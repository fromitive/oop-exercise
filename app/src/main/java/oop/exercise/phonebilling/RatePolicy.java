package oop.exercise.phonebilling;

import oop.exercise.common.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
