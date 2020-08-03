package com.integral.enigmaticlegacy.items;

import java.util.List;

import javax.annotation.Nullable;

import com.integral.enigmaticlegacy.EnigmaticLegacy;
import com.integral.enigmaticlegacy.helpers.ItemLoreHelper;
import com.integral.enigmaticlegacy.items.generic.ItemBase;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LoreInscriber extends ItemBase {

	public LoreInscriber() {
		super(ItemBase.getDefaultProperties().rarity(Rarity.EPIC).maxStackSize(1));
		this.setRegistryName(new ResourceLocation(EnigmaticLegacy.MODID, "lore_inscriber"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> list, ITooltipFlag flagIn) {

		if (Screen.func_231173_s_()) {
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber1");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber2");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.void");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber3");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber4");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber5");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.void");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber6");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber7");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber8");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.void");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber9");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber10");
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.loreInscriber11");
		} else {
			ItemLoreHelper.addLocalizedString(list, "tooltip.enigmaticlegacy.holdShift");
		}

	}

}
