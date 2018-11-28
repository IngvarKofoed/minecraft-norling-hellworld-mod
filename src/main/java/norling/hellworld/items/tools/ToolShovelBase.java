package norling.hellworld.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import norling.hellworld.Main;
import norling.hellworld.init.ItemInit;
import norling.hellworld.util.IHasModel;

public class ToolShovelBase extends ItemSpade implements IHasModel {
	
	public ToolShovelBase(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
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
