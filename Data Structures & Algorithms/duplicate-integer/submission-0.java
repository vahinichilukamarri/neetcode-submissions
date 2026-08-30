class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable <Integer,Integer> ht = new Hashtable<>();
        for(int x: nums){
            ht.put(x,ht.getOrDefault(x,0)+1);
        }
        for(Integer h: ht.keySet()){
            if(ht.get(h)>1) return true;
        }
        return false;
    }
}