public class Test {
    static int modify(int[] i) {
        i[0] += 10;
        return i[0] + 10;
    }

    public static void main(String[] args) {
        int[] i = {10};
        modify(i);
        System.out.println(i[0] + 15);
    }
}
