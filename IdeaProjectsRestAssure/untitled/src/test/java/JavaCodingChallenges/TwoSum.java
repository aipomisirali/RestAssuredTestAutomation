package JavaCodingChallenges;


import org.junit.Test;

public class TwoSum {
    @Test
    public void twoSumm() {

        int[] nums={-3,2,3}; int target=0;
        int count=0;
        String[] returnArr=new String[2];

        for(int i=0; i<=nums.length-1; i++) {
            for (int j = 1; j <=nums.length-1; j++) {
                if (nums[i]+nums[j]==target) {

                    returnArr[0] = Integer.toString(i);
                    returnArr[1] = Integer.toString(j);
                    count++;}


            }}
        for (String i:returnArr) {
            System.out.println(i); }}}
