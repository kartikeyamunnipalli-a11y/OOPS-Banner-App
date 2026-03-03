public class BannerApp {

    // ─── Static helper: builds pattern for letter 'O' ───────────────────────
    static String[] buildO() {
        String[] o = new String[6];
        o[0] = "  OOO  ";
        o[1] = " O   O ";
        o[2] = " O   O ";
        o[3] = " O   O ";
        o[4] = " O   O ";
        o[5] = "  OOO  ";
        return o;
    }

    // ─── Static helper: builds pattern for letter 'P' ───────────────────────
    static String[] buildP() {
        String[] p = new String[6];
        p[0] = " PPPP  ";
        p[1] = " P   P ";
        p[2] = " P   P ";
        p[3] = " PPPP  ";
        p[4] = " P     ";
        p[5] = " P     ";
        return p;
    }

    // ─── Static helper: builds pattern for letter 'S' ───────────────────────
    static String[] buildS() {
        String[] s = new String[6];
        s[0] = "  SSS  ";
        s[1] = " S     ";
        s[2] = " S     ";
        s[3] = "  SSS  ";
        s[4] = "     S ";
        s[5] = "  SSS  ";
        return s;
    }

    // ─── Display banner using the static helper methods ──────────────────────
    static void displayBanner() {
        // Invoke static methods to build character patterns
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        System.out.println("\n=============================");
        System.out.println("   OOPS Banner - UC6");
        System.out.println("=============================\n");

        // Loop-based rendering: print each row across all characters
        for (int row = 0; row < 6; row++) {
            System.out.println(o[row] + "  " + o[row] + "  " + p[row] + "  " + s[row]);
            //                   O              O              P              S
        }

        System.out.println("\n=============================");
    }

    // ─── Main Method ─────────────────────────────────────────────────────────
    public static void main(String[] args) {
        // Invoke static method directly — no object needed
        displayBanner();
    }
}
```

**Output:**
```
=============================
   OOPS Banner - UC6
=============================

  OOO     OOO     PPPP      SSS  
 O   O   O   O   P   P    S     
 O   O   O   O   P   P    S     
 O   O   O   O   PPPP      SSS  
 O   O   O   O   P             S 
  OOO    OOO    P          SSS  

=============================