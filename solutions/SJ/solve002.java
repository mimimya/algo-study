import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve002 {
    private static final int[] DX ={0, 0, -1, 1};
    private static final int[] DY = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        Queue<int[]> q = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) {
                    //map[][] = 1 ; 토마토, 1일째
                    q.add(new int[]{j, i});
                }
            }
        }
        
        while (!q.isEmpty()) {
            int[] xy = q.poll();
            int cx = xy[0];
            int cy = xy[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx+DX[i];
                int ny = cy+DY[i];
                
                if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                if(map[ny][nx] != 0) continue;

                map[ny][nx] = map[cy][cx] + 1; //Day 계산
                q.add(new int[]{nx, ny});
            }
        }

        // 탐색 완료
        int maxDay = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                maxDay = Math.max(maxDay, map[i][j]);
            }
        }
        
        System.out.println(maxDay -1); // 초기 상태는 경과에서 제외
    }
}
