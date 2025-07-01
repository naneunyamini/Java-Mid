package lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value =10;
        int i1 = compareTo(10,5);
        int i2 = compareTo(10,10);
        int i3 = compareTo(10,20);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


    }

    // 외부메서드 compareTo
    public static int compareTo(int value,int target){
        if ( value < target){
            return -1;
        } else if ( value > target){
            return 1;
        } else{
            return 0;
        }
    }
}
