import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        assertIsAnagram("silent", "listen", true);
        assertIsAnagram("eye", "yee", true);
        assertIsAnagram("eye1", "yee", true);
        // TODO: add more tests
    }
 
    /**
     * Anagram: a word, phrase, or sentence formed from another by rearranging its letters.
     * 
     * @param s1 the first string to check
     * @param s2 the second string to check
     * @return true if s1 and s2 are anagrams, false otherwise
     * 
     * @implNote Example:
     * "listen" and "silent" - same letters, different order
     */
    public static boolean isAnagram(String s1, String s2) {
    	
    	
       List<Integer> l1= s1.chars().sorted().boxed().collect(Collectors.toList());
       List<Integer> l2= s2.chars().sorted().boxed().collect(Collectors.toList());
        // TODO: implement me
        return l1.equals(l2);
    }
 
    public static void assertIsAnagram(String s1, String s2, boolean isAnagramAssertion) {
        if (isAnagram(s1, s2) == isAnagramAssertion) {
            System.out.printf("%s and %s: correct %n", s1, s2);
        } else {
            System.out.printf("%s and %s: ** INCORRECT ASSERTION ** expected isAnagram == %s %n", s1, s2, isAnagramAssertion);
        }
    }
}