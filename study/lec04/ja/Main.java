package study.lec04.ja;

import study.lec04.JavaMoney;

public class Main {
  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(2000L);
    JavaMoney money2 = new JavaMoney(1000L);

    if (money1.compareTo(money2) > 0) {
      System.out.println("Money1 이 Money2 보다 금액이 큽니다.");
    }

    // ----
    JavaMoney money3 = new JavaMoney(1000);
    JavaMoney money4 = money3;
    JavaMoney money5 = new JavaMoney(1000);

    System.out.println(money3 == money4); // result : true
    System.out.println(money3 == money5); // result : false

    // ----
    JavaMoney money6 = new JavaMoney(1000);
    JavaMoney money7 = new JavaMoney(2000);
    System.out.println(money6.plus(money7));
  }
}
