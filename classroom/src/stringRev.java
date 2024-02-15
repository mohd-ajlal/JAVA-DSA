public class stringRev {
    public static String reverse(String str){
        if(str.length()>1){
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "hello";

//        char c = str.charAt(str.length()-1);
//        System.out.println(c);
//
//        str = str.substring(0, str.length()-1);
//        System.out.println(str);
//        c = str.charAt(str.length()-1);
//        System.out.println(c);

        System.out.println(reverse(str));
    }
}
