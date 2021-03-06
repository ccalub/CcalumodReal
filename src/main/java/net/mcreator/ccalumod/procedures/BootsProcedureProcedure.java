package net.mcreator.ccalumod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.ccalumod.enchantment.SpeedEnchantment;
import net.mcreator.ccalumod.enchantment.JumpBoostEnchantment;
import net.mcreator.ccalumod.enchantment.GlideEnchantment;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class BootsProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency entity for procedure BootsProcedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CcalumodMod.LOGGER.warn("Failed to load dependency itemstack for procedure BootsProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((EnchantmentHelper.getEnchantmentLevel(SpeedEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 1)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 1, (false), (false)));
		} else if (((EnchantmentHelper.getEnchantmentLevel(SpeedEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 2, (false), (false)));
		} else if (((EnchantmentHelper.getEnchantmentLevel(SpeedEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 3)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 3, (false), (false)));
		}
		if (((EnchantmentHelper.getEnchantmentLevel(JumpBoostEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 1)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 2, (int) 1, (false), (false)));
		} else if (((EnchantmentHelper.getEnchantmentLevel(JumpBoostEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 2, (int) 2, (false), (false)));
		} else if (((EnchantmentHelper.getEnchantmentLevel(JumpBoostEnchantment.enchantment,
				((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY))) == 3)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 2, (int) 3, (false), (false)));
		}
		if (((EnchantmentHelper.getEnchantmentLevel(GlideEnchantment.enchantment, (itemstack))) == 1)) {
			if (((entity.getMotion().getY()) < 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 2, (int) 1, (false), (false)));
			}
		}
	}
}
