
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.dreamlike.fluid.DreamwaternocolorFluid;
import net.mcreator.dreamlike.fluid.DreamwaterFluid;
import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DreamlikeMod.MODID);
	public static final RegistryObject<FlowingFluid> DREAMWATER = REGISTRY.register("dreamwater", () -> new DreamwaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DREAMWATER = REGISTRY.register("flowing_dreamwater", () -> new DreamwaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> DREAMWATERNOCOLOR = REGISTRY.register("dreamwaternocolor", () -> new DreamwaternocolorFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DREAMWATERNOCOLOR = REGISTRY.register("flowing_dreamwaternocolor", () -> new DreamwaternocolorFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DREAMWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DREAMWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DREAMWATERNOCOLOR.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DREAMWATERNOCOLOR.get(), RenderType.translucent());
		}
	}
}
