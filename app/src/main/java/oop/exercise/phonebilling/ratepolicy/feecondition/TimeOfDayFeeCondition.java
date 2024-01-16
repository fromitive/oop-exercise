package oop.exercise.phonebilling.ratepolicy.feecondition;

import java.util.List;
import java.util.stream.Collectors;

import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.ratepolicy.FeeCondition;

import java.time.LocalTime;
import java.time.LocalDateTime;

public class TimeOfDayFeeCondition implements FeeCondition {

    private LocalTime from;
    private LocalTime to;

    public TimeOfDayFeeCondition(LocalTime from, LocalTime to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return call.getInterval().splitByDay()
                .stream()
                .filter(interval -> from(interval).isBefore(to(interval)))
                .map(interval -> DateTimeInterval.of(
                        LocalDateTime.of(interval.getFrom().toLocalDate(), from(interval)),
                        LocalDateTime.of(interval.getTo().toLocalDate(), to(interval))))
                .collect(Collectors.toList());
    }

    private LocalTime to(DateTimeInterval interval) {
        return interval.getFrom().toLocalTime().isBefore(from) ? 
                from : interval.getFrom().toLocalTime();
    }

    private LocalTime from(DateTimeInterval interval) {
        return interval.getTo().toLocalTime().isAfter(to) ?
                to : interval.getTo().toLocalTime();
    }

}
