package ExamPractice;

import java.nio.channels.Channel;
import java.util.ArrayList;

public class Video3_2 extends VisualMedia {

    private int views;

    // vairable is set to static to not be associated with each object created from this class - it belongs
    // to the class itself and now functions as a counter - to count each Video object that is created
    private static int totalNumberOfVideos;// = 0; // needs to be initialized to a value! (STart value).
    // "oppførsel" i oppgaveteksten hinter til STATIC - at den tilhører klassen og ikke et objekt.

    private static ArrayList<String> listOfTitles = new ArrayList<String>(); // Storing list of titles here which
    //are added to a list in the constructor, in this case. NEEDS to also be initialized to a new ArrayLIst, otherwise
    // nullPointerException.

    private static ArrayList<Video3_2> videos = new ArrayList<Video3_2>();


    // You can add code into the constructor that will run each time a new object is created. Such as the case with
    // totalNUmberOfVideos - which now is a COUNTER.  WHAT CODE DO YOU WANT TO RUN WHEN CREATING AN OBJECT?
    public Video3_2(String title, double lengthInMinutes, Channel channel, int views) {
        super(title, lengthInMinutes, channel);
        this.views = views;
        totalNumberOfVideos++; // actual part of the exam!
        // Practice
        listOfTitles.add(title); // adding title of video to list of titles hre
        videos.add(this); // adding the newly created object here, using THIS key word! Refers to the current
        // object being created.


    }

    public int getTotalNumberOfVideos() {
        return totalNumberOfVideos;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void printTotalNumberOfVideos() {
        System.out.println("The total number of videos created is " + totalNumberOfVideos);
    }


}