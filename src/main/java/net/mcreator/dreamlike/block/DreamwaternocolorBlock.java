
package net.mcreator.dreamlike.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DreamwaternocolorBlock extends LiquidBlock {
	public DreamwaternocolorBlock() {
		super(() -> DreamlikeModFluids.DREAMWATERNOCOLOR.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 2).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}