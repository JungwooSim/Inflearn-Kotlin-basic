package study.lec01.ja;

import study.lec01.Person;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    long number1 = 10L;
    final long number2 = 20L;

    Long number3 = 1000L;

    Person person = new Person("big");

    List<Integer> number4 = Arrays.asList(1, 2);
    number4.add(3);
  }
}
