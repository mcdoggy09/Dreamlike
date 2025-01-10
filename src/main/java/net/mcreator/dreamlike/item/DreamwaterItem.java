
package net.mcreator.dreamlike.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.dreamlike.init.DreamlikeModFluids;

public class DreamwaterItem extends BucketItem {
	public DreamwaterItem() {
		super(DreamlikeModFluids.DREAMWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
