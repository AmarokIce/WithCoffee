package club.someoneice.withcoffee.init;

import club.someoneice.manamoon.item.ManaMoonLight;
import club.someoneice.withcoffee.WithCoffee;
import club.someoneice.withcoffee.core.M3FoodItems;
import club.someoneice.manamoon.item.MoonLightPowerGetter;
import club.someoneice.withcoffee.util.missingno.sandman.Sandman;
import club.someoneice.withcoffee.core.FoodItems;
import club.someoneice.withcoffee.core.ItemItems;
import club.someoneice.withcoffee.util.item.Milk;
import com.foodplus.core.FoodPlusItems;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import project.studio.manametalmod.potion.PotionM3;
import project.studio.manametalmod.produce.cuisine.CuisineCore;

public class ItemList {
	public static Item ItemIcon = new Sandman("icon");

	// coffee material
	public static Item itemCoffeeSugar;
	public static Item itemFermentedTea;
	public static Item itemDryTea;
	public static Item itemWoodenCap;
	public static Item foodCoffeeCream;
	public static Item itemCoffeeFlour;
	public static Item itemDough;
	public static Item itemBaguetteDough;

	public static Item itemCornmeal;



	// coffee
	public static Item foodMocha;
	public static Item foodLatte;
	public static Item foodMacchiato;
	public static Item foodHoneyCoffee;
	public static Item foodVanillaCoffee;
	public static Item foodHoneyVanillaCoffee;
	public static Item foodIcedCoffee;
	public static Item foodEggCoffee;
	public static Item foodMilkCoffee;
	public static Item foodCookieCreamCoffee;
	public static Item foodFrostCoffee;
	public static Item foodCaramelCoffee;
	public static Item foodMapleSugarCoffee;
	public static Item foodPineappleCoffee;
	public static Item foodStrawberryCoffee;
	public static Item foodPumkCoffee;
	public static Item foodEnderCoffee;

	public static Item foodLegendCoffee;

	// tea
	public static Item foodRedTea;
	public static Item foodWhiteTea;
	public static Item foodMilkTea;
	public static Item foodCaramelMilkTea;
	public static Item foodMapleSugarMilkTea;
	public static Item foodPeachTea;
	public static Item foodMintTea;
	public static Item foodHerdTea;
	public static Item foodDandelionTea;
	public static Item foodIcedTea;
	public static Item foodPineappleTea;
	public static Item foodStrawberryTea;

	public static Item foodLegendTea;

	// drink
	public static Item foodDownWithWolf;
	public static Item foodSnowForestRanger;

	// other
	public static Item foodHotCoco;
	public static Item foodHoneyMilk;

	// food
	public static Item foodCookedPineapple;
	public static Item foodHamSandwich;
	public static Item foodCheeseSandwich;
	public static Item foodBaguette;
	public static Item foodCroissant;
	public static Item foodCaramelCroissant;
	public static Item foodHoneyCroissant;
	public static Item foodPineappleCroissant;
	public static Item foodStrawberryCroissant;
	public static Item foodEggCroissant;
	public static Item foodHamCroissant;
	public static Item foodEggHamCroissant;
	public static Item foodChickenCroissant;
	public static Item foodPeachPreserves;
	public static Item foodStrawberryPreserves;
	public static Item foodPineapplePreserves;

	public static Item foodTortilla;
	public static Item foodWrap;
	public static Item foodLuckThursdayMuttonWrap;
	public static Item foodMonteCristoSandwich;


	/* FoodPlus Runtime Register */
	//coffee
	public static Item foodCoconetLatte;
	public static Item foodCookieLatte;

	// tea
	public static Item foodSugarMilkTea;
	public static Item foodNutellaMilkTea;
	public static Item foodBananaTea;

	// food
	public static Item foodBaconSandwich;

	public static Item foodWalnutCroissant;
	public static Item foodHotDogCroissant;

	public static Item Brownie;
	public static Item Trownie; // Just Chocolate.

	public static Item foodBeefWrap;

	/* ManaMoonLight register */
	public static Item itemMoonGetter;
	public static Item itemMoonPower;

	public ItemList() { }

