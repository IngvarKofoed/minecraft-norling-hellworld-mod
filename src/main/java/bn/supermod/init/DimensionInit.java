package bn.supermod.init;

import bn.supermod.Main;
import bn.supermod.util.ModConfiguration;
import bn.supermod.world.dimensions.DimensionLibrary;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {

	public static final DimensionType HELLWORLD = DimensionType.register("Hellworld", "_hellworld", ModConfiguration.DIMENSION_HELLWORLD_ID, DimensionLibrary.class, false);
	
	public static void registerDimensions()
	{
		Main.logger.warn(HELLWORLD);
		DimensionManager.registerDimension(ModConfiguration.DIMENSION_HELLWORLD_ID, HELLWORLD);
	}
}
