public class target1 {

    public static boolean isSubSeries(String source, String target) {
        int sourceLength = source.length();
        int targetLength = target.length();
        
        if (sourceLength == 0) {
            return true;
        }
        
        if (targetLength == 0) {
            return false;
        }
        
        int sourceIndex = 0;
        int targetIndex = 0;
        
        while (targetIndex < targetLength) {
            if (source.charAt(sourceIndex) == target.charAt(targetIndex)) {
                sourceIndex++;
                if (sourceIndex == sourceLength) {
                    return true;
                }
            }
            targetIndex++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = input.split(" ");
        String source = words[0];
        String target = words[1];
        
        boolean result = isSubSeries(source, target);
        System.out.println(result);
    }
}
