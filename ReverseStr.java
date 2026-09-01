import java.util.Scanner;
public class ReverseStr{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        System.out.println(reversedStr.toString());
    }
}
