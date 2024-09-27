public class Person{

	private String name;
	private String contact;
	
	public void setName(String name){
		this.name = name;
	}
	public void setContact(String contact){
		this.contact = contact;
	}
	public String getName(){
		return name;
	}
	public String getContact(){
		return contact;
	}
	
	Person(String name , String contact){
		setName(name);
		setContact(contact);
	}
	@Override
	public String toString(){
		return String.format("Name : %-10s  Contact  %-10s ",name,contact);
	
	}
	
	
	
	




}