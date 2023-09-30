import java.util.Scanner;
public class MainActivity2
{
	public static void main(String[] args)
	{   
		Scanner input = new Scanner(System.in);

		System.out.print("How Many Dogs would you like to sale?: ");
		int sale = input.nextInt();
		input.nextLine();
		Dogs4Sale[] doggy = new Dogs4Sale[sale];
	
		for(int i = 0 ; i < sale ; i++){ 

			Dogs4Sale dogs = new Dogs4Sale("",0.0,""); // constructor with parameters

			System.out.println("\n"+"Enter information for Dog "+(i+1)+ ":"+"\n");

			System.out.print("Enter the Name: ");
			dogs.setName(input.nextLine());

			System.out.print("Enter the Price: ");
			dogs.setPrice(input.nextDouble());
			input.nextLine();

			System.out.print("Enter the Breed: ");
			dogs.setBreed(input.nextLine());
			
			doggy[i]= dogs;
		}
		
		Dogs4Sale dogss = new Dogs4Sale();//default constructor


        //printing the information about the user input
		for (int i = 0 ; i < doggy.length ; i++){
			Dogs4Sale dogs = doggy[i];

			System.out.println("\nDog " + (i + 1) + " ");
			System.out.println("\t\tName: "+dogs.getName());
			System.out.println("\t\tPrice: "+dogs.getPrice());
			System.out.println("\t\tBreed: "+dogs.getBreed());

		}
		//if the user finish to input this will be here achievement.
		if(sale > 0){
			System.out.println("\n=======================================================");
			System.out.println("Congratulations! You successfully sale " + sale + " Dog"+(sale > 1 ? "s" : " ") + "!");
		}
	}
}
