package Array.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _0500_KeyboardRow {

  public String[] findWords(String[] words) {
    HashSet<String> row1 = new HashSet<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p"));
    HashSet<String> row2 = new HashSet<>(Arrays.asList("a","s","d","f","g","h","j","k","l"));
    HashSet<String> row3 = new HashSet<>(Arrays.asList("z","x","c","v","b","n","m"));
    
    List<String> ans = new ArrayList<>();
                                        
    for(String w: words) {
      String word = w.toLowerCase();
      if(row1.contains(word.substring(0, 1))) {
        if(valid(row1, word)) {
          ans.add(w);
        }
      } else if(row2.contains(word.substring(0, 1))) {
        if(valid(row2, word)) {
          ans.add(w);
        }
      } else {
        if(valid(row3, word)) {
          ans.add(w);
        }
      }
    }                 
    return ans.toArray(new String[0]);
  }
                                        
  private boolean valid(HashSet<String> dict, String word) {
    boolean valid = true;
    for(int i = 0; i < word.length(); i++) {
      String ch = word.substring(i, i + 1);
      if(!dict.contains(ch)) {
        valid = false;
      }
    }
    return valid;
  }
}
