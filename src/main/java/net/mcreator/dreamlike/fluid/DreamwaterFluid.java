
package net.mcreator.dreamlike.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.dreamlike.init.DreamlikeModItems;
import net.mcreator.dreamlike.init.DreamlikeModFluids;
import net.mcreator.dreamlike.init.DreamlikeModFluidTypes;
import net.mcreator.dreamlike.init.DreamlikeModBlocks;

public abstract class DreamwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DreamlikeModFluidTypes.DREAMWATER_TYPE.get(), () -> DreamlikeModFluids.DREAMWATER.get(), () -> DreamlikeModFluids.FLOWING_DREAMWATER.get())
			.explosionResistance(100f).bucket(() -> DreamlikeModItems.DREAMWATER_BUCKET.get()).block(() -> (LiquidBlock) DreamlikeModBlocks.DREAMWATER.get());

	private DreamwaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DreamwaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DreamwaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
