
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dreamlike.item.EeItem;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamlikeMod.MODID);
	public static final RegistryObject<Item> EE = REGISTRY.register("ee", () -> new EeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
