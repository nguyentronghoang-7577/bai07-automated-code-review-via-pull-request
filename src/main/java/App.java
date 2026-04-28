import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp App cung cấp các hàm tiện ích toán học cơ bản.
 * Đã thêm Javadoc để vượt qua kiểm tra Checkstyle.
 */
public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  /**
   * Hàm chính khởi chạy ứng dụng.
   *
   * @param args tham số dòng lệnh.
   */
  public static void main(String[] args) {
    logger.info("Starting Application...");
      int a = 10;
    int b = 5;
    
    int sum = add(a, b);
    logger.info("Phep cong: {} + {} = {}", a, b, sum);
    
    try {
      double div = divide(a, b);
      logger.info("Phep chia: {} / {} = {}", a, b, div);
    } catch (IllegalArgumentException e) {
      logger.error("Loi chia cho 0: {}", e.getMessage());
    }
  }

  /**
   * Tinh tong hai so nguyen.
   *
   * @param a so thu nhat.
   * @param b so thu hai.
   * @return tong cua a va b.
   */
  public static int add(int a, int b) {
    return a + b;
  }

  /**
   * Tinh thuong hai so, co kiem tra chia cho 0 để demo Coverage.
   *
   * @param a so bi chia.
   * @param b so chia.
   * @return thuong cua a va b.
   * @throws IllegalArgumentException neu b bang 0.
   */
  public static double divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("So chia khong the bang 0");
    }
    return (double) a / b;
  }
}