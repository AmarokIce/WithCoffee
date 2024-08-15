package club.someoneice.withcoffee.event;

import club.someoneice.withcoffee.ConfigHandle;
import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class PlayerLogInEvent {
    public PlayerLogInEvent() {
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer player = event.player;

        player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + "Good Day," + event.player.getDisplayName() + "! " + StatCollector.translateToLocal("hello.with_coffee.message")));

        if (WithCoffee.FoodPlusMod) {
            player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + StatCollector.translateToLocal("foodplus.with_coffee.message")));
        } else {
            player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + EnumChatFormatting.RED + StatCollector.translateToLocal("no_foodplus.with_coffee.message")));
        }

        if (ConfigHandle.DebugMode) {
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RED + "] >> " + EnumChatFormatting.RED + StatCollector.translateToLocal("debug.with_coffee.message")));
        }
    }
}