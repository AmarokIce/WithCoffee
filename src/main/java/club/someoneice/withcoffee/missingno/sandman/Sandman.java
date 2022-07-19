package club.someoneice.withcoffee.missingno.sandman;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Sandman extends Item {
    // This is a sandman, Just use for tab Icon.
	public Sandman(String name) {

        this.setUnlocalizedName(name);
        this.setTextureName(name);

        // The easy register! XD
        this.setTextureName(WithCoffee.MODID + ":" +name);
        GameRegistry.registerItem(this, name, WithCoffee.MODID);
    }
}
