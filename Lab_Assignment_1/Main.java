import java.util.Scanner;
	public class Main{

	
	
	

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		PharmacyShop p = new PharmacyShop();
	
		
		
	
		

		System.out.println("1.Add a new Medicine ");
		System.out.println("2.Search a Medicine by Id ");
		System.out.println("3.Remove a Medicine from Inventery ");
		System.out.println("4.Display all Medicines");
		System.out.println("5.Update a Medicine ");
	
		System.out.println("Enter your Choice:");		
		 int choice = input.nextInt();
	
		

		if (choice ==1){
			p.add();
			
			}

		if (choice ==2){
			p.searchMedicineById();
			
		}
		if (choice == 3){
			p.searchMedicineById();
			
			}
		if(choice == 4){
			p.display();
			
			}
		if (choice == 5){
			p.upDateMedicine();
			
			}
		

		

















	}


}