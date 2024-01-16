package oop.exercise.phonebilling.ratepolicy;

import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;

import java.util.List;

public interface FeeCondition {

    List<DateTimeInterval> findTimeIntervals(Call call);

}
