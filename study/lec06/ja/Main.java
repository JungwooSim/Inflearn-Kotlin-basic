package study.lec06.ja;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private void ex1() {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (long number : numbers) {
            System.out.println(number);
        }
    }

    private void ex2() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    private void ex3() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private void ex4() {
        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }
    }

    private void ex5() {
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
    }
}
