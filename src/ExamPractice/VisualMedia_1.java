package ExamPractice;

import java.nio.channels.Channel;

//Oppgave 3.4:
public abstract class VisualMedia_1 implements Comparable<VisualMedia_1> {

    private String title;

    private double lengthInMinutes;

    private java.nio.channels.Channel channel;

    public VisualMedia_1(String title, double lengthInMinutes, Channel channel) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
        this.channel = channel;
    }

    @Override
    public int compareTo(VisualMedia_1 other) {
        return Double.compare(other.lengthInMinutes, this.lengthInMinutes);
        //To achieve descending order we flip the logic, flipping
        // which value comes first in the comparison. When other is
        // first, we sort descending. If this comes first, we
        // sort ascending (Standard).
    }


}
