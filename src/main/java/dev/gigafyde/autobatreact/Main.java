package dev.gigafyde.autobatreact;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static JDA jda;
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        jda = JDABuilder.createDefault(System.getenv("TOKEN"))
                .addEventListeners(new MessageListener())
                .build();
        jda.awaitReady();
        MessageListener.batemote = jda.getEmoteById(797601839717023744L);
        log.info("Bat bot activated");
    }
}
