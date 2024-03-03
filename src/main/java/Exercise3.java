import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "\\bhttp://[^\\s]*|https://[^\\s]*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            return matcher.group();
        else
            return null;
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "\\b@[^.]*|@[^.]*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find())
            return true;
        else
            return false;
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            if (hasRepeatedLetters(word)) {
                wordsWithRepeatLetters.add(word);
            }
        }
        return wordsWithRepeatLetters;
    }
    private static boolean hasRepeatedLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            for(int j = i + 1; j < word.length(); j++) {
                char currentChar = Character.toLowerCase(word.charAt(i));
                char nextChar = Character.toLowerCase(word.charAt(j));
                if (currentChar == nextChar) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {
        // test your code here!
        System.out.println(findWordsWithRepeatLetters("word with repeat letters: hello"));
    }
}