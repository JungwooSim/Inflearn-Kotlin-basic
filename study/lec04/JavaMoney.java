package study.lec04;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney> {
  private final long amount;

  public JavaMoney(long amount) {
    this.amount = amount;
  }

  public JavaMoney plus(JavaMoney javaMoney) {
    return new JavaMoney(this.amount + javaMoney.amount);
  }

  @Override
  public String toString() {
    return "JavaMoney{" +
            "amount=" + amount +
            '}';
  }

  @Override
  public int compareTo(@NotNull JavaMoney o) {
    return Long.compare(this.amount, o.amount);
  }
}
