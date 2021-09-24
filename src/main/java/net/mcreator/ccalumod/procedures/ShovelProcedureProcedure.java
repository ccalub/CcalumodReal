package net.mcreator.ccalumod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.ccalumod.enchantment.ExcavationEnchantment;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class ShovelProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CcalumodMod.LOGGER.warn("Failed to load dependency itemstack for procedure ShovelProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CcalumodMod.LOGGER.warn("Failed to load dependency x for procedure ShovelProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CcalumodMod.LOGGER.warn("Failed to load dependency y for procedure ShovelProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CcalumodMod.LOGGER.warn("Failed to load dependency z for procedure ShovelProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CcalumodMod.LOGGER.warn("Failed to load dependency world for procedure ShovelProcedure!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(ExcavationEnchantment.enchantment, (itemstack))) == 1)) {
			if ((Blocks.GRASS_BLOCK.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
				}
			} else if ((Blocks.DIRT.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
				}
			} else if ((Blocks.SAND.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
				}
			} else if ((Blocks.RED_SAND.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
				}
			} else if ((Blocks.GRAVEL.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
				}
			}
		}
	}
}
