public class Main {
    public static void main(String[] args) {
        // bir sisteme sonradan eklenen bir özellik için mevcut hiçbir ozellik değişmemesi gerekiyor

    CustomerManager customerManager= new CustomerManager(new SqlServerDatabaseManager());
    customerManager.getCustomer();
    }
}