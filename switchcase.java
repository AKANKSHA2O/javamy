import java.util.*;
public class switchcase {
    public static void main(String args[]){
        Scanner st = new Scanner(System.in);
        int num = st.nextInt();
        System.out.println(num);

        switch(num){
        case 1 : System.out.println("hello");
        break;
        case 2 : System.out.println("namste");
        break;
        case 3 : System.out.println("bonjour");
        break;
        default : System.out.println("invalid number");
        }
    }
}