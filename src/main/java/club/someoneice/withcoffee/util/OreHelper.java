package club.someoneice.withcoffee.util;

import club.someoneice.withcoffee.WithCoffee;
import club.someoneice.withcoffee.init.ItemList;
import com.foodplus.core.FoodPlusItems;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import project.studio.manametalmod.ManaMetalAPI;
import project.studio.manametalmod.ManaMetalMod;

public class OreHelper {
    public OreHelper() {
        OreDictionary.registerOre("listAllmilk", ItemList.foodHoneyMilk);
        OreDictionary.registerOre("foodCream", ItemList.foodCoffeeCream);
        OreDictionary.registerOre("itemDryTea", ItemList.itemDryTea);
        OreDictionary.registerOre("flourCoffee", ItemList.itemCoffeeFlour);
        
        OreDictionary.registerOre("foodCake", ManaMetalMod.smallcake);
        OreDictionary.registerOre("foodCake", Items.cake);

        if (WithCoffee.FoodPlusMod) {
            OreDictionary.registerOre("flourCoffee", FoodPlusItems.CoffeeDust);
            OreDictionary.registerOre("dustCoffee", FoodPlusItems.CoffeeDust);
            OreDictionary.registerOre("foodTealeaf", FoodPlusItems.TeaLeaves);
            OreDictionary.registerOre("itemDryTea", FoodPlusItems.DriedTeaLeaves);
            OreDictionary.registerOre("foodChocolatebar", FoodPlusItems.Chocolate);
            OreDictionary.registerOre("foodCaramel", FoodPlusItems.Caramel);
            OreDictionary.registerOre("flour", FoodPlusItems.Flour);

            // Add the IceCubes in frozen item for ManaMetalMod.
            ManaMetalAPI.addFrozenItem(FoodPlusItems.IceTray, 600);
            ManaMetalAPI.addFrozenItem(FoodPlusItems.IceCube, 100);
        }
    }
}
