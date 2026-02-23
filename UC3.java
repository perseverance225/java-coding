public class UC3 {
    public static void main(String[] args) {
        // UC2: Print "OOPS" banner using String.join()
        printBanner();
    }

    private static void printBanner() {
        // Each line of the banner is constructed using String.join()
        String line1 = String.join("", "*", "*", "*", "*", "*", "*", "*");
        String line2 = String.join("", "*", " ", "O", "O", "P", "S", " ");
        String line3 = String.join("", "*", "*", "*", "*", "*", "*", "*");

        // Print the banner
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
