package net.mcreator.dreamlike.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DecimatorLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HARM, 60, 1, false, false));
	}
}
