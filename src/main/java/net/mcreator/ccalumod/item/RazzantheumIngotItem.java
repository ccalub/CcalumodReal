
package net.mcreator.ccalumod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.ccalumod.procedures.RazzantheumProcedureProcedure;
import net.mcreator.ccalumod.CcalumodModElements;

import java.util.Map;
import java.util.HashMap;

@CcalumodModElements.ModElement.Tag
public class RazzantheumIngotItem extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:razzantheum_ingot")
	public static final Item block = null;
	public RazzantheumIngotItem(CcalumodModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("razzantheum_ingot");
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
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				RazzantheumProcedureProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
