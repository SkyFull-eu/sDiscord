package eu.SkyFull.sDiscord.Listeners.Minecraft;

import eu.SkyFull.sDiscord.JDAManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class onJoinLeavePlayerInMinecraft implements Listener {

    @EventHandler
    public void onJoinPlayerInMinecraft(PlayerJoinEvent e){
        JDAManager.sendMessageToDiscordMinecraftChat("[**+**] "+ e.getPlayer().getName());
        //JDAManager.getJDA().getTextChannelById("802572561174757376").getManager().setTopic("Hráči: "+ Bukkit.getOnlinePlayers().size() +"/"+ Bukkit.getServer().getMaxPlayers()).complete();
    }


    @EventHandler
    public void onLeavePlayerInMinecraft(PlayerQuitEvent e){
        JDAManager.sendMessageToDiscordMinecraftChat("[**-**] "+ e.getPlayer().getName());
        //JDAManager.getJDA().getTextChannelById("802572561174757376").getManager().setTopic("Hráči: "+ Bukkit.getOnlinePlayers().size() +"/"+ Bukkit.getServer().getMaxPlayers()).complete();
    }
}
