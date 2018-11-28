package norling.hellworld.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import norling.hellworld.Main;
import norling.hellworld.init.ItemInit;
import norling.hellworld.util.IHasModel;

public class ToolPickaxeBase extends ItemPickaxe implements IHasModel {

	public ToolPickaxeBase(String name, ToolMaterial material, CreativeTabs tab) 
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
