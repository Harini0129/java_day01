import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar) && duplicates.indexOf(String.valueOf(currentChar)) == -1) {
                duplicates.append(currentChar);
            }
        }

        System.out.println("Duplicate characters: " + duplicates.toString());
    }
    
}
