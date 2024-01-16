package oop.exercise.phonebilling.ratepolicy.basicratepolicy;

import java.util.ArrayList;
import java.util.List;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.discountrule.DurationDiscountRule;
import oop.exercise.phonebilling.ratepolicy.BasicRatePolicy;

public class DurationDiscountPolicy extends BasicRatePolicy {
    List<DurationDiscountRule> rules = new ArrayList<>();

    public DurationDiscountPolicy(List<DurationDiscountRule> rules) {
        this.rules = rules;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return rules.stream().map(rule -> rule.calculate(call)).reduce(Money.ZERO,
                (first, second) -> first.plus(second));
    }

}
