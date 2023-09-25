public class subString {
    public static void main(String[] args) {
        String s = "Hello";
        for(int i = 0; i<=s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                System.out.print(s.substring(i, j)+ " ");
            }
            System.out.println();
        }
    }
}
