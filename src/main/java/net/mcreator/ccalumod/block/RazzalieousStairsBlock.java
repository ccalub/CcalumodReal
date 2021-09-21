
package net.mcreator.ccalumod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@CcalumodModElements.ModElement.Tag
public class RazzalieousStairsBlock extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:razzalieous_stairs")
	public static final Block block = null;

	public RazzalieousStairsBlock(CcalumodModElements instance) {
		super(instance, 52);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(CcalumodItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3f, 2f).setLightLevel(s -> 0))
					.getDefaultState(),
					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(3f, 2f).setLightLevel(s -> 0));

			setRegistryName("razzalieous_stairs");
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
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
