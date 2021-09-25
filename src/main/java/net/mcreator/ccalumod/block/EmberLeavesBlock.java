
package net.mcreator.ccalumod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@CcalumodModElements.ModElement.Tag
public class EmberLeavesBlock extends CcalumodModElements.ModElement {

	@ObjectHolder("ccalumod:ember_leaves")
	public static final Block block = null;

	public EmberLeavesBlock(CcalumodModElements instance) {
		super(instance, 116);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.3f, 0.3f).setLightLevel(s -> 0));

			setRegistryName("ember_leaves");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 1;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 45;
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
