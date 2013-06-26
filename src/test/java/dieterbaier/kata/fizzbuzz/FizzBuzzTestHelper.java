package dieterbaier.kata.fizzbuzz;

import dieterbaier.kata.FizzBuzz;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzTestHelper {

  public static int countBuzz(final int start, final int end) {
    return count(start, end, "\\bBuzz\\b");
  }

  public static int countFizz(final int start, final int end) {
    return count(start, end, "\\bFizz\\b");
  }

  public static int countFizzBuzz(final int start, final int end) {
    return count(start, end, "\\bFizzBuzz\\b");
  }

  public static int countLines(final int start, final int end) {

    return count(start, end, System.getProperty("line.separator"));
  }

  public static int countNumbers(final int start, final int end) {
    return count(start, end, "\\d+");
  }

  private static int count(final int start, final int end, final String word) {
    final OutputStream os = new ByteArrayOutputStream();
    new FizzBuzz().print(start, end, new PrintStream(os));
    final Matcher parser = Pattern.compile(word).matcher(os.toString());
    int counter = 0;
    while (parser.find())
      counter++;
    return counter;
  }

}
