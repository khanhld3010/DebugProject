package Triangle;

import Triangle.exception.IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("--Triangle--");
            System.out.println("Cạnh thứ nhất (a)");
            double a = input.nextDouble();
            System.out.println("Cạnh thứ hai (b)");
            double b = input.nextDouble();
            System.out.println("Cạnh thứ ba (c)");
            double c = input.nextDouble();
            isTriangle(a, b, c);
            System.out.println("=> Chúc mừng! Ba cạnh hợp lệ để tạo thành tam giác.");
            System.out.println("Chu vi: " + (a + b + c));
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi nghiệp vụ: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi nghiệp vụ: " + e.getMessage());
        } finally {
            System.out.println("Đây là khối finally");
            System.out.println("--- Chương trình kết thúc ---");
        }
    }

    public static void isTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Giá trị các cạnh phải là số dương lớn hơn 0.");
        }
        // Kiểm tra định lý tổng 2 cạnh
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}
