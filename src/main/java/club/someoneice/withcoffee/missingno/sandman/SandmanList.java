package club.someoneice.withcoffee.missingno.sandman;
import club.someoneice.withcoffee.core.FoodItems;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import project.studio.manametalmod.produce.cuisine.CuisineCore;

public class SandmanList {
    private SandmanList() { }

    public static Item foodTestFood;
    public static Item foodTestDrink;
    public static Item toolHungerMaker;

    public static Item foodFoodItemTest;

    public static void TestItemList() {
        foodTestFood = new SandFood("test_food", 2, 0.5f, false, EnumAction.eat);
        foodTestDrink = new SandFood("test_drink", 2, 0.5f, false, EnumAction.drink);
        toolHungerMaker = new SandFood("hunger_maker", -2, 0.5f, false, EnumAction.drink);

        foodFoodItemTest = new FoodItems("foodItem", 5, 0.5f, false, CuisineCore.itemCoffeeCup, EnumAction.eat);

    }
}
