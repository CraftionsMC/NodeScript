package net.craftions.nodescript;

import net.craftions.nodescript.commands.CommandNode;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nodescript extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("node").setExecutor(new CommandNode());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
