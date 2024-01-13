import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do lado x: ");
        double x = scanner.nextDouble();
        System.out.println("Insira o valor do lado y: ");
        double y = scanner.nextDouble();

        double z = Math.sqrt((x * x) + (y * y));
        double z1 = Math.min(x, y);
        double z2 = Math.max(x, y);
        double z3 = Math.abs(y);
        double z4 = Math.sqrt(y);
        System.out.println("\nO valor da hipotenusa é: \n" + z);
        System.out.println("\nO maior valor entre os dois números é: \n" + z2);
        System.out.println("\nO menor valor entre os dois números é: \n" + z1);
        System.out.println("\nO valor absoluto de y é: \n" + z3);
        System.out.println("\nA raíz quadrada de y é: \n" + z4);
        scanner.close();
    }
}