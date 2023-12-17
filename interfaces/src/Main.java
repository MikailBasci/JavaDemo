import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
// interfaces newlenmemli çünkü kendi operasyonu ile geliyor
//    ICustomerDal iCustomerDal = new ICustomerDal() {
//        @Override
//        public void add() {
//
//        }
//    }  ;
        // overide örneği
        ICustomerDal iCustomerDal =new oracleCustomerDal();
        iCustomerDal.add();
        CustomerManager customerManager= new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();



        };

    }
