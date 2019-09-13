import java.util.Scanner;

public class Fibonacci{
    private String fibo(int input){
        int[] result=new int[input];
        String res="";
        result[0]=0;
        result[1]=1;
        for(int i=0;i<result.length;i++){
            if(i>=2){
                result[i]=result[i-1]+result[i-2];
            }
        }
        for(int i=0;i<result.length;i++){
            res+=result[i]+" ";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci fi=new Fibonacci();

        System.out.print("Berapa Banyak Bilangan Fibonacci yang ingin di generate? ");
        int input=sc.nextInt();
        System.out.println(fi.fibo(input));
        sc.close();

    }
}