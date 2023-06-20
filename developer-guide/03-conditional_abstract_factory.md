<table>
    <tr>
        <td><a href="01-overview.md">Home</a>
        <td><a href="02-conditional_factory_method.md">Prev</a>
        <td><a href="04-conditional_builder.md">Next</a>
    </tr>
</table>

---

### Conditional Design Pattern
2. <b>Abstract Factory</b>
   #### Problem:
   Imagine creating a furniture shop application which support family of furniture say Modern, Victorian and products being Chair, Sofa, Coffee Table. <br>Now we need a way to create individual furniture objects so that they match other objects of the same family. Also, you don't want to change existing code when adding new products or families of products to the code. <br>Furniture vendors update their catalogs very often, and we don't want to change the core code each time this it happens.  
   ![abstract-factory](./image/abstract-factory.png)
    * The Abstract Factory pattern suggests to explicitly declare interface for each distinct product of the product family (e.g. chair, sofa, coffee table)
    * Then make all variants of products follow those interfaces (e.g. all chair variants implements Chair interface and so on)
    * Next move is to declare Abstract Factory - an interface with a list of creation methods for all products that are part of the product family (e.g. createChair, createSofa, createCoffeeTable). <br>These methods must return abstract product types represented by the interfaces (e.g. Chair, Sofa, CoffeeTable) here FurnitureFactory 
    * For each variant of a product family, we create a separate factory class based on AbstractFactory interface (here, FurnitureFactory). <br>A factory is a class that returns products of a particular kind. (e.g. ModernFurnitureFactory can only create ModernChair, ModernSofa, ModernCoffeeTable objects.)  
    * The client code should work with both factories and products - via their respective abstract interfaces.<br>Letting the user change the type of factory that he pass to the client code as well as the product variant that the client code receives without breaking the actual client code. 
    * Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
    * Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
