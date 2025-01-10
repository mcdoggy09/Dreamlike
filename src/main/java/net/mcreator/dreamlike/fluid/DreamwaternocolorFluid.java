
package net.mcreator.dreamlike.fluid;

public abstract class DreamwaternocolorFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DreamlikeModFluidTypes.DREAMWATERNOCOLOR_TYPE.get(), () -> DreamlikeModFluids.DREAMWATERNOCOLOR.get(),
			() -> DreamlikeModFluids.FLOWING_DREAMWATERNOCOLOR.get()).explosionResistance(100f).bucket(() -> DreamlikeModItems.DREAMWATERNOCOLOR_BUCKET.get()).block(() -> (LiquidBlock) DreamlikeModBlocks.DREAMWATERNOCOLOR.get());

	private DreamwaternocolorFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DreamwaternocolorFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DreamwaternocolorFluid {
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
