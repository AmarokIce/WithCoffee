package club.someoneice.withcoffee.util.bean;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodItems extends ItemFood {

    private final Item returnItem;
    private final EnumAction action;

    public FoodItems(String name, int food, float saturation, boolean wolfFood, Item returnItem, EnumAction action) {
        super(food, saturation, wolfFood);
        this.setUnlocalizedName(name);
        this.setAlwaysEdible();
        this.setCreativeTab(WithCoffee.Pineapple);
        this.setTextureName(WithCoffee.MODID + ":" + name);

        this.returnItem = returnItem;
        this.action = action;

        GameRegistry.registerItem(this, name);
    }

    public FoodItems(String name, int hunger, float saturation) {
        this(name, hunger, saturation, false, null, EnumAction.eat);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) {
        return this.action;
    }

    @Override
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
        super.onEaten(itemstack, world, player);
        if (returnItem != null) player.inventory.addItemStackToInventory(new ItemStack(this.returnItem));
        return itemstack;
    }
}
