public class Pattern10 {
    public static void main(String[] args) {
        for(int i =1 ; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" "+(10-i+1));
            System.out.println();
        }
        System.out.println();
    }
}
