public class OOPSBannerApp {
    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7)
        String[] lines = new String[7];

        // 2. Populate each index using String.join() to construct the OOPS pattern
        // The pattern follows: [Letter O] [Letter O] [Letter P] [Letter S]
        lines[0] = String.join(" ", "  ***  ", "  ***  ", " ***** ", " ***** ");
        lines[1] = String.join(" ", " **  **", " **  **", " **  **", " **    ");
        lines[2] = String.join(" ", " **  **", " **  **", " **  **", " **    ");
        lines[3] = String.join(" ", " **  **", " **  **", " ***** ", " ***** ");
        lines[4] = String.join(" ", " **  **", " **  **", " **    ", "     **");
        lines[5] = String.join(" ", " **  **", " **  **", " **    ", "     **");
        lines[6] = String.join(" ", "  ***  ", "  ***  ", " **    ", " ***** ");

        // 3. Use a for-each loop to iterate through the array and print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}