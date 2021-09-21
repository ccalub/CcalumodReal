
package net.mcreator.ccalumod.item;

@CcalumodModElements.ModElement.Tag
public class RazzanthiumShardItem extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:razzanthium_shard")
	public static final Item block = null;

	public RazzanthiumShardItem(CcalumodModElements instance) {
		super(instance, 68);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("razzanthium_shard");
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
			list.add(new StringTextComponent("Use a merger to make a Razzantheum ingot!"));
		}

	}

}
