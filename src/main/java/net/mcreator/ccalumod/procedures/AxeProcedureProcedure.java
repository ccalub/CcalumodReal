package net.mcreator.ccalumod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.ccalumod.enchantment.TreefellerEnchantment;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class AxeProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				CcalumodMod.LOGGER.warn("Failed to load dependency itemstack for procedure AxeProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CcalumodMod.LOGGER.warn("Failed to load dependency x for procedure AxeProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CcalumodMod.LOGGER.warn("Failed to load dependency y for procedure AxeProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CcalumodMod.LOGGER.warn("Failed to load dependency z for procedure AxeProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CcalumodMod.LOGGER.warn("Failed to load dependency world for procedure AxeProcedure!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(TreefellerEnchantment.enchantment, (itemstack))) == 1)) {
			if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) (x + 1), (int) y, (int) z)))) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 3), (int) z), Blocks.AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.AIR.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.AIR.getDefaultState(), 3);
			}
		}
	}
}
