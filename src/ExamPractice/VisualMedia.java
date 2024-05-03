package ExamPractice;

import java.nio.channels.Channel;

public abstract class VisualMedia {

    private String title;

    private double lengthInMinutes;

    private Channel channel;

    public VisualMedia(String title, double lengthInMinutes, Channel channel) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.channel = channel;
    }

}
