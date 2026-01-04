import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class solve008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String S = br.readLine();

        int ACnt = 0, BCnt = 0, CCnt = 0;
        int maxCnt = 0;
        int l = 0, answer = 0;

        for (int r = 0; r < S.length(); r++) {
            char c = S.charAt(r);

            if (c == 'A') ACnt++;
            else if (c == 'B') BCnt++;
            else CCnt++;

            maxCnt = Math.max(maxCnt,
                      Math.max(ACnt, Math.max(BCnt, CCnt)));

            while (r - l + 1 - maxCnt > K) {
                char left = S.charAt(l);
                if (left == 'A') ACnt--;
                else if (left == 'B') BCnt--;
                else CCnt--;
                l++;
            }

            answer = Math.max(answer, r - l + 1);
        }

        System.out.println(answer);
    }
}
