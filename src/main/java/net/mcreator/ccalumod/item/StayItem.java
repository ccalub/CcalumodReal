
package net.mcreator.ccalumod.item;

@CcalumodModElements.ModElement.Tag
public class StayItem extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:stay")
	public static final Item block = null;

	public StayItem(CcalumodModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, CcalumodModElements.sounds.get(new ResourceLocation("ccalumod:staysong")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("stay");
		}

	}

}
