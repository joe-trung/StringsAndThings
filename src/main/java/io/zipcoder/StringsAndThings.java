package io.zipcoder;


import org.codehaus.plexus.util.StringUtils;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        String[] wordCount = input.split(" ");
        char yy = 'y';
        char zz = 'z';
        int i;
        int j=0;
        for (i=0;i<wordCount.length;i++) {
            Character check = (wordCount[i].charAt(wordCount[i].length()-1));
            // I could have used endWith() if i know this before
            if (check == yy || check == zz) {
                j++;
            }
        }
        return j;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replaceAll(remove,"");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int i = StringUtils.countMatches(input, "is");
        int j = StringUtils.countMatches(input, "not");
        if (i-j==0) {
            return true;
        }
        else {
            return false;
        }
    }


    //copied from the internet, understood.
    /**    public static int countMatches(String str, String sub) {
     if (isEmpty(str) || isEmpty(sub)) {
     return 0;
     }
     int count = 0;
     int idx = 0;
     while ((idx = str.indexOf(sub, idx)) != -1) {
     count++;
     idx += sub.length();
     }
     return count;
     }
     */



    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        String[] arr = input.split("");
        int i;
        int j = 0;
        for (i=0;i<input.length()-2;i++) {
            if (arr[i].equals(arr[i+1]) && arr[i].equals("g")) {
                j++;
            }
        }
        if (j>0) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int j = 0;
        if (input.length()<2) {
            j = 0;
        }
        else {
            String[] arr = input.split("");
            int i;
            for (i=0;i<input.length()-3;i++) {
                if ((arr[i].equals(arr[i+1])) && (arr[i].equals(arr[i+2]))) {
                    j++;
                }
            }
        }
        return j;
    }
}

