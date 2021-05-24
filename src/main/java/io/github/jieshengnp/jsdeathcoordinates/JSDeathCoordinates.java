package io.github.jieshengnp.jsdeathcoordinates;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class JSDeathCoordinates extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[JSDeathCoordinates] is now Enabled.");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[JSDeathCoordinates] is now Disabled.");
    }
}
