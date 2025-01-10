
package net.mcreator.dreamlike.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EeItem extends Item {
	public EeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
