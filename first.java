import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class first{
    public static void main(String args[]){
     Scanner a = new Scanner(System.in);
     int age = a.nextInt();
     System.out.print(age);

     if(age >= 18){
        System.out.println("is adult");
     }
     else{
        System.out.println("not an adult");
     }
    }
   }