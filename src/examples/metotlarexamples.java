package examples;

import java.util.Scanner;

public class metotlarexamples {

	public static void main(String[] args) {

		// Girilen sayıların tek mi çift mi olduklarını bulalım ve ekrana yazdıralım
		// kosul,döngü,dizi,method konularını kullanmaya çalışacağız

		System.out.println("GİRİLEN SAYILARIN TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA UYGULAMASI");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dizinin Eleman Sayısını Giriniz: ");
		int diziLenght = scanner.nextInt();
		scanner.nextLine();

		int[] sayilar = new int[diziLenght];

		for (int i = 0; i < sayilar.length; i++) {
			System.out.print("Dizinin" + i + ". indeks değerini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		// artık dizimizin içerisi dolu

		for (int deger : sayilar) {
			tekMiCiftMi(deger);

		}

	}

	public static void tekMiCiftMi(int sayi) {
		if (sayi % 2 == 0) {

			System.out.println("Sayi: " + sayi + " ÇİFTTİR");

		} else {
			System.out.println("Sayi: " + sayi + " TEKTİR");
		}

	}
}
