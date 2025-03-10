
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dreamlike.block.DreamylushgrassBlock;
import net.mcreator.dreamlike.block.DreamycobblestoneBlock;
import net.mcreator.dreamlike.block.DreamyGrassBlock;
import net.mcreator.dreamlike.block.DreamwaterBlock;
import net.mcreator.dreamlike.block.DiminsionalLeavesBlock;
import net.mcreator.dreamlike.block.DimensionalLogBlock;
import net.mcreator.dreamlike.block.CosmosOreBlock;
import net.mcreator.dreamlike.block.AngelsandBlock;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DreamlikeMod.MODID);
	public static final RegistryObject<Block> DREAMY_GRASS = REGISTRY.register("dreamy_grass", () -> new DreamyGrassBlock());
	public static final RegistryObject<Block> DREAMYLUSHGRASS = REGISTRY.register("dreamylushgrass", () -> new DreamylushgrassBlock());
	public static final RegistryObject<Block> DREAMYCOBBLESTONE = REGISTRY.register("dreamycobblestone", () -> new DreamycobblestoneBlock());
	public static final RegistryObject<Block> ANGELSAND = REGISTRY.register("angelsand", () -> new AngelsandBlock());
	public static final RegistryObject<Block> DREAMWATER = REGISTRY.register("dreamwater", () -> new DreamwaterBlock());
	public static final RegistryObject<Block> DIMENSIONAL_LOG = REGISTRY.register("dimensional_log", () -> new DimensionalLogBlock());
	public static final RegistryObject<Block> COSMOS_ORE = REGISTRY.register("cosmos_ore", () -> new CosmosOreBlock());
	public static final RegistryObject<Block> DIMINSIONAL_LEAVES = REGISTRY.register("diminsional_leaves", () -> new DiminsionalLeavesBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
