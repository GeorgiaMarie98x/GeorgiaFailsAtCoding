package georgiafailsatcoding.georgiafailsatcoding;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public final class GeorgiaFailsAtCoding extends JavaPlugin {

    public static class MyListener implements Listener {
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event) {
            Bukkit.broadcastMessage("" + ChatColor.DARK_GREEN + "[GeorgiaFailsAtCoding] " + ChatColor.LIGHT_PURPLE +  "Welcome, " + ChatColor.DARK_GREEN + event.getPlayer().getName() + ChatColor.LIGHT_PURPLE + ". If you see this, take a sip of water please and thank you!");
        }
    }

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("" + ChatColor.DARK_GREEN + "[GeorgiaFailsAtCoding] " + ChatColor.LIGHT_PURPLE + "Welcome to the " + ChatColor.DARK_GREEN + "PARTY!");
        Bukkit.getConsoleSender().sendMessage("" + ChatColor.DARK_GREEN + "[GeorgiaFailsAtCoding] " + ChatColor.LIGHT_PURPLE + "Hey :) - Watson was here.");
        getServer().getPluginManager().registerEvents(new MyListener(), this);

        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new MovementListener(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("" + ChatColor.DARK_GREEN + "[GeorgiaFailsAtCoding] " + ChatColor.DARK_RED + "Roger, Roger. Shutting down.");
    }
}