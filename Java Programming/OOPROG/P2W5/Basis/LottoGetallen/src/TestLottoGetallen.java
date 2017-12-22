public class TestLottoGetallen {
    public static void main(String[] args) {
        LottoGetallen lottoGetallen = new LottoGetallen();

        for (int i = 0; i < 40; i++) {
            lottoGetallen.genereertLottoGetallen();
            System.out.println(lottoGetallen.toonLottoGetallen());
        }
    }
}
