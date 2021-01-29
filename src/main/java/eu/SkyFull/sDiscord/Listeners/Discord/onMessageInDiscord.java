package eu.SkyFull.sDiscord.Listeners.Discord;

import eu.SkyFull.sDiscord.Main;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;

public class onMessageInDiscord extends ListenerAdapter {


    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e){
        if(e.getChannel().getId().equalsIgnoreCase("802572561174757376")){
            if(!e.getAuthor().getId().equalsIgnoreCase("803210421200617474")) {
                String nick = e.getAuthor().getName();
                if (e.getMember().getNickname() != null) {
                    nick = e.getMember().getNickname();
                }
                Bukkit.broadcastMessage("§9§lDiscord §f" + nick + " §9§l➛ §f" + Main.getStringWithoutMarkdown(e.getMessage().getContentDisplay()));
            }
        }
    }
}
