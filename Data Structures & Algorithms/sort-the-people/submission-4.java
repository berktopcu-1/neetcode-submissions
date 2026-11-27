class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        
        for(int i = 0; i < names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i = 0; i < heights.length / 2; i++){
            int temp = heights[heights.length - (i+1)];
            heights[heights.length - (i+1)] = heights[i];
            heights[i] = temp;
            
        }

        for(int i = 0; i < heights.length;i++){
            names[i] = map.get(heights[i]);
        }
        return names;
    }
}