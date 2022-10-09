
public class NufusDBSinifi {

	public void add(InsanSinifi insanSinifi) {
		System.out.println("Veri tabanına eklendi : "+insanSinifi.getName() );
	}
	
	public void delete(InsanSinifi insanSinifi) {
		System.out.println("Veri tabanına silindi : "+insanSinifi.getName() );
	}
	
	public void arat() {
		
	}
	
	public void listeleDizi(InsanSinifi[] insanlar) {
		for(InsanSinifi items : insanlar) {
			System.out.println("İsim: "+ items.getName() + "   Soyadı: " + items.getFirstName() + "   Yaş,Boy,Kilo : " + items.getYas() + " , " + items.getBoy() + " , " + items.getKilo() ) ;
		}
	}

	
}
