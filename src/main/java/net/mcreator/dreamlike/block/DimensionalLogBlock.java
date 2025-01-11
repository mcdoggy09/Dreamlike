
package net.mcreator.dreamlike.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DimensionalLogBlock extends Block {
	public DimensionalLogBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1.9f, 16f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}