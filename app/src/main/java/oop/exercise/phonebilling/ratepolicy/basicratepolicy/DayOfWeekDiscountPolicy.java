package oop.exercise.phonebilling.ratepolicy.basicratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.discountrule.DayOfWeekDiscountRule;
import oop.exercise.phonebilling.ratepolicy.BasicRatePolicy;

import java.util.List;
import java.util.ArrayList;

public class DayOfWeekDiscountPolicy extends BasicRatePolicy {

    List<DayOfWeekDiscountRule> rules = new ArrayList<>();

    @Override
    protected Money calculateCallFee(Call call) {
        return call.splitByDay().stream()
                .map(interval -> calculateIntervalFee(interval))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

    private Money calculateIntervalFee(DateTimeInterval interval) {
        return rules.stream()
                .map(rule -> rule.calculate(interval))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

}
