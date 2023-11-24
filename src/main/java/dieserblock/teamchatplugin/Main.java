package dieserblock.teamchatplugin;

import dieserblock.teamchatplugin.Commands.ReloadCommand;
import dieserblock.teamchatplugin.Listeners.TeamChatListener;
import dieserblock.teamchatplugin.Utilities.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    public static String elias = "§bDieserEliasYT §8|| §edieser-block.de";
    private static Main plugin;


    @Override
    public void onEnable() {
        // Commands
        getCommand("teamchat").setExecutor(new ReloadCommand());



        // Listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new TeamChatListener(), this);



        // Sonstiges
        int pluginId = 20371;
        Metrics metrics = new Metrics(this, pluginId);
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My Value"));
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        plugin = this;




        // Start Nachricht
        System.out.println("§a--------------------");
        System.out.println("§cTeam§7Chat §anabled!");
        System.out.println("§a--------------------");

    }

    @Override
    public void onDisable() {
        // Stop Nachricht
        System.out.println("§c----------------------");
        System.out.println("§cTeam§7Chat §cdisabled!");
        System.out.println("§c----------------------");
    }
}
