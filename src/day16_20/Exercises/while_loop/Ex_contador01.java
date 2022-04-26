package day16_20.Exercises.while_loop;

public class Ex_contador01 {
    public static void main(String[] args) {
      /*
        int cc = 1;
      while ( cc <= 5 ){
          System.out.println("cambalhota " + cc);
          cc++;
      }
*/
        int cc = 0;
        while ( cc <= 10 ){
            cc++;
            if (cc == 5  || cc == 7) {
                continue;
            }
            System.out.println("cambalhota " + cc);
        }
    }
}
