package net.mcreator.dreamlike.procedures;

import net.minecraft.world.entity.Entity;

public class FireygreatstaffLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
