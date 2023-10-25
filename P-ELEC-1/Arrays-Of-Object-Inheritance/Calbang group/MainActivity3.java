import java.util.Scanner;
public class MainActivity3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("How many computer appliances do you want to sell: ");
            int sales = input.nextInt();
            input.nextLine();
           
            ComputerAppliances[] computers = new ComputerAppliances[sales]; // Create an array of Computer objects
           
            
                for(int i = 0 ; i < sales; i++){ 

                    ComputerAppliances PcAppliances = new ComputerAppliances(" "," ", 0.0 , 0); // constructor with parameters
                        System.out.println();
                        System.out.println("Enter information about what you are selling in No. "+(i+1)+ "\n");

                        System.out.print("Category: ");
                        PcAppliances.setCategory(input.nextLine());

                        System.out.print("Model: ");
                        PcAppliances.setModel(input.nextLine());

                        System.out.print("Price: ");
                        PcAppliances.setPrice(input.nextDouble());
                         
                        System.out.print("Quantity: ");
                        PcAppliances.setQuantity(input.nextInt());
                        
                        input.nextLine();
                        
                        computers[i]= PcAppliances;
                }

                //printing the information about the user input
                for (int i = 0 ; i < sales; i++){
                      ComputerAppliances  PcAppliances = computers[i];
                        System.out.println("=======================================================");
                        System.out.println(); 
                        System.out.println("Product " + (i + 1) + ": ");
                        System.out.println();
                        System.out.println("Category: "+PcAppliances.getCategory());
                        System.out.println("Model: "+PcAppliances.getModel());
                        System.out.println("Price: "+PcAppliances.getPrice());
                        System.out.println("Quantity: "+PcAppliances.getQuantity());
                        System.out.println("Total Price: "+PcAppliances.calculateTotalPrice());
                        System.out.println();
                    }
                //if the user finish to input this will be here achievement.
                if(sales> 0){
                        System.out.println("\n=======================================================");
                        System.out.println("Congratulations! You successfully sale " + sales + " computer appliance"+(sales > 1 ? "s" : " ") + "!");
                    }
            }
        }
           
    

        

