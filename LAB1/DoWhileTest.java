package LAB1;

public class DoWhileTest {
    public static void main(String[] args) {
        int num = 123489; 
        int sum = 0; 
        do{
            sum += num % 10; 
            num = num / 10;
        } while(num > 0);
        System.out.println(sum);
    }
}
