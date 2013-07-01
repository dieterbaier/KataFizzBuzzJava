package dieterbaier.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeMethod
  public void beforeMethod() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void countBuzz() {
    assertThat(count(1, 100, "\\bBuzz\\b"), is(22));
  }

  @Test
  public void countFizz() {
    assertThat(count(1, 100, "\\bFizz\\b"), is(34));
  }

  @Test
  public void countFizzBuzz() {
    assertThat(count(1, 100, "\\bFizzBuzz\\b"), is(6));
  }

  @Test
  public void countLines() {
    assertThat(count(1, 100, System.getProperty("line.separator")), is(100));
  }

  @Test
  public void countNumbers() {
    assertThat(count(1, 100, "\\d+"), is(38));
  }

  private int count(final int start, final int end, final String pattern) {
    final OutputStream os = new ByteArrayOutputStream();
    fizzBuzz.print(start, end, new PrintStream(os));
    final Matcher parser = Pattern.compile(pattern).matcher(os.toString());
    int counter = 0;
    while (parser.find())
      counter++;
    return counter;
  }

}
