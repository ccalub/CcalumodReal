
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class ParanoiaEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:paranoia")
	public static final Enchantment enchantment = null;
	public ParanoiaEnchantment(CcalumodModElements instance) {
		super(instance, 135);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("paranoia"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == Items.BOW)
				return true;
			if (stack.getItem() == Items.CROSSBOW)
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
