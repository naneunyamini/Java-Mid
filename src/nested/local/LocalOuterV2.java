package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar){

        int localVar = 1;

        // 인터페이스로도 구현할 수 있다
        class LocalPrinter implements Printer {
            int value =0;

            @Override
            public void print(){
                System.out.println("value="+value);
                System.out.println("localVar="+localVar);
                System.out.println("paramVar="+paramVar);
                System.out.println("outInstanceVar="+outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();

    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
