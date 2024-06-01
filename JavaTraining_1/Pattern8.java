public class Pattern8 {
    public static void main(String[] args) {
        int sum  = 0;
        int sum2 =0;
        for(int i=1 ; i<=4 ; i++){
            for(int j = 1 ; j<=4 ; j++){
                sum ++;
                System.out.print(sum+" ");
                sum2 = sum2+j;
            }
            System.out.println(" ->"+sum2);
        System.out.println();
    } 
    }
}
