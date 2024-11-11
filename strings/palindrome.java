
public class palindrome {

    public static boolean check(String S) {
        
        int i=0;
        int j=S.length()-1;
        while(i<j){
            if (S.charAt(i)!=S.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String S="abbaa";
        System.out.println(check(S));
    }
    
}

