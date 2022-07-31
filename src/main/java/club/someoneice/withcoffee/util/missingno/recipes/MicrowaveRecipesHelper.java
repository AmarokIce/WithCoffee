package club.someoneice.withcoffee.util.missingno.recipes;

/*
import com.foodplus.core.FoodPlusItems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MicrowaveRecipesHelper {
    private static final MicrowaveRecipesHelper smeltingBase = new MicrowaveRecipesHelper();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap();

    public static final MicrowaveRecipesHelper smelting() {
        return smeltingBase;
    }

    private MicrowaveRecipesHelper() {
        this.addRecipie(FoodPlusItems.HotChocolate, new ItemStack(FoodPlusItems.HotChocolateFinal, 1), 0.1F);
    }

    public void addRecipie(Item item, ItemStack itemstack, float experience) {
        this.addLists(item, itemstack, experience);
    }

    public void addLists(Item item, ItemStack itemstack, float experience) {
        this.putLists(new ItemStack(item, 1, 32767), itemstack, experience);
    }

    public void putLists(ItemStack itemstack, ItemStack itemstack2, float experience) {
        this.smeltingList.put(itemstack, itemstack2);
        this.experienceList.put(itemstack2, experience);
    }

    @Deprecated
    public ItemStack getSmeltingResult(int par1) {
        return (ItemStack)this.smeltingList.get(par1);
    }

    public Map getSmeltingList() {
        return this.smeltingList;
    }

    @Deprecated
    public float getExperience(int par1) {
        return this.experienceList.containsKey(par1) ? (Float)this.experienceList.get(par1) : 0.0F;
    }

    public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience) {
        this.metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
        this.metaExperience.put(Arrays.asList(itemID, metadata), experience);
    }

    public ItemStack getSmeltingResult(ItemStack itemstack) {
        Iterator iterator = this.smeltingList.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (this.canBeSmelted(itemstack, (ItemStack)entry.getKey())) {
                return (ItemStack)entry.getValue();
            }
        }

        return null;
    }

    private boolean canBeSmelted(ItemStack itemstack, ItemStack itemstack2) {
        return itemstack2.getItem() == itemstack.getItem() && (itemstack2.getMaxStackSize() == 32767 || itemstack2.getMaxStackSize() == itemstack.getMaxStackSize());
    }

    public float giveExperience(ItemStack itemstack) {
        Iterator iterator = this.experienceList.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (this.canBeSmelted(itemstack, (ItemStack)entry.getKey())) {
                if (itemstack.getItem().getSmeltingExperience(itemstack) != -1.0F) {
                    return itemstack.getItem().getSmeltingExperience(itemstack);
                }

                return (Float)entry.getValue();
            }
        }

        return 0.0F;
    }

    public Map<List<Integer>, ItemStack> getMetaSmeltingList() {
        return this.metaSmeltingList;
    }
}
*/
