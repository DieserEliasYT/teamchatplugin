package dieserblock.teamchatplugin.Commands;

import dieserblock.teamchatplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ReloadCommand implements CommandExecutor {

    Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equalsIgnoreCase("teamchat")) {
            if(args.length == 0) {
                String prefix = plugin.getConfig().getString("Prefix");
                sender.sendMessage(prefix + "§cTeam§7Chat §eis coded by: " + Main.elias);
                return true;
            }
        }
        if(args.length == 1) {
            if(args[0].equalsIgnoreCase("reload")) {
                if(sender.hasPermission("teamchat.reload")) {
                    plugin.reloadConfig();
                    String reloadMSG = plugin.getConfig().getString("reloadMSG");
                    String prefix = plugin.getConfig().getString("Prefix");
                    sender.sendMessage(prefix + reloadMSG);
                    return true;
                } else {
                    String noPerm = plugin.getConfig().getString("noPerm");
                    String prefix = plugin.getConfig().getString("Prefix");
                    sender.sendMessage(prefix + noPerm);
                }
            }
        }
        return true;
    }
}
