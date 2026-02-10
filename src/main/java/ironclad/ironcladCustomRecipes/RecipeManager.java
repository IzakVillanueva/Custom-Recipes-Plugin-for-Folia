package ironclad.ironcladCustomRecipes;

import ironclad.ironcladCustomRecipes.recipes.BlockToItemRecipes;
import ironclad.ironcladCustomRecipes.recipes.Complicated9x9Recipes;
import org.bukkit.plugin.java.JavaPlugin;

public class RecipeManager {
    private final JavaPlugin plugin;

    public RecipeManager(JavaPlugin plugin){
        this.plugin = plugin;
    }

    public void registerAll(){
        // Add recipes here from recipes/..
        BlockToItemRecipes.register(plugin);
        Complicated9x9Recipes.register(plugin);
    }
}
/*
*   Shape explanation:
*   "Q" = single item in top-left slot of crafting grid
*   "QQQ" = 3 items in a horizontal row
*   "Q", "Q", "Q" = 3 items in a vertical column
*   "QQ", "QQ" = 2x2 square (like the coal example)
*   "QQQ", "QQQ", "QQQ" = full 3x3 grid
* */