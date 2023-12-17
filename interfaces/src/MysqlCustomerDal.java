// bir class birden fazla interface implements yapabiliyor
public class MysqlCustomerDal implements ICustomerDal,IRepostory{
    @Override
    public void add() {
        System.out.println("My sql eklendi");

    }
}
