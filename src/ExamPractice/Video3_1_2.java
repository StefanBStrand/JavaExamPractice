package ExamPractice;

import java.nio.channels.Channel;

public class Video3_1_2 extends VisualMedia {

    private int views;


    public Video3_1_2(String title, double lengthInMinutes, Channel channel, int views) {
        super(title, lengthInMinutes, channel);
        this.views = views;

    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
