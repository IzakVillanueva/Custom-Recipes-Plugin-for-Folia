package ironclad.ironcladCustomRecipes.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Complicated9x9Recipes {
    public static void register(JavaPlugin plugin){
        // add recipes here
        betterDispenserRecipe(plugin);
    }

    private static void betterDispenserRecipe(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "bow_dropper_to_dispenser");
        ItemStack result = new ItemStack(Material.DISPENSER, 1);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape(
                "TS ", // Stick, String, Air
                "TDS", // Stick, Dropper, String
                "TS "  // Stick, String, Air
        );
        recipe.setIngredient('T', Material.STICK);
        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('D', Material.DROPPER);

        Bukkit.addRecipe(recipe);
    }
}
