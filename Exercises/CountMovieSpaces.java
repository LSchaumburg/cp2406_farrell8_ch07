/**
 * Created by jc247746 on 29/08/16.
 */
@SuppressWarnings("Duplicates")
public class CountMovieSpaces {
    public static void main(String[] args) {
        String quote = "I'll be back!";
        int numSpaces = 0;
        int stringLength = quote.length();
        System.out.println("The movie quote is: " + "\"" + quote + "\"");

        for (int i = 0; i < stringLength; i++) {
            char c = quote.charAt(' ');
            if (c == ' ') {
                numSpaces++;
            }
        }
        System.out.println();
        System.out.println("The number of SPACES is " + numSpaces);
    }
}
