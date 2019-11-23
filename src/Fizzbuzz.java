public class Fizzbuzz {
    public static void main(String[] args) {
        int x = 347693485;
        int b;
        for (int num=x;num>0;num/=10){
            b =num%10;
            if (b%2==0 && b%3!=0 ) System.out.println(b+" fizz");
            if (b%3==0 && b%2!=0) System.out.println(b+" buzz");
            if (b%2==0 && b%3==0) System.out.println(b+" fizzbuzz");

            //System.out.println(num%10);
        }
    }
}
