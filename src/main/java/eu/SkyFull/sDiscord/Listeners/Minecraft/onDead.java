package eu.SkyFull.sDiscord.Listeners.Minecraft;

import eu.SkyFull.sDiscord.JDAManager;
import eu.SkyFull.sDiscord.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onDead implements Listener {

    @EventHandler
    public void ondead(PlayerDeathEvent e){
        JDAManager.sendMessageToDiscordMinecraftChat(Main.getStringWithoutColors(e.getDeathMessage()).replace(e.getEntity().getName(), "**"+ e.getEntity().getName() +"**"));
    }
}
