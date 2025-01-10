
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

import net.mcreator.dreamlike.item.TerminatorItem;
import net.mcreator.dreamlike.item.OsMagniunIngotItem;
import net.mcreator.dreamlike.item.GalaxyPickaxeItem;
import net.mcreator.dreamlike.item.FireygreatstaffItem;
import net.mcreator.dreamlike.item.DreamwaterItem;
import net.mcreator.dreamlike.item.CosmosArmourItem;
import net.mcreator.dreamlike.item.BloodScytheItem;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamlikeMod.MODID);
	public static final RegistryObject<Item> DREAMY_GRASS = block(DreamlikeModBlocks.DREAMY_GRASS);
	public static final RegistryObject<Item> DREAMYLUSHGRASS = block(DreamlikeModBlocks.DREAMYLUSHGRASS);
	public static final RegistryObject<Item> DREAMYCOBBLESTONE = block(DreamlikeModBlocks.DREAMYCOBBLESTONE);
	public static final RegistryObject<Item> BLOOD_SCYTHE = REGISTRY.register("blood_scythe", () -> new BloodScytheItem());
	public static final RegistryObject<Item> FIREYGREATSTAFF = REGISTRY.register("fireygreatstaff", () -> new FireygreatstaffItem());
	public static final RegistryObject<Item> GALAXY_PICKAXE = REGISTRY.register("galaxy_pickaxe", () -> new GalaxyPickaxeItem());
	public static final RegistryObject<Item> COSMOS_ARMOUR_HELMET = REGISTRY.register("cosmos_armour_helmet", () -> new CosmosArmourItem.Helmet());
	public static final RegistryObject<Item> COSMOS_ARMOUR_CHESTPLATE = REGISTRY.register("cosmos_armour_chestplate", () -> new CosmosArmourItem.Chestplate());
	public static final RegistryObject<Item> COSMOS_ARMOUR_LEGGINGS = REGISTRY.register("cosmos_armour_leggings", () -> new CosmosArmourItem.Leggings());
	public static final RegistryObject<Item> COSMOS_ARMOUR_BOOTS = REGISTRY.register("cosmos_armour_boots", () -> new CosmosArmourItem.Boots());
	public static final RegistryObject<Item> TERMINATOR = REGISTRY.register("terminator", () -> new TerminatorItem());
	public static final RegistryObject<Item> ANGELSAND = block(DreamlikeModBlocks.ANGELSAND);
	public static final RegistryObject<Item> MAGNIUM_INGOT = REGISTRY.register("magnium_ingot", () -> new OsMagniunIngotItem());
	public static final RegistryObject<Item> DREAMWATER_BUCKET = REGISTRY.register("dreamwater_bucket", () -> new DreamwaterItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
