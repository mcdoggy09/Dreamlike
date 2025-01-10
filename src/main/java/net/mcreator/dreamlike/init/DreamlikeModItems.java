
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dreamlike.item.LittleBerthaItem;
import net.mcreator.dreamlike.item.FireygreatstaffItem;
import net.mcreator.dreamlike.item.DecimatorItem;
import net.mcreator.dreamlike.item.BloodScytheItem;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamlikeMod.MODID);
	public static final RegistryObject<Item> DREAMY_GRASS = block(DreamlikeModBlocks.DREAMY_GRASS);
	public static final RegistryObject<Item> DREAMYLUSHGRASS = block(DreamlikeModBlocks.DREAMYLUSHGRASS);
	public static final RegistryObject<Item> DREAMYCOBBLESTONE = block(DreamlikeModBlocks.DREAMYCOBBLESTONE);
	public static final RegistryObject<Item> LITTLE_BERTHA = REGISTRY.register("little_bertha", () -> new LittleBerthaItem());
	public static final RegistryObject<Item> DECIMATOR = REGISTRY.register("decimator", () -> new DecimatorItem());
	public static final RegistryObject<Item> BLOOD_SCYTHE = REGISTRY.register("blood_scythe", () -> new BloodScytheItem());
	public static final RegistryObject<Item> FIREYGREATSTAFF = REGISTRY.register("fireygreatstaff", () -> new FireygreatstaffItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
