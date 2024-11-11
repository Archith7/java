public class parking {
    int big,med,small;

    public parking(int b, int m, int s){
        this.big=b;
        this.med=m;
        this.small=s;
    }
    public boolean addcar(int a){
        if(a==1){
            if(big>0){
                big--;
                return true;
            }
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        parking p=new parking(1,1,0);
        System.out.println(p.addcar(1));
    }
}
