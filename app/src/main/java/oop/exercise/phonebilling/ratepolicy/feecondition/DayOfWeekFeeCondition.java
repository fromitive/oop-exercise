package oop.exercise.phonebilling.ratepolicy.feecondition;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.ratepolicy.FeeCondition;

import java.time.DayOfWeek;

public class DayOfWeekFeeCondition implements FeeCondition{
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    
    public DayOfWeekFeeCondition(DayOfWeek ... dayOfWeeks) {
        this.dayOfWeeks = List.of(dayOfWeeks);
    }

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return call.getInterval()
                .splitByDay()
                .stream()
                .filter(interval -> dayOfWeeks.contains(interval.getFrom().getDayOfWeek()))
                .collect(Collectors.toList());
    }
    
}
