
package net.mcreator.ccalumod.item;

@CcalumodModElements.ModElement.Tag
public class BlankRecordItem extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:blank_record")
	public static final Item block = null;

	public BlankRecordItem(CcalumodModElements instance) {
		super(instance, 91);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("blank_record");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("An item used for crafting custom records!"));
		}

	}

}
