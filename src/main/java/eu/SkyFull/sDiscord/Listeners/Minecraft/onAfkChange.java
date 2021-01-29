package eu.SkyFull.sDiscord.Listeners.Minecraft;

import eu.SkyFull.sDiscord.JDAManager;
import eu.SkyFull.sDiscord.Main;
import net.ess3.api.events.AfkStatusChangeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class onAfkChange implements Listener {


    @EventHandler
    public void onAFK(AfkStatusChangeEvent e){
        if(e.getValue()){
            JDAManager.sendMessageToDiscordMinecraftChat(Main.getStringWithoutColors("**･AFK** "+ e.getController().getName() +" je mimo počítač."));
        } else {
            JDAManager.sendMessageToDiscordMinecraftChat(Main.getStringWithoutColors("**･AFK** "+ e.getController().getName() +" už je zase u počítače."));
        }
    }
}
