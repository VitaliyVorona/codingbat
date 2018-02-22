package warmup_first;

public class FrontThree {

    public static String front3(String str) {
        String output;
        if (str.length() < 3) {
            output = str;
        } else output = str.substring(0, 3);
        return output + output + output;
    }

}
