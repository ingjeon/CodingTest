-- 코드를 입력하세요
# 입양 못간 동물중 가장 오래 3마리
SELECT ANIMAL_INS.NAME, ANIMAL_INS.DATETIME FROM ANIMAL_INS 
LEFT JOIN ANIMAL_OUTS 
ON ANIMAL_INS.ANIMAL_ID= ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_OUTS.DATETIME IS NULL
ORDER BY ANIMAL_INS.DATETIME
LIMIT 3