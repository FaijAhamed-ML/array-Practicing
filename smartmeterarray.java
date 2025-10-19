import java.util.Scanner;
public class smartmeterarray {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        double[] unites={1.2,2.1,0.8,0.0,1.3,4.0,1.5,3.2,1.0,1.3,4.0,1.5,3.2,3.2,2.3,0.4,1.2,2.1,0.8,0.0,2.6,2.1,1.7,7.0,1.2,2.1,0.8,0.0} ;

        //find max & min value

    double maxUseUnit= unites[0];
    int maxUsei= 0;

    double minUseUnit= unites[0];
    int minUsei= 0;

        
    double totalunit= 0;// find for avg
    double total=0;     // find for avg

    for(int i=0; i<unites.length; i++){
           if (maxUseUnit<unites[i]){
                maxUseUnit=unites[i];
                maxUsei=i;
           }else if (minUseUnit>unites[i]){
                minUseUnit=unites[i];
                minUsei=i;
           }
           totalunit+= unites[i];  // find for avg
           total+=1;                    // find for avg
    }

     /// find accual max use day
    int maxDay=maxUsei+1;

    /// find accual max use day
    int minDay=minUsei+1;

    /// find avg usage
    double avg=totalunit/total;

    System.out.println("Day of the month with maximum usage: "+maxDay+"th of November.");
    System.out.println("Maximum usage unit: "+maxUseUnit);
    System.out.println("Day of the month with minimum usage: "+minDay+"th of November.");
    System.out.println("Minimum usage unit: "+minUseUnit);
    System.out.println("Average use of the Month :"+avg);
    System.out.println("Total usage for the month :"+totalunit);
    }
}
