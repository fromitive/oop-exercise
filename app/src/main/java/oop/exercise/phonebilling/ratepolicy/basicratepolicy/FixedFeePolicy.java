package oop.exercise.phonebilling.ratepolicy.basicratepolicy;

import java.time.Duration;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.ratepolicy.BasicRatePolicy;

public class FixedFeePolicy extends BasicRatePolicy {
    private Money amount;
    private Duration seconds;

    
    public FixedFeePolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }


    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuartion().getSeconds() / seconds.getSeconds());
    }
    
}
