import java.util.*;
public class lessequal {
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int a = st.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println(" a is greater");
        }
        else{
            System.out.println("a is smaller");
        }
    }
}