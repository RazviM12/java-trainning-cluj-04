public class summingNonFloating {

    public static void main(String[] args){
        sumBytes();
        sumShorts();
        sumInts();
    }

    private static void sumBytes(){
        byte x = 5;
        byte y = 10;
        byte sum;
        sum = (byte) (x + y);
        System.out.println("Sum in bytes: " + sum);
    }

    private static void sumShorts(){
        short x = 5;
        short y = 10;
        short sum = (short) (x + y);
        System.out.println("Sum in shorts " + sum);
    }

    private static void sumInts(){
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of ints " + sum);
    }

}
