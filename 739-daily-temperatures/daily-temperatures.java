class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();  // stores indices

        for (int i = 0; i < n; i++) {
            // If current temp is greater than temp at index on top of stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;   // number of days waited
            }
            stack.push(i);  // push current index
        }

        return answer;
    }
}
