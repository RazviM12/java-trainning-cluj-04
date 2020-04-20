public class FooBarQix {

    public static void main(String[] args) {

        for(int i = 1; i <= 60; i++){
            if((i % 3 == 0)) {
                System.out.print("Foo ");
                if ((i / 10 == 3) || (i % 10 == 3) || (i % 10 / 10 == 3))
                    System.out.print("Foo ");
            }
            else System.out.print(i+" ");
            
        }
    }
}



