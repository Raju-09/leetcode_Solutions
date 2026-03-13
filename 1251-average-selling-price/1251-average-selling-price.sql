SELECT 
    product_id,
    ROUND(IFNULL(SUM(total_price)/SUM(units),0),2) AS average_price
FROM (
    SELECT 
        p.product_id,
        p.price * u.units AS total_price,
        u.units
    FROM Prices p
    LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
) t
GROUP BY product_id;