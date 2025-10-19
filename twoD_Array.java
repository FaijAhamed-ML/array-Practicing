import java.util.Scanner;
public class twoD_Array {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        int[][] thea=new int[3][4];

        

        for(int i=0; i<thea.length;i++){
            for(int j=0; j<thea[0].length;j++){
                int k=i+1;
                int l=j+1;
                System.out.print("Eneter the rating for "+k+"movie "+l+"th Reviewers : ");
                thea[i][j]= get.nextInt();
            }
        }

        System.out.println("+---------------------+-----------------------+---------------------+---------------------+");
        
        for(int i=0; i<thea.length;i++){
          
                System.out.println("|         "+thea[i][0]+"           |          "+thea[i][1]+"            |          "+thea[i][2]+"          |          "+thea[i][3]+"          |");
                System.out.println("+---------------------+-----------------------+---------------------+---------------------+");
            
        }

        int[] total=new int[3];
        for(int i=0; i<thea.length;i++){
            for(int j=0; j<thea[0].length;j++){
                total[i]+=thea[i][j];
            }
        }

        double highAvgMovieRate=0;

        for(int i=0; i<total.length; i++){
            int y=i+1;
            double avg=total[i];
            System.out.println("your movie num "+y+"'s Average is : "+avg);
            if(highAvgMovieRate<avg){
                highAvgMovieRate= avg ;
            }
        }

        System.out.println("\nhiest avg movie rate is :"+highAvgMovieRate);

        
    }
}
