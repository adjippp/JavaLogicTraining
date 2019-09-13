import java.util.Scanner;

public class GlassHour{

    private String exeGlassHour(int n){
        String res="";
        int target=n;
        int batasAtas=n/2;
        int batasBawah=2;
        int batasBawahGanjil=1;
        int spasiBawah=n/2;
        if(n%2==0){
            //top glass
            for(int i=0;i<batasAtas;i++){
                for(int j=0;j<i;j++){
                    res+=" ";
                }
                for(int j=0;j<target;j++){
                    res+="*";
                }
                target-=2;
                res+="\n";
            }
            //bottom glass
            for(int i=0;i<(batasAtas-1);i++){
                for(int j=0;j<spasiBawah-2;j++){
                    res+=" ";
                }
                for(int j=0;j<(batasBawah+2);j++){
                    res+="*";
                }
                batasBawah+=2;
                spasiBawah-=1;
                res+="\n";
            }
        }else{
            //top glass
            for(int i=0;i<batasAtas+1;i++){
                for(int j=0;j<i;j++){
                    res+=" ";
                }
                for(int j=0;j<target;j++){
                    res+="*";
                }
                target-=2;
                res+="\n";
            }
            //bottom glass
            for(int i=0;i<(batasAtas);i++){
                for(int j=0;j<spasiBawah-1;j++){
                    res+=" ";
                }
                for(int j=0;j<(batasBawahGanjil+2);j++){
                    res+="*";
                }
                batasBawahGanjil+=2;
                spasiBawah-=1;
                res+="\n";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        GlassHour gh=new GlassHour();
        System.out.println("Masukan angka untuk generate jam pasir (input > 0)");
        int input=sc.nextInt();
        System.out.println(gh.exeGlassHour(input));
        sc.close();
    }
}