public class Main {
    public static void main(String[] args) {

        // polymorphism : çok biçimlilik demek ve bir birinin referansını tutma olayı
        // sadece kalıtım (inheritance ) yapan classlar polymorphism yapar.
//       FileLogger fileLogger = new FileLogger();
//       DatabaseLogger databaseLogger = new DatabaseLogger();
//       EmailLogger emailLogger = new EmailLogger();
//       emailLogger.log("Log mesajı");
        // class türlerindede arry(Diziler) vrilebilir
//        BaseLogger[] baseLoggers= new BaseLogger[]{new ConsolLogger(),new DatabaseLogger(),new EmailLogger(),new FileLogger()};
//        // verilen arrylerin hepsi BaseLogger ile inheritenca (kalıtım) yaptığı için farklı iş yapan değeri aynı diziye alabilir
//        for(BaseLogger Logger:baseLoggers){
//            Logger.log("Log mesajı");
        CustomerManger customerManger = new CustomerManger(new FileLogger());
        customerManger.add();
        }

    }




