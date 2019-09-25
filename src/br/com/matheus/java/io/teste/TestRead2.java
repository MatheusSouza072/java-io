package br.com.matheus.java.io.teste;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TestRead2 {

    public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.name());

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			// System.out.println(line);

			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(",");
			lineScanner.useLocale(Locale.US);

			String typeAccount = lineScanner.next();
			int agency = lineScanner.nextInt();
			int number = lineScanner.nextInt();
			String holder = lineScanner.next();
			double balance = lineScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", typeAccount, agency, number, holder, balance);

			System.out.print(valorFormatado);


		}

		scanner.close();
	}

}