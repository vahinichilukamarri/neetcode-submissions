class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable <Integer,Integer> ht = new Hashtable<>();
        for (int x : nums) {
            if (ht.containsKey(x)) {
                return true;
            }
            ht.put(x, 1);
        }
        return false;
    }
}