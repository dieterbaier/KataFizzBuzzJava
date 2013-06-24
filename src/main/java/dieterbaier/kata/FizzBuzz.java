package dieterbaier.kata;

import java.io.PrintStream;

public class FizzBuzz {

  public void print(final int start, final int end, final PrintStream out) {
    for (int i = start; i <= end; i++)
      out.println(convert(i));
  }

  private String convert(final int number) {
    if (isFizzBuzzCandidate(number))
      return "FizzBuzz";
    if (isBuzzCandidate(number))
      return "Buzz";
    if (isFizzCandidate(number))
      return "Fizz";
    return asString(number);
  }

  private boolean isBuzzCandidate(final int number) {
    return isNumberDevisibleByDigit(number, 5) || asString(number).contains("5");
  }

  private String asString(final int number) {
    return Integer.toString(number);
  }

  private boolean isFizzBuzzCandidate(final int number) {
    return isNumberDevisibleByDigit(number, 5) && isNumberDevisibleByDigit(number, 3);
  }

  private boolean isFizzCandidate(final int number) {
    return isNumberDevisibleByDigit(number, 3) || asString(number).contains("3");
  }

  private boolean isNumberDevisibleByDigit(final int number, final int digit) {
    return number % digit == 0;
  }

}
