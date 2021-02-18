package dev.gigafyde.autobatreact;

import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
    public static Emote batemote;
    public static Emote forgcar;

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (event.getChannel().getIdLong() == 796862435499049010L) {
            event.getMessage().addReaction(batemote).queue();
            return;
        }
        if (event.getMessage().getContentStripped().toLowerCase().contains("forg") || event.getMessage().getContentStripped().toLowerCase().contains("brum brum")) {
            event.getMessage().addReaction(forgcar).queue();
        }
    }
}
