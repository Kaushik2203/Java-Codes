public class Throwex{
    public static void main(String[] args)throws Exception{
        int arr[] = {1, 2, 3, 4, 5};

    
        myException();
    }
    static void myException() throws Exception{
        throw new Exception("Something went wrong");
    }

}