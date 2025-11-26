package feedback;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class feedback001 {
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
        for (int k = 2; k < N; k++) {
            int left = A[k] - A[k - 1];
            int right = -1 * (A[k - 1] - A[k - 2]);

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
