package club.someoneice.withcoffee.event;

import club.someoneice.withcoffee.init.ItemList;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import project.studio.manametalmod.produce.cuisine.CuisineCore;

public class RecipesEvent{
    public RecipesEvent() { }

    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent event) {
        Item item = event.crafting.getItem();
        EntityPlayer player = event.player;

        if (item == ItemList.foodLegendCoffee) {
            player.inventory.addItemStackToInventory(new ItemStack(CuisineCore.itemCoffeeCup));
        }
    }
}
