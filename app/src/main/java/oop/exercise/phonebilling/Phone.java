package oop.exercise.phonebilling;

import oop.exercise.common.Money;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Phone {
    RatePolicy ratepolicy;
    List<Call> calls = new ArrayList<>();
    public Money calculateFee(){
        return ratepolicy.calculateFee(this);
    }
    
    public List<Call> getCalls(){
        return Collections.unmodifiableList(calls);
    }

    public void call(Call call) {
        calls.add(call);
    }
}
