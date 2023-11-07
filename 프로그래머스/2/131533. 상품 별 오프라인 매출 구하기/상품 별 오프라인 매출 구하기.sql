-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(price*SALES_AMOUNT)
FROM PRODUCT 
JOIN OFFLINE_SALE 
on PRODUCT.PRODUCT_ID = OFFLINE_SALE.PRODUCT_ID
GROUP BY PRODUCT_CODE 
ORDER BY SUM(price*SALES_AMOUNT) DESC, PRODUCT_CODE
 