import java.util.Scanner;

public class CompleteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = scanner.nextInt();
        CompleteNumber op = new CompleteNumber();

//    #### PRINT(A) ALL NUMBER
//    for(int i = 1 ; i < upperLimit ; i++) {
//    // 6
//    // 8
//        if(op.isPerfectNumber(i)) {
//            System.out.println(i);
//        }
//    }

//        #### PRINT(B) YES OR NO
        String test = op.isPerfectNumber(upperLimit);
        System.out.println(test);
    }
    // PART (A)
//    private boolean isPerfectNumber(int num) {
//        int sum = 0;
//        // 6 / 2 ==> 3
//        // 8 / 2 ==>4
//        for (int i = 1 ; i <= num /2 ; i++) {
//            // 6 % 1 ==> 0 , 6 % 2 ==> 0 ; 6 % 3 ==> 0
//            // 8 % 1 ==>0,8 % 2 ==> 4, 8%3 !=0 , 8 % 4 ==> 0 ==>1 + 2 +4 ==> 7 so in failed
//            if(num % i == 0) {
//                sum += i;
//            }
//        }
//       return sum == num ? true: false;
//
//    }
// ### PART(b)
    private  String isPerfectNumber(int num) {
        int sum = 0;
        for(int i =1 ; i <= num/ 2 ; i++) {
            if(num %  i == 0 ){
                sum += i;
            }

        }
        return sum == num ? "YES": "NO";
    }
}