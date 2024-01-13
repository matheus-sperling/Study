import javax.swing.*;
import java.util.Scanner;

public class Study2 {
    public static class Study {
        public static void main(String[] args) {
            System.out.println("Teste 1");
            System.out.println("Teste 2");
            System.out.println();
            System.out.println();

            int x = 123; // Inicialização
            double y = 3.14;
            boolean z = true;
            String name = "Matheus";

            System.out.println("Olá, " + name + "!\n");
            System.out.println("Seu outro número é: " + x + "\n");
            System.out.println("Seu número é: " + y + "\n");
            System.out.println("Z é uma variável classificada como: " + z + "\n");
            System.out.println(name + "\n");

            String x1 = "Água";
            String y1 = "Crystal";
            String temp;

            temp = x1;
            x1 = y1; //Funciona do mesmo jeito!
            y1 = temp;

            System.out.println("X: " + x1 + "\n");
            System.out.println("Y: " + y1 + "\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual é o seu nome?\n");

            String name1 = scanner.nextLine();

            System.out.println("Olá, " + name1 + "!" + "\n");

            System.out.println("Qual é a sua idade?\n");

            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o Scanner pra retirar o \n!

            System.out.println("A sua idade é: " + idade);

            System.out.println("Qual é a sua comida favorita?");

            // Expressões = operandos e operadores
            // Operandos = valores, variáveis, números, quantidade
            // Operadores = + - * / &

            double amigos = 10;

            amigos = amigos / 3;

            System.out.println(amigos); // Valor impossível!


            // Estudo de JOptionPane!

            name = JOptionPane.showInputDialog("Escreva seu nome:");
            JOptionPane.showMessageDialog(null, "Olá " + name + ".");

            int age = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade:"));
            JOptionPane.showMessageDialog(null, "Você tem " + age + " ano(s).");

            double height = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em centímetros:"));
            JOptionPane.showMessageDialog(null, "Você tem " + height + " centímetros de altura.");
        }
    }
}
