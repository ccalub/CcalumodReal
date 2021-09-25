
package net.mcreator.ccalumod.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.ccalumod.item.UltimaniumArmorItem;
import net.mcreator.ccalumod.item.ToleroniumItem;
import net.mcreator.ccalumod.item.RazzantheumArmourItem;
import net.mcreator.ccalumod.CcalumodModElements;

@CcalumodModElements.ModElement.Tag
public class GlideEnchantment extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:glide")
	public static final Enchantment enchantment = null;
	public GlideEnchantment(CcalumodModElements instance) {
		super(instance, 134);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("glide"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, slots);
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
			if (stack.getItem() == ToleroniumItem.boots)
				return true;
			if (stack.getItem() == UltimaniumArmorItem.boots)
				return true;
			if (stack.getItem() == RazzantheumArmourItem.boots)
				return true;
			if (stack.getItem() == Items.LEATHER_BOOTS)
				return true;
			if (stack.getItem() == Items.CHAINMAIL_BOOTS)
				return true;
			if (stack.getItem() == Items.IRON_BOOTS)
				return true;
			if (stack.getItem() == Items.GOLDEN_BOOTS)
				return true;
			if (stack.getItem() == Items.DIAMOND_BOOTS)
				return true;
			if (stack.getItem() == Items.NETHERITE_BOOTS)
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
