import java.util.Arrays;

public class MultipleStrings {
    public static void main(String[] args) {
        String sentence="This program shows how can we split a string into multiple Strings.";
        String[] words = sentence.split(" ");
        System.out.println("The number of words in the sentence is: " + words.length);
        System.out.println(Arrays.toString(words));
    }
}
