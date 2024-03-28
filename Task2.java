//--Task 2--(Random Password Generator )//
import java.util.*;

class Randompassgen
{
    public static void main(String[] args)
     {
      
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String specialchar="@#$%^&*()!_-+/~|{}[]";
        String num="0123456789";

        String combination=upper+lower+specialchar+num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a length of Required Paassword :");
        int len=sc.nextInt();

        if (len <= 20) {
            char[] password = new char[len];
            Random r = new Random();
            for (int i = 0; i < len; i++) {
                password[i] = combination.charAt(r.nextInt(combination.length()));
            }
            System.out.println("Randomly Generated Password is : " + new String(password));
        } else {
            System.out.println("Ideal Length of a Password is upto 20 characters Please enter correct Length.");
        }

    sc.close();  
    }
}