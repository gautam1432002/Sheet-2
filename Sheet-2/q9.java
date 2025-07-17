import java.util.Scanner;

 class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
