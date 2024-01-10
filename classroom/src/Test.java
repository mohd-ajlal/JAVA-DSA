
interface Int1{
    void m1();
}

interface Int2 extends Int1{
    void m2();
}
public class Test implements Int2 {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }
}
