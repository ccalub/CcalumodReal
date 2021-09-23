
package net.mcreator.ccalumod.enchantment;

@CcalumodModElements.ModElement.Tag
public class JumpBoostEnchantment extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:jump_boost")
	public static final Enchantment enchantment = null;

	public JumpBoostEnchantment(CcalumodModElements instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("jump_boost"));
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
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == RazzantheumArmourItem.boots)
				return true;
			if (stack.getItem() == UltimaniumArmorItem.boots)
				return true;
			if (stack.getItem() == ToleroniumItem.boots)
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
