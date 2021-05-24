package io.github.jieshengnp.jsdeathcoordinates.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEventListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity().getPlayer();
        Location deathLocation = player.getLocation();
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        World deathWorld = player.getWorld();
        String deathWorldName = deathWorld.getName();
        switch (deathWorld.getName()){
            case "world":
                deathWorldName = "The Overworld";
                break;
            case "world_nether":
                deathWorldName = "The Nether";
                break;
            case "world_the_end":
                deathWorldName = "The End";
        }

        console.sendMessage( ChatColor.GREEN + "[JSDeathCoordinates] " + ChatColor.RED + player.getName() + " has died in " + deathLocation.getWorld().getName() + " at " + String.format("%.2f", deathLocation.getX()) + " " + String.format("%.2f", deathLocation.getY()) + " " + String.format("%.2f", deathLocation.getZ()));
        player.sendMessage(ChatColor.GREEN + "[JSDeathCoordinates] " + ChatColor.RED + "You have died in " + deathWorldName + " at X:" + String.format("%.2f", deathLocation.getX()) + " Y:" + String.format("%.2f", deathLocation.getY()) + " Z:" + String.format("%.2f", deathLocation.getZ()));
    }
}
