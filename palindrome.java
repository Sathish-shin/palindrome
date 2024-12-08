import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the ineteger number : ");
        int num=s.nextInt();
        int original=num;
        int reverse=0;
        while (num>0) {
            int r=num%10;
            reverse=reverse*10+r;
            num/=10;
        }
        if(original==reverse){
            System.out.println(original+" is a palindrome number ");
        }
        else{
            System.out.println(original+" is not a palindrome number ");
        }
    }
    
}


