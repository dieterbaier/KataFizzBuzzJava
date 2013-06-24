package dieterbaier.kata.fizzbuzz;

import dieterbaier.kata.FizzBuzz;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FizzBuzzTestHelper {

  public static final String LF = System.getProperty("line.separator");

  public static Integer count(final int start, final int end, final String word) {
    final OutputStream os = new ByteArrayOutputStream();
    printNumbers(start, end, os);
    return countWords(word, os);
  }

  private static String buildPattern(final String word) {
    return LF.equals(word) ? LF : "\\b" + word + "\\b";
  }

  private static Integer countWords(final String word, final OutputStream os) {
    final Matcher parser = getParser(word, os);
    int count = 0;
    while (parser.find())
      count++;
    return count;
  }

  private static Matcher getParser(final String word, final OutputStream os) {
    return Pattern.compile(buildPattern(word)).matcher(os.toString());
  }

  private static void printNumbers(final int start, final int end, final OutputStream os) {
    new FizzBuzz().print(start, end, new PrintStream(os));
  }

}
