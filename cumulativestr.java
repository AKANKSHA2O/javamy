import java.util.*;
public class cumulativestr {
    public static void main(String aegs[]){
Scanner dc = new Scanner(System.in); 
  int size = dc.nextInt();
  int tolength = 0;

  String num[]=new String[size];
  for(int i=0;i<size;i++){
      num[i]=dc.nextLine();
    tolength=num[i].length();
  }
    System.out.println("lenght of string"+ ""+tolength);
}
}
