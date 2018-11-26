package norling.hellworld.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import norling.hellworld.Main;
import norling.hellworld.init.ItemInit;
import norling.hellworld.util.IHasModel;

public class ItemBase  extends Item implements IHasModel
{
	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}

}
