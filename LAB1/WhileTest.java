package LAB1;

public class WhileTest {
    public static void main(String[] args) {
        int num = 123489; 
        int sum = 0; 
        while (num > 0) {
            sum += num % 10; 
            num = num / 10;
        }
        System.out.println(sum);
    }
}
