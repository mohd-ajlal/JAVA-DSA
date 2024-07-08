public class digitSum {
    public static int sum(int num){
        if(num<=9) return num;
        else return sum(num/10) + num%10;
    }

    public static int sumIterative(int num){
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num /=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num =89654;
        System.out.println(sum(num));
        System.out.println(sumIterative(num));
    }
}
