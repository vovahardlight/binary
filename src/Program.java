import java.util.Scanner;

class Converter{
  static String toBinary(int x){
       String y = "";
       while (x>0) {
           y=(x%2)+y;
           x/=2;
       }
       return y;
   }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}
