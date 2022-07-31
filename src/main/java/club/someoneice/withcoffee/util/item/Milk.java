package club.someoneice.withcoffee.util.item;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Milk extends ItemFood {

    private Item setItem;

    public Milk(String name, int food, float saturation, Item returnItem, int setMaxStackSize) {

        super(food, saturation, false);

        this.setUnlocalizedName(name);
        this.setTextureName(name);
        this.setMaxStackSize(setMaxStackSize);

        this.setAlwaysEdible();

        this.setItem = returnItem;
        this.setCreativeTab(WithCoffee.Pineapple);
        this.setTextureName(WithCoffee.MODID + ":" +name);

        GameRegistry.registerItem(this, name, WithCoffee.MODID);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) { return 32;}


    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) { return EnumAction.drink;}

    @Override
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
        if (!world.isRemote) player.curePotionEffects(itemstack);

        player.inventory.addItemStackToInventory(new ItemStack(this.setItem));

        return itemstack.stackSize <= 0 ? new ItemStack(this.setItem) : itemstack;
    }
}
