package examples;

import java.util.Scanner;

public class metotlarexample2 {

	static boolean aktif = true;
	static int hakSayisi = 3;

	public static void main(String[] args) {
		// kullanıcının uygulamaya giriş yapmasını sağlayalım, 3 hakkı olsun
		// 3 hakkını doldurduğu zaman hesabını disable yapalım, doğru girerse sisteme
		// giriş yapsın

		Scanner scanner = new Scanner(System.in);

		if (aktif) {
			if (hakSayisi > 0) {
				while (aktif) {
					System.out.println("Kullanıcı Adınız: ");
					String username = scanner.nextLine();

					System.out.println("Şifreniz: ");
					String password = scanner.nextLine();

					boolean sonuc = login(username, password);
					if (sonuc) {
						System.out.println("Uygulamaya başarılı olarak giriş yaptınız :) ");
						break;
					} else {
						if (hakSayisi == 0) {
							aktif = false; // hesabı pasif yaptım
							break; // döngüyü kırdım. artık kullanıcı adı ve şifresi sormasın
						}
					}
				}

				if (aktif == false) {
					System.out.println("Hak sayınız dolmuştur");
				}
			} else {
				System.out.println("Hak Sayınız dolmuştur,hesabınız bloke edildi.");
			}

		} else {
			System.out.println("Hesabınız aktif değildir, yöneticiniz ile görüşünüz");
		}

	}

	public static boolean login(String username, String password) { // nilo------123
		if (username.equals("nilo") && password.equals("123")) {
			return true; // başarılı
		} else {
			hakSayisi--;
			System.out.println("Kullanıcı adı ve şifreniz yanlıştır.");
			return false;
		}
	}

}