package JavaConditionalLoop03;
/* Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.
 */
public class KunalEvenDayOuting {

    public static void main(String args[]){
        int count=0;
        for(int i=2;i<=30;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Kunal can go for outing with friends in August month days are : "+ count);
    }
}
