
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.dreamlike.fluid.types.DreamwaterFluidType;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DreamlikeMod.MODID);
	public static final RegistryObject<FluidType> DREAMWATER_TYPE = REGISTRY.register("dreamwater", () -> new DreamwaterFluidType());
}
