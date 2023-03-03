import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру: 1 - Параллелепипед, 2 - ЦилиндрВыберите фигуру: 1 - Параллелепипед, 2 - Цилиндр");
        int choice = scanner.nextInt();

        try {
            if (choice == 1) {
                System.out.println("Введите длину, ширину и высоту параллелепипеда:Введите длину, ширину и высоту параллелепипеда:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();

                if (length <= 0 || width <= 0 || height <= 0) {
                    throw new Exception("Недопустимые размеры. Длина, ширина и высота должны быть положительными.");
                }

                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);

                System.out.println("Area: " + parallelepiped.getArea());
                System.out.println("Volume: " + parallelepiped.getVolume());
            } else if (choice == 2) {
                System.out.println("Введите радиус и высоту цилиндра:");
                double radius = scanner.nextDouble();
                double height = scanner.nextDouble();

                if (radius <= 0 || height <= 0) {
                    throw new Exception("Недопустимые размеры. Радиус и высота должны быть положительными.");
                }

                Cylinder cylinder = new Cylinder(radius, height);

                System.out.println("Area: " + cylinder.getArea());
                System.out.println("Volume: " + cylinder.getVolume());
            } else {
                throw new Exception("Неверный выбор. Пожалуйста, выберите 1 или 2.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}