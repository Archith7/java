
public class multicatch {
    
        public static void main(String[] args) {
            int a=0;
            int j=0;
            int k=0;
            int arr[]= new int[3];
            try {
                j=20/10;
                System.out.println(arr[3]);
                 k= 50/2;
            } catch (ArithmeticException e) {
                System.out.println("Aaaruthmetic exception!!");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds!!");
                }
            System.out.println(j);
            System.out.println("k"+k);
            System.out.println("byee..");
        }
    
    
}
