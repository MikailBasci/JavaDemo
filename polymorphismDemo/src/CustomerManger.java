public class CustomerManger {
    private BaseLogger logger;

    public CustomerManger(BaseLogger logger){
        this.logger =logger;


    }

    public void add(){
        System.out.println(" MÜŞTERİ eklendi");
        // yavaş yavaş newlerden cıkmamız lazım çunku new sıkıntılı
this.logger.log("log mesajı");
//        DatabaseLogger databaseLogger = new DatabaseLogger();
//        databaseLogger.log("loglandı");
//
    }
}
