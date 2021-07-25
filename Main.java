import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
		
		String isim = scan.nextLine().toLowerCase();
		char harf = scan.nextLine().toLowerCase().charAt(0);
		
		int sayi = 0;
		String son = isim;
		
		
	for (int i = 0; i < isim.length(); i++) {
		
		if (son.indexOf(harf) >= 0) {
			
			sayi++;
			
			son = son.substring(son.indexOf(harf)+1);
			
		}
		
	}
		System.out.println("Number of a = " + sayi);
		scan.close();

  }
}