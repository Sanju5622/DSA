class Solution {
    public int romanToInt(String s) {
        

        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total =0;
        int prevValue=0;

        for(int i = s.length()-1;i>=0;i--)
        {
            char currentchar = s.charAt(i);
            int currentValue = map.get(currentchar);

            if(currentValue<prevValue)
            {
                total-=currentValue;
            }
            else
            {
                total+=currentValue;
            }

            prevValue=currentValue;
        }
        return total;
    }
}
