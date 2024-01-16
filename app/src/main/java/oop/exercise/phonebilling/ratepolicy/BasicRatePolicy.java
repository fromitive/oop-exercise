package oop.exercise.phonebilling.ratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.Phone;
import oop.exercise.phonebilling.RatePolicy;

public abstract class BasicRatePolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {
        return phone.getCalls().stream()
                .map(each -> calculateCallFee(each))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

    protected abstract Money calculateCallFee(Call call);
    
}
