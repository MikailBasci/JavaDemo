// burda paketteki classa bağlandığını gösteriyor
//import matematic.Algoritma;
//import matematic.Dortİslem;
// tek tek pkaetteki classlara bağlanmak yerine
import matematic.*;
// burda matematik paketindeki her calasa bağlandığını gösteriyor


import java.util.Scanner;
// kendi paketinini oluşturabilirsin

public class Main {
    public static void main(String[] args) {

        // packages modül,paket demek.
        // hazır işlemlere erişim sağlar
        Scanner scanner = new Scanner(System.in);
        //Scanner modülü Javada kullanıcadan veri almaya yarar

        System.out.println("Adınız;");
        String name=scanner.nextLine();
        // burda kendi oluşturduğumuz paketteki dort işlem clasından topla fonksiyonunu çağırdık
        System.out.println("adınız; "+name);
        Dortİslem dortİslem=new Dortİslem();
        dortİslem.topla(1,2);
        // çağıracağımız paketteki classı newlesek dah doğru olur
        Algoritma algoritma = new Algoritma();
        algoritma.sonuc();
        add adds =new add();
        adds.add1();
    }
}