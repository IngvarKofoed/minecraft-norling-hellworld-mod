package norling.hellworld;


import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import norling.hellworld.creativetabs.HellworldTab;
import norling.hellworld.proxy.CommonProxy;
import norling.hellworld.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION) 
public class Main {
	public static Logger logger;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = "norling.hellworld.proxy.ClientProxy", serverSide = "norling.hellworld.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new HellworldTab();
	

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{	
		logger = event.getModLog();
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}}
