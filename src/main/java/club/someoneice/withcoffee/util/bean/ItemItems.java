package club.someoneice.withcoffee.util.bean;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemItems extends Item {
    public ItemItems(String name, int setMaxStackSize) {
        this.setUnlocalizedName(name);
        this.setTextureName(name);

        this.setMaxStackSize(setMaxStackSize);

        this.setCreativeTab(WithCoffee.Pineapple);
        this.setTextureName(WithCoffee.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
    }

    public ItemItems(String name) {
        this(name, 64);
    }
}