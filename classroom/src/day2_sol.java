import java.io.File;
import java.util.List;
import java.util.Scanner;

public class day2_sol {

    record MGO(int r, int g, int b) {
    }

    public static boolean isGameValid(List<MGO> mgos) {
        for (MGO mgo : mgos) {
            if (mgo.r() < 0 || mgo.r() > 12)
                return false;
            if (mgo.g() < 0 || mgo.g() > 13)
                return false;
            if (mgo.b() < 0 || mgo.b() > 14)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("input.txt"));
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        sc.close();
    }

}
