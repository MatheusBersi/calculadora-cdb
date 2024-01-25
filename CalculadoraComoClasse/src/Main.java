import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		double v1;
		double v2;
		double resultado;
		char op;		
		
		System.out.println("Digite o 1º valor: ");
		v1 = input.nextDouble();
		
		System.out.println("Digite o simbolo da operação (+, -, * ou /): ");
		op = input.next().charAt(0);
		
		System.out.println("Insira o 2º valor: ");
		v2 = input.nextDouble();
		
		resultado = calc.calcular(v1, v2, op);
		
		System.out.println("O resultado da operação é " + resultado);		
		
	}
		
}
		
		