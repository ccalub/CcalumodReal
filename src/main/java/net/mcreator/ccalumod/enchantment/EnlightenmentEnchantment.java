
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.item.UltimaniumArmorItem;
import net.mcreator.ccalumod.item.ToleroniumItem;
import net.mcreator.ccalumod.item.RazzantheumArmourItem;
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class EnlightenmentEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:enlightenment")
	public static final Enchantment enchantment = null;
	public EnlightenmentEnchantment(CcalumodModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("enlightenment"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_CHEST, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 2;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == ToleroniumItem.body)
				return true;
			if (stack.getItem() == UltimaniumArmorItem.body)
				return true;
			if (stack.getItem() == RazzantheumArmourItem.body)
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
