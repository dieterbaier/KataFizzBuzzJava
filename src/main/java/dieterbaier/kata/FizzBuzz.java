package dieterbaier.kata;

import java.io.PrintStream;

public class FizzBuzz {

  public void printNumbers(final int start, final int end, final PrintStream out) {
    for (int i = start; i <= end; i++)
      out.println(convert(i));
  }

  private String asString(final int number) {
    return Integer.toString(number);
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
    return isNumberDevisableByDigit(number, 5) || asString(number).contains("5");
  }

  private boolean isFizzBuzzCandidate(final int number) {
    return isNumberDevisableByDigit(number, 3) && isNumberDevisableByDigit(number, 5);
  }

  private boolean isFizzCandidate(final int number) {
    return isNumberDevisableByDigit(number, 3) || asString(number).contains("3");
  }

  private boolean isNumberDevisableByDigit(final int number, final int digit) {
    return number % digit == 0;
  }

}
