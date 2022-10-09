import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Hocam öncelikle merhabalar. Bir iki özellik veya kod fazladan yazmış olabilirim. İnanın ödevi sevdiğimden ve
		 * yeni öğrendiğimden bildiklerimi yazmak istedim. Siz değerli hocalarıma bilmişlik taslamak istemem. Hatta daha da 
		 * güzelleştirecektim, güzelleştirirken öğrenecektim fakat size karşı sınırımı çok aşmak istemedim.
		 * Şimdiden teşşekkür ederim eğer derseniz fazlalıkları siler baştan atarım. 
		 * 
		 * Doğukan Güner
		 * 02195076013
		 * 
		 */
		
		
		
		InsanSinifi insanSinifi1 = new InsanSinifi("Doğu", "Güner", 23, 1.77, 60); //Parametli constractor çalıştırdım. Kaydetme şekillerden biri
		
		
		
		
		InsanSinifi insanSinifi2 = new InsanSinifi(); //Düz constructor çalıştırdım. Kaydetme şekillerinden biri
		insanSinifi2.setName("Ahmet");
		insanSinifi2.setFirstName("Güner");
		insanSinifi2.setYas(19);
		insanSinifi2.setBoy(1.78);
		insanSinifi2.setKilo(60);
		
		
		
		
		InsanSinifi insanSinifi3 = new InsanSinifi("Ferdi","Güner", 46, 1.79, 79);
		InsanSinifi insanSinifi4 = new InsanSinifi("Selma","Güner", 42, 1.59, 70);
		
		
		
		Scanner scanner = new Scanner(System.in);
		InsanSinifi insanSinifi5 = new InsanSinifi(); //Bu kısım da ise kullanıcıdan girdileri alıyor. Nesne tanımlada bildiğim yöntemler bu kadar. 
		System.out.println("İsim giriniz :");
		insanSinifi5.setName(scanner.nextLine());
		System.out.println("Soy isim giriniz :");
		insanSinifi5.setFirstName(scanner.nextLine());
		System.out.println("Yaş giriniz :");
		insanSinifi5.setYas(scanner.nextInt());
		System.out.println("Boy giriniz : (Nokta yerine virgül kllanın!!)");
		insanSinifi5.setBoy(scanner.nextDouble());
		System.out.println("Kilo giriniz :");
		insanSinifi5.setKilo(scanner.nextInt());

		
		
		NufusDBSinifi nufusDBSinifi = new NufusDBSinifi();
		InsanSinifi[] insanlar = { insanSinifi1,insanSinifi2, insanSinifi3, insanSinifi4, insanSinifi5}; 
		
		for(InsanSinifi multiAdd : insanlar) {
			nufusDBSinifi.add(multiAdd);
		}
		
		System.out.println("---Liste---");
		nufusDBSinifi.listeleDizi(insanlar);
		
		
		
		
		
		
		
		

		
		

	}

}
