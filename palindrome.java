public class palindrome {
    public static void main(String[] args) {
        int num=121;
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