	public static void init() {
		itemCoffeeSugar = new ItemItems("coffee_sugar");
		itemFermentedTea = new ItemItems("fermented_tea_leaves");
		itemDryTea = new ItemItems("dry_tea_leaves");
		foodCoffeeCream = new ItemItems("milk_cream");
		itemCoffeeFlour = new ItemItems("coffee_flour");
		itemWoodenCap = new ItemItems("wooden_cap");
		itemDough = new ItemItems("dough");
		itemBaguetteDough = new ItemItems("baguette_dough");


		// 2022.7.31



		foodMocha = new M3FoodItems("mocha", 5, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodLatte = new M3FoodItems("latte", 6, 0.4f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodMacchiato = new M3FoodItems("macchiato", 10, 0.25f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionHoney}, CuisineCore.itemCoffeeCup);
		foodHoneyCoffee = new M3FoodItems("honey_coffee", 8, 0.5f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionHoney}, 500,  CuisineCore.itemCoffeeCup);
		foodVanillaCoffee = new M3FoodItems("vanilla_coffee", 9, 0.5f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potiotMoney}, CuisineCore.itemCoffeeCup);
		foodHoneyVanillaCoffee = new M3FoodItems("honey_vanilla_coffee", 11, 0.5f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionHoney, PotionM3.potiotMoney}, 700, CuisineCore.itemCoffeeCup);
		foodIcedCoffee = new M3FoodItems("iced_coffee", 6, 0.5f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionCold}, 450, CuisineCore.itemCoffeeCup);
		foodEggCoffee = new M3FoodItems("egg_coffee", 6, 0.5f, new PotionM3[]{PotionM3.potionCofe}, 300, CuisineCore.itemCoffeeCup);
		foodMilkCoffee = new M3FoodItems("milk_coffee", 13, 0.6f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionWarm, PotionM3.potionHoney}, 550, CuisineCore.itemCoffeeCup);
		foodCookieCreamCoffee = new M3FoodItems("cookie_cream_coffee", 13, 0.6f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionHoney}, CuisineCore.itemCoffeeCup);
		foodFrostCoffee = new M3FoodItems("frost_coffee", 8, 0.7f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potiotMoney, PotionM3.potiotFood}, 450, CuisineCore.itemCoffeeCup);
		foodCaramelCoffee = new M3FoodItems("caramel_coffee", 10, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodMapleSugarCoffee = new M3FoodItems("maple_coffee", 8, 0.5f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionHoney}, 500, CuisineCore.itemCoffeeCup);
		foodPineappleCoffee = new M3FoodItems("pineapple_coffee", 8, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodStrawberryCoffee = new M3FoodItems("strawberry_coffee", 8, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodPumkCoffee = new M3FoodItems("pumk_coffee", 10, 0.7f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionWarm, PotionM3.potiotFood}, 400, CuisineCore.itemCoffeeCup);
		foodEnderCoffee = new M3FoodItems("ender_coffee", 5, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
		foodLegendCoffee = new M3FoodItems("legend_coffee", 20, 2f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionMinefood, PotionM3.potionHoney, PotionM3.potiotMoney}, 900, CuisineCore.itemCoffeeCup);

		foodRedTea = new M3FoodItems("red_tea", 6, 0.5f, new PotionM3[]{PotionM3.potionTea}, CuisineCore.itemTeaCup);
		foodWhiteTea = new M3FoodItems("white_tea", 6, 0.5f, new PotionM3[]{PotionM3.potionTea}, CuisineCore.itemTeaCup);
		foodMilkTea = new M3FoodItems("milk_tea", 10, 0.5f, new PotionM3[]{PotionM3.potionTea}, CuisineCore.itemTeaCup);
		foodCaramelMilkTea = new M3FoodItems("caramel_milk_tea", 10, 0.5f, new PotionM3[]{PotionM3.potionTea, PotionM3.potionMinefood}, 200,  CuisineCore.itemTeaCup);
		foodMapleSugarMilkTea = new M3FoodItems("maple_milk_tea", 10, 0.5f, new PotionM3[]{PotionM3.potionTea, PotionM3.potionHoney}, CuisineCore.itemTeaCup);
		foodMintTea = new M3FoodItems("MintTea", 10, 0.5f, new PotionM3[]{PotionM3.potionTea}, 450, CuisineCore.itemTeaCup);
		foodHerdTea = new M3FoodItems("herd_tea", 15, 1f, new PotionM3[]{PotionM3.potionTea, PotionM3.potionWarm}, 1200, CuisineCore.itemTeaCup);
		foodIcedTea = new M3FoodItems("iced_tea", 5, 0.5f, new PotionM3[]{PotionM3.potionTea, PotionM3.potionCold}, 450,CuisineCore.itemTeaCup);
		foodDandelionTea = new M3FoodItems("dandelion_tea", 5, 0.2f, new PotionM3[]{PotionM3.potionTea}, 100, CuisineCore.itemTeaCup);
		foodPeachTea = new M3FoodItems("peach_tea", 10, 0.5f, new PotionM3[]{PotionM3.potionTea}, 400, CuisineCore.itemTeaCup);
		foodPineappleTea = new M3FoodItems("pineapple_tea", 8, 0.5f, new PotionM3[]{PotionM3.potionTea}, 800, CuisineCore.itemTeaCup);
		foodStrawberryTea = new M3FoodItems("strawberry_tea", 8, 0.5f, new PotionM3[]{PotionM3.potionTea}, 800, CuisineCore.itemTeaCup);
		foodLegendTea = new M3FoodItems("legend_tea", 20, 2f, new PotionM3[]{PotionM3.potionCofe, PotionM3.potionMinefood, PotionM3.potionHoney, PotionM3.potiotMoney}, 900, CuisineCore.itemCoffeeCup);

		foodDownWithWolf = new M3FoodItems("down_with_wolf", 5, 0.5f, new PotionM3[]{PotionM3.potionAlcohol}, ItemList.itemWoodenCap);
		foodSnowForestRanger = new M3FoodItems("forest_ranger", 8, 0.6f, new PotionM3[]{PotionM3.potionAlcohol}, 900, ItemList.itemWoodenCap);

		foodHotCoco = new FoodItems("hot_coco", 8, 0.6f, false, CuisineCore.itemTeaCup, EnumAction.drink);
		foodHoneyMilk = new Milk("honey_milk", 5, 0.5f, null, 64);

		foodCookedPineapple = new FoodItems("cooked_pineapple", 8, 0.5f);
		foodHamSandwich = new FoodItems("han_sandwich", 10, 0.6f);
		foodCheeseSandwich = new FoodItems("cheese_sandwich", 10, 0.5f);
		foodBaguette = new FoodItems("baguette", 10, 0.5f);
		foodCroissant = new FoodItems("croissant", 4, 0.5f);
		foodCaramelCroissant = new FoodItems("caramel_croissant", 8, 0.6f);
		foodHoneyCroissant = new FoodItems("honey_croissant", 8, 0.6f);
		foodPineappleCroissant = new FoodItems("pineapple_croissant", 7, 0.6f);
		foodStrawberryCroissant = new FoodItems("strawberry_croissant", 7, 0.6f);
		foodEggCroissant = new FoodItems("egg_croissant", 9, 0.6f);
		foodHamCroissant = new FoodItems("ham_croissant", 9, 0.6f);
		foodEggHamCroissant = new FoodItems("egg_club", 14, 0.6f);
		foodChickenCroissant = new FoodItems("chicken_croissant", 12, 0.6f);
		foodPeachPreserves = new M3FoodItems("peach_preserves", 2, 0.2f, new PotionM3[]{PotionM3.potionHoney}, 200, null);
		foodStrawberryPreserves = new M3FoodItems("strawberry_preserves", 2, 0.2f, new PotionM3[]{PotionM3.potionHoney}, 200, null);
		foodPineapplePreserves = new M3FoodItems("pineapple_preserves", 2, 0.2f, new PotionM3[]{PotionM3.potionHoney}, 200, null);

		if(WithCoffee.FoodPlusMod) {
			WithCoffee.Logger.info("[With Coffee] >> Now register the FoodPlus foods...");
			foodCoconetLatte = new M3FoodItems("coconet_latte", 7, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);
			foodCookieLatte = new M3FoodItems("cookie_latte", 8, 0.5f, new PotionM3[]{PotionM3.potionCofe}, CuisineCore.itemCoffeeCup);

			foodSugarMilkTea = new FoodItems("sugar_tea", 6, 0.5f, false, FoodPlusItems.Mug, EnumAction.drink);
			foodNutellaMilkTea = new FoodItems("nutella_tea", 8, 0.6f, false, CuisineCore.itemTeaCup, EnumAction.drink);
			foodBananaTea = new FoodItems("banana_tea", 7, 0.3f, false, CuisineCore.itemTeaCup, EnumAction.drink);

			foodBaconSandwich = new FoodItems("bacon_sandwich", 13, 0.5f);

			foodWalnutCroissant = new FoodItems("walnut_croissant", 15, 0.5f);
			foodHotDogCroissant = new FoodItems("hot_dog_croissant", 15, 0.5f);

			Brownie = new FoodItems("brownie", 6, 0.5f);
			Trownie = new FoodItems("trownie", 6, 0.5f);

			if(true) {
				// TODO - Here is ManaMoonMode's item and now it code in WithCoffee. So here if(true).
				itemMoonGetter = new MoonLightPowerGetter();
				itemMoonPower = new ManaMoonLight();
			}


		} else {
			WithCoffee.Logger.info("[With Coffee] >> Now skin the FoodPlus foods register...");
		}
	}
}
