public class UC3 {
    // Helper method to create a line
    private static String createLine(String... parts) {
        return String.join("", parts);
    }

    public static void main(String[] args) {
        String line1 = createLine("*****", "   ", "*****", "   ", "*****", "   ", "*****");
        String line2 = createLine("*   *", "   ", "*   *", "   ", "*   *", "   ", "*    ");
        String line3 = createLine("*   *", "   ", "*   *", "   ", "*****", "   ", "******");
        String line4 = createLine("*   *", "   ", "*   *", "   ", "*", "       ", "     *", "   ", "", "       ", " ");
        String line5 = createLine("*****", "   ", "*****", "   ", "*", "       ", "******", "   ", "", "       "," " );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}

