package girls;

import java.util.*;

public class DemoGirl {
    public static void main(String[] args) {
        Girl[] girlsArray = {
                new Girl("An", 20),
                new Girl("Bea", 20),
                new Girl("Bea", 25),
                new Girl("Diana", 25),
                new Girl("Zoë", 18),
                new Girl("Katleen", 18),
                new Girl("Bea", 20)};

        List<Girl> girlList = new ArrayList<>(Arrays.asList(girlsArray));
        System.out.println(girlList);
        Set<Girl> girlSet = new HashSet<>(Arrays.asList(girlsArray));
        System.out.println(girlSet);
    }
}
