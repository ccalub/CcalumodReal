
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.item.UltimaniumPickaxeItem;
import net.mcreator.ccalumod.item.ToleroniumPickaxeItem;
import net.mcreator.ccalumod.item.RubyPickaxeItem;
import net.mcreator.ccalumod.item.RazzantheumPickaxeItem;
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class AutoSmeltEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:auto_smelt")
	public static final Enchantment enchantment = null;
	public AutoSmeltEnchantment(CcalumodModElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("auto_smelt"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.BREAKABLE, slots);
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
			if (stack.getItem() == ToleroniumPickaxeItem.block)
				return true;
			if (stack.getItem() == UltimaniumPickaxeItem.block)
				return true;
			if (stack.getItem() == RazzantheumPickaxeItem.block)
				return true;
			if (stack.getItem() == RubyPickaxeItem.block)
				return true;
			if (stack.getItem() == Items.WOODEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.STONE_PICKAXE)
				return true;
			if (stack.getItem() == Items.IRON_PICKAXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.DIAMOND_PICKAXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_PICKAXE)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
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
