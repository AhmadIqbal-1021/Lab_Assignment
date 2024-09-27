public class Address{
	
	private String street;
	private String city;
	private String postalCode;
	
	
	public void setStreet(String street){
		this.street=street;
	}
	public String getStreet(){
		return street;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;	
	}	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	public String getPostalCode(){
		return postalCode;	
	}
		
		Address(String street , String city , String postalCode){
			setStreet(street);
			setCity(city);
			setPostalCode(postalCode);
		}

	@Override
	public String toString(){
		return String.format("Street : %-10s City :  %-10s  Postal Code : %-10s",street,city,postalCode);
	
	}














	
}