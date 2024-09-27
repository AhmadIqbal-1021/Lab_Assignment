import java.util.Scanner;
	public class PharmacyShop{
	
	Scanner input = new Scanner(System.in);
	int medicineCount = 4;
	String flag ;
	Address address = new Address("ST#5","Karachi","K910");
	Person owner = new Person("Ahmad Khan " , "03184405326");
	
	
	Medicine[] medicines = new Medicine[10];
	
	{
		medicines[0] = new Medicine("M001","B123","Paracetamol","PharmaCorp",100,50.0,new Date(15,8,25));
		medicines[1] = new Medicine("M001","B123","Paracetamol","PharmaCorp",100,50.0,new Date(15,8,25));
		medicines[2] = new Medicine("M001","B123","Paracetamol","PharmaCorp",100,50.0,new Date(15,8,25));
		medicines[3] = new Medicine("M001","B123","Paracetamol","PharmaCorp",100,50.0,new Date(15,8,25));		 
		
		
	}
		
	
	public void display(){
		for(int i = 0 ; i<medicineCount+1 ; i++){
			System.out.println(medicines[i]);
		}

		
		
	}
	
	public boolean searchMedicineById(){
		System.out.println("Enter the Id:");
		String id = input.nextLine();
		 for(int i=0 ; i<medicines.length;i++)	
		{	
		
		if(medicines[i].getMedicineId().equals(id))
			{
				System.out.println(medicines[i]);
				Medicine temp = medicines[i];
				return true;
				
				
		}
		  else 
			System.out.println("Not found");
				
		}
		return false;
	
	}
	
	public void addMedicine(){
		add();
		
		
	}
	public void add(){
		System.out.println("Enter the ID : ");
		String id = input.nextLine();
		System.out.println("Enter the Name: ");
		String name = input.nextLine();
		System.out.println("Enter the Batch Number: ");
		String bnumber = input.nextLine();
		System.out.println("Enter the Manufacturer: ");
		String manufact = input.nextLine();
		System.out.println("Enter the Quantity: ");
		int qn = input.nextInt();
		System.out.println("Enter the Price: ");
		double pr = input.nextDouble();
		
		 medicines[medicineCount] = new Medicine(id,bnumber,name,manufact,qn,pr,new Date(1,1,1));
			medicineCount++;
		
	
	
	}
	
	
	public void upDateMedicine(){
		System.out.println("Enter the Old ID");
		String id1 =input.nextLine();
		System.out.println("Enter the old ID");
		String id = input.nextLine();
		if(searchMedicineById())
			{
				add();

			}
		else
			System.out.println("Not exist");
	

		}
	
	
	 
	public void searchMedicineByName(String name){	

		
	}
	
	   
	
	
	
	
	
	
	
	
}