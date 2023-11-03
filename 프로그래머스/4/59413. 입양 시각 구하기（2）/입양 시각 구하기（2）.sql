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
SELECT n, IFNULL(COUNT(ANIMAL_ID),0) 
FROM cte
LEFT JOIN ANIMAL_OUTS 
ON cte.n =  DATE_FORMAT(DATETIME,'%H')
GROUP BY n;

# SELECT cte.n, IFNULL(A.total,0)
# FROM (SELECT DATE_FORMAT(DATETIME,'%H') AS "COL_01",
#     COUNT(ANIMAL_ID) AS total
# 	FROM ANIMAL_OUTS
# 	 GROUP BY DATE_FORMAT(DATETIME,'%H')
# 	) A
# RIGHT JOIN cte 
# ON A.COL_01 = cte.n;