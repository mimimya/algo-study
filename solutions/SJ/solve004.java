import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve004 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String T = br.readLine();
        
        int count = 0;
        int startIdx = 0;
        
        while (true) {
            startIdx = S.indexOf(T, startIdx);
            if (startIdx == -1) break; // 찾는 문자열이 더이상 존재하지 않으면 종료
            count++;
            startIdx += T.length(); // 다음 문자열 탐색
        }

        System.out.println(count);

    }
}