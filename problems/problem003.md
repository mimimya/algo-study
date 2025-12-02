# RLE 문제 (문자열 압축)

(백준 16634)[https://www.acmicpc.net/problem/16634]

# 입력
Input consists of a single line of text. The line starts with a single letter: E for encode or D for decode. This letter is followed by a single space and then a message. The message consists of 1 to 100 characters.

```
E HHHeellloWooorrrrlld!!
```
```
D H3e2l3o1W1o3r4l2d1!2
```
Each string to decode has even length. Its characters alternate between the same characters as strings to encode and a single digit between 1 and 9, indicating the run length for the preceding character.


# 출력
On an input of E output the run-length encoding of the provided message. On an input of D output the original string corresponding to the given run-length encoding.

```
H3e2l3o1W1o3r4l2d1!2
```
```
HHHeellloWooorrrrlld!!
```