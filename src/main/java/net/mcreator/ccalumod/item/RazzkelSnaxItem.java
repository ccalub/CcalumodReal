
package net.mcreator.ccalumod.item;

@CcalumodModElements.ModElement.Tag
public class RazzkelSnaxItem extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:razzkel_snax")
	public static final Item block = null;

	public RazzkelSnaxItem(CcalumodModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(10).saturation(1f).setAlwaysEdible()

							.build()));
			setRegistryName("razzkel_snax");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
