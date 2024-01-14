package oop.exercise.phonebilling.ratepolicy.basicratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.ratepolicy.BasicRatePolicy;

public class TimeOfDayDiscountPolicy extends BasicRatePolicy{

    @Override
    protected Money calculateCallFee(Call call) {
        // TODO: 이어서 해야 함.
         throw new RuntimeException("미구현");
    }

}
