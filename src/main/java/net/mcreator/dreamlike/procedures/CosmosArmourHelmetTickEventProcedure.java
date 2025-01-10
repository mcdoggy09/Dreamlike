package net.mcreator.dreamlike.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CosmosArmourHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, false, false));
	}
}
