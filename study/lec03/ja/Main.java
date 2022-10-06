package study.lec03.ja;

import study.lec03.Person;

public class Main {
  public static void main(String[] args) {

  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getName());
    }
  }
}
