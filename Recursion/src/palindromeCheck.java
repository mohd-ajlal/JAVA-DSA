public class palindromeCheck {
    static boolean ispPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)) && ispPalindrome(str, start+1, end-1);
    }
      public static void main(String[] args) {
        String str = "aabbaa";
        int start = 0;
        int end = str.length()-1;
          System.out.println(ispPalindrome(str, start, end));
    }
}
