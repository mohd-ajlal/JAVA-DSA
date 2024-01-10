interface print<T>{
    T m1(T a);
}

public class gernerics {
    public static void main(String[] args) {
      print <Integer> p = a -> a*2;

      int a = p.m1(10);

        System.out.println(a);


    }
}
