package solutions.SJ; //VSCode

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class solve001 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int maxLen = 1;
        int curBlocks = 0;
        for (int k2 = N - 1; k2 >= 2; k2--) {
            int left = A[k2 - 2] - A[k2 - 1];
            int right = -1 * (A[k2 - 1] - A[k2]);

            if (left == right)
                curBlocks++;
            else
                curBlocks = 0;
            maxLen = Math.max(maxLen, curBlocks + 2);
        }

        // 답안 출력
        System.out.println(maxLen);

    }
}
