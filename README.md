# longdi-algo-study
시차는 있어도 실력차는 없애자


## A가 문제1, B가 문제2 선택
또는 같은 문제를 동시에 풀이

### 1. 각자 브랜치에서 풀이

```bash
git checkout main
git pull origin main
git checkout -b SJ
```

#### 솔루션 작성: solutions/SJ/solve1.py

```bash
git add .
git commit -m "solve p1"
git push origin SJ
```

### 2. PR 생성 & 리뷰 요청

GitHub에서 userA(SJ) → main PR 생성
PR 설명에 풀이 요약 + 고민 포인트 작성해 피드백 요청

### 3. 리뷰 & 피드백 반영

B가 PR 코멘트로 리뷰
A가 피드백 반영, 코드 수정 후 커밋 → PR 업데이트

### 4. 최종 코드 반영

리뷰 완료 후 PR merge → main
`solutions/feedback/solution1.py` 최종 코드 생성 (A+B 합쳐진 버전)

풀이 설명 + 리뷰 내용 README.md에 기록 (선택)
