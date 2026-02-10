package ironclad.ironcladCustomRecipes.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockToItemRecipes {
    public static void register(JavaPlugin plugin){
        // add recipes here
        quartzBlockToItem(plugin);
        prismarineBlockToItem(plugin);
        prismarineBricksToItem(plugin);
        honeycombBlockToItem(plugin);
        bricksToBrick(plugin); // bruh ts hilarious naming
    }

    private static void quartzBlockToItem(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "quartz_block_to_item");
        ItemStack result = new ItemStack(Material.QUARTZ, 4);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape("Q");
        recipe.setIngredient('Q', Material.QUARTZ_BLOCK);

        Bukkit.addRecipe(recipe);
    }

    private static void prismarineBlockToItem(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "prismarine_block_to_item");
        ItemStack result = new ItemStack(Material.PRISMARINE_SHARD, 4);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape("P");
        recipe.setIngredient('P', Material.PRISMARINE);

        Bukkit.addRecipe(recipe);
    }

    private static void prismarineBricksToItem(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "prismarine_bricks_to_item");
        ItemStack result = new ItemStack(Material.PRISMARINE_SHARD, 9);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape("P");
        recipe.setIngredient('P', Material.PRISMARINE_BRICKS);

        Bukkit.addRecipe(recipe);
    }

    private static void honeycombBlockToItem(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "honeycomb_block_to_item");
        ItemStack result = new ItemStack(Material.HONEYCOMB, 4);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape("H");
        recipe.setIngredient('H', Material.HONEYCOMB_BLOCK);

        Bukkit.addRecipe(recipe);
    }

    private static void bricksToBrick(JavaPlugin plugin){
        NamespacedKey key = new NamespacedKey(plugin, "bricks_to_brick");
        ItemStack result = new ItemStack(Material.BRICK, 4);

        ShapedRecipe recipe = new ShapedRecipe(key, result);
        recipe.shape("B");
        recipe.setIngredient('B', Material.BRICKS);

        Bukkit.addRecipe(recipe);
    }
}
