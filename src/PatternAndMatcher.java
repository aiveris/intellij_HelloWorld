import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches(".t", "dt")); // true
        System.out.println(Pattern.matches(".d", "odt")); // false
        System.out.println(Pattern.matches(".d", "oodt")); // false
        System.out.println(Pattern.matches("..t", "odt")); // true

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");

        System.out.println("m.pattern() >> " + m.pattern());
        System.out.println("p.pattern() >> " + p.pattern()); // a*b

        // Pattern.compile("", Pattern.CASE_INSENSITIVE);


        // boolean matches() - test whether the regular expression matches the pattern
        System.out.println(m.matches()); // true

        // boolean find() - finds the next expression that matches the pattern
        // boolean find(int start) - finds the next expression that matches the pattern from the given start number
        // String group() - returns the matched subsequence.
        // int start() - returns the starting index of the matched subsequence
        System.out.println("m.start() >> " + m.start());


        Pattern p2 = Pattern.compile("b");
        Matcher m2 = p2.matcher("ab");
        System.out.println(m2.matches());
        // System.out.println("m.start() >> " + m2.start());


        String REGEX = "(.*)(\\d+)(.*)";
        String INPUT = "This is a sample Text, 1234, with numbers in between.";

        // create a pattern
        Pattern pattern = Pattern.compile(REGEX);

        // get a matcher object
        Matcher matcher = pattern.matcher(INPUT);

        if(matcher.find()) {
            //get the MatchResult Object
            MatchResult result = matcher.toMatchResult();

            //Prints the offset after the last character matched.
            System.out.println("First Capturing Group - Match String end(): " + result.end());
        }


        // int end() - returns the ending index of the matched subsequence
        // int groupCount() - returns the total number of the matched subsequence
    }
}