
package net.mcreator.dreamlike.item;

import net.minecraft.network.chat.Component;

public class DreamwaterItem extends BucketItem {

	public DreamwaterItem() {
		super(DreamlikeModFluids.DREAMWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}

}
