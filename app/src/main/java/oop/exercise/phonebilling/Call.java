package oop.exercise.phonebilling;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
public class Call {
    DateTimeInterval interval;
    public Duration getDuartion(){
        return interval.duration();
    }

    public LocalDateTime getFrom(){
        return interval.getFrom();
    } 

    public LocalDateTime getTo(){
        return interval.getTo();
    }

    public DateTimeInterval getInterval(){
        return interval;
    }

    public List<DateTimeInterval> splitByDay(){
        return interval.splitByDay();
    }
}
