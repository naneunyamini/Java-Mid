package lang.immuateble.change;

public class ImmutableObj {
    private final int value; // 불변객체

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue; // 불변이기 때문에 절대 값이 바뀔 수 없음
        return new ImmutableObj(result); //계산 결과 값을 넣기
    } //자기 자신은 바뀌지 않고 새로운 객체를 넣기

    public int getValue() {
        return value;
    }

    // 이때 final이라서 set함수는 만들 수 없음
}
