package norling.hellworld.creativetabs;

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
		return new ItemStack(Items.APPLE);//ItemInit.COPPER_INGOT);
	}
}
