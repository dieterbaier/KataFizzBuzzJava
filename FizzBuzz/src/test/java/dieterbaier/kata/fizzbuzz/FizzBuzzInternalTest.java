package dieterbaier.kata.fizzbuzz;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzInternalTest {
  
  private FizzBuzz printer;


  @BeforeMethod
  public void beforeMethod() {
    printer = new FizzBuzz();
  }

  @Test
  public void NumberConvertsToFizz() {
    assertThat("Invalid Convertion", printer.convert(3), is("Fizz"));
  }

  @Test
  public void NumberConvertsToBuzz() {
    assertThat("Invalid Convertion", printer.convert(5), is("Buzz"));
  }
  
  @Test
  public void NumberConvertsToFizzBuzz() {
    assertThat("Invalid Convertion", printer.convert(15), is("FizzBuzz"));
  }
  
  @Test
  public void NumberDoesntConvert() {
    assertThat("Invalid Convertion", printer.convert(1), is("1"));
  }
  
  @Test
  public void NegativeNumberConvertsToFizz() {
    assertThat("Invalid Convertion", printer.convert(-3), is("Fizz"));
  }

  @Test
  public void NegativeNumberConvertsToBuzz() {
    assertThat("Invalid Convertion", printer.convert(-5), is("Buzz"));
  }
  
  @Test
  public void NegativeNumberConvertsToFizzBuzz() {
    assertThat("Invalid Convertion", printer.convert(-15), is("FizzBuzz"));
  }
  
  
  @Test
  public void NegativeNumberDoesntConvert() {
    assertThat("Invalid Convertion", printer.convert(-1), is("-1"));
  }

}
