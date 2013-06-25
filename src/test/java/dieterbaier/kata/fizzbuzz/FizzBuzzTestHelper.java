package dieterbaier.kata.fizzbuzz;

import dieterbaier.kata.FizzBuzz;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FizzBuzzTestHelper {

  public static Integer countWord(final int start, final int end, final String word) {
    final OutputStream os = new ByteArrayOutputStream();
    new FizzBuzz().printNumbers(start, end, new PrintStream(os));
    return countPrintedWords(word, os.toString());
  }

  private static String buildPattern(final String word) {
    if (System.getProperty("line.separator").equals(word))
      return word;
    else
      return "\\b" + word + "\\b";
  }

  private static Integer countPrintedWords(final String word, final String textToParse) {
    int counter = 0;
    final Matcher parser = instantiateParser(word, textToParse);
    while (parser.find())
      counter++;
    return counter;
  }

  private static Matcher instantiateParser(final String word, final String textToParse) {
    return Pattern.compile(buildPattern(word)).matcher(textToParse);
  }

}
