package com.company.algorithm1;

public class FirstBadVersion {


    public int firstBadVersion(int n) {

        int low = 0;
        int high =n;
        int mid;
        int ans=-1;

        /*while (low<=high){

            mid = low + (high - low) / 2;
            if (isBadVersion[mid] ){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }

        }

*/
        return ans;
    }

}
