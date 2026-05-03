package LeetCode_Problems;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();
        if (size == 0 || size < 26) return false;

        boolean status = true;

        for(char ch = 'a';ch<='z';ch++){
            if (!sentence.contains(String.valueOf(ch))){
                status = false;
                break;
            }
        }

        return status;

    }
}
