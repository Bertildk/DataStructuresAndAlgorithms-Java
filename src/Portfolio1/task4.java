package Portfolio1;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] list = {23,56,22,11,65,89,3,44,87,910,45,35,98};
        System.out.println(Arrays.toString(algorithm(list)));
    }
    private static int[] algorithm(int[] list){
        int[] result = new int[4];
        double closest = 9999;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                for (int k = 0; k < list.length; k++) {
                    int A = list[i];
                    int B = list[j];
                    int C = list[k];
                    int sum = A+B+C;

                    float log_base_two = log2(sum);
                    int exponent = Math.round(log_base_two);

                    double closest_power = Math.pow(2, exponent);
                    double distance = Math.abs(sum - closest_power);
                    
                    if(distance < closest && i!= j && i!=k && j!=k){
                        closest = distance;
                        result[0] = A;
                        result[1] = B;
                        result[2] = C;
                        result[3] = (int)closest_power;
                    }
                    
                }
            }
        }
        
        return result;
    }

    private static float log2(double n){
        return (float)(Math.log(n) / Math.log(2));
    }


}
//https://www.geeksforgeeks.org/java/how-to-calculate-log-base-2-of-an-integer-in-java/
