package norling.hellworld.init;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import norling.hellworld.Main;
import norling.hellworld.util.ModConfiguration;
import norling.hellworld.world.dimensions.DimensionLibrary;

public class DimensionInit {

	public static final DimensionType HELLWORLD = DimensionType.register("Hellworld", "_hellworld", ModConfiguration.DIMENSION_HELLWORLD_ID, DimensionLibrary.class, false);
	
	public static void registerDimensions()
	{
		Main.logger.warn(HELLWORLD);
		DimensionManager.registerDimension(ModConfiguration.DIMENSION_HELLWORLD_ID, HELLWORLD);
	}
}
