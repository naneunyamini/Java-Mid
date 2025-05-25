package lang.immuateble.test;

public class ImmutableMyDate {

    private int year;
    private int month;
    private int day;

    // 생성자
    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // with은 set대신 사용함 : 기존 값을 유지한 상태로 뭔가 새로 하나 넣어서 반환
    // set은 나의 원래 값을 바꿀 때 주로 사용
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return  "year=" + year +
                ", month=" + month +
                ", day=" + day;
    }
}
