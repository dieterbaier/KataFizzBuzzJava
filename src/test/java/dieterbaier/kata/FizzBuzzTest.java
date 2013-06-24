package dieterbaier.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import dieterbaier.kata.fizzbuzz.FizzBuzzTestHelper;

import org.testng.annotations.Test;

public class FizzBuzzTest {

  @Test
  public void countBuzz() {
    assertThat(FizzBuzzTestHelper.count(1, 100, "Buzz"), is(22));
  }

  @Test
  public void countFizz() {
    assertThat(FizzBuzzTestHelper.count(1, 100, "Fizz"), is(34));
  }

  @Test
  public void countFizzBuzz() {
    assertThat(FizzBuzzTestHelper.count(1, 100, "FizzBuzz"), is(6));
  }

  @Test
  public void countLines() {
    assertThat(FizzBuzzTestHelper.count(1, 100, FizzBuzzTestHelper.LF), is(100));
  }
}
