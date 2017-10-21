import static org.junit.Assert.*;
import org.junit.*;
import hello.*;

public class GreetingTest {
  @Test
  public void greetingExpression() {
    Greeting greeting = new Greeting(1, "hello");
    long id = greeting.getId();
    assertEquals(1, id);
  }
}
