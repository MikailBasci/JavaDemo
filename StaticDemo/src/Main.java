public class Main {
    public static void main(String[] args) {

        // başka bir classta static olan bir fonksiyonu o classı newleyerek çağıramayız.
        // onun yerine class ad.fonksiyon adı
        // ornek main fonksiyonunu başka bir yerde çağırmak için Main.main,
        productManager productManager= new productManager();
        product product= new product();
        product.price=10;
        product.name="mouse";
        productManager.add(product);
        DataBaseHelper.crud.delete();
    }
}