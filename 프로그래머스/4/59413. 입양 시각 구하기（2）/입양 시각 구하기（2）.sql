-- 코드를 입력하세요
# 0~23 시간대별 입양 건수 
# HOUR(기준 날짜);
# SET sql_mode = '';

### n속성에 0~23인 cte 테이블 생성
WITH RECURSIVE cte AS (
         SELECT 0 AS n
         UNION ALL
         SELECT n + 1 FROM cte WHERE n < 23
	)
### 
SELECT n, COUNT(ANIMAL_ID)
FROM cte
LEFT JOIN ANIMAL_OUTS 
ON cte.n =  DATE_FORMAT(DATETIME,'%H')
GROUP BY n;
 