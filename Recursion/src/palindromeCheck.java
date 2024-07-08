public class palindromeCheck {
    static boolean isPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }

    static boolean isPalindrome1(String str){
        if(str.length()<2){
            return true;
        }

        boolean b = str.charAt(0) == str.charAt(str.length()-1);
        return b && isPalindrome1(str.substring(1, str.length()-1));
    }


      public static void main(String[] args) {
        String str = "nitin";
        int start = 0;
        int end = str.length()-1;
          System.out.println(isPalindrome(str, start, end));

          System.out.println(isPalindrome1(str));
    }
}
