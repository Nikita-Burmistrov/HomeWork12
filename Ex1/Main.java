package Ex1;

public class Main {
    public static void main(String[] args) {
        CheckString a = arg -> System.out.println(arg.replace("o", ""));
        System.out.println();
        a.consume("Hello World");



     }
}