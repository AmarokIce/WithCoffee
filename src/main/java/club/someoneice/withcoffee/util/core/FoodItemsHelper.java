package club.someoneice.withcoffee.util.core;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//Deprecated - It much bug here and I didn't wanna to fix.
@Deprecated
public class FoodItemsHelper extends ItemFood {
    // Pineapple? The PineapplePsychicParty! (?)

    private int maxUseDuration;
    private Item returnItem;
    private EnumAction enumAction;

    public FoodItemsHelper(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, Item returnItem, int useDuration, int setMaxStackSize, EnumAction DrinkItem) {

        super(food, saturation, wolfFood);

        this.setUnlocalizedName(name);
        this.setTextureName(name);

        if (setAlwaysEdible)
            this.setAlwaysEdible();

        this.setMaxStackSize(setMaxStackSize);
        this.returnItem = returnItem;
        this.maxUseDuration = useDuration;
        this.enumAction = enumAction;

        this.setCreativeTab(WithCoffee.Pineapple);

        // Okay, The list of item to register not be work in 1.7.10 . So just take registry when Item has be create.
        // ItemList.ITEM_LIST.add(this);
        GameRegistry.registerItem(this, name, WithCoffee.MODID);
    }

    public FoodItemsHelper(String name, int food, float saturation) {
        this(name, food, saturation, false, true, null, 32, 64, EnumAction.eat);
    }

    public FoodItemsHelper(String name, int food, float saturation, Item returnItem, EnumAction enumAction) {
        this(name, food, saturation, false, true, returnItem, 32, 64, enumAction);
    }

    public FoodItemsHelper(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, null, 32, 64, EnumAction.eat);
    }

    public FoodItemsHelper(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, Item returnItem) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, null, 32, 64, EnumAction.eat);
    }

    public FoodItemsHelper(String name, int food, float saturation, Item returnItem, int useDuration, int setMaxStackSize, EnumAction enumAction) {
        this(name, food, saturation, false, true, returnItem, useDuration, setMaxStackSize, enumAction);
    }

    public FoodItemsHelper(String name, int food, float saturation, boolean wolfFood, boolean setAlwaysEdible, EnumAction enumAction) {
        this(name, food, saturation, wolfFood, setAlwaysEdible, null, 32, 64, enumAction);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return maxUseDuration;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) { return this.enumAction;}

    @Override
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
        super.onEaten(itemstack, world, player);

        player.inventory.addItemStackToInventory(new ItemStack(this.returnItem));
        return itemstack.stackSize <= 0 ? new ItemStack(this.returnItem) : itemstack;
    }
}