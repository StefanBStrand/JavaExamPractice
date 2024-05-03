package ExamPractice;

import java.nio.channels.Channel;

public class Video {

        private String title;

        private double lengthInMinutes;

        private int views;

        private Channel channel;

        public Video(String title, double lengthInMinutes, int views, Channel channel) {
            this.title = title;
            this.lengthInMinutes = lengthInMinutes;
            this.views = views;
            this.channel = channel;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
