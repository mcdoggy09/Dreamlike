
package net.mcreator.dreamlike.item;

import net.minecraft.network.chat.Component;

public class DreamwaternocolorItem extends BucketItem {

	public DreamwaternocolorItem() {
		super(DreamlikeModFluids.DREAMWATERNOCOLOR, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

}
