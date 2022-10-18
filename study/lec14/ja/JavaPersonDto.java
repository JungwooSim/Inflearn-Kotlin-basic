package study.lec14.ja;

import java.util.Objects;

public class JavaPersonDto {
  private final String name;
  private final int age;

  public JavaPersonDto(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "JavaPersonDto{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
