package api;


import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.methods.SlackApiException;
import com.github.seratch.jslack.api.methods.response.chat.ChatPostMessageResponse;

import java.io.IOException;

public class SlackApi {

    private static Slack slack = Slack.getInstance();
    private static String token = "tE6WYdrWe0FlVgpALNEtVXK5";

    public static void sendTextMessage() throws IOException, SlackApiException {
        //Slack slack = Slack.getInstance();  슬랙 시작을 위한 코드

        ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
                .channel("team_sync") // Channel ID
                .text(":wave: Hi from a bot written in Java!"));
    }

}