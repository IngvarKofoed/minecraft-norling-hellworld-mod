package norling.hellworld.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import norling.hellworld.Main;
import norling.hellworld.Reference;
import norling.hellworld.items.ItemBase;
import norling.hellworld.items.armor.ArmourModel;
import norling.hellworld.items.tools.ToolAxeBase;
import norling.hellworld.items.tools.ToolHoeBase;
import norling.hellworld.items.tools.ToolPickaxeBase;
import norling.hellworld.items.tools.ToolShovelBase;
import norling.hellworld.items.tools.ToolSwordBase;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Armour Materials
	public static final ArmorMaterial HELLWORLD_MODEL_MATERIAL = EnumHelper.addArmorMaterial("hellworld_model", Reference.MODID + ":hellworld_model", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
	
	// Tool Materials
	public static final ToolMaterial HELLWORLD_TOOL = EnumHelper.addToolMaterial("hellworld_tool", 2, 400, 3.0f, 5.0f, 20);
	
	// Items
	public static final Item HELLWORLD_INGOT = new ItemBase("hellworld_ingot", Main.CREATIVE_TAB);
	
	// Armour
	public static final Item HELLWORLD_HELMET = new ArmourModel("hellworld_helmet", Main.CREATIVE_TAB, HELLWORLD_MODEL_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item HELLWORLD_CHESTPLATE = new ArmourModel("hellworld_chestplate", Main.CREATIVE_TAB, HELLWORLD_MODEL_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item HELLWORLD_LEGGINGS = new ArmourModel("hellworld_leggings", Main.CREATIVE_TAB, HELLWORLD_MODEL_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item HELLWORLD_BOOTS = new ArmourModel("hellworld_boots", Main.CREATIVE_TAB, HELLWORLD_MODEL_MATERIAL, EntityEquipmentSlot.FEET);
	
	// Tools
	public static final Item HELLWORLD_AXE = new ToolAxeBase("hellworld_axe", HELLWORLD_TOOL, Main.CREATIVE_TAB);
	public static final Item HELLWORLD_HOE = new ToolHoeBase("hellworld_hoe", HELLWORLD_TOOL, Main.CREATIVE_TAB);
	public static final Item HELLWORLD_PICKAXE = new ToolPickaxeBase("hellworld_pickaxe", HELLWORLD_TOOL, Main.CREATIVE_TAB);
	public static final Item HELLWORLD_SHOVEL = new ToolShovelBase("hellworld_shovel", HELLWORLD_TOOL, Main.CREATIVE_TAB);
	public static final Item HELLWORLD_SWORD = new ToolSwordBase("hellworld_sword", HELLWORLD_TOOL, Main.CREATIVE_TAB);
}
