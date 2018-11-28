package norling.hellworld.world.dimensions;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import norling.hellworld.init.BiomeInit;
import norling.hellworld.init.DimensionInit;
import norling.hellworld.world.generation.chunks.ChunkGeneratorNetherTemplate;

public class DimensionLibrary extends WorldProvider {

	public DimensionLibrary() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.HELLWORLD);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.HELLWORLD;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorNetherTemplate(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
