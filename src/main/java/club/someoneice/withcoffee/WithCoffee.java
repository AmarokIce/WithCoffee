package club.someoneice.withcoffee;

import club.someoneice.withcoffee.event.PlayerLogInEvent;
import club.someoneice.withcoffee.init.ItemList;
import club.someoneice.withcoffee.init.Recipes;
import club.someoneice.withcoffee.util.OreHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;

@Mod(modid = WithCoffee.MODID, version = WithCoffee.VERSION, dependencies ="required-after:manametalmod; after:FoodPlus")
public class WithCoffee {
    public static final String MODID = "with_coffee";
    public static final String VERSION = "1.5";
    public static Configuration config;
    public static org.apache.logging.log4j.Logger Logger = LogManager.getLogger("with_coffee");
    public static final CreativeTabs Pineapple = new CreativeTabs("tab_pineapple"){
        public Item getTabIconItem() {
            return ItemList.foodVanillaCoffee;
        }
    };

    public static boolean FoodPlusMod = false;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Logger.info("[With Coffee] >> Now loading items!");
        ItemList.init(); // Register Item here, it must be first to register.
        new OreHelper(); // Register OreDictionary here.
        new Recipes(); // Register Recipes here, and it must after to register with OreDictionary.

        Logger.info("[With Coffee] >> Now loading events!");
        MinecraftForge.EVENT_BUS.register(new PlayerLogInEvent());

        if (PineappleConfig.DebugMode) {
            Logger.info("Now debug mode is running!");
        }
    }

    @Mod.EventHandler
    public void PineappleEvent(FMLPreInitializationEvent event) {
        Logger = event.getModLog();

        Logger.info("[With Coffee] >> Thank you for install WithCoffee! Now loading FoodPlus...");
        try {
            Class.forName("com.foodplus.core.FoodPlus");
            FoodPlusMod = true;
            Logger.info("[With Coffee] >> You install the FoodPlusMod! Thank you! :)");
            Logger.info("[With Coffee] >> Hello! Thanks for play ManaMetalMod, FoodPlus and WithCoffee! Have fun!;)");
        } catch (ClassNotFoundException e) {
            FoodPlusMod = false;
            Logger.info("[With Coffee] >> You have not install the FoodPlusMod! Some of FoodPlus Recipes will not be use! :(");
            Logger.info("[With Coffee] >> Hello! Thanks for play ManaMetalMod and WithCoffee! Have fun!;)");
            Logger.info("[With Coffee] >> If you wanna, install FoodPlus together! You will have more of fun in there! XD ");
        }

        Logger.info("[With Coffee] >> Now loading config...");
        config = new Configuration(event.getSuggestedConfigurationFile());
        new PineappleConfig();
    }
}
