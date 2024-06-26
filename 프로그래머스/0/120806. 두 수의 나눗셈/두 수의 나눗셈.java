class Solution {
    public int solution(int num1, int num2) {
        // num1을 num2로 나눈 후 1000을 곱한 값을 구합니다.
        double result = (double) num1 / num2 * 1000;
        
        // 결과의 정수 부분을 반환합니다.
        return (int) result;
    }
}
