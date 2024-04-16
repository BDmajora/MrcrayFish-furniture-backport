package useless.dfexample.item;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFoodStackable;
import net.minecraft.core.item.ItemSeeds;
import turniplabs.halplibe.helper.ItemHelper;
import useless.dfexample.UtilIdRegistrar;

import static useless.dfexample.DFExampleMod.MOD_ID;

public class ModItems {
	// Items

	//nether items
	public static final Item netherBrick = ItemHelper.createItem(MOD_ID, new ItemAccessor("item.brick", UtilIdRegistrar.nextIdItem(), "nether_brick"), "nether_brick.png");


	public static void register() {
	}
}

