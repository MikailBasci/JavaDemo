public abstract class GameCalculator {
    // bir class abstract olması için abstract modülünü clasa katarız
    // abstract claslarında abstract bir operasron yazılması zorunlu değildir veya normal bir operasyon.
    // abstract bir operasyonda abstract modülü kulanılmalı


    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti");

}

}
