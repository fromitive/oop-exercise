package oop.exercise.phonebilling.ratepolicy.feecondition;

import java.util.List;
import java.util.Collections;

import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.ratepolicy.FeeCondition;

import java.time.Duration;


public class DurationFeeCondition implements FeeCondition {
    private Duration from;
    private Duration to;

    
    public DurationFeeCondition(Duration from, Duration to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        if (call.getInterval().duration().compareTo(from) < 0) {
            return Collections.emptyList();
        }

        return List.of(DateTimeInterval.of(
            call.getInterval().getFrom().plus(from),
            call.getInterval().duration().compareTo(to) > 0 ?
                    call.getInterval().getFrom().plus(to) :
                    call.getInterval().getTo()
            ));
    }
    
}
