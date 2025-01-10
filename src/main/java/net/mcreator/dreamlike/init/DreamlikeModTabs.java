
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreamlike.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dreamlike.DreamlikeMod;

public class DreamlikeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DreamlikeMod.MODID);
	public static final RegistryObject<CreativeModeTab> DREAMLIKE = REGISTRY.register("dreamlike",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dreamlike.dreamlike")).icon(() -> new ItemStack(Items.EMERALD)).displayItems((parameters, tabData) -> {
				tabData.accept(DreamlikeModBlocks.DREAMY_GRASS.get().asItem());
				tabData.accept(DreamlikeModBlocks.DREAMYCOBBLESTONE.get().asItem());
				tabData.accept(DreamlikeModItems.LITTLE_BERTHA.get());
				tabData.accept(DreamlikeModItems.DECIMATOR.get());
				tabData.accept(DreamlikeModItems.BLOOD_SCYTHE.get());
				tabData.accept(DreamlikeModItems.FIREYGREATSTAFF.get());
				tabData.accept(DreamlikeModItems.GALAXY_PICKAXE.get());
				tabData.accept(DreamlikeModItems.COSMOS_ARMOUR_HELMET.get());
				tabData.accept(DreamlikeModItems.COSMOS_ARMOUR_CHESTPLATE.get());
				tabData.accept(DreamlikeModItems.COSMOS_ARMOUR_LEGGINGS.get());
				tabData.accept(DreamlikeModItems.COSMOS_ARMOUR_BOOTS.get());
				tabData.accept(DreamlikeModItems.TERMINATOR.get());
				tabData.accept(DreamlikeModBlocks.ANGELSAND.get().asItem());
				tabData.accept(DreamlikeModItems.MAGNIUM_INGOT.get());
				tabData.accept(DreamlikeModItems.DREAMWATER_BUCKET.get());
			})

					.build());
}
