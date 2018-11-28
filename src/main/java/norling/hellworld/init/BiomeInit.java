package norling.hellworld.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import norling.hellworld.Main;
import norling.hellworld.world.biomes.HellworldBiome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeInit {

	public static final Biome HELLWORLD = new HellworldBiome();
	
	public static void registerBiomes()
	{		
		initBiome(HELLWORLD, "Hellworld", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		Main.logger.warn(name);
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		
		/*if(ModConfiguration.spawnCustomBiomesInOverworld) 
		{
			BiomeManager.addSpawnBiome(biome);
		}*/
		return biome;
	}
}
