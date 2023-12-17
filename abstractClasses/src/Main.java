public class Main {
    public static void main(String[] args) {

        // abtract classları soyutlam denir.Yani kalıtımdaki gibi ortak operasyonlar yerine
        // her class kendi ayrı operasyonlarını tutar.
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.gameOver();
        womenGameCalculator.hesapla();
        //abstract bir class newlenmemeli çünkü kendi operasyonu ile geliyor bunun içinde new'lemeye gerek yok
//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
//        };
    }
}