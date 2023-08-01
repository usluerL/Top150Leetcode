package helper.bitwise;

public class IthBitOfANumber {



    // if you want to find ith bit of a number you can & with 1.
    // In order to
    public int findKthBit(int i, int n) {

        int mask = 1 << i-1;
        int res = mask & n;
        System.out.println(res);

        return  res >> i-1;

    }

    public int setIthBit(int i, int n){
        int mask = 1 << i-1;
        int res = n ^ mask;

        return res;

    }




    public static void main(String[] args) {
        IthBitOfANumber pr = new IthBitOfANumber();


//        System.out.println(pr.setIthBit(3, 10));

        System.out.println(12 ^  -12)  ;

    }
}
