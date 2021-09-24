
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.item.UltimaniumLongswordItem;
import net.mcreator.ccalumod.item.UltimaniumDaggerItem;
import net.mcreator.ccalumod.item.UltimaniumBroadswordItem;
import net.mcreator.ccalumod.item.ToleroniumSwordItem;
import net.mcreator.ccalumod.item.RubySwordItem;
import net.mcreator.ccalumod.item.RazzantheumSwordItem;
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class XpFinderEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:xp_finder")
	public static final Enchantment enchantment = null;
	public XpFinderEnchantment(CcalumodModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("xp_finder"));
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
			return 4;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == ToleroniumSwordItem.block)
				return true;
			if (stack.getItem() == UltimaniumBroadswordItem.block)
				return true;
			if (stack.getItem() == UltimaniumDaggerItem.block)
				return true;
			if (stack.getItem() == UltimaniumLongswordItem.block)
				return true;
			if (stack.getItem() == RazzantheumSwordItem.block)
				return true;
			if (stack.getItem() == RubySwordItem.block)
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
