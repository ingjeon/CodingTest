-- 코드를 입력하세요
# 보호소에서 중성화 수술을 거친 동물 정보, 보호소에 들어올 당시 중성화X, 보호소를 나갈 당시에는 중성화O 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문
# Intact% Neutered Male,Spayed Female
SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME FROM ANIMAL_INS
INNER JOIN ANIMAL_OUTS
ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE SEX_UPON_INTAKE LIKE "intact%" 
AND (SEX_UPON_OUTCOME = "Neutered Male" OR SEX_UPON_OUTCOME = "Spayed Female");