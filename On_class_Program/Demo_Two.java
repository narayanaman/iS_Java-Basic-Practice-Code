public class Demo_Two{
    public static void main(String [args]){
        int Sum=0,Product=1;
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    Sum=Sum+arr[i][j];
                    Product=Product*arr[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal element "+Sum);
        System.out.println("Product of Diagonal element "+Product);
    }
}