public class HolyGrail {

    public String vervangNietLettersDoorSpaties(String knights) {
        return knights.replaceAll("[,.!]", " ");
    }

    public String verwijderNietLetters(String knights) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < knights.length(); i++) {
            if (Character.isLetter(knights.charAt(i)) || Character.isSpaceChar(knights.charAt(i))) {
                sb.append(knights.charAt(i));
            }
        }
        return sb.toString();
    }
}
