package main.scala.Test_For;

/**
 * @author zbstart
 * @create 2020-08-23 18:30
 */
public class Test_try_catch {
    public static void main(String[] args) {
        int i;
        for (i = 0;i < 10;i ++){
            try {
                if (i == 5) throw new RuntimeException();
                System.out.println("s="+i);
            }catch (Exception e){
//
            }


        }




    }
}
