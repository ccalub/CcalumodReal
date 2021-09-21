
package net.mcreator.ccalumod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.ccalumod.itemgroup.CcalumodItemGroup;
import net.mcreator.ccalumod.CcalumodModElements;

import java.util.List;

@CcalumodModElements.ModElement.Tag
public class ToleroniumPickaxeItem extends CcalumodModElements.ModElement {
	@ObjectHolder("ccalumod:toleronium_pickaxe")
	public static final Item block = null;
	public ToleroniumPickaxeItem(CcalumodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 781;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ToleroniumIngotItem.block));
			}
		}, 1, -2.4f, new Item.Properties().group(CcalumodItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("A Pickaxe Based on TolerLive"));
			}
		}.setRegistryName("toleronium_pickaxe"));
	}
}
