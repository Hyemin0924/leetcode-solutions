풀이 
아이디어: 2차원 배열을 1차원 선형 구조로 펼쳐서(Flattening) $k$번 shift를 단순하게 계산합니다.
모듈러 연산: $k$를 전체 원소 개수($N = m \times n$)로 나눈 나머지 rk = k % N를 구해 불필요한 회전을 없앱니다.
1차원 변환: 2차원 grid를 순회하며 원소를 순서대로 1차원 리스트 g에 모아둡니다.
인덱스 역추적: $k$번 shift 된 후의 위치 gn에 들어올 값은, shift 되기 전인 gn - rk 위치의 값입니다.
음수 인덱스 처리: gn - rk < 0인 경우, 전체 개수 $N$을 더해 리스트 뒤쪽 원소를 가져옵니다 (원형 회전).
결과 재구성: 1차원 인덱스 gn을 0부터 1씩 증가시키며 행(List<Integer>) 단위로 끊어 최종 2차원 리스트를 완성합니다.
시간 복잡도: $\mathcal{O}(m \times n)$ — 원소를 정확히 2번씩만 순회하므로 최적의 속도를 가집니다.
공간 복잡도: $\mathcal{O}(m \times n)$ — 1차원 리스트 g 생성을 위한 추가 메모리를 사용합니다.

<h2><a href="https://leetcode.com/problems/shift-2d-grid">Shift 2D Grid</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given a 2D <code>grid</code> of size <code>m x n</code>&nbsp;and an integer <code>k</code>. You need to shift the <code>grid</code>&nbsp;<code>k</code> times.</p>

<p>In one shift operation:</p>

<ul>
	<li>Element at <code>grid[i][j]</code> moves to <code>grid[i][j + 1]</code>.</li>
	<li>Element at <code>grid[i][n - 1]</code> moves to <code>grid[i + 1][0]</code>.</li>
	<li>Element at <code>grid[m&nbsp;- 1][n - 1]</code> moves to <code>grid[0][0]</code>.</li>
</ul>

<p>Return the <em>2D grid</em> after applying shift operation <code>k</code> times.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/11/05/e1.png" style="width: 400px; height: 178px;" />
<pre>
<strong>Input:</strong> <code>grid</code> = [[1,2,3],[4,5,6],[7,8,9]], k = 1
<strong>Output:</strong> [[9,1,2],[3,4,5],[6,7,8]]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/11/05/e2.png" style="width: 400px; height: 166px;" />
<pre>
<strong>Input:</strong> <code>grid</code> = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
<strong>Output:</strong> [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> <code>grid</code> = [[1,2,3],[4,5,6],[7,8,9]], k = 9
<strong>Output:</strong> [[1,2,3],[4,5,6],[7,8,9]]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m ==&nbsp;grid.length</code></li>
	<li><code>n ==&nbsp;grid[i].length</code></li>
	<li><code>1 &lt;= m &lt;= 50</code></li>
	<li><code>1 &lt;= n &lt;= 50</code></li>
	<li><code>-1000 &lt;= grid[i][j] &lt;= 1000</code></li>
	<li><code>0 &lt;= k &lt;= 100</code></li>
</ul>
