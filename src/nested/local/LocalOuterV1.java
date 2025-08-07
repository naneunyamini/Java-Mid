package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar){

        //지역변수는 절대 값이 변할 수 없음 -> 바꾸면 컴파일 오류남 !
        //사실상 final임
        int localVar = 1;

        // 지역변수
        class LocalPrinter {
            int value =0;

            public void printData(){
                System.out.println("value="+value);
                System.out.println("localVar="+localVar);
                System.out.println("paramVar="+paramVar);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();

    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
