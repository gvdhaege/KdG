import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        String tellen = "Hoe meer je leert hoe minder je weet";
        String substring = "ee";
        int aantal = 0;

        for (int i = 0; i < tellen.length() -1; i++) {
            if (tellen.substring(i, i + 2).equalsIgnoreCase("ee")){
                aantal++;
            }

        }

        System.out.print(tellen);
        System.out.printf("%nDe substring \"ee\" komt %d keer voor.", aantal);
    }
}
