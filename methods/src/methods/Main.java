package methods;


public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,5,9};
		int aranacak=6;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if (varMi) {
			mesaj="Sayı bulundu: "+ aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı bulunamadı: "+ aranacak);
			
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
