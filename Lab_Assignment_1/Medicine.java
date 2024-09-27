public class Medicine{
	
	private String medicineId;
	private String batchNumber;	
	private String manufacturer;
	private String name;
	private int quantity;
	private double price;
	
	Date expiryDate = new Date(1,1,1);
	
	public void setMedicineId(String id){
		this.medicineId = id;		
	}
	public String getMedicineId(){
		return medicineId;
	}
	public void setBatchNumber(String batchNumber){
		this.batchNumber = batchNumber;
	}
	public String getBatchNumber(){
		return batchNumber;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}


	public void setDate(Date date){
		this.expiryDate	= date;
	}
	public Date getDate(){
		return expiryDate;
	}



	
		
	Medicine(String medicineId , String batchNumber , String name , String manufacturer , int quantity , double price , Date date){
	
	
	setMedicineId(medicineId);
	setBatchNumber(batchNumber);	
	setName(name);
	setManufacturer(manufacturer);
	setQuantity(quantity);
	setPrice(price);
	setDate(date);
	

	}
	
	
	public String toString(){
	
	String Temp = String.format("Medicine Id : %-5s  Medicine Name : %-10s  Manufacturer : %-10s  Batch Number : %-5s Quantity : %d  Price : %.2f ",medicineId,name,manufacturer,batchNumber,quantity,price);

	
	return Temp;

}
	
	
	@Override 
	public boolean equals(Object o){
		
		Medicine temp = (Medicine)o;
		return temp.medicineId == this.medicineId; 
		
	
	}





















		
		
}