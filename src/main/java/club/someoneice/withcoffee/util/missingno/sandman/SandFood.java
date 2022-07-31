package club.someoneice.withcoffee.util.missingno.sandman;

import club.someoneice.withcoffee.WithCoffee;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

// Deprecated
@Deprecated
public class SandFood extends ItemFood {

    public EnumAction enumAction;

    public SandFood(String name, int hunger, float stat, boolean wolfFood, EnumAction enumAction) {
        super(hunger, stat, wolfFood);
        this.setUnlocalizedName(name);
        this.setTextureName(name);

        this.setAlwaysEdible();

        this.enumAction = enumAction;

        this.setTextureName(WithCoffee.MODID + ":" +name);
        GameRegistry.registerItem(this, name, WithCoffee.MODID);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack itemStack) { return this.enumAction;}
}

