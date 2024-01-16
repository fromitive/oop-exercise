package oop.exercise.phonebilling.discountrule;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.DateTimeInterval;

import java.util.List;
import java.util.ArrayList;

import java.time.DayOfWeek;
import java.time.Duration;

public class DayOfWeekDiscountRule {
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    private Duration duration = Duration.ZERO;
    private Money amount = Money.ZERO;

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval) {
        if (dayOfWeeks.contains(interval.getFrom().getDayOfWeek())) {
            return amount.times(interval.duration().getSeconds() / duration.getSeconds());
        }
        return Money.ZERO;
    }

}
