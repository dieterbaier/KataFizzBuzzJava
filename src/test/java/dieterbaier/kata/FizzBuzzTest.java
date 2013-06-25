package dieterbaier.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import dieterbaier.kata.fizzbuzz.FizzBuzzTestHelper;

import org.testng.annotations.Test;

public class FizzBuzzTest {

  @Test
  public void countPrintedBuzz() {
    assertThat(FizzBuzzTestHelper.countWord(1, 100, "Buzz"), is(22));
  }

  @Test
  public void countPrintedFizz() {
    assertThat(FizzBuzzTestHelper.countWord(1, 100, "Fizz"), is(34));
  }

  @Test
  public void countPrintedFizzBuzz() {
    assertThat(FizzBuzzTestHelper.countWord(1, 100, "FizzBuzz"), is(6));
  }

  @Test
  public void countPrintedLines() {
    assertThat(FizzBuzzTestHelper.countWord(1, 100, System.getProperty("line.separator")), is(100));
  }

  @Test
  public void countPrintedNumbers() {
    assertThat(FizzBuzzTestHelper.countWord(1, 100, "\\d+"), is(38));
  }
}
