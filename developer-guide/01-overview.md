<table>
    <tr>
        <td>
        <td>
    </tr>
</table>

---
# Project Overview
Reference-Template contain examples of design pattern

### Conditional Design Pattern
   1. <b>Factory method</b>
      * The Factory Method pattern suggests replace 
        - direct object construction calls (using the new operator) with 
        - calls to a special factory method.
      * Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method.
      * Objects returned by a factory method are often referred to as products.
      * The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.
      * For example, to add a new product type to the app, you’ll only need to create a new creator subclass and override the factory method in it.
      * Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support. 
      * Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
### Structural Design Pattern
### Behavioural Design Pattern

