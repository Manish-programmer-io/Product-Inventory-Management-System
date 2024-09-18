1. Product Class Implementation

Create a Product class with the following attributes:

id: A unique identifier for the product.
name: The name of the product.
category: The category to which the product belongs.
price: The price of the product.
rating: The customer rating of the product (out of 5).
sales


2. Inventory Management

Create an Inventory class that manages a collection of Product objects. The Inventory class should use a List to store the products, a Set to manage unique product categories, and a Map to track the stock quantity of each product.

Implement methods to add a product to the inventory.
Implement methods to remove a product from the inventory by its id.
Implement a method to update the stock quantity for a given product.

3. Product Filtering

Add functionality to filter products based on the following criteria:

Price range (min and max price).
Rating (minimum rating).
Stock availability (whether the product is in stock).
Implement a method to filter and return products that match the given criteria.
Ensure the method allows combining multiple criteria (e.g., filter by price range and rating).

4. Dynamic Pricing Adjustment

Implement a feature that adjusts the price of products based on their sales performance. Products with high sales should have their prices increased by a certain percentage.

adjustPriceBasedOnSales(10, 10) // Increase price by 10% if sales > 10

5. Category-Based Analytics

Add functionality to analyze the product categories in the inventory. The analysis should include:
The total sales for each category.
The average price of products in each category.
The highest-rated product in each category.
Implement methods to perform the above analytics and return the results.

6. Inventory Forecasting

Implement a feature to forecast future inventory needs based on current sales trends. The forecast should predict the required stock for each product to meet future demand.
Implement a method that predicts the future stock needs for each product based on its sales history.
Ensure the method takes into account an expected increase in demand.

7. Display Inventory Details

Create a method to display the details of all products in the inventory, including their current stock quantity.
Implement a method that prints the details of all products in the inventory.
Ensure the method includes all relevant product information such as price, category, and rating.
