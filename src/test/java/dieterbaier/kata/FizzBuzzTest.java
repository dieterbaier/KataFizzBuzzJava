package dieterbaier.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import dieterbaier.kata.fizzbuzz.FizzBuzzTestHelper;

import org.testng.annotations.Test;

public class FizzBuzzTest {

  @Test
  public void checkSummOfAllConvertions() {
    final int start = 1;
    final int end = 100;
    assertThat(
        FizzBuzzTestHelper.countFizz(start, end) + FizzBuzzTestHelper.countBuzz(start, end)
            + FizzBuzzTestHelper.countFizzBuzz(start, end) + FizzBuzzTestHelper.countNumbers(start, end),
        is(100));
  }

  @Test
  public void countPrintedBuzz() {
    assertThat(FizzBuzzTestHelper.countBuzz(1, 100), is(22));
  }

  @Test
  public void countPrintedFizz() {
    assertThat(FizzBuzzTestHelper.countFizz(1, 100), is(34));
  }

  @Test
  public void countPrintedFizzBuzz() {
    assertThat(FizzBuzzTestHelper.countFizzBuzz(1, 100), is(6));
  }

  @Test
  public void countPrintedLines() {
    assertThat(FizzBuzzTestHelper.countLines(1, 100), is(100));
  }

  @Test
  public void countPrintedNumbers() {
    assertThat(FizzBuzzTestHelper.countNumbers(1, 100), is(38));
  }
}
