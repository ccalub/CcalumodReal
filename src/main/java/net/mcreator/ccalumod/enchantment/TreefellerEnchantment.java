
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.item.UltimaniumAxeItem;
import net.mcreator.ccalumod.item.ToleroniumAxeItem;
import net.mcreator.ccalumod.item.RubyAxeItem;
import net.mcreator.ccalumod.item.RazzantheumAxeItem;
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class TreefellerEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:treefeller")
	public static final Enchantment enchantment = null;
	public TreefellerEnchantment(CcalumodModElements instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("treefeller"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == Items.WOODEN_AXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_AXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_AXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_AXE)
				return true;
			if (stack.getItem() == Items.IRON_AXE)
				return true;
			if (stack.getItem() == Items.STONE_AXE)
				return true;
			if (stack.getItem() == RubyAxeItem.block)
				return true;
			if (stack.getItem() == RazzantheumAxeItem.block)
				return true;
			if (stack.getItem() == UltimaniumAxeItem.block)
				return true;
			if (stack.getItem() == ToleroniumAxeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
