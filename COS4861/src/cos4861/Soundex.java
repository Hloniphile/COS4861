
package cos4861;

public class Soundex {

  /* Implements the mapping
   * from: AEHIOUWYBFPVCGJKQSXZDTLMNR
   * to:   00000000111122222222334556
   */
  public static final char[] MAP = {
    //A  B   C   D   E   F   G   H   I   J   K   L   M
    '0','1','2','3','0','1','2','0','0','2','2','4','5',
    //N  O   P   W   R   S   T   U   V   W   X   Y   Z
    '5','0','1','2','6','2','3','0','1','0','2','0','2'
  };

  /** Convert the given String to its Soundex code.
   * @return null If the given string can't be mapped to Soundex.
   */
  public static String soundex(String name) {

    // Algorithm works on uppercase (mainframe era).
    String stringNameToUpperCase = name.toUpperCase();

    StringBuffer res = new StringBuffer();
    char current, previous = '?';

    // Main loop: find up to 4 characters that map.
    for (int i=0; i<stringNameToUpperCase.length() && res.length() < 4 &&
      (current = stringNameToUpperCase.charAt(i)) != ','; i++) {

      // Check to see if the given character is alphabetic.
      // Text is already converted to uppercase. Algorithm
      // only handles ASCII letters.
      if (current>='A' && current<='Z' && current != previous) {
        previous = current;

        // First char is installed unchanged, for sorting.
        if (i==0)
          res.append(current);
        else {
          char m = MAP[current-'A'];
          if (m != '0')
            res.append(m);
        }
      }
    }
    if (res.length() == 0)
      return null;
    for (int i=res.length(); i<4; i++)
      res.append('0');
    return res.toString();
  }
}