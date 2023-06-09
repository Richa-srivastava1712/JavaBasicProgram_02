package Javafunction04;

public class PhythaGoreousTriplet {
     static boolean IsPhythagorousTriplet(int a, int b, int c){
         /*
         if(Math.pow(a,2.0) +Math.pow(b,2.0) == Math.pow(c,2.0)){
             return true;
         }
          */
         if(a>0 && b>0 && c>0){
             int sumab =0, sumc =0;
             sumab +=(a*a +b*b) ;
             sumc +=(c*c);
             if(sumab ==sumc){
                 return true;
             }

         }
         return false;
     }

     static void pythagorousTripletSeries(int n)
     {
         for(int i=1;i<=n;i++){
             for(int j=i;j<=n;j++){
                 for(int k=j;k<=n;k++){
                     if((Math.pow(i,2.0) +Math.pow(j,2.0)) == Math.pow(k,2.0)){
                         System.out.println( i +" "+j+" " +k);
                     }
                 }
             }
         }
     }

    public static void main(String arg[]){
        boolean isPhythagorous = IsPhythagorousTriplet(3,4,5);
        if(isPhythagorous == true){
            System.out.println("a, b,c are phythagoreous triplet");
        }else
            System.out.println("Not");

        pythagorousTripletSeries(20);
    }
}
