public class MainActivity1{
    public static void main(String []args){
        Dogs4Sale dogs = new Dogs4Sale();
        Dogs4Sale dog1 = new Dogs4Sale(" ",0.0," ");
        Dogs4Sale dog2 = new Dogs4Sale(" ",0.0," ");
        Dogs4Sale dog3 = new Dogs4Sale(" ",0.0," ");
     
		//Set dog1
		dog1.setName("Richard");
		dog1.setPrice(1000.0);
		dog1.setBreed("Golden Retriever");
        //Set dog2
		dog2.setName("SimoRun");
		dog2.setPrice(800.0);
		dog2.setBreed("Pitbull");
        //Set dog3
		dog3.setName("Karl");
		dog3.setPrice(1200.0);
		dog3.setBreed("Husky");
		// Print information about the dogs
		//information of Dog1 
   	    System.out.println("Dog 1:\n\t\tName:  " + dog1.getName() );
		System.out.println("\t\tPrice :  " + dog1.getPrice());
		System.out.println("\t\tBreed: "+ dog1.getBreed() ); 
		
		//information of Dog 2 
		System.out.println("Dog 2:\n\t\tName:  " + dog2.getName() );
		System.out.println("\t\tPrice :  " + dog2.getPrice());
		System.out.println("\t\tBreed: "+ dog2.getBreed() ); 
		
        //information of Dog 3 
		System.out.println("Dog 3:\n\t\tName:  " + dog3.getName() );
		System.out.println("\t\tPrice :  " + dog3.getPrice());
		System.out.println("\t\tBreed: "+ dog3.getBreed() ); 
    }
}