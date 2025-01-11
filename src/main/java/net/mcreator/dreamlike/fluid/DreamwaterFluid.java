
package net.mcreator.dreamlike.fluid;

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
