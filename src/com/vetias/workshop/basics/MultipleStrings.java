
public class MultipleStrings {
    public static void main(String[] args) {
        String sentence="This program shows. how can we split a string. into multiple Strings.";
        String[] words = sentence.split(" ");
        String[] words2 = sentence.split("\\.");
        String[] words3 = sentence.split("");
        System.out.println("The number of words in the sentence is: " + words.length);
        System.out.println("The number of sentences in the paragraph is: " + words2.length);
        System.out.println("The number of characters in the sentence is: " + words3.length);
    }
}
