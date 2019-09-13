import java.util.Scanner;

public class ArrowPattern{

    private String exeArrowPattern(int n){
        String res="";
        int tampung=n/2;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                for(int j=0;j<i;j++){
                    res+=" ";
                }
                for(int j=0;j<2;j++){
                    res+="*";
                }
                res+="\n";
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<(tampung)-1;j++){
                    res+=" ";
                }
                for(int j=0;j<2;j++){
                    res+="*";
                }
                tampung-=1;
                res+="\n";
            }
        }else{
            for(int i=0;i<(n/2)+1;i++){
                for(int j=0;j<i;j++){
                    res+=" ";
                }
                for(int j=0;j<2;j++){
                    res+="*";
                }
                res+="\n";
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<(tampung)-1;j++){
                    res+=" ";
                }
                for(int j=0;j<2;j++){
                    res+="*";
                }
                tampung-=1;
                res+="\n";
        }
    }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrowPattern ap=new ArrowPattern();
        System.out.println("Masukan angka untuk generate arrow (input > 0)");
        int input=sc.nextInt();
        System.out.println(ap.exeArrowPattern(input));
        sc.close();
    }
}