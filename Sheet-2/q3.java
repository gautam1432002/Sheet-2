import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, year;
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
        System.out.print("Enter year of service: ");
        year = sc.nextInt();

        if(year > 5) {
            int bonus = salary * 5 / 100;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
