import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/23/2020
 * Time: 10:33 AM
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của 3 cạnh tam giác");
        TriangleException triangle = new TriangleException();
            try {
                double sideA = triangle.inputNumber(input, "A");
                double sideB = triangle.inputNumber(input, "B");
                double sideC = triangle.inputNumber(input, "C");
                if ((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA) {
                    throw new NumberFormatException("Lỗi! Độ dài 3 cạnh của tam giác không hợp lệ!");
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Lỗi! Độ dài 3 cạnh phải là số nguyên dương!");
            }
    }
}
