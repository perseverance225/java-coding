public class UC4 {
    public static void main(String[] args) {
        // Store all banner lines in a String array
        String[] bannerLines = {
            String.join("", "*****", "   ", "*****", "   ", "*****", "   ", "*****"),
            String.join("", "*   *", "   ", "*   *", "   ", "*   *", "   ", "*   "),
            String.join("", "*   *", "   ", "*   *", "   ", "*****", "   ", "*****"),
            String.join("", "*   *", "   ", "*   *", "   ", "*", "      ", "", "     * ", " ", "       ", " "),
            String.join("", "*****", "   ", "*****", "   ", "*", "    ", "", "   ***** ", " ", "       ", " ")
        };

        // Print each line using a loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
