class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: if one of the numbers is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        
        // Result can be at most len1 + len2 digits long
        int[] result = new int[len1 + len2];

        // Reverse traverse both strings
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p2] = sum % 10;      // Store current digit
                result[p1] += sum / 10;     // Carry to the next position
            }
        }

        // Build the final product string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();  // Return the final product as a string
    }
}
