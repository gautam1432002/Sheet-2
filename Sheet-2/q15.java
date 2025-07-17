import java.util.Scanner;

 class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income, tax = 0;
        System.out.print("Enter your income: ");
        income = sc.nextFloat();

        if(income <= 250000) {
            tax = 0;
        } else if(income <= 500000) {
            tax = (income - 250000) * 0.05f;
        } else if(income <= 1000000) {
            tax = (250000 * 0.05f) + (income - 500000) * 0.2f;
        } else {
            tax = (250000 * 0.05f) + (500000 * 0.2f) + (income - 1000000) * 0.3f;
        }

        System.out.println("Tax to be paid: ₹" + tax);
    }
}
