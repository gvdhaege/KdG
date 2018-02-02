public class RunMonty {
    public static String knights =
            "Then, when you have found the shrubbery, you must" +
                    " cut down the mightiest tree in the forrest..." +
                    " with... a herring!";

    public static void main(String[] args) {
        System.out.println(knights);
        HolyGrail grail = new HolyGrail();
        String aKnight = grail.vervangNietLettersDoorSpaties(knights);
        System.out.println(aKnight);
        String anotherKnight = grail.verwijderNietLetters(knights);
        System.out.println(anotherKnight);
    }
}