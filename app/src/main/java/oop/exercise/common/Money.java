package oop.exercise.common;
import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = new Money(new BigDecimal(0));
    BigDecimal amount;

    public Money(BigDecimal amount){
        this.amount = amount;
    }

    public Money add(Money that){
        return new Money(this.amount.add(that.amount));
    }

    public Money time(double value){
        return new Money(amount.multiply(BigDecimal.valueOf(value)));
    }
}
