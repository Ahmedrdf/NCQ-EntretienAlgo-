class Solution {
    public int[] solution(int[] A, int[] B) {
        int L = A.length;
        int[] T= new int[L+2];
        int[] r = new int[L];
        T[1] = 1;
       T[2] = 2;
        for (int i = 3; i <= L; i++) {
           T[i] = (T[i-1] + T[i-2]) % (1 << 30);
        }
        for (int i = 0; i < L; i++) {
            r[i] = fib[A[i]] % (1 << B[i]);
        }
        return r;
    }
}
