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
    final String numberAsString = Integer.toString(number);
    if (isBuzzCandidate(number, numberAsString))
      return "Buzz";
    if (isFizzCandidate(number, numberAsString))
      return "Fizz";
    return numberAsString;
  }

  private boolean isBuzzCandidate(final int number, final String numberAsString) {
    return isNumberDevisableByDigit(number, 5) ||
        numberAsString.contains("5");
  }

  private boolean isFizzBuzzCandidate(final int number) {
    return isNumberDevisableByDigit(number, 3) && isNumberDevisableByDigit(number, 5);
  }

  private boolean isFizzCandidate(final int number, final String numberAsString) {
    return isNumberDevisableByDigit(number, 3) ||
        numberAsString.contains("3");
  }

  private boolean isNumberDevisableByDigit(final int number, final int digit) {
    return number % digit == 0;
  }

}
