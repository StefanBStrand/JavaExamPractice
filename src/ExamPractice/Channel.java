package ExamPractice;

import java.util.ArrayList;

public class Channel {

    private String name;

    private ArrayList<VisualMedia> visualMedias;

    private int videoViews = 0;


    // 1. need to count objects in visualMedias list,
    // 2. and then update counter for videoViews variable
    // 3. Return videoViews

    //
    public void updateVideoViews() {
        int totalCount = 0;
        for (VisualMedia visualmedia : visualMedias) {
            int count = visualmedia.getViews();
            totalCount += count;
        }
        videoViews = totalCount; // variable on left side is the one to be ALTERED/UPDATED, take on NEW VALUE.
    }

    /*public void updateVideoViews() {
        int totalCount = 0;
        for (VisualMedia visualmedia : visualMedias) {
            if (visualmedia instanceof Video3_1_2) {
                int count = ((Video3_1_2)) visualmedia).getViews();
                totalCount += count;
            }
        }
        videoViews = totalCount;
    }*/

}

