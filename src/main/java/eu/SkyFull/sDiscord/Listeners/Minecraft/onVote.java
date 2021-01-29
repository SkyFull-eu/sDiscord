package eu.SkyFull.sDiscord.Listeners.Minecraft;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import eu.SkyFull.sDiscord.JDAManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class onVote implements Listener {

    //Vote ► Hráč: _ItsMePeter_ hlasoval za nás a získal odmenu! Hlasuj aj ty! /vote

    @EventHandler
    public void onVote(VotifierEvent e){
        Vote vote = e.getVote();
        JDAManager.sendMessageToDiscordMinecraftChat("**Vote** -> Hráč: `"+ vote.getUsername() +"` hlasoval za nás a získal odmenu! Hlasuj aj ty! <#802996725346074624>");
    }
}
