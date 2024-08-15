package club.someoneice.withcoffee.util.bean;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import project.studio.manametalmod.potion.PotionEffectM3;
import project.studio.manametalmod.potion.PotionM3;

public class M3FoodItems extends FoodItems {
    private final int time;
    private final PotionM3[] M3Effect;

    public M3FoodItems(String name, int food, float saturation, boolean wolfFood, PotionM3[] effects, int time, Item returnItem, EnumAction DrinkItem) {

        super(name, food, saturation, wolfFood, returnItem, DrinkItem);

        this.M3Effect = effects;
        this.time = time;
    }

    public M3FoodItems(String name, int hunger, float staturation, PotionM3[] effects, Item returnItem) {
        this(name, hunger, staturation, false, effects, 600, returnItem, EnumAction.drink);
    }

    public M3FoodItems(String name, int hunger, float staturation, PotionM3[] effects, int time, Item returnItem) {
        this(name, hunger, staturation, false, effects, time, returnItem, EnumAction.drink);
    }

    @Override
    public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player) {
        super.onEaten(itemstack, world, player);
        for (PotionM3 effect : M3Effect) PotionEffectM3.addPotion(player, effect, time, 0);

        return itemstack;
    }
}
