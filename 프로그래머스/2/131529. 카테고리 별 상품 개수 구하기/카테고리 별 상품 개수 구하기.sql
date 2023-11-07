-- 코드를 입력하세요
SELECT LEFT(product_code,2), COUNT(PRODUCT_ID) FROM PRODUCT
GROUP BY LEFT(product_code,2)