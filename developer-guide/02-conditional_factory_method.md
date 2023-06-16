<table>
    <tr>
        <td><a href="01-overview.md">Home</a>
        <td>
    </tr>
</table>

---

### Conditional Design Pattern
1. <b>Factory method</b> (a.k.a. Virtual Constructor)
   #### Problem:
   Imagine creating a logistics management application while in the first version only supports transportation through Trucks.</br>After some time it need to support transportation through Ships.
   <br>But now as the code is coupled to Trucks class, adding new class to the program isn’t that simple.
   ![factory-method](./image/factory-method.png)
    * The Factory Method pattern suggests replace
        - direct object construction calls(using the new operator) with
        - calls to a special factory method.
    * Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method.
    * Objects returned by a factory method are often referred to as products.
    * The Factory Method separates product construction code from the code that actually uses the product. Therefore it’s easier to extend the product construction code independently from the rest of the code.
    * For example, to add a new product type to the app, you’ll only need to create a new creator subclass and override the factory method in it.
    * Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
    * Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
