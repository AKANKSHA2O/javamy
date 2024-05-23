import java.util.*;
public class searchle {
    public static void main(String args[]){
        Scanner dc= new Scanner(System.in);

        int num[]={1 ,2,5,6};
        System.out.println("element that you want search");
       int traget=dc.nextInt();
       for(int i=0;i<num.length;i++){
        if(num[i]==traget){
            System.out.print(i);
        }

       }

    }
    
}
