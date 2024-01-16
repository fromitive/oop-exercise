package oop.exercise.phonebilling.ratepolicy.feecondition;

import java.util.List;

import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.ratepolicy.FeeCondition;

public class FixedFeeCondition implements FeeCondition {

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return List.of(call.getInterval());
    }
    
}
