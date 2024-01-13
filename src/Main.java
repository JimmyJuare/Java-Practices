import com.codingproblems.LetterAccumulator;
import com.codingproblems.Palindrome;
import com.codingproblems.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        //twoSum problem
//        TwoSum test = new TwoSum();
//        System.out.println(Arrays.toString(test.twoSum(new int[]{5,4,3,2,1}, 3)));
        // Palindrome
//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.check(9987654321L));

        LetterAccumulator accumulator = new LetterAccumulator();
        System.out.println(accumulator.accumulate("Jimmy is the best"));
    }
}