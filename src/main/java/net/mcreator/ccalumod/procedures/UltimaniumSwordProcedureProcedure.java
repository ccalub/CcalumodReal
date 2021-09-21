package net.mcreator.ccalumod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class UltimaniumSwordProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency entity for procedure UltimaniumSwordProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1) / 10));
	}
}
