public class StringB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        StringBuilder s1 = new StringBuilder("hello");

        String s = "hello";
        String name = s.concat("abc");
        sb.append("abc");
        s1.append("abc");
        System.out.println(s);  // immutable - cant be change
        System.out.println(s1); // mutable
        System.out.println(sb); // mutable

//        string
        int start = (int) System.currentTimeMillis();

        for(int i = 0; i<100000; i++){
            s = s.concat("abc");
        }

        int end = (int) System.currentTimeMillis();
        System.out.println(end-start);

// buffer

        start = (int) System.currentTimeMillis();

        for(int i = 0; i<100000; i++){
            sb.append("abc");
        }

        end = (int) System.currentTimeMillis();
        System.out.println(end-start);

//        builder
        start = (int) System.currentTimeMillis();

        for(int i = 0; i<100000; i++){
            s1.append("abc");
        }

        end = (int) System.currentTimeMillis();
        System.out.println(end-start);

    }
}
