package nested.anonymous;

import java.util.Random;

public class Ex1RefMain2 {
    public static void hello(Process process){

        // 변하지 않는 부분 : 코드 조각 시작
        System.out.println("프로그램 시작");

        process.run();
        
        // 변하지 않는 부분 : 코드 조각 종료
        System.out.println("프로그램 종료");
    }



    // main 메소드 안에서 생성
    public static void main(String[] args) {
        class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 =" + randomValue);
            }
        }

        class Sum implements Process {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i =" + i);
                }
            }
        }

        Dice dice = new Dice();
        Sum sum = new Sum();

        hello(dice);
        hello(sum);

    }
}
