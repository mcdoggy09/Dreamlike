
package net.mcreator.dreamlike.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OsMagniunIngotItem extends Item {
	public OsMagniunIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
