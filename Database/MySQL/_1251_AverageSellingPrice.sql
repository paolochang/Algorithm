# Write a solution to find the average selling price for each product. average_price should be rounded to 2 decimal places. If a product does not have any sold units, its average selling price is assumed to be 0.
# Return the result table in any order.
#
# Table: Prices
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | product_id    | int     |
# | start_date    | date    |
# | end_date      | date    |
# | price         | int     |
# +---------------+---------+
#
# Table: UnitsSold
# +---------------+---------+
# | Column Name   | Type    |
# +---------------+---------+
# | product_id    | int     |
# | purchase_date | date    |
# | units         | int     |
# +---------------+---------+

SELECT p.product_id, IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) as average_price
    FROM Prices p
    LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id 
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
    GROUP BY p.product_id;