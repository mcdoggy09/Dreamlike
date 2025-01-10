
package net.mcreator.dreamlike.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.dreamlike.init.DreamlikeModFluids;

public class DreamwaternocolorBlock extends LiquidBlock {
	public DreamwaternocolorBlock() {
		super(() -> DreamlikeModFluids.DREAMWATERNOCOLOR.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 2).noCollission()
				.noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
