
package net.mcreator.dreamlike.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AngelsandBlock extends FallingBlock {
	public AngelsandBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.SAND).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}