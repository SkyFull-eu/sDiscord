package eu.SkyFull.sDiscord;

import eu.SkyFull.sDiscord.Listeners.Discord.onMessageInDiscord;
import eu.SkyFull.sDiscord.Listeners.Minecraft.onDead;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class JDAManager {

    private static JDA jda;

    public static void startBot(String token) throws LoginException {
        JDABuilder builder = new JDABuilder(token);
        builder.setActivity(Activity.watching("mc.skyfull.eu"));
        builder.addEventListeners(new onMessageInDiscord());
        jda = builder.build();
    }

    public static JDA getJDA(){
        return jda;
    }

    public static void sendMessageToDiscordMinecraftChat(String message){
        jda.getGuildById("799246219058085948").getTextChannelById("802572561174757376").sendMessage(message).complete();
    }
}
