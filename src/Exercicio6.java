import java.util.Scanner;


public class Exercicio6 {
	
			public static void main(String[] args) {
				
				Scanner leitor = new Scanner (System.in);
				
				System.out.println("Calculando o maximo divisor comum !");
				System.out.println("Digite o primeiro numero: ");
				
				int a  = leitor.nextInt();
				
				System.out.println("Digite o segundo numero: ");
				
				int b  = leitor.nextInt();
				
				int resto;
				
				while (b != 0) {
						resto = a % b;
						a = b;
						b = resto;
				}
				
				int mdc = a;
				
				System.out.println("O maximo divisor comum é: " + mdc);
			}

}
