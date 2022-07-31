package club.someoneice.withcoffee.util.event;

import club.someoneice.withcoffee.PineappleConfig;
import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class PlayerLogInEvent {
    public PlayerLogInEvent() { }

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.player instanceof EntityPlayer) { }

        EntityPlayer player = event.player;

        player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + "Good Day," + event.player.getDisplayName() + "! " + StatCollector.translateToLocal("hello.with_coffee.message")));
        player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + "Test," + event.player.getDisplayName() + "! "));

        if (WithCoffee.FoodPlusMod)
            player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " + StatCollector.translateToLocal("foodplus.with_coffee.message")));
        else
            player.addChatMessage(new ChatComponentText("[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RESET + "] >> " +EnumChatFormatting.RED +  StatCollector.translateToLocal("no_foodplus.with_coffee.message")));

        if (PineappleConfig.DebugMode)
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[" + EnumChatFormatting.AQUA + "With Coffee" + EnumChatFormatting.RED + "] >> " + EnumChatFormatting.RED + StatCollector.translateToLocal("debug.with_coffee.message")));
    }
}