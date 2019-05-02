public class StringRegex {

    public static void main(String[] args) {

        // // Spliting sentence into words
        // String line = "This is a    line words.";
        // String[] words = line.split("\\s+");
        //
        // // System.out.println(words.length);
        // for (String word :  words) {
        //     System.out.println(word);
        // }

        // Spliting paragraphs into sentences
        String paragraph = "This is is a sentence. And this is also. This as well! And the last one, I promise.";
        String[] sentence = paragraph.split("(\\.|!|\\?)\\s");
        for (String word : sentence) {System.out.println(word);}
        System.out.println("===================");

        // Spliting paragraphs into sentences (advanced example that preserves the sentence marking characters)
        String paragraph2 = "This is is a sentence. Is this also a sentece? This as well! And the last one, I promise.";
        String[] sentence2 = paragraph.split("(?<=\\.|!|\\?)\\s");
        for (String word : sentence2) {System.out.println(word);}
    }
}