
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
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class LifestealEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:lifesteal")
	public static final Enchantment enchantment = null;
	public LifestealEnchantment(CcalumodModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("lifesteal"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 5;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == UltimaniumBroadswordItem.block)
				return true;
			if (stack.getItem() == UltimaniumDaggerItem.block)
				return true;
			if (stack.getItem() == UltimaniumLongswordItem.block)
				return true;
			if (stack.getItem() == ToleroniumSwordItem.block)
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
