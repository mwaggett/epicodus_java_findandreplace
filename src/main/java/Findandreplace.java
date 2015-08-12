import java.util.Arrays;

public class Findandreplace {
  public static void main(String[] args){}

  public static String replaceWordInSentence(String sentence, String originalWord, String newWord) {

    String newSentence = sentence.replaceAll(originalWord, newWord);

    // String[] sentenceArray = sentence.split(" ");
    //
    // for (String word : sentenceArray) {
    //   if (word.equals(originalWord)) {
    //     word = newWord;
    //   }
    // }
    //
    // String newSentence = Arrays.toString(sentenceArray);
    // newSentence = newSentence.substring(1, newSentence.length()-1).replaceAll(",", "");
    return newSentence;
  }
}
