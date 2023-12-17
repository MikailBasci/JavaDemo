public class Main {
    public static void main(String[] args) {

            int number=15;
            int remander=number%2;
            int kalan=remander;
            boolean asalmı=true;
            for(int i=2;i<number;i++){
                if(number%i==0){
                    System.out.println("Asal Değildir.");
                    break;
                }

            }
            for(int a =2;a<number;a++){
                if(number%a==0){
                    asalmı=false;
                    break;
                }

            }
            System.out.println(asalmı);



        }
    }
