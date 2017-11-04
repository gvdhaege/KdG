import java.util.Calendar;

public class Weekdagen {
    public static void main(String[] args) {
        String[] weekdagen = {"maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"};

        int dagVanDeWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int index = getIndexPosition(dagVanDeWeek);

        String vandaag = weekdagen[index];

        System.out.printf("Vandaag is het %s", vandaag);
    }

    private static int getIndexPosition(int dagVanDeWeek) {
        int index;
        if (dagVanDeWeek == 1) {
            index = 6;
        } else {
            index = dagVanDeWeek - 2;
        }
        return index;
    }
}
