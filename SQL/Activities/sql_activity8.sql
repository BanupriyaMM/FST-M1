select customer_id,max(purchase_amount) as "maximum amount" from orders group by customer_id order by customer_id;
    
select max(purchase_amount),salesman_id from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_date;
    
Select customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders
GROUP BY customer_id, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);