public class CustomerManager {
    private BastDatabaseManager bastDatabaseManager;

    public CustomerManager(BastDatabaseManager bastDatabaseManager){
        this.bastDatabaseManager=bastDatabaseManager;
    }

    public void getCustomer(){
        bastDatabaseManager.getData();



    }
}
