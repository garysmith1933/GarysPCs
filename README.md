<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY
## D287 – JAVA FRAMEWORKS - Gary Smith

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
File Name: mainscreen.html
Line Number: The whole page. Line 14 - 165.
Change: Adjusted mainscreen.html with added products, parts, and shop name

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
File Name: about.html
Line Number: the entire page. I added the navigation to get back to the main page on line 16, added the page title on line 17, and about information on line 18.
Change:

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
File Name:
Line Number:
Change:

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•   The “Buy Now” button must be next to the buttons that update and delete products.

•   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•   Display a message that indicates the success or failure of a purchase.
File Name:
Line Number:
Change:

G. Modify the parts to track maximum and minimum inventory by doing the following:

•   Add additional fields to the part entity for maximum and minimum inventory.

•   Modify the sample inventory to include the maximum and minimum fields.

•   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

•   Rename the file the persistent storage is saved to.

•   Modify the code to enforce that the inventory is between or at the minimum and maximum value.
File Name:
Line Number:
Change:

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