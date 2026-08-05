package hu.webler;

import java.util.Scanner;

public class CalculateBmi {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a nemed(Férfi vagy Nő): ");
        String gender = scanner.next();

        System.out.println("Add meg a testsúlyod(Kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Add meg a magasságod(m),vesszővel(pl. 1,83): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("A BMI értéked %.2f%n", bmi);

        boolean isMan = gender.equals("Férfi");

        String category = isMan
                ? (bmi < 20 ? "Alultáplált"
                : bmi < 25 ? "Normál testsúly"
                : bmi < 30 ? "Túlsúlyos"
                : "Elhízott")
                : (bmi < 19 ? "Alultáplált"
                : bmi < 24 ? "Normál testsúly"
                : bmi < 29 ? "Túlsúlyos"
                : "Elhízott");

        System.out.println("Kategória: " + category);
        scanner.close();
    }
}
