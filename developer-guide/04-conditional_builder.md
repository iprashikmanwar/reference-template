<table>
    <tr>
        <td><a href="01-overview.md">Home</a>
         <td><a href="03-conditional_abstract_factory.md">Prev</a>
         <td><a href="01-overview.md"></a>
    </tr>
</table>

---

### Conditional Design Pattern
3. <b>Builder</b>
   #### Problem:
   Imagine creating a complex object that requires laborious, step-by-step initialization of many fields and nested objects.
   <br>Here the initialization code will have monstrous constructor with lots of parameters. Also, most of the parameters will be used very less, implying this method of creating it quite difficult.   
   ![builder](./image/builder.png)
    * The Abstract Factory pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders. 
    * This pattern organise object construction into a set of steps (buildWalls, buildDoor, etc.)
      <br>To create an object, you only need to execute necessary steps for producing a particular configuration of an object.
    * Then you can create a director class which defines the executing order for building the object. (This step is optional, this code can be written directly in client code)
      <br>This may be a good place to put various construction routines, so we can reuse them across the program.
      <br>Director class can be used to completely hide the details of product construction from the client.
    * With director class, client only needs to associate a builder with a director, launch the construction with the director and get the result from the builder.  
