package solutions.SJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve005 {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String B = br.readLine();

        int Blen = B.length();
        
        StringBuilder sb = new StringBuilder();

        // 빈 문자열에 S의 글자를 스택에 쌓아가며 끝이 B와 같아지면 바로 삭제

        for(char c : S.toCharArray()){
            sb.append(c);
            if(sb.length() >= Blen){
                boolean match = true; //  B단어 온전히 포함 여부 확인
                for(int i = 0; i < Blen; i++){
                    //S의 끝에서 S의 글자와 B단어의 글자 비교
                    if(sb.charAt(sb.length() - Blen + i) != B.charAt(i)){
                        match = false;
                        break;
                    }
                }
                
                if(match){
                    sb.delete(sb.length() - Blen, sb.length());
                }
            }
        }
        String answer = sb.toString();
        System.out.println(answer.length() == 0 ? "FRULA" : answer );

     
    }
}
