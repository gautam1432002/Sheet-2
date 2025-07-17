import java.util.Scanner;

 class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, present;
        System.out.print("Enter total classes held: ");
        total = sc.nextInt();
        System.out.print("Enter total classes attended: ");
        present = sc.nextInt();

        float percent = (present * 100.0f) / total;

        System.out.println("Attendance percentage: " + percent + "%");

        if(percent >= 75) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }
    }
}
