package study.lec08.ja;

public class Main {
    public static void main(String[] args) {

    }

    private int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    private void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.println(str);
            }
        }
    }

    private void repeat(String str, int num) {
        repeat(str, num, true);
    }

    private void repeat(String str) {
        repeat(str, 3, true);
    }

    private void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
