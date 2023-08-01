package helper.bitwise;

public class IsOddOrEven {


    public boolean isOdd(int n){

       return (n & 1) == 1;
    }


    public static void main(String[] args) {


        IsOddOrEven isEven = new IsOddOrEven();
        int n = 23;
        System.out.println(isEven.isOdd(n));
    }
}
