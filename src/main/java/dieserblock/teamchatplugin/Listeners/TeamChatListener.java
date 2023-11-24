package dieserblock.teamchatplugin.Listeners;

import dieserblock.teamchatplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

public class TeamChatListener implements Listener {

    Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        // Shortcuts
        String prefix = plugin.getConfig().getString("Prefix");
        String noPerm = plugin.getConfig().getString("noPerm");
        String reloadMSG = plugin.getConfig().getString("reloadMSG");
        String adminPerm = plugin.getConfig().getString("adminPerm");
        String Rank1 = plugin.getConfig().getString("Rank1");
        String Rank2 = plugin.getConfig().getString("Rank2");
        String Rank3 = plugin.getConfig().getString("Rank3");
        String Rank4 = plugin.getConfig().getString("Rank4");
        String Rank5 = plugin.getConfig().getString("Rank5");
        String Rank6 = plugin.getConfig().getString("Rank6");
        String Rank1perm = plugin.getConfig().getString("Rank1perm");
        String Rank2perm = plugin.getConfig().getString("Rank2perm");
        String Rank3perm = plugin.getConfig().getString("Rank3perm");
        String Rank4perm = plugin.getConfig().getString("Rank4perm");
        String Rank5perm = plugin.getConfig().getString("Rank5perm");
        String Rank6perm = plugin.getConfig().getString("Rank6perm");
        String Rank1see = plugin.getConfig().getString("Rank1see");
        String Rank2see = plugin.getConfig().getString("Rank2see");
        String Rank3see = plugin.getConfig().getString("Rank3see");
        String Rank4see = plugin.getConfig().getString("Rank4see");
        String Rank5see = plugin.getConfig().getString("Rank5see");
        String Rank6see = plugin.getConfig().getString("Rank6see");
        String Rank1pre = plugin.getConfig().getString("Rank1pre");
        String Rank2pre = plugin.getConfig().getString("Rank2pre");
        String Rank3pre = plugin.getConfig().getString("Rank3pre");
        String Rank4pre = plugin.getConfig().getString("Rank4pre");
        String Rank5pre = plugin.getConfig().getString("Rank5pre");
        String Rank6pre = plugin.getConfig().getString("Rank6pre");
        String TeamChatColor = plugin.getConfig().getString("TeamChatColor");
        String symbol = plugin.getConfig().getString("TeamChatSymbol");
        String nochatperm = plugin.getConfig().getString("noChatPerm");

        // Owner Chat
        if(e.getMessage().startsWith(Rank1pre) || p.hasPermission(adminPerm)) {
            if(p.hasPermission(Rank1perm)) {
                String msg = e.getMessage();
                for(Player rank1 : Bukkit.getOnlinePlayers()) {
                    if(rank1.hasPermission(Rank1see) || rank1.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank1.sendMessage(Rank1 + p.getName() + symbol + msg.replaceAll(Rank1pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }
        // Admin Chat
        if(e.getMessage().startsWith(Rank1pre)) {
            if(p.hasPermission(Rank2perm) || p.hasPermission(adminPerm)) {
                String msg = e.getMessage();
                for(Player rank2 : Bukkit.getOnlinePlayers()) {
                    if(rank2.hasPermission(Rank2see) || rank2.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank2.sendMessage(Rank2 + p.getName() + symbol + msg.replaceAll(Rank2pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }

        // Dev Chat
        if(e.getMessage().startsWith(Rank3pre)) {
            if(p.hasPermission(Rank3perm) || p.hasPermission(adminPerm)) {
                String msg = e.getMessage();
                for(Player rank3 : Bukkit.getOnlinePlayers()) {
                    if(rank3.hasPermission(Rank3see) || rank3.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank3.sendMessage(Rank3 + p.getName() + symbol + msg.replaceAll(Rank3pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }

        // Mod Chat
        if(e.getMessage().startsWith(Rank4pre)) {
            if(p.hasPermission(Rank4perm) || p.hasPermission(adminPerm)) {
                String msg = e.getMessage();
                for(Player rank4 : Bukkit.getOnlinePlayers()) {
                    if(rank4.hasPermission(Rank4see) || rank4.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank4.sendMessage(Rank4 + p.getName() + symbol + msg.replaceAll(Rank4pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }

        // Sup Chat
        if(e.getMessage().startsWith(Rank5pre)) {
            if(p.hasPermission(Rank5perm) || p.hasPermission(adminPerm)) {
                String msg = e.getMessage();
                for(Player rank5 : Bukkit.getOnlinePlayers()) {
                    if(rank5.hasPermission(Rank5see) || rank5.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank5.sendMessage(Rank5 + p.getName() + symbol + msg.replaceAll(Rank5pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }

        // TeamChat General
        if(e.getMessage().startsWith(Rank6pre)) {
            if(p.hasPermission(Rank6perm) || p.hasPermission(adminPerm)) {
                String msg = e.getMessage();
                for(Player rank6 : Bukkit.getOnlinePlayers()) {
                    if(rank6.hasPermission(Rank1see) || rank6.hasPermission(adminPerm)) {
                        e.setCancelled(true);
                        rank6.sendMessage(Rank6 + p.getName() + symbol + msg.replaceAll(Rank6pre, TeamChatColor));
                    }
                }
            } else {
                e.setCancelled(true);
                e.getPlayer().sendMessage(nochatperm);
            }
        }
    }

}
