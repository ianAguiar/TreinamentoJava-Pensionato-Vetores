package application;

import java.text.ParseException;
import java.util.Scanner;
import entities.Rent;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		System.out.print("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto Desejado: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}