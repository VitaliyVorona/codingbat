package warmup_first;

public class FrontBack {

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String midStringPart = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + midStringPart + str.charAt(0);
    }

}
