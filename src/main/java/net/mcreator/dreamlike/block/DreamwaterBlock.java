
package net.mcreator.dreamlike.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DreamwaterBlock extends LiquidBlock {
	public DreamwaterBlock() {
		super(() -> DreamlikeModFluids.DREAMWATER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 6).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}