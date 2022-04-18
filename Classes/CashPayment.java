package Classes;
import java.util.Scanner;
public abstract class CashPayment{
	Scanner sc = new Scanner(System.in);
    double discount;
    double payAbleAmount = 5500.0*3.0;
    public double setPayableAmount(){
        System.out.println("Enter Your Cgpa:");
        double cgpa = sc.nextDouble();
        if(cgpa == 4.00){
            System.out.println("Congratulations! You're Under Complete Scholarship");
            System.out.print("Your total Payable Amount:");
            discount = payAbleAmount * 1;
            payAbleAmount = payAbleAmount - discount;
            System.out.println(payAbleAmount);
        }
        else if(cgpa<4.00 && cgpa >= 3.75){
            System.out.println("Congratulations! You will get 50% Scholarship");
            System.out.print("Your total Payable Amount:");
            discount = payAbleAmount * 0.5;
            payAbleAmount = payAbleAmount - discount;
            System.out.println(" "+payAbleAmount);
        }
        else if(cgpa<3.75 && cgpa >= 3.50){
            System.out.println("Congratulations! You will get 30% Scholarship");
            System.out.print("Your total Payable Amount:");
            discount = payAbleAmount * 0.3;
            payAbleAmount = payAbleAmount - discount;
            System.out.println(" "+payAbleAmount);
        }
        else{
            System.out.println("Sorry! You're not accepted for Scholarship.");
            System.out.print("Your total Payable Amount:");
            System.out.println(" "+payAbleAmount);
        }
        return cgpa;
    }
    public abstract void SetUser();
	public abstract void greetingsUser();
	
}