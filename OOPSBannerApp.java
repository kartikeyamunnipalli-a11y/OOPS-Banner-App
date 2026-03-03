import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 * UC8 - Use Map for Character Patterns and Render via Function
 * @author Kartik M
 * @version 8.0
 */

public class OOPSBannerApp {

    // Utility Method 1: Create and return the Map
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        map.put('P', new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*        ",
                "*        ",
                "*        "
        });

        map.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *        ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return map;
    }

    // Utility Method 2: Render Banner
    public static void renderBanner(String message, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                sb.append(pattern[row]).append("   ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}