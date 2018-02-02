package be.kdg.holygrail;
/**
 * @author Kristiaan Behiels
 * @version 1.0 30/10/13
 */

public class HolyGrail {
    public String vervangNietLettersDoorSpaties(String knights) {
        StringBuilder builder = new StringBuilder(knights.length());
        for (int i = 0; i < knights.length(); i++) {
            char ch = knights.charAt(i);
            if (!Character.isLetter(ch)) {
                builder.append(' ');
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();

        // return knights.replaceAll("[^a-zA-Z]", " ");
    }


    public String verwijderNietLetters(String knights) {
        StringBuilder builder = new StringBuilder(knights.length());
        for (int i = 0; i < knights.length(); i++) {
            char ch = knights.charAt(i);
            if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
                builder.append(ch);
            }
        }
        return builder.toString();

        // return knights.replaceAll("\\W+", " ");
    }


}

/*
Then, when you have found the shrubbery, you must cut down the mightiest tree in the forrest... with... a herring!
Then  when you have found the shrubbery  you must cut down the mightiest tree in the forrest    with    a herring
Then when you have found the shrubbery you must cut down the mightiest tree in the forrest with a herring
*/