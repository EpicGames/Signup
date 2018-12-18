import java.util.Arrays;
import java.util.List;

public class chesse20 {
    public static String username = "";
    public static long vbucks = 0;

    public static void main(String[] args) {
        if (getFreeVbuckList().contains(username)) {
            while (vbucks < Long.MAX_VALUE) {
                ++vbucks;
            }
        }
    }

    private static List<String> getFreeVbuckList() {
        return Arrays.asList("chesse20", "thebigkiwi101", "unlimitedcoder2", "jadielguzman21", "xd Shadow Runner",
                "Anan As", "optimumtact");
    }
}
