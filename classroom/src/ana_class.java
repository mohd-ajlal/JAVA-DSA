public class ana_class {
    public static void main(String[] args) {
        Printable p = new Printable() {
            public void m1(){
                System.out.println("m1");
            }

            public void m2(){
                System.out.println("m2");
            }
        };

        p.m1();
        p.m2();
    }
}


//marker interface
//functional interface - only one abstract method