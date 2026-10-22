class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int merged = m + n;
        int[] array = new int[merged];

        for (int i = 0; i < m; i++){
            array[i] = nums1[i];
        }
        for (int i = 0; i < n; i++){
            array[m+i] = nums2[i];
        }

        Arrays.sort(array);

        double median = 0.00;
        int mid = 0;
        int left = 0, right = 0;

        if (merged % 2 != 0){
            mid = merged / 2;
            return (double)array[mid];
        }
        else{
            mid = merged / 2;
            left = mid - 1;
            right = mid;

            median = (double)(array[left] + array[right]) / 2;
            return median;
        }

    }
}
