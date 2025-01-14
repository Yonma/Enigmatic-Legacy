package com.integral.enigmaticlegacy.api.items;

import com.integral.enigmaticlegacy.EnigmaticLegacy;
import com.integral.enigmaticlegacy.config.OmniconfigHandler;
import com.integral.enigmaticlegacy.helpers.ItemNBTHelper;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;

public interface IMultiblockMiningTool {

	default boolean areaEffectsEnabled(Player player, ItemStack stack) {
		return this.areaEffectsAllowed(stack) && (!player.isCrouching() || OmniconfigHandler.disableAOEShiftSuppression.getValue());
	}

	default boolean areaEffectsAllowed(ItemStack stack) {
		if (stack.getItem() instanceof IMultiblockMiningTool)
			return ItemNBTHelper.getBoolean(stack, "MultiblockEffectsEnabled", true);

		return false;
	}

	default void enableAreaEffects(Player player, ItemStack stack) {

		if (stack.getItem() instanceof IMultiblockMiningTool) {
			ItemNBTHelper.setBoolean(stack, "MultiblockEffectsEnabled", true);

			if (!player.level.isClientSide) {
				player.level.playSound(null, player.blockPosition(), EnigmaticLegacy.HHON, SoundSource.PLAYERS, 1.0F, (float) (0.8F + (Math.random() * 0.2F)));
			}
		}

	}

	default void disableAreaEffects(Player player, ItemStack stack) {
		if (stack.getItem() instanceof IMultiblockMiningTool) {
			ItemNBTHelper.setBoolean(stack, "MultiblockEffectsEnabled", false);

			if (!player.level.isClientSide) {
				player.level.playSound(null, player.blockPosition(), EnigmaticLegacy.HHOFF, SoundSource.PLAYERS, 1.0F, (float) (0.8F + (Math.random() * 0.2F)));
			}
		}
	}

	default void toggleAreaEffects(Player player, ItemStack stack) {
		if (stack.getItem() instanceof IMultiblockMiningTool) {
			if (this.areaEffectsAllowed(stack)) {
				this.disableAreaEffects(player, stack);
			} else {
				this.enableAreaEffects(player, stack);
			}
		}
	}

}
