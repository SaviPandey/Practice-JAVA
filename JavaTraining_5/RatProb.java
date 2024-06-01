public class RatProb {
    public static int ratFood(int r , int unit , int arr[]){
        int foodRequired = r*unit;
        int foodHouse =0;
        if(arr.length ==0){
            return -1;
        }
        for(int i =0; i<arr.length ; i++){
            if(foodRequired > foodHouse){
                foodHouse += arr[i];
            }
            else{
                return i++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] ={ 2,8,3,5,7,4,1,2};
        System.out.println(ratFood(r, unit, arr));

    }
}
