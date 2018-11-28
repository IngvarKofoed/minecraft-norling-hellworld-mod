package norling.hellworld.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import norling.hellworld.init.ItemInit;

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
