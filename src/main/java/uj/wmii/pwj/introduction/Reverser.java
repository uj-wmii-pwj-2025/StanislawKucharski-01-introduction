package uj.wmii.pwj.introduction;
public class Reverser {

    public String reverse(String input){
        if(input == null)return null;
        input = input.strip();
        int l = input.length();
        StringBuilder res = new StringBuilder(input);
        for (int i = 0; i < l; i++){
            res.setCharAt(l - i - 1, input.charAt(i));
        }
        return res.toString();
    }

    public String reverseWords(String input) {
        if(input == null)return null;
        input = input.strip();
        String[] words = input.split(" ");
        int l = words.length;
        String res = words[0];
        for(int i = 1; i < l; i++){
            res = words[i] + " " + res;
        }
        return res;
    }

}
