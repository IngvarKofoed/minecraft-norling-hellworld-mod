package bn.supermod.creativetabs;

import bn.supermod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HellworldTab extends CreativeTabs {
	public HellworldTab() 
	{
		super("hellworld");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.HELLWORLD_HELMET);
		//return new ItemStack(Items.APPLE);//ItemInit.COPPER_INGOT);
	}
}
