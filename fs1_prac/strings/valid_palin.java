
public class valid_palin {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(check(s));

    }
    public static boolean check(String s){
        StringBuilder x= new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                x.append(Character.toLowerCase(ch));
                
            }
        }
        String newone = x.toString();
        String revnew=x.reverse().toString();

        // if (newone==revnew) {
        //     return true;
        // }
        // return false;
        return newone.equals(revnew);
    }
}
