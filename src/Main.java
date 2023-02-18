import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(120);
        int w = random.nextInt(12);
        int q = random.nextInt(59);
        double r =(double)  (a+w+q) / 3;
        System.out.println(a+"\n"+w+"\n"+q+"\n"+r);


    }
}