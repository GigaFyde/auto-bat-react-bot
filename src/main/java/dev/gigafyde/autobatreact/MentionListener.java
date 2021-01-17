package dev.gigafyde.autobatreact;

import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MentionListener extends ListenerAdapter {
    public static Emote batping;

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if (event.getMessage().getMentionedUsers().size() > 0) event.getMessage().addReaction(batping).queue();
    }
}
