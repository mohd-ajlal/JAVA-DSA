import java.util.*;
import java.io.File;
public class _1_star {
    public static  void main (String[] args){
        Scanner sc;
        try{
            sc = new Scanner(new File("_1_star_file.txt"));
        }
        catch (Exception e) {
            System.out.println("bruh");
            return;
        }
        long res=0;
        while(sc.hasNext()){
            res+=sum(sc.nextLine());
        }
        System.out.println(res);
        sc.close();

    }
    public static int sum(String word){
        StringBuilder haha= new StringBuilder(word);
        int[] arr= new int[2];
        int len= haha.length()-1;
        int flag1=0;
        int flag2=0;
        for( int i=0; i< haha.length(); i++){
            if (haha.charAt(i) >='0' && haha.charAt(i) <='9' && flag1==0 ){
                arr[0]= (int)haha.charAt(i)-48;
                flag1= 1;
            }
            if(haha.charAt(len-i) >='0' && haha.charAt(len-i) <='9' && flag2==0){
                arr[1]= (int)haha.charAt(len-i)- 48;
                flag2= 1;
            }
        }
        return (arr[0] * 10) + arr[1];
    }
}
