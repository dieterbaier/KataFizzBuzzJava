package dieterbaier.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class FizzBuzzTest {

  @Test
  public void CountBuzz() {
    assertThat(count(1, 100, "Buzz"), is(22));
  }

  @Test
  public void CountFizz() {
    assertThat(count(1, 100, "Fizz"), is(34));
  }

  @Test
  public void CountFizzBuzz() {
    assertThat(count(1, 100, "FizzBuzz"), is(6));
  }

  @Test
  public void CountLines() {
    assertThat(count(1, 100, null), is(100));
  }

  @Test
  public void PrintLines() {
    new FizzBuzz().print(1, 100, System.out);
  }

  private Integer count(final int start, final int end, final String word) {
    final OutputStream os = new ByteArrayOutputStream();
    new FizzBuzz().print(start, end, new PrintStream(os));
    String pattern;
    if (word == null)
      pattern = "[/d]*" + System.getProperty("line.separator");
    else
      pattern = "\\b" + word + "\\b";
    final Matcher matcher = Pattern.compile(pattern).matcher(os.toString());
    int count = 0;
    while (matcher.find())
      count++;
    return count;
  }
}
