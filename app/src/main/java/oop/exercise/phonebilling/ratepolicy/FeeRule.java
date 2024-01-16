package oop.exercise.phonebilling.ratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;

public class FeeRule {
    FeeCondition feeCondition;
    FeePerDuration feePerDuration;

    public Money calculate(Call call) {
        return feeCondition.findTimeIntervals(call).stream()
                .map(interval -> feePerDuration.calculate(interval))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

}
