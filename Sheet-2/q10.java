import java.util.Scanner;
 class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, digit;
        System.out.print("Enter a 3-digit number: ");
        num = sc.nextInt();

        while(num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
