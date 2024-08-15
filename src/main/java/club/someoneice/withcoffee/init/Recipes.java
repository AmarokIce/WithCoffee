package club.someoneice.withcoffee.init;

import club.someoneice.withcoffee.WithCoffee;
import com.foodplus.core.FoodPlusItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import project.studio.manametalmod.ManaMetalAPI;
import project.studio.manametalmod.ManaMetalMod;
import project.studio.manametalmod.core.ItemStackOre;
import project.studio.manametalmod.core.RecipeOre;
import project.studio.manametalmod.itemAndBlockCraft.ItemCraft10;
import project.studio.manametalmod.itemAndBlockCraft.ItemCraft3;
import project.studio.manametalmod.produce.cuisine.CuisineCore;
import project.studio.manametalmod.produce.farming.FarmCore;

public class Recipes {
    public Recipes() {
        /* Recipes. */
        GameRegistry.addRecipe(new ItemStack(ItemList.itemWoodenCap, 1), "I I", "# #", "I#I", 'I', Items.iron_ingot, '#', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(ItemList.itemBaguetteDough, 1), "I  ", " I ", "  I", 'I', ItemList.itemDough);
        GameRegistry.addRecipe(new ItemStack(ItemList.itemBaguetteDough, 1), "  I", " I ", "I  ", 'I', ItemList.itemDough);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.itemDough, 2), "flour", "flour"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodHamSandwich, 1), ItemCraft3.Toast, ItemCraft3.Toast, ItemCraft3.Toast, ManaMetalMod.Ham));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodCheeseSandwich, 1), ItemCraft3.Toast, ItemCraft3.Toast, ItemCraft3.Toast, ManaMetalMod.Cheese));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodCaramelCroissant, 1), FarmCore.MapleSugar, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodHoneyCroissant, 1), "dropHoney", ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodPineappleCroissant, 1), FarmCore.Pineapple, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodStrawberryCroissant, 1), FarmCore.Strawberry, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodEggCroissant, 1), Items.egg, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodHamCroissant, 1), ManaMetalMod.Ham, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodEggHamCroissant, 1), Items.egg, ManaMetalMod.Ham, ItemList.foodCroissant));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodChickenCroissant, 1), Items.cooked_chicken, ItemList.foodCroissant));

        /* Smelting. */
        GameRegistry.addSmelting(ItemList.itemDough, new ItemStack(ItemList.foodCroissant), 0.3f);
        GameRegistry.addSmelting(ItemList.itemBaguetteDough, new ItemStack(ItemList.foodBaguette), 0.3f);

        /* MMM */
        //* Grinder *//
        ManaMetalAPI.FoodGrindingRecipeList.add(new RecipeOre(new ItemStackOre("cropCoffeebeans"), new ItemStackOre("cropCoffeebeans"), new ItemStack(ItemList.itemCoffeeFlour, 2)));
        ManaMetalAPI.FoodGrindingRecipeList.add(new RecipeOre(new ItemStackOre("foodCoffeebeans"), new ItemStackOre("foodCoffeebeans"), new ItemStack(ItemList.itemCoffeeFlour, 2)));
        ManaMetalAPI.FoodGrindingRecipeList.add(new RecipeOre(new ItemStackOre(Items.sugar), new ItemStackOre(Items.sugar), new ItemStack(ItemList.itemCoffeeSugar, 3)));

        //* Juicer *//
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("flourCoffee"), new ItemStackOre(CuisineCore.itemCoffeeCup), new ItemStack(CuisineCore.foodCoffee)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("listAllmilk"), new ItemStackOre("listAllmilk"), new ItemStack(ItemList.foodCoffeeCream)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(Blocks.ice), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodIcedCoffee)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("listAllegg"), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodEggCoffee)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("listAllmilk"), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodMilkCoffee)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(Items.cookie), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodCookieCreamCoffee)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("foodCake"), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodFrostCoffee)));

        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("itemDryTea"), new ItemStackOre(CuisineCore.itemTeaCup), new ItemStack(ItemList.foodRedTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("listAllmilk"), new ItemStackOre(ItemList.foodRedTea), new ItemStack(ItemList.foodMilkTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("foodCaramel"), new ItemStackOre(ItemList.foodMilkTea), new ItemStack(ItemList.foodCaramelMilkTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.MapleSugar), new ItemStackOre(ItemList.foodMilkTea), new ItemStack(ItemList.foodMapleSugarMilkTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("foodMint"), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodMintTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("cropMint"), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodMintTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre("flourCoffee"), new ItemStackOre(ItemList.foodMintTea), new ItemStack(ItemList.foodHerdTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(Blocks.ice), new ItemStackOre(ItemList.foodMintTea), new ItemStack(ItemList.foodIcedTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(Blocks.yellow_flower), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodDandelionTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.foodPeachPreserves), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodPeachTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.foodStrawberryPreserves), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodStrawberryTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.foodPineapplePreserves), new ItemStackOre(CuisineCore.foodTea), new ItemStack(ItemList.foodPineappleTea)));

        //* Bake *//
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("cropTealeaf"), new ItemStackOre("cropTealeaf"), new ItemStack(ItemList.itemDryTea, 2)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodTealeaf"), new ItemStackOre("foodTealeaf"), new ItemStack(ItemList.itemDryTea, 2)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodChocolatebar"), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodMocha)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodCream"), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodLatte)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodCaramel"), new ItemStackOre(ItemList.foodLatte), new ItemStack(ItemList.foodMacchiato)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodVanilla"), new ItemStackOre(ItemList.foodLatte), new ItemStack(ItemList.foodVanillaCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("cropVanilla"), new ItemStackOre(ItemList.foodLatte), new ItemStack(ItemList.foodVanillaCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("dropHoney"), new ItemStackOre(ItemList.foodLatte), new ItemStack(ItemList.foodHoneyCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("dropHoney"), new ItemStackOre(ItemList.foodVanillaCoffee), new ItemStack(ItemList.foodHoneyVanillaCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("cropVanilla"), new ItemStackOre(ItemList.foodHoneyCoffee), new ItemStack(ItemList.foodHoneyVanillaCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.MapleSugar), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodMapleSugarCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Pineapple), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodPineappleCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Strawberry), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodStrawberryCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(Blocks.pumpkin), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodPumkCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(Items.ender_pearl), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodEnderCoffee)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("foodChocolatebar"), new ItemStackOre(CuisineCore.itemCoffeeCup), new ItemStack(ItemList.foodHotCoco)));
        ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre("dropHoney"), new ItemStackOre("listAllmilk"), new ItemStack(ItemList.foodHoneyMilk)));

        //* Fermentation *//
        ManaMetalAPI.FoodFermentationRecipeList.add(new RecipeOre(new ItemStackOre("itemDryTea"), new ItemStackOre("itemDryTea"), new ItemStack(ItemList.itemFermentedTea, 2)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.itemFermentedTea), new ItemStackOre(CuisineCore.itemTeaCup), new ItemStack(ItemList.foodWhiteTea)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(ItemCraft10.fruitTree3), new ItemStackOre(ItemCraft10.fruitTree3), new ItemStack(ItemList.foodPeachPreserves)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Pineapple), new ItemStackOre(FarmCore.Pineapple), new ItemStack(ItemList.foodPineapplePreserves)));
        ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Strawberry), new ItemStackOre(FarmCore.Strawberry), new ItemStack(ItemList.foodStrawberryPreserves)));

        //* Bartender*//
        ManaMetalAPI.FoodBartendingRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Pineapple), new ItemStackOre(ItemList.itemWoodenCap), new ItemStack(ItemList.foodDownWithWolf)));
        ManaMetalAPI.FoodBartendingRecipeList.add(new RecipeOre(new ItemStackOre(FarmCore.Strawberry), new ItemStackOre(ItemList.foodDownWithWolf), new ItemStack(ItemList.foodSnowForestRanger)));

        //* Kiln *//
        // ManaMetalAPI.FoodKilnRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.itemDough), new ItemStack(ItemList.foodCroissant)));
        // ManaMetalAPI.FoodKilnRecipeList.add(new RecipeOre(new ItemStackOre(ItemList.itemBaguetteDough), new ItemStack(ItemList.foodBaguette)));

        //* Injection *//
        ManaMetalAPI.ManaMetalInjectionRecipeList.add(new ItemStack[]{new ItemStack(ItemList.foodMocha), new ItemStack(ItemList.foodLatte), new ItemStack(ItemList.foodVanillaCoffee), new ItemStack(ItemList.foodMacchiato), new ItemStack(ItemList.foodEggCoffee), new ItemStack(ItemList.foodCookieCreamCoffee), new ItemStack(ItemList.foodStrawberryCoffee), new ItemStack(ItemList.foodPineappleCoffee), new ItemStack(ItemList.foodEnderCoffee), new ItemStack(ItemList.foodLegendCoffee)});
        ManaMetalAPI.ManaMetalInjectionRecipeList.add(new ItemStack[]{new ItemStack(ItemList.foodHerdTea), new ItemStack(ItemList.foodMapleSugarMilkTea), new ItemStack(ItemList.foodIcedTea), new ItemStack(ItemList.foodMintTea), new ItemStack(ItemList.foodMilkTea), new ItemStack(ItemList.foodWhiteTea), new ItemStack(ItemList.foodStrawberryTea), new ItemStack(ItemList.foodPineappleTea), new ItemStack(ItemList.foodRedTea), new ItemStack(ItemList.foodLegendTea)});

        if (WithCoffee.FoodPlusMod) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodBaconSandwich), ItemCraft3.Toast, ItemCraft3.Toast, ItemCraft3.Toast, FoodPlusItems.CookedBacon));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodWalnutCroissant), FoodPlusItems.Walnut, ItemList.foodCroissant));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemList.foodHotDogCroissant), FoodPlusItems.Sausage, ItemList.foodCroissant));

            ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.IceCube), new ItemStackOre(CuisineCore.foodCoffee), new ItemStack(ItemList.foodIcedCoffee)));
            ManaMetalAPI.FoodJuiceRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.IceCube), new ItemStackOre(ItemList.foodMintTea), new ItemStack(ItemList.foodIcedTea)));

            ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.Coconut), new ItemStackOre(ItemList.foodLatte), new ItemStack(ItemList.foodCoconetLatte)));
            ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.BaseCookie), new ItemStackOre(ItemList.foodCoconetLatte), new ItemStack(ItemList.foodCookieLatte)));
            ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(Items.sugar), new ItemStackOre(ItemList.foodMilkTea), new ItemStack(ItemList.foodSugarMilkTea)));
            ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.Nutella), new ItemStackOre(ItemList.foodMilkTea), new ItemStack(ItemList.foodNutellaMilkTea)));
            ManaMetalAPI.FoodBakingRecipeList.add(new RecipeOre(new ItemStackOre(FoodPlusItems.Banana), new ItemStackOre(ItemList.foodMilkTea), new ItemStack(ItemList.foodBananaTea)));
        }
    }
}
