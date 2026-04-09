package ch02;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Print2 p2 = new PrintBanner2("Hello2");
        p2.printWeak();
        p2.printStrong();
    }
}
