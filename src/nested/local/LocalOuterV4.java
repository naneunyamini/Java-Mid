 package nested.local;


 public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨

        // 인터페이스로도 구현할 수 있다
        class LocalPrinter implements Printer {
            int value =0;

            @Override
            public void print(){
                System.out.println("value="+value);

                // 인스턴스는 지역 변수보다 더 오래 살아남음
                System.out.println("localVar="+localVar); //여기를 직접 접근하는게 아니고 캡쳐하는거임 !
                System.out.println("paramVar="+paramVar);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면 ? 다시 캡쳐해야하난 ?
        // localVar =10; => 컴파일 오류
        // parmVar = 20; => 컴파일 오류
        return printer;

    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();

    }
}
