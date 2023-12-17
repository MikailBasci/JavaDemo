public class ProducValidator {
// Normalde bir clasın yapıcı bloku calışması için onun newlenmesi lazımdı
    //ama static bir yapıcı blok çağrılabiir böylelikle staik bir fonksiyon çağrıldığında yinede işlem görebilir.
    static {
        System.out.println("merhaba static");
}
    public ProducValidator(){
        System.out.println("MERHABA");

    }
    public static boolean isValied(product product){
     if(!product.name.isEmpty()&& product.price>0){
         return true;
     }else{
         return false;
     }
    }
    public static class birsey{
        // bir clasın içinde başka bir classın tüm işlemleri static modülü ile static yapılabilir.// inner class demek
        public void add(){
            System.out.println("eklendi");
        }

    }


}
