public class productManager {
//    public void add(product product){
//        ProducValidator producValidator =new ProducValidator();
//        if (producValidator.isValied(product)){
//            System.out.println("ürün eklenmiştir");
//
//        }else {
//            System.out.println("Ürün geçersizdir");
//        }
//    }
    // static bir fonksiyonda classı newlememize gerek yok class ismi ile fonksiyon çağrılabilir
    // static bir fonksiyon bir krere kullanılır yani herkes aynı seyi kullanır
    // statatik newler gibi işi bittiğinde bellektn silinmez taki uygulamayı sonlandırana kadar bellekte tutulur
    // araç gibi işlemlerimizde static kullanılabilir
    //
public void add(product product){
    if (ProducValidator.isValied(product)){
        System.out.println("ürün eklenmiştir");

    }else {
        System.out.println("Ürün geçersizdir");
    }
    ProducValidator producValidator =new ProducValidator();



}
}
