package kitapyonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1.Kullanicinin kitap ekleme, silme ve listeleme gibi islemleri 
       yapmasina imkan taniyan bir uygulama yaziniz
    
     2.Program, kitaplara 1001 den baslayarak sirali ve otomatik numara vermeli. 
       Bununla birlikte herbir kitap icin
       Kitap Adi,Yazar Adi,Yayin Yili ve fiyat gibi bilgiler girilebilmelidir.
   
     3. Program baslangicinda kullaniciya asagidaki gibi bir menu sunulmalidir.
       Kullanici programi bitirene kadar isleme devam edilmelidir.
	 
	 ===========Kitap Programi=============
	 1:Kitap Ekle
	 2:Numara ile kitap sil
	 3:Tum kitaplari listele
	 4:Bitir */
public class Kitapci {
	
	static List <Kitap> kitapListe = new ArrayList<>();	
	static Scanner scanner = new Scanner (System.in);
	static int kitapNo = 1001;
	
	
	
	public static void main(String [] args) {
		menu(kitapListe);
		
	
	}

	public static void menu(List <Kitap> liste) {
		System.out.println("===========Kitap Programi=============\n1:Kitap ekle\n2:Numara ile kitap sil"
				+ "\n3:Tum kitaplari listele\n4:Bitir");
		
		System.out.println("Isleminizi seciniz : ");
		int tercih = scanner.nextInt();
		
		switch (tercih) {
		
		case 1:
			kitapEkle(liste);
			break;
		
		case 2:
			noIleSil(liste);
			break;	
			
		case 3:
			listele(liste);
			break;
			
		case 4:
			bitir();
			break;
		default:
			System.out.println("Yanlis giris yapildi. Tekrar deneyiniz!!!");
			break;
		}
		
	}
    
	private static void bitir() {
		System.out.println("Yine bekleriz");
	}
	
	
	private static void listele(List<Kitap> liste) {
	for(Kitap k: liste) {
		System.out.println(k.toString());
	}
	menu(liste);	
	}

	private static void noIleSil(List<Kitap> liste) {
	 System.out.println("Silinecek kitap numarasini giriniz: ");
	 int silinecekNo = scanner.nextInt();
	 
	 for (Kitap k : liste) {
		if(k.getNo() == silinecekNo ) {
		liste.remove(silinecekNo);
		menu(liste);
		}
	 }
	 System.out.println(silinecekNo+ " ait kitap bulunamadi.");
	 menu(liste);
	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.print("Kitap ismi giriniz:");
		String kitapAdi = scanner.next();
		System.out.println("Kitap yazar ismi giriniz:");
		String yazarAdi = scanner.next();
		System.out.println("Kitap yayin yilini giriniz:");
		int yayinYili = scanner.nextInt();
		System.out.println("Fiyati giriniz:");
		double fiyat = scanner.nextDouble();
		Kitap kitap = new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);//kitap objesi create edildi
		liste.add(kitap);
		System.out.println(kitap.toString() + " eklendi.");
		menu(liste);
	}
	
	
}













