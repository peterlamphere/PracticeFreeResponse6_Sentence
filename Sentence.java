import java.util.ArrayList;
import java.util.Arrays;

public class Sentence {
  private String sentence;
  
  public ArrayList<Integer> getBlankPositions() {
    // Write your answer to part A here

    // Don't forget to return a value
    return null;
  }

  public String[] getWords() {
    // Write your answer to part B here



    // Don't forget to return a value
    return null;
  }

  // Helper methods, etc
  public int countWords() {
    return getBlankPositions().size()+1;
  }

  public  Sentence(String sentence) {
    this.sentence=sentence;
  }
  public String toString() { 
    return sentence + '\n' + getBlankPositions() + '\n' + Arrays.toString(getWords());
  }
}