public class NumberUtils {

    public static void main(String[] args) {
        
        class Utils {
            int getLastDigit(int number) {
                if (number < 0) {
                    return -1;
                }
                return number % 10;
            }
        }

        Utils utils = new Utils();

        
        System.out.println(utils.getLastDigit(123));  
        System.out.println(utils.getLastDigit(456));  
        System.out.println(utils.getLastDigit(789));  

        
        System.out.println(utils.getLastDigit(-123)); 

        
        System.out.println(utils.getLastDigit(0));    
    }
}
