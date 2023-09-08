<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY
## D287 – JAVA FRAMEWORKS - Gary Smith

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
File Name: mainscreen.html
Line Number: The whole page. Line 14 - 165.
Change: Adjusted mainscreen.html with added products, parts, and shop name

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
File Name: about.html, mainscreen.html
Line Number: the entire page, specifically line 16, 17, and 18 on about.html, line 20 in mainscreen.html
Change: I added the navigation to get back to the main page on line 16, added the page title on line 17, and about information on line 18. In mainscreen.html, I added the ability to navigate to the home page, this is shown on line 20.

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
File Name: BootStrapData.java
Line Number: Line 61 - Line 188
Change: From Line 61 - Line 154, I created 5 different parts with their names, inventory amounts, company names and ids. I also added logic that checked to see if the data was already in the database, if so, it would skip it and not add a duplicate part.
From line 164 - line 188, I created 5 different products with their names, inventory amounts,  and prices. I also added logic that checked to see if the data was already in the database, if so, it would skip it and not add a duplicate product.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•   The “Buy Now” button must be next to the buttons that update and delete products.

•   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•   Display a message that indicates the success or failure of a purchase.
File Name: MainScreenController.java, purchaseController.java, mainscreen.html, purchaseSuccess.html, and purchaseFailure.html.
Line Number: MainScreenController.java: line 67 - 87, purchaseController.java: line 1 - 18, mainscreen.html: line 81 - 92, purchaseSuccess.html and purchaseFailure.html: line 1 - 13. 
Change: In MainScreenController.java, I added a method to handle the purchase of a product, the method checks if the product exists by searching with the product id. If does not exist, an error is returned. 
If it does exist, it checks if the product is available for purchase based on the inventory, if so it decrements the products inventory and redirects to a page confirming the purchase, which is the purpose of the purchaseSuccess.html page and the method corresponding to it in the purchaseController.java page.
If inventory is not available, the page is redirected to the purchase error page, which is the purpose of the purchaseFailure.html file and purchaseFailure method in the purchaseController.java file. In mainscreen.html, I added a form that handles the functionality of the buy button. The input is hidden so that when the button is clicked on,
it collects the products id and passes it to the buyProduct method for confirm or deny the purchase.

G. Modify the parts to track maximum and minimum inventory by doing the following:

•   Add additional fields to the part entity for maximum and minimum inventory.

•   Modify the sample inventory to include the maximum and minimum fields.

•   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

•   Rename the file the persistent storage is saved to.

•   Modify the code to enforce that the inventory is between or at the minimum and maximum value.
File Name: Part.java, BootStrapData.java, InhousePartForm.html, OutsourcedPartForm.html, AddInhousePartController.java, AddOutsouredPartController.java, and application.properties.
Line Number: Part.java: Line 33, 34, 57, 58, 119 - 131. BootstrapData.java: From line 67 - line 128. InhousePartForm: From lines 25 - 31. OutsourcedPartForm: From Line 25 - 31. AddInhousePartController.java and OutsourcedPartController.java: From line 43 - line 46.
Change: In the Part.java file on line 33 and 34, I added the max and min inventory fields to the part entity. On line 57 and 58 I added the max and min inventory to the constructor. From 119 to 131 I added getter and setter methods for the min and max inventories.
In the Bootstrap.java file, I updated each of the parts to include a minimum inventory and a maximum inventory.
In both inhouse and outsourced part forms html files, I added inputs for the maximum and minimum inventories.
The database was renamed to gsd287. This can be seen on line 6 of the application.properties file.
For both AddInHousePartController and AddOutsourcedPartController, I added an if statement in the submitform methods to check if the inv is equal to or between the max and min inventory amounts, if there is not an error appears in the form. This is seen on line 43 - line 46 on both pages.

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:

•   Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

•   Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

•   Display error messages when adding and updating parts if the inventory is greater than the maximum.
File Name:
Line Number:
Change:

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
File Name:
Line Number:
Change:

J.  Remove the class files for any unused validators in order to clean your code.
File Name:
Line Number:
Change: