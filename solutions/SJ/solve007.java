import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class solve007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String S = br.readLine();

        String doubled = S + S;

        int zeroCnt = 0;
        int l = 0, answer = 0;

        for (int r = 0; r < doubled.length(); r++) {
            if (doubled.charAt(r) == '0') zeroCnt++;

            while (zeroCnt > K ||  r - l + 1 > N)  { //  (r - l + 1 > N) : S=11111
                if (doubled.charAt(l) == '0') zeroCnt--;
                l++;
            }

            answer = Math.max(answer, r-l+1);
        }

        System.out.println(answer);
    }
}
