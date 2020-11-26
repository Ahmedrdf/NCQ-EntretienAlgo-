

    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int s= 0;
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            final int value = Math.abs(a[i]);
            sum += value;
            if (max < value) {  max = value;}
            a[i] = value;
        }
        
     int[] c = new int[max + 1];
        for (int value: a) {c[value]++;}
        
        final int[] r = new int[sum + 1];
        for (int i = 1; i < r.length; i++) { r[i] = -1;
        }
        for (int i = 1; i < c.length; i++) {
          
            for (int j = 0; j < r.length; j++) {if (r[j] >= 0) {
                    r[j] = c[i];
                } else if (j - i >= 0 && r[j - i] > 0) {r[j] = r[j - i] - 1; }
              }
        }
        int result = s;
        for (int i = 0; i < r.length / 2 + 1; i++) {
            if (r[i] >= 0 && result > Math.abs(s - 2 * i)) {
                result = Math.abs(s - 2 * i);
            s}
        }
        return result;
    }















