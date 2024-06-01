public class Pattern9 {
    public static void main(String[] args) {
        for(int i=1 ; i<=4; i++){
            for(int j=1; j<=4 ; j++){
               if(i==j){
                System.out.print("1");
               } 
               else{
                System.out.print("0");
               } 
            }
            System.out.println();
        }
    }
}
