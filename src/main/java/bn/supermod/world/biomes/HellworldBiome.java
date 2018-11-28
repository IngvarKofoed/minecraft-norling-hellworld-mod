package bn.supermod.world.biomes;

import bn.supermod.init.BlockInit;
import net.minecraft.world.biome.Biome;

public class HellworldBiome extends Biome  {
	
	public HellworldBiome() 
	{
		super(new BiomeProperties("Hellworld").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		
		topBlock = BlockInit.HELLWORLD_DIRT.getDefaultState();
		fillerBlock = BlockInit.HELLWORLD_ORE.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		// this.spawnableCreatureList.add(new SpawnListEntry(EntityCentaur.class, 5, 1, 5));
	}
}
