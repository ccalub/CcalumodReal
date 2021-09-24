package net.mcreator.ccalumod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.ccalumod.enchantment.XpFinderEnchantment;
import net.mcreator.ccalumod.enchantment.LifestealEnchantment;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class LifestealProcuedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency entity for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CcalumodMod.LOGGER.warn("Failed to load dependency itemstack for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CcalumodMod.LOGGER.warn("Failed to load dependency x for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CcalumodMod.LOGGER.warn("Failed to load dependency y for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CcalumodMod.LOGGER.warn("Failed to load dependency z for procedure LifestealProcuedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CcalumodMod.LOGGER.warn("Failed to load dependency world for procedure LifestealProcuedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(LifestealEnchantment.enchantment, (itemstack))) == 1)) {
			if ((Math.random() < 0.7)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 0.5));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 5, 3, 3, 3, 1);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(LifestealEnchantment.enchantment, (itemstack))) == 2)) {
			if ((Math.random() < 0.7)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 1));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 10, 3, 3, 3, 1);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(LifestealEnchantment.enchantment, (itemstack))) == 3)) {
			if ((Math.random() < 0.7)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 1.5));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 15, 3, 3, 3, 1);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(LifestealEnchantment.enchantment, (itemstack))) == 4)) {
			if ((Math.random() < 0.7)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 2));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 20, 3, 3, 3, 1);
				}
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(LifestealEnchantment.enchantment, (itemstack))) == 5)) {
			if ((Math.random() < 0.7)) {
				if (sourceentity instanceof LivingEntity)
					((LivingEntity) sourceentity)
							.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 2.5));
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.ENCHANTED_HIT, (sourceentity.getPosX()), (sourceentity.getPosY()),
							(sourceentity.getPosZ()), (int) 25, 3, 3, 3, 1);
				}
			}
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) == 0)) {
			if (((EnchantmentHelper.getEnchantmentLevel(XpFinderEnchantment.enchantment, (itemstack))) == 1)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
				}
				if ((Math.random() < 0.5)) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(XpFinderEnchantment.enchantment, (itemstack))) == 2)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 4));
				}
				if ((Math.random() < 0.6)) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 3));
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(XpFinderEnchantment.enchantment, (itemstack))) == 3)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 6));
				}
				if ((Math.random() < 0.7)) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 5));
					}
				}
			} else if (((EnchantmentHelper.getEnchantmentLevel(XpFinderEnchantment.enchantment, (itemstack))) == 4)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 7));
				}
				if ((Math.random() < 0.8)) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 7));
					}
				}
			}
		}
	}
}
