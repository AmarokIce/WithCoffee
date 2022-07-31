package club.someoneice.manamoon.item;

import club.someoneice.withcoffee.WithCoffee;
import club.someoneice.withcoffee.init.ItemList;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class MoonLightPowerGetter extends Item {

    public MoonLightPowerGetter() {
        this.setUnlocalizedName("moon_getter");
        this.setTextureName("moon_getter");

        setMaxStackSize(1);

        this.setCreativeTab(WithCoffee.Pineapple);
        this.setTextureName(WithCoffee.MODID + ":" + "moon_getter");

        GameRegistry.registerItem(this, "moon_getter", WithCoffee.MODID);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) { return 256;}

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) { return EnumAction.bow;}

    @Override
    public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
        super.onEaten(itemStack, world, player);
        WorldServer worldserver = MinecraftServer.getServer().worldServers[0];
        long getTime = worldserver.getWorldTime();

        if (getTime > 14000) {
            world.playSoundAtEntity(player, "mob.wolf.howl", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            return new ItemStack(ItemList.Brownie);
        }
        else {
            world.playSoundAtEntity(player, "mob.wolf.shake", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            return itemStack;
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        super.onItemRightClick(itemStack, world, player);
        WorldServer worldserver = MinecraftServer.getServer().worldServers[0];
        long getTime = worldserver.getWorldTime();

        if (getTime > 14000){
            player.canEat(true);
            player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
        }

        if (getTime > 14000) {
            if (player.capabilities.isCreativeMode)
                return new ItemStack(ItemList.Brownie);
        }
        return itemStack;
    }
}
