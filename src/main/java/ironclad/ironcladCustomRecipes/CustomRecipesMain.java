package ironclad.ironcladCustomRecipes;

import org.bukkit.plugin.java.JavaPlugin;

public final class CustomRecipesMain extends JavaPlugin {

    private RecipeManager recipeManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        recipeManager = new RecipeManager(this);
        recipeManager.registerAll();
        getLogger().info("Custom recipes enabled!!!!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
