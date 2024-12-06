import java.util.Scanner;

public class StringInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringInString repeatInString = new StringInString();
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if(s1 == "" || s2 == "") {
            System.out.println(0);
            return;
        }
       int n =  repeatInString.foundRepeat(s1, s2);
        System.out.println(n);

    }

    private int foundRepeat(String one,String two) {
        int i = 0;
        int sum = 0;
        int y =  two.length();

        while (y != one.length() + 1) {
            String check = one.substring(i,y);
            if(check.equals(two)) { sum+=1;};
            i++;
            y++;
        }
        return sum;
    }
}
