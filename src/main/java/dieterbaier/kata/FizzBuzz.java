package dieterbaier.kata;

import java.io.PrintStream;

public class FizzBuzz {

  /**
   * Prints all numbers to out from start to end but converts each number after following rules:<br>
   * <br>
   * 
   * - Every number devisable by 3 to "Fizz"<br>
   * - Every number devisable by 5 to "Buzz"<br>
   * - Every number devisable by 3 and 5 to "FizzBuzz"<br>
   * - Every number which has a 3 within (e.g. 13) to "Fizz"<br>
   * - Every number which has a 5 within (e.g. 51) to "Buzz"; Note that 51 would be devisable by 3 as well but it will
   * be converted to "Buzz"<br>
   * <br>
   * 
   * @param start
   * @param end
   * @param out
   */
  public void print(final int start, final int end, final PrintStream out) {
    for (int i = start; i <= end; i++)
      out.println(convert(i));
  }

  private String convert(final int number) {
    final String numberAsString = Integer.toString(number);
    if (isFizzBuzzCandidate(number))
      return "FizzBuzz";
    if (isBuzzCandidate(number, numberAsString))
      return "Buzz";
    if (isFizzCandidate(number, numberAsString))
      return "Fizz";
    return numberAsString;
  }

  private boolean isBuzzCandidate(final int number, final String numberAsString) {
    return isNumberDevisableByDigit(number, 5) || numberAsString.contains("5");
  }

  private boolean isFizzBuzzCandidate(final int number) {
    return isNumberDevisableByDigit(number, 3) && isNumberDevisableByDigit(number, 5);
  }

  private boolean isFizzCandidate(final int number, final String numberAsString) {
    return isNumberDevisableByDigit(number, 3) || numberAsString.contains("3");
  }

  private boolean isNumberDevisableByDigit(final int number, final int digit) {
    return number % digit == 0;
  }

}
