class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Brute-force Approach:

        // the brute-force approach has a time-complexity of O(n ^ 2) and space complexity of O(n)

        // we begin by defining two loops and compare the current element in the outer loop with the current element in the inner loop
        // for(int i = 0; i < nums.length - 1; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // HashSet Approach (more time optimal):

        /**
        time compleixty is O(n) because '.contains()' operation takes O(1) time but the operation is done 'n' times when there's no duplicates
        space complexity is O(n) because if there are no duplicates, all elements will be stored.
         */
        // declare and initialize a set
        Set<Integer> set = new HashSet<>();

        // loop through and check if element is found in set
        for(Integer element: nums) {
            if(set.contains(element)) {
                return true;
            }
            // set does not contain current element, add element
            set.add(element);
        }
        // set does not contain element, return 'false'
        return false;
    }
}