import java.io.File;
import java.util.Scanner;
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("input_01_2.txt"));
        } catch (Exception e) {
            System.out.println("bruh");
            return;
        }
        long res = 0;
        while (sc.hasNext()) {
            res += getNum(sc.nextLine());
        }
        System.out.println(res);
        sc.close();
    }
    public static int getNum(String s){
        int num = 0;
        String[] arr = {"one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i < s.length(); i++){
            if(48 <= s.charAt(i) && s.charAt(i) <= 57){
                num = num + ((int)(s.charAt(i)) - 48);
                num = num * 10;
                break;
            }
            else{
                boolean flag = false;
                for(int j = 0; j < arr.length; j++){
                    int end = i+arr[j].length() > s.length() ? s.length() : i+arr[j].length();
                    if(s.substring(i,end).equals(arr[j])){
                        num = num + (j + 1);
                        num = num * 10;
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
                
            }
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(48 <= s.charAt(i) && s.charAt(i) <= 57){
                num = num + ((int)(s.charAt(i)) - 48);
                break;
            }
            else{
                boolean flag = false;
                for(int j=0;j<arr.length;j++){
                    int start = i-arr[j].length()+1 < 0 ? 0 : i-arr[j].length()+1;
                    if(s.substring(start,i+1).equals(arr[j])){
                        num = num + (j + 1);
                        flag = true;
                       break;
                    }    
                }
                if(flag)
                    break; 
            }
        }
        return num;
    }
    

    
}