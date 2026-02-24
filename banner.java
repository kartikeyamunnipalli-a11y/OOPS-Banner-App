public class banner {
    public static void main(String[] args) {
        // We define a 3-space gap to separate the letters clearly
        String gap = "   "; 

        // Row 1: The top horizontal bars for O, O, P, and S
        System.out.println("*********️" + gap + "*********️" + gap + "*********️" + gap + "*********️");

        // Row 2: Side walls for O, O, P; Top-left corner for S
        System.out.println("* *" + gap + "* *" + gap + "* *" + gap + "* ");

        // Row 3: Side walls for O, O, P; Top-left corner for S
        System.out.println("* *" + gap + "* *" + gap + "* *" + gap + "* ");

        // Row 4: Middle bars: O stays hollow, P and S get a horizontal bar
        System.out.println("* *" + gap + "* *" + gap + "*********️" + gap + "*********️");

        // Row 5: Side walls for O; Stem for P; Top-right corner for S
        System.out.println("* *" + gap + "* *" + gap + "* " + gap + "        *");

        // Row 6: Side walls for O; Stem for P; Top-right corner for S
        System.out.println("* *" + gap + "* *" + gap + "* " + gap + "        *");

        // Row 7: Bottom bars for O and S; Stem for P
        System.out.println("*********️" + gap + "*********️" + gap + "* " + gap + "*********️");
    }
}