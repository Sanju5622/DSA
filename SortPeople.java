class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Integer [] index = new Integer[heights.length];

        for(int i =0;i<heights.length;i++)
        {
            index[i]=i;
        }

        Arrays.sort(index, (a, b) -> Integer.compare(heights[b], heights[a]));
        

        String [] sortedNames = new String[names.length];

        for(int i=0;i<index.length;i++)
        {
            sortedNames[i] = names[index[i]];
        }

        return sortedNames;

    }
}
