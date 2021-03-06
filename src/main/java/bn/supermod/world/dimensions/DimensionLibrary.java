package bn.supermod.world.dimensions;

import bn.supermod.init.BiomeInit;
import bn.supermod.init.DimensionInit;
import bn.supermod.world.generation.chunks.ChunkGeneratorNetherTemplate;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionLibrary extends WorldProvider {

	public DimensionLibrary() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.DEAMON);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.DEAMON;
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
