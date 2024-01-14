package oop.exercise.phonebilling;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.LongStream;

public class DateTimeInterval {
    LocalDateTime from;
    LocalDateTime to;

    public static DateTimeInterval toMidnight(LocalDateTime from) {
        // 이게 맞냐? 1
        return new DateTimeInterval(
                from,
                LocalDateTime.of(from.toLocalDate(), LocalTime.of(23, 59, 59, 999_999_999)));
    }

    public static DateTimeInterval during(LocalDate date) {
        // 이게 맞냐? 2
        return new DateTimeInterval(
                LocalDateTime.of(date, LocalTime.of(0, 0)),
                LocalDateTime.of(date, LocalTime.of(23, 59, 59, 999_999_999)));
    }

    public static DateTimeInterval fromMidnight(LocalDateTime to) {
        // 이게 맞냐? 3
        return new DateTimeInterval(
                LocalDateTime.of(to.toLocalDate(), LocalTime.of(0, 0)),
                to);
    }


    public static DateTimeInterval of(LocalDateTime from, LocalDateTime to) {
        return new DateTimeInterval(from, to);
    }

    private DateTimeInterval(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public Duration duration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public List<DateTimeInterval> splitByDay() {
        if (days() > 0) {
            return splitByDay(days());
        }

        return Arrays.asList(this);
    }

    private List<DateTimeInterval> splitByDay(long days) {
        List<DateTimeInterval> result = new ArrayList<>();
        addFirstDay(result);
        addMiddleDay(result, days);
        addLastDay(result);
        return result;

    }    
    private void addLastDay(List<DateTimeInterval> result) {
        result.add(DateTimeInterval.fromMidnight(to));
    }

    private void addMiddleDay(List<DateTimeInterval> result, long days) {
        LongStream.range(1, days)
                .forEach(day -> result.add(DateTimeInterval.during(from.toLocalDate().plusDays(day))));
    }

    private void addFirstDay(List<DateTimeInterval> result) {
        result.add(DateTimeInterval.toMidnight(from));
    }

    private long days() {
        return Duration.between(
                from.toLocalDate().atStartOfDay(),
                to.toLocalDate().atStartOfDay()).toDays();
    }

}
