package com.integral.enigmaticlegacy.items;

import com.integral.enigmaticlegacy.EnigmaticLegacy;
import com.integral.enigmaticlegacy.items.generic.ItemBase;

import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

public class AstralDust extends ItemBase {

	public AstralDust() {
		super(ItemBase.getDefaultProperties().rarity(Rarity.EPIC));
		this.setRegistryName(new ResourceLocation(EnigmaticLegacy.MODID, "astral_dust"));
	}

}
