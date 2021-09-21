
package net.mcreator.ccalumod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@CcalumodModElements.ModElement.Tag
public class RazzalieousSlabBlock extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:razzalieous_slab")
	public static final Block block = null;

	public RazzalieousSlabBlock(CcalumodModElements instance) {
		super(instance, 53);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(CcalumodItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0));

			setRegistryName("razzalieous_slab");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}

	}

}
