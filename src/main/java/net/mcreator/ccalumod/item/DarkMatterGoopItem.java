
package net.mcreator.ccalumod.item;

@CcalumodModElements.ModElement.Tag
public class DarkMatterGoopItem extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:unstable_dark_matter")
	public static final Item block = null;

	public DarkMatterGoopItem(CcalumodModElements instance) {
		super(instance, 71);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("unstable_dark_matter");
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

	}

}
