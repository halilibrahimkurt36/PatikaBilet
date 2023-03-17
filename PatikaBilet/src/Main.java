import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String firstName,lastName;
		int age,distance,type;
		double amount=0;
		try (Scanner giris = new Scanner(System.in)) {
			System.out.println("Hoşgeldiniz");
			
			System.out.print("Adınız? : ");
			firstName=giris.nextLine();
			
			System.out.print("Soyadınız? : ");
			lastName=giris.nextLine();
			
			System.out.println("Merhaba " + firstName + " " + lastName);
			
			System.out.print("Lütfen Yaşınızı Giriniz : ");
			age=giris.nextInt();
			while(age<0) {
			if(age<=0) {
				System.out.println("Yaş 0'dan küçük olamaz");
			}
			System.out.print("Lütfen Yaşınızı Giriniz : ");
			age=giris.nextInt();
			}
			
			System.out.print("Gidilecek Mesafeyi Giriniz : ");
			distance=giris.nextInt();
			while(distance<0) {
				if(distance<=0) {
					System.out.println("Mesafe 0'dan küçük olamaz");
				}
				System.out.print("Gidilecek Mesafeyi Giriniz : ");
				distance=giris.nextInt();
				}
			
			
			System.out.print("Sadece Gidiş İçin 1 , Gidiş-Dönüş İçin 2 Yazınız :");
			type=giris.nextInt();
			
			if(type==1 || type==2) {
				amount=0.10*distance;
				System.out.println("Normal Tutar : " + amount);
				if(age<12) {
					amount=amount-(amount*50)/100;
				}else if(age >=12 && age <=24) {
					amount=amount-(amount*10)/100;
				}else if(age>65) {
					amount=amount-(amount*30)/100;
				}
				if(type==2) {
					amount=amount-(amount*20)/100;
				}
			}else {
				
			
			while(type!=1 || type!=2) {
			if(type!=1 || type!=2 ) {
				System.out.println("Yanlış Giriş Yaptınız Lütfen Yolculuk Tipini Yeniden Giriniz");
			}
			type=giris.nextInt();
			}
			}
		}
		
		System.out.println("Toplam Bilet Tutarınız = "+amount);
		
	}
	

}
