import java.util.*;
public class Loops {
    public static void main(String[] args) {
     int n,r,rem,sum=0;
     Scanner s=new Scanner(System.in);     //this question is to prove if a number is an armstrong number....

        System.out.println("enter the number");
        n=s.nextInt();
        r=n;

        while(r!=0){

            rem=r%10;  // r%10 gives the last digit of the entered number
            sum+=(rem*rem*rem);//as sum=0 initially, hence sum becomes last digit cube and then so on....
            r=r/10;/*this gives the number by removing last digit ...and hence the above process continues
                    until the number becomes zero and hence we get the sum of cubes of digits of a given no.*/

        }
        if (sum==n)   // if the sum of cubes of digits of a number is equal to the given number
            System.out.println(n+" is an armstrong number");  //it is an armstrong number
        else
            System.out.println(n+" is not an armstrong number");//else not an armstrong number




    }
}
