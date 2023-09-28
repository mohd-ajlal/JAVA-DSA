public class palindrome_print {
    static boolean isPalindrome(String str){
        if(str.isEmpty()){
            return true;
        }
        str= str.toLowerCase();
        for(int i = 0; i< str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()- 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "nitin";
        for(int i = 0; i<=s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String str = s.substring(i, j);
                if(isPalindrome(str)){
                    System.out.println(str);
                }
            }
        }
    }
}