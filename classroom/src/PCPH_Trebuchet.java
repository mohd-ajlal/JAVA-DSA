public class PCPH_Trebuchet {
    public static int fun1(String string){
        StringBuilder line = new StringBuilder(string);
        int first=10;
        int last=0;
        for(int i = 0; i<line.length(); i++){
            if(line.charAt(i) >=48&&line.charAt(i) <=57){
                if(first==0){
                    first = line.charAt(i) - 48;
                } else if (first!=10) {
                    last = line.charAt(i) - 48;
                }
            }
//            System.out.println(first);
//            System.out.println(last);
        }

        return first*10 + last;
    }
    public static void main(String[] args) {
        String str = "88xpnfpb";
        int num = fun1(str);
        System.out.println(num);
    }
}
