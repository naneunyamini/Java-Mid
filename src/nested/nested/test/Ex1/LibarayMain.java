package nested.nested.test.Ex1;

public class LibarayMain {

    public static void main(String[] args) {
        Libaray libaray = new Libaray(4);
        libaray.addBook("책1","저자1");
        libaray.addBook("책2","저자2");
        libaray.addBook("책3","저자3");
        libaray.addBook("책4","저자4");
        libaray.addBook("책5","저자5");
        libaray.showBooks();

    }
}
