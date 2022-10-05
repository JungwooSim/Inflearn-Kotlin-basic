package study.lec02.ja;

public class Main {
  public static void main(String[] args) {

  }

  public boolean startWithA(String str) {
    return str.startsWith("A");
  }

  public Boolean startWithA2(String str) {
    if (str == null) {
      return null;
    }

    return str.startsWith("A");
  }

  public boolean startsWithA3(String str) {
    if (str == null) {
      return false;
    }

    return str.startsWith("A");
  }
}
