package eu.SkyFull.sDiscord;

import eu.SkyFull.sDiscord.Listeners.Minecraft.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            JDAManager.startBot("ODAzMjEwNDIxMjAwNjE3NDc0.YA6d_w.UjfnODAERuNZPuylQYKCyFPMXBw");
        } catch (LoginException e) {
            e.printStackTrace();
        }
        Bukkit.getPluginManager().registerEvents(new onMessageInMinecraft(), this);
        Bukkit.getPluginManager().registerEvents(new onJoinLeavePlayerInMinecraft(), this);
        Bukkit.getPluginManager().registerEvents(new onAfkChange(), this);
        Bukkit.getPluginManager().registerEvents(new onVote(), this);
        Bukkit.getPluginManager().registerEvents(new onDead(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String getStringWithoutColors(String str){
        return ChatColor.stripColor(str);
    }

    public static String getStringWithoutMarkdown(String str){
        return str
                .replace("*", "")
                .replace("~", "")
                .replace("||", "")
                .replace("`", "")
                .replace("> ", "");
    }
}
