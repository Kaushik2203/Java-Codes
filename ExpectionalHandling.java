public class ExpectionalHandling{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(arr[1]);
        try{
        System.out.println(arr[-1]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(arr[0]);
        }
    }     
}