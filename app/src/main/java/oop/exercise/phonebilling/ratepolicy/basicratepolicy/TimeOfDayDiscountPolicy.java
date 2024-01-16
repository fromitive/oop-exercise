package oop.exercise.phonebilling.ratepolicy.basicratepolicy;

import oop.exercise.common.Money;
import oop.exercise.phonebilling.Call;
import oop.exercise.phonebilling.DateTimeInterval;
import oop.exercise.phonebilling.ratepolicy.BasicRatePolicy;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalTime;
import java.time.Duration;

public class TimeOfDayDiscountPolicy extends BasicRatePolicy {
    // starts , ends , durations , amounts
    // 시작(시:분), 종료(시:분), 부가단위(초), 부가금액(원)

    private List<LocalTime> starts = new ArrayList<>();
    private List<LocalTime> ends = new ArrayList<>();
    private List<Duration> durations = new ArrayList<>();
    private List<Money> amounts = new ArrayList<>();

    @Override
    protected Money calculateCallFee(Call call) {
        return call.splitByDay().stream()
                .map(interval -> calculateIntervalFee(interval))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));

    }

    private Money calculateIntervalFee(DateTimeInterval interval) {
        Money result = Money.ZERO;
        for (int loop = 0; loop < starts.size(); loop++) {
            result = result.plus(amounts.get(loop).times(
                Duration.between(from(interval, starts.get(loop)),to(interval, ends.get(loop)))
                .getSeconds() / durations.get(loop).getSeconds()));
        }
        return result;
    }

    private LocalTime to(DateTimeInterval interval, LocalTime to) {
        return interval.getTo().toLocalTime().isAfter(to) ? to : interval.getTo().toLocalTime();
    }

    private LocalTime from(DateTimeInterval interval, LocalTime from) {
        return interval.getFrom().toLocalTime().isBefore(from) ? from : interval.getFrom().toLocalTime();
    }

}
