package oop.exercise.phonebilling.ratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.Phone;
import oop.exercise.phonebilling.RatePolicy;

import java.util.List;
import java.util.ArrayList;

public class BasicRatePolicy implements RatePolicy {
    private List<FeeRule> feeRules = new ArrayList<>();

    @Override
    public Money calculateFee(Phone phone) {
        return phone.getCalls().stream()
                .map(each -> calculateCallFee(each))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

    private Money calculateCallFee(Call call) {
        return feeRules.stream()
                .map(feeRule -> feeRule.calculate(call))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

}
