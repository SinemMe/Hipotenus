import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;

        System.out.print("Enter the 1. side of the triangle : ");
        side1 = input.nextInt();
        System.out.print("Enter the 2. side of the triangle : ");
        side2 = input.nextInt();
        System.out.print("Enter the 3. side of the triangle : ");
        side3 = (int)Math.sqrt((side1*side1)+(side2*side2));

        System.out.println("Area of triangle: " + side3);
    }
}
