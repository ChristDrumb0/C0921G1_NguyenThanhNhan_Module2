package nhap.giai_thuat;

import java.util.HashSet;
import java.util.Set;

public class Tuan3 {
    public static int solution(String inputStr)
    {
        Set<String> result = new HashSet<>();

        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j <= inputStr.length(); j++) {

                result.add(inputStr.substring(i, j));
            }
        }

        return result.size();
    }

    // Driver Code
    public static void main(String[] args)
    {
        String inputStr = "abca";
        System.out.println(solution(inputStr));
    }
}
