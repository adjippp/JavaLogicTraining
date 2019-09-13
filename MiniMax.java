import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMax {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        long tampung=0;
        long tampungHasil=0;
        long kecil=0;
        long besar=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                tampung=arr[0];
                arr[0]=0;             
                for(int j=0;j<arr.length;j++){
                    tampungHasil+=arr[j];
                }
                arr[0]=tampung;
                kecil=tampungHasil;
                besar=tampungHasil;
            }else if(i==1){
                tampung=arr[1];
                arr[1]=0;             
                for(int j=0;j<arr.length;j++){
                    tampungHasil+=arr[j];
                }
                arr[1]=tampung;
                               
            }else if(i==2){
                tampung=arr[2];
                arr[2]=0;             
                for(int j=0;j<arr.length;j++){
                    tampungHasil+=arr[j];
                }
                arr[2]=tampung;
                
            }else if(i==3){
                tampung=arr[3];
                arr[3]=0;             
                for(int j=0;j<arr.length;j++){
                    tampungHasil+=arr[j];
                }
                arr[3]=tampung;
            }else{
                tampung=arr[4];
                arr[4]=0;             
                for(int j=0;j<arr.length;j++){
                    tampungHasil+=arr[j];
                }
                arr[4]=tampung;
            }

            if(kecil>tampungHasil){
                kecil=tampungHasil;
            }else if(besar<tampungHasil){
                besar=tampungHasil;
            }
            tampungHasil=0;
        }
        System.out.print(kecil+" "+besar);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
