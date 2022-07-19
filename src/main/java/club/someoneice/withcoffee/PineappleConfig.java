package club.someoneice.withcoffee;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class PineappleConfig {

    public static Boolean DebugMode = false;

    public PineappleConfig() {
        Configuration config = WithCoffee.config;
        config.load();
        config.addCustomCategoryComment("WithCoffee", "Welcome! There is the config for WithCoffee!");
        Property debug = config.get("Booleans", "Enter with debug mod.", DebugMode);
        debug.comment = "If you wanna to use the debug item and food, take it true. But it doesn't make sense.";
        DebugMode = debug.getBoolean(DebugMode);
        config.save();
    }
}
