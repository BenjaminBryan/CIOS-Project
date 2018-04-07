# CIOS-Project
This README file will explain the function of our point of sale software, how it works and how to use it.
This is a point of sale system which contains a database through sql containing a list of the inventory (random items).
The list holds item number, name and price and the user will use the GUI to select items and add them to their (cart) list.
Once the list is complete (up to user) a preview of the items and their prices will be shown when clicking confirm, the properly taxed sum of all the selected items will be shown too.
--------------------------------------------------------------------------------------------------------------------------------------
Software Usage

The Point of Sale Software help manages the transaction between a buyer, seller and storefronts. POS systems consist of various combinations of software, to keep track of everything from items, prices, taxes, sale date and time, discounts and payments. In comparison, it also benefits businesses with:

-          Intuition, ergonomics and ease of use
-          Maximizing the speed of customer service
-          Safety and Reliability of the POS system and cash register operation
-          Automation of all processes
-          Broadest possible functionality

--------------------------------------------------------------------------------------------------------------------------------------

Functionality

1) Quick and easy sale management

2) Possibility of flexible POS configuration : with a display for cashier, a monitor, a touch screen and connected scanner/ scale.

3) The possibility to use the touch screen

4) Mechanism of automatic recognition of errors – active while entering data by cashier

5) Possibility to adapt the cashier graphic interface to customers’ needs : applies to POS configured with a monitor or touch screen

6) Possibility to use POSs for Inventory

7) Supports complex bonuses for purchases

8) A more accurate business -  Instead of double- checking each customer’s order, you can use the POS system to manage inventory and analyze sales patterns in a more accurate manner.

9) Networking to other terminals – A system can be networked to other terminals and expanded with handheld devices for tracking operations from any location

---------------------------------------------------------------------------------------------------------------------------------------
Why would this be useful to someone?

This computerized system allows business owners to track sales, cash flows, food inventory and simplify bookkeeping substantially. The key feature are described below:

1) Sales Reporting & Analytics.  Allows to capture and analyze vital sales data, including not only the products that are being sold, but revenue rates and ROI too.

2) Customer Management. Using a POS system to attract valuable customers, since the customer’s full purchase history will be displayed on your screen and you will start prioritizing between valuable and most valuable customers.

3) Employee Management.  To keep track of when and what your employers are working on, to reduce overhead, and to manage their commissions accordingly.

4) Robust Reporting. It is important for retailers to make use of a POS system with robust reporting features to gain the information and insight needed to make the right business decisions.
 
5) Powerful Integrations. The POS system should smoothly integrate with the other business systems and apps you use.

---------------------------------------------------------------------------------------------------------------------------------------
Targeted Audience

Our targeted industry are local grocery stores, mainly small businesses that are in need to attract customers. A point of sale system is a key asset for boasting profit margins, as it focuses on the most successful products and reveals the ones that needs to be reordered. With the help of purchasing functionality, it tracks their vendor list and orders.


UML Diagrams & Descriptions

Class Diagram

Diagram 1 – Explanation
-          A customer comes to the store and has a coupon for an item in that store
-          The coupon must be verified by the Store representative to ensure the coupon is still valid towards an item in the inventory database
-          The store representative selects the item and processes the coupon in system to ensure the customer is receiving the coupon discount
-          Once discount is applied the final price with tax is added to the final purchase of sale.

Activity Diagram

-          An inventory list is updated on the POS software to ensure items selected by customer are in stock
-          Customer selects items to purchase on the POS software
-          The selection is made by the customer and the POS must check whether the item selected is in stock or not
-          The system will prompt a selection to the customer to ensure whether items are in stock are available to purchase or not
-          If the items that the customer selected are in stock, it will prompt a selection to proceed with Purchase of Sale, or not available it will prompt back to the main selection list
-          Once the items that have been selected by the customer, the software will process the total price amount and the taxes
-          A purchase of sale bill will be displayed to the customer prior to form of payment option
-          Form of payment option will be displayed to customer
-          If the customer chooses YES to proceed, the POS which will then process the transaction to ensure payment was received and once completed the system will then refresh to a new Purchase of Sale.
-          If the Transaction was rejected an option will be displayed to indicate whether the customer would like to Retry payment or cancel purchase transaction.

State Chart Diagram

-          Store Representative will click option to create a sale purchase
-          The POS will proceed will checking out item or can create a system error which will then proceed to stop processing information or transaction
-          Once the system is processing the information being entered successfully, the software will then give an option to the store representative to start checking out items
-          If more than one item is being added, continuation of scanning or entering information will remain until store representative finishes scanning or entering information of items being purchased
-          Once items are checked out, the tax is then added towards to the final bill
-          A preview will be prompted to ensure the number of items and tax was included in the bill
-          An option is given whether the customer wants to make changes to the bill it will prompt them back to modifying their item purchase until they are satisfied
-          Once modifications have been accepted a coupon option is displayed prompting if any coupons are readily available to ensure a discount.
-          Once coupon has been applied or not, payment option is displayed, verify payment method
-          Once payment method has been verified it can display into two ways
o   Transaction will be completed
Transaction will be rejected which will then prompt to retrying a different payment method or cancelling the purchase of sale.

Sequence Diagram

-          The store updates the current inventory list in their database to ensure the inventory list is readily available for the customer
-          Inventory list is shown to the customer, the customer can choose the items that they would like to purchase from the POS
-          Items selected will create a sum of all products with respect to their respectable tax which will be included to the sum of products
-          A review of purchase sale will be demonstrated to the customer to ensure that the items they would like to purchase is available
-          Customer must confirm the list of items and pay the final purchase of bill
-          If the customer would like to alter the list of items being purchased, they can remove the unwanted item from the list and would have to recalculate the sum of all products as well as taxes
-          Once completed it will re- prompt them to show preview of items being purchased
They must confirm with items and pay.



What was the easiest to implement?
Creating various UML diagrams were easier to implement throughout this project.
 
What was most difficult?
The most difficult that we found out in this project was implementing fxml (JavaFX Application)
 
If you could go back would do anything differently?
As group, we would choose to work on something that is not as complex as a Storefront POS System, as there is a lot going on

What have you learned?
Overall, everything was a great experience, from the group members to create a Point of Sale system

