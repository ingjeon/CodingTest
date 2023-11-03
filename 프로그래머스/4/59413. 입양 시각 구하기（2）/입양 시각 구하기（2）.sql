-- 코드를 입력하세요
# 0~23 시간대별 입양 건수 
# HOUR(기준 날짜);

SET sql_mode = '';
SELECT B.n , 
		 IFNULL(A.COUNT,0)
	FROM (
		SELECT  
			DATE_FORMAT(DATETIME,'%H') AS "COL_01",
			COUNT(DATETIME) AS COUNT
		FROM ANIMAL_OUTS
		GROUP BY DATE_FORMAT(DATETIME,'%H')
	) A
	RIGHT JOIN(
    	WITH RECURSIVE cte AS (
          SELECT 0 AS n
          UNION ALL
          SELECT n + 1 FROM cte WHERE n < 23
		)
		SELECT n FROM cte
	) B ON A.COL_01 = B.n;