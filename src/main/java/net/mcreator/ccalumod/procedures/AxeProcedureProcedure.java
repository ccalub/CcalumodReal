package net.mcreator.ccalumod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.ccalumod.enchantment.TreefellerEnchantment;
import net.mcreator.ccalumod.CcalumodMod;

import java.util.Map;

public class AxeProcedureProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CcalumodMod.LOGGER.warn("Failed to load dependency entity for procedure AxeProcedure!");
			return;
		}
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
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EnchantmentHelper.getEnchantmentLevel(TreefellerEnchantment.enchantment, (itemstack))) == 1)) {
			if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) z)))) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 2), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 3), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 4), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 5), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 6), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 6), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 7), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 7), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 8), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 8), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 9), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 9), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 10), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 10), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 11), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 11), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 12), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 12), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 13), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 13), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 14), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 14), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 15), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 15), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 16), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 16), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 17), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 17), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 18), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 18), (int) z), false);
				}
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 19), (int) z)), (World) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 19), (int) z), false);
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) (x + 1), (int) y, (int) z)))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) (z + 1))))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) (x - 1), (int) y, (int) z)))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
				if ((Blocks.OAK_LOG.getDefaultState().isValidPosition(world, new BlockPos((int) x, (int) y, (int) (z - 1))))) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).clearActivePotions();
				}
			}
		}
	}
}
