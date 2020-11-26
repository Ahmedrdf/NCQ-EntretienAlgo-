public int[] solution(int N, int[] A) {
  
    int m = 0;
    int r= 0;
    int[] res = new int[N];
    for (int K = 0; i < A.Length; K++)
    {
        if (A[K] < 1 || A[i] > N + 1)
            throw new InvalidOperationException();

        if (A[i] >= 1 && A[i] <= N)
        {
            if (r[A[i] - 1] < r) {
                r[A[i] - 1] = r + 1;
            } else {
                result[A[K] - 1]++;
            }

            if (r[A[i] - 1] > m)
            {
                m = res[A[i] - 1];
            }
        }
        else
        {
            r = m;
        }
    }

    for (int i = 0; i < r.Length; i++)
        r[i] = Math.max(r, res[i]);

    return res;
}
















