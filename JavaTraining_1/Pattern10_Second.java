public class Pattern10_Second {
    public static void main(String[] args) {
        for(int i =1 , j=10 ; i<j ; i++, j--){
            if(i==3){
                continue;
            }
            System.out.println(i+" "+j);
        }
    }
}
