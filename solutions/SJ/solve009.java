import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class solve009 {
    public static int[] need;
    public static int[] have;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        String W = br.readLine();
        String S = br.readLine();

        need = new int[52];
        have = new int[52];
        for(int i = 0; i < W.length(); i ++){
            char c = W.charAt(i);
            char cc = S.charAt(i);
            int idx, idx2;
            if('a' <= c && c <= 'z') {
                idx = c - 'a';
            }else {
                idx = c - 'A' + 26;
            }
            if('a' <= cc && cc <= 'z') {
                idx2 = cc - 'a';
            }else {
                idx2 = cc - 'A' + 26;
            }
            need[idx]++;
            have[idx2]++;
        }

        int answer = 0, l = 0;
        if(isSame()) answer++;
        for(int r = W.length(); r < S.length(); r++){
            char c = S.charAt(r);
            int idx;
            if('a' <= c && c <= 'z') {
                idx = c - 'a';
            }else {
                idx = c - 'A' + 26;
            }
            have[idx]++;

            c = S.charAt(l++);
            if('a' <= c && c <= 'z') {
                idx = c - 'a';
            }else {
                idx = c - 'A' + 26;
            }
            have[idx]--;


            if(isSame()) answer++;
        }
        System.out.println(answer);

    }
    public static boolean isSame() {
        boolean isSame = true;
        for(int i = 0; i<52; i++){
            if(have[i] != need[i]) isSame = false;
        }
        return isSame;
    }
}
