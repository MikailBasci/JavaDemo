public class SqlServerCustomerDal implements ICustomerDal,IRepostory{

    @Override
    public void add() {
        System.out.println("Sql Server eklendi");
    }
}
