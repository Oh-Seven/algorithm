package algorithm.str;


/**
 * FindStrInString
 * @author lee
 * @version 1.0
 * @description haystack = "leetcode", needle = "leeto"
 * @date 2023年10月24日 15:24:00
 */
public class FindStrInString {
    public static void main(String[] args) {
        System.out.println(findStrIndex("sadbutsad","sad"));
    }
    private static Integer findStrIndex(String haystack, String needle){
        char[] chars = haystack.toCharArray();
        for(int i = 0;i < chars.length-needle.length()+1;i++){
            if(needle.startsWith(String.valueOf(chars[i]))){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
