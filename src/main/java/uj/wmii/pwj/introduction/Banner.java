package uj.wmii.pwj.introduction;

import java.util.Arrays;

public class Banner {
    private final String[] rawFont = (
            "    #    \n" +
            "   # #   \n" +
            "  #   #  \n" +
            " #     # \n" +
            " ####### \n" +
            " #     # \n" +
            " #     # \n" +
            "         \n" +
            " ######  \n" +
            " #     # \n" +
            " #     # \n" +
            " ######  \n" +
            " #     # \n" +
            " #     # \n" +
            " ######  \n" +
            "         \n" +
            "  #####  \n" +
            " #     # \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            " #     # \n" +
            "  #####  \n" +
            "         \n" +
            " ######  \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " ######  \n" +
            "         \n" +
            " ####### \n" +
            " #       \n" +
            " #       \n" +
            " #####   \n" +
            " #       \n" +
            " #       \n" +
            " ####### \n" +
            "         \n" +
            " ####### \n" +
            " #       \n" +
            " #       \n" +
            " #####   \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            "         \n" +
            "  #####  \n" +
            " #     # \n" +
            " #       \n" +
            " #  #### \n" +
            " #     # \n" +
            " #     # \n" +
            "  #####  \n" +
            "         \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " ####### \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            "         \n" +
            " ### \n" +
            "  #  \n" +
            "  #  \n" +
            "  #  \n" +
            "  #  \n" +
            "  #  \n" +
            " ### \n" +
            "         \n" +
            "       # \n" +
            "       # \n" +
            "       # \n" +
            "       # \n" +
            " #     # \n" +
            " #     # \n" +
            "  #####  \n" +
            "         \n" +
            " #    # \n" +
            " #   #  \n" +
            " #  #   \n" +
            " ###    \n" +
            " #  #   \n" +
            " #   #  \n" +
            " #    # \n" +
            "         \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            " ####### \n" +
            "         \n" +
            " #     # \n" +
            " ##   ## \n" +
            " # # # # \n" +
            " #  #  # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            "         \n" +
            " #     # \n" +
            " ##    # \n" +
            " # #   # \n" +
            " #  #  # \n" +
            " #   # # \n" +
            " #    ## \n" +
            " #     # \n" +
            "         \n" +
            " ####### \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " ####### \n" +
            "         \n" +
            " ######  \n" +
            " #     # \n" +
            " #     # \n" +
            " ######  \n" +
            " #       \n" +
            " #       \n" +
            " #       \n" +
            "         \n" +
            "  #####  \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #   # # \n" +
            " #    #  \n" +
            "  #### # \n" +
            "         \n" +
            " ######  \n" +
            " #     # \n" +
            " #     # \n" +
            " ######  \n" +
            " #   #   \n" +
            " #    #  \n" +
            " #     # \n" +
            "         \n" +
            "  #####  \n" +
            " #     # \n" +
            " #       \n" +
            "  #####  \n" +
            "       # \n" +
            " #     # \n" +
            "  #####  \n" +
            "         \n" +
            " ####### \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "         \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            "  #####  \n" +
            "         \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            " #     # \n" +
            "  #   #  \n" +
            "   # #   \n" +
            "    #    \n" +
            "         \n" +
            " #     # \n" +
            " #  #  # \n" +
            " #  #  # \n" +
            " #  #  # \n" +
            " #  #  # \n" +
            " #  #  # \n" +
            "  ## ##  \n" +
            "         \n" +
            " #     # \n" +
            "  #   #  \n" +
            "   # #   \n" +
            "    #    \n" +
            "   # #   \n" +
            "  #   #  \n" +
            " #     # \n" +
            "         \n" +
            " #     # \n" +
            "  #   #  \n" +
            "   # #   \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "    #    \n" +
            "         \n" +
            " ####### \n" +
            "      #  \n" +
            "     #   \n" +
            "    #    \n" +
            "   #     \n" +
            "  #      \n" +
            " ####### \n" +
            "         ").split("\n");

    public String[] toBanner(String input) {
        if(input == null)return new String[]{};
        input = input.toUpperCase();
        String[] result = new String[]{"","","","","","",""};
        for(int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(letter == ' '){
                for(int j = 0; j < 7; j++){
                    result[j]+="    ";
                }
            }
            else if (letter >= 'A' && letter <= 'Z'){
                int letter_number = (int)letter - (int)'A';
                int line_index = letter_number*8;
                for(int j = 0; j < 7; j++){
                    String seg = rawFont[line_index++];
                    seg = seg.substring(1, seg.length()-1);
                    result[j] += seg;
                    if(i != input.length()-1 && input.charAt(i+1) != ' ') result[j] += ' ';
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Banner baner = new Banner();
        for (String arg:args) {
            String[] res = baner.toBanner(arg);
            for(String line: res){
                System.out.println(line);
            }
        }


    }
}
