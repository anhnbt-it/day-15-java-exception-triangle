import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/23/2020
 * Time: 10:32 AM
 */
public class TriangleException {
    public double inputNumber(Scanner input, String side) throws NumberFormatException {
        System.out.print("Nhập độ dài cạnh " + side + ": ");
        double num = Double.parseDouble(input.nextLine());
        if (num < 0) {
            throw new NumberFormatException("Lỗi! Độ dài cạnh phải lớn hơn 0.");
        }
        return num;
    }
}
