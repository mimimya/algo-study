import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class solve006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int answer = 0;
        int len = 0;
        for(char c : S.toCharArray()){
            if(c == 'a') len++;
        }
        int bCnt = 0;
        for(int i = 0; i<len; i++) {
            if(S.charAt(i) == 'b') bCnt++;
        }
        answer = bCnt;
        String doubled = S + S;
        for(int i = len; i < doubled.length(); i++){
            if(doubled.charAt(i) == 'b') bCnt++;
            if(doubled.charAt(i-len) == 'b') bCnt--;
            answer = Math.min(answer, bCnt);
        }
        System.out.println(answer);
    }
}