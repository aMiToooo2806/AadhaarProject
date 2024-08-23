package AadhaarProject;
// Requirements: Ask User to enter his aadhaar Number, and display his pan details
// Basically Link the aadhaar and pan .
import java.util.Scanner;

public class PanAadhaarLinkedApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadhaarService aadhaarService = new AadhaarService();
        PanService panService = new PanService();

        System.out.println("Enter the aadhaar Number");
        String aadhaarNumber = sc.nextLine();

        // Aadhaar aadhaar = aadhaarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan = panService.getPanByAadhaarNumber(aadhaarNumber);

        if( pan != null)
        {

            System.out.println("Pan Details are : "+ pan);
        }
        else{
            System.out.println("No match found.......");
        }
    }
}
