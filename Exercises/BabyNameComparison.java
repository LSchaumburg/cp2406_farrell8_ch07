import java.util.Scanner;

/**
 * Created by jc247746 on 29/08/16.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        System.out.println("Enter three baby names:\n");
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++){
            System.out.println("name " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }

        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                System.out.println(names[x] + " " + names [y]);
            }
        }
    }
}
