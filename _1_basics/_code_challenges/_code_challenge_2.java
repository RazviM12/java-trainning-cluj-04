public class FooBarQix {

    public static void main(String[] args) {

        for(int i = 1; i <= 60; i++){
            if((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0))
                System.out.print("FooBarQix ");
            else if(i % 3 == 0)
                    System.out.print("Foo ");
            else if(i % 5 == 0)
                System.out.print("Bar ");
            else if(i % 7 == 0)
                System.out.print("Qix ");
            else if ((i / 10 == 3) || (i % 10 == 3) || (i % 10 / 10 == 3))
                    System.out.print("Foo ");
            else if ((i / 10 == 5) || (i % 10 == 5) || (i % 10 / 10 == 5))
                System.out.print("Bar ");
            else if ((i / 10 == 7) || (i % 10 == 7) || (i % 10 / 10 == 7))
                System.out.print("Qix ");

            if((i % 3 != 0) && ((i / 10 != 3) && (i % 10 != 3) && (i % 10 / 10 != 3))
                    && (i % 5 != 0) && ((i / 10 != 5) && (i % 10 != 5) && (i % 10 / 10 != 5))
                    && (i % 7 != 0) && ((i / 10 != 7) && (i % 10 != 7) && (i % 10 / 10 != 7)))
                System.out.print(i+" ");
            
        }
    }
}



