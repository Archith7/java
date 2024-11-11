
// public class reverse {

//     public static void main(String[] args) {
//         String str = "Hello World";
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println(rev);
//     }

// }

public class reverse{
    public static void main(String[] args){
        String x = "tony";
        int y=x.length();
       for(int i=x.length()-1; i>=0 ; i--){
            System.out.print(x.charAt(i));
       }
    }
}