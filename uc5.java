public class uc5 {
    public static void main(String[] args) {
        // Goal: Combine declaration and initialization using String.join()
        // This eliminates the verbose element-by-element assignment from UC4
        String[] bannerLines = {
            String.join(" ", "****", "****", "****", "****", "****"), // Line 1
            String.join(" ", "*  *", "*  *", "*  *", "*  *", "*   "), // Line 2
            String.join(" ", "*  *", "*  *", "****", "****", "****"), // Line 3
            String.join(" ", "*  *", "*  *", "*   ", "*   ", "   *"), // Line 4
            String.join(" ", "****", "****", "*   ", "*   ", "****")  // Line 5 (Example pattern)
        };

        // Efficient iteration using an enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}