
public class InsanSinifi {

	private String name;
	private String firstName;
	private int yas;
	private double boy;
	private int kilo;
	
	public InsanSinifi() {
		
	}
	
	public InsanSinifi( String name, String firstName, int yas, double boy, int kilo) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public double getBoy() {
		return boy;
	}


	public void setBoy(double boy) {
		this.boy = boy;
	}


	public int getKilo() {
		return kilo;
	}


	public void setKilo(int kilo) {
		this.kilo = kilo;
	}


}
