
import java.util.*;
class abc{
    public static void peak(ArrayList<Integer> n){
        System.out.println(n);
        int low=0;
        int high = n.size()-1;
        // System.out.println(high);
 
        ArrayList<Integer> l= new ArrayList<>();
        for(int i=1; i<high ;i++){
            // System.out.println(n.get(i));
            if(n.get(i)>n.get(i-1) && n.get(i)>n.get(i+1)){
                l.add(n.get(i));
            }            
        }
        System.out.println("without low high"+l);

        if(n.get(0)>n.get(1)){
            l.add(n.get(0));
        }
        if(n.get(high)>n.get(high-1)){
            l.add(n.get(high));
        }
        System.out.println(l);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        // peak(n);
        // int []arr=int[];
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i=0; i<n ;i++){
            int x= sc.nextInt();
            arr.add(x);
        } 
        peak(arr);
        // System.out.println(arr);
    }
}


// In a city, a survey is being conducted to identify special houses known as "peaks." 
// A peak house is defined as one whose height is greater than its immediate neighbors. 
// For houses on the boundary (first and last in the array), a peak is a house that is greater than its single neighbor.

// Your task is to assist the surveyor by writing a program that identifies and prints the heights of all peak houses in sorted order.

// Input Format:
// -------------
// Line-1: An integer n (the number of houses).
// Line-2: n distinct integers, representing the heights of the houses.

// Output Format:
// --------------
// Line-1: Print a list of peak house heights in sorted order.

// Constraints:
// 1 ≤ n ≤ 10^5 (i.e., up to 100,000 houses)
// Heights of houses are distinct and can be any integer between -10^9 and 10^9.

// Definitions:
// A peak house is a house where its height is greater than both its neighboring houses.
// For the first house, it is a peak if it is greater than the second house.
// For the last house, it is a peak if it is greater than the second-to-last house.

// Sample Input-1:
// ---------------
// 8
// 9 4 5 3 8 7 10 11

// Sample Output-1:
// -----------------
// [5, 8, 9, 11]

// Explanation:
// House heights 5, 8, 9, and 11 are peaks as they are greater than their neighboring houses.

// Sample Input-2:
// ---------------
// 10
// 1 2 3 4 5 6 7 8 9 10

// Sample Output-2:
// ----------------
// [10]

// Explanation:
// Only 10 is a peak because it is greater than its only neighbor, 9.


// Sample Input-3:
// ---------------
// 10
// 10 9 8 7 6 5 4 3 2 1

// Sample Output-3:
// ---------------
// [10]

// Explanation:
// Only 10 is a peak because it is greater than 9, its only neighbor on the right.


// Sample Input-4:
// ---------------
// 10
// 1 2 3 4 5 10 6 7 8 9

// Sample Output-4:
// ---------------
// [9, 10]

// Explanation:
// The houses 9 and 10 are peaks since they are greater than their immediate neighbors.