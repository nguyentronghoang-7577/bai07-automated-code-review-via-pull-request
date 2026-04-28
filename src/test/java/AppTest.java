import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit Test cho ung dung App.
 */
public class AppTest {
  @Test
  public void TestMain() {
    // Chạy hàm main với tham số rỗng để tăng coverage
    String[] args = {};
    App.main(args); 
  }
  @Test
  public void testAdd() {
    assertEquals(15, App.add(10, 5));
  }

  @Test
  public void testAddNegative() {
    assertEquals(-5, App.add(5, -10));
  }

  @Test
  public void testDivideSuccess() {
    assertEquals(2.0, App.divide(10, 5));
  }

  @Test
  public void testDivideByZero() {
    assertThrows(IllegalArgumentException.class, () -> {
      App.divide(10, 0);
    });
  }
}