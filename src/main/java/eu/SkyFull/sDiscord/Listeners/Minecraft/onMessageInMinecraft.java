package eu.SkyFull.sDiscord.Listeners.Minecraft;

import eu.SkyFull.sDiscord.JDAManager;
import eu.SkyFull.sDiscord.Main;
import me.clip.placeholderapi.PlaceholderAPI;
import me.leoko.advancedban.manager.PunishmentManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class onMessageInMinecraft implements Listener {

    @EventHandler
    public void onAsynchronousMessage(AsyncPlayerChatEvent e){
        if(!e.isCancelled()){
            if(!PunishmentManager.get().isMuted(e.getPlayer().getName())) {
                JDAManager.sendMessageToDiscordMinecraftChat(
                        Main.getStringWithoutColors(
                                PlaceholderAPI.setPlaceholders(e.getPlayer(),
                                        "%LevelPoints_player_level% | **%luckperms_primary_group_name%** " + e.getPlayer().getName() + " ➛ `" + e.getMessage() + "`"
                                )
                        )
                );
            }
        }
    }
}
