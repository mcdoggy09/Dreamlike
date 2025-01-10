package net.mcreator.dreamlike.procedures;

import net.minecraftforge.eventbus.api.Event;

public class LittleBerthaLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 2, false, false));
	}
}
