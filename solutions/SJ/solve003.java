package solutions.SJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve003 {
        public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        String flag = st.nextToken();

        if(flag.equals("E")){
            System.out.println(encode(st.nextToken()));
        }else{
            System.out.println(decode(st.nextToken()));
        }
    }

    public static String encode(String s){
        StringBuilder sb = new StringBuilder();

        char beforeC = s.charAt(0);
        int count = 1;
        char[] arr = s.toCharArray();
        for(int i = 1; i<arr.length; i++){
            if(beforeC == arr[i]){
                count++;
            }else{
                sb.append(beforeC +"" + count);
                count = 1;
            }
            beforeC = arr[i];
        }
        // 마지막 문자 처리
        sb.append(beforeC + "" + count);
        return sb.toString();
    }

    public static String decode(String s){
        StringBuilder sb = new StringBuilder();
        int i = 0; 
        while(i<s.length()){
            char c = s.charAt(i); // 문자
            i++;
            
            // 문자 반복 횟수 계산
            StringBuilder numSb = new StringBuilder(); 
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                numSb.append(s.charAt(i));
                i++;
            }
            int count = Integer.parseInt(numSb.toString());

            for(int j = 0; j<count; j++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
