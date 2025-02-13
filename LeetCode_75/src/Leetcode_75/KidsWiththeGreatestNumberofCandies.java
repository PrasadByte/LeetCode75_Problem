package Leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }//for boolean array
        List<Boolean> res = new ArrayList<>();
        for (int i : candies) {
            if (i + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        KidsWiththeGreatestNumberofCandies obj = new KidsWiththeGreatestNumberofCandies();
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);
    }
}
