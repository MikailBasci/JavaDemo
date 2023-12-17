public class Main {
    public static void main(String[] args) {
    BaseKrediManager[] krediManagers = new BaseKrediManager[]
            { new TeacherManager(),new StudentManager(),new FarmerManager()};
    for(BaseKrediManager krediManager:krediManagers ){
        System.out.println(krediManager.hesapla(1001));
    }



    }
}