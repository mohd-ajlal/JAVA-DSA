public class recursion2 {
    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.print(test + " ");
            printFun(test - 1);
            System.out.print(test + " ");
            return;
        }
    }

    public static void main(String[] args)
    {
        // Calling function printFun()
        int test = 5;

        printFun(test);
    }
}
