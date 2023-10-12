# Reflection on my Intended Design
Follow the instructions and write the report in this file.
## Are there any classes missing in your design, why/why not?
as this classes are given in the assignment with their description i.e Game, Board, Tile, StartTile.FreeTile, PropertyTile, Player, Dice and UserInterface i did not reduced classes any class from them in my diagram 
## Did you have any extra classes in your design, why/why not?
as these classes are given in the assignment with their description i.e Game, Board, Tile (abstract), StartTile.FreeTile, PropertyTile, Player, Dice and UserInterface therefore most of the classes are the same. but i have added one class to call the main method and i have called it gameLauncher. this class uses to make an aggregation relationship with the game class. this allows it to create an object from the game class and call all the  methods i the game classes to launch the program
## Are there differences in naming the classes? How should classes be named?
The naming conventions used in my class diagram and the naming convention provided are quite similar, but there are some minor differences:
Instead of "human player," my class diagram simply uses "Player," which could represent both human and computer players.
Both my naming conventions and the given class diagram naming convention use "Player" and "Board" as class names, which is consistent with the prompt.
My class diagram uses "StartTile," "FreeTile," and "PropertyTile" for the different types of tiles, whereas the given diagram uses "start," "free," and "property." I think Both naming conventions are clear and descriptive, but still "StartTile," "FreeTile," and "PropertyTile" are more specific and descriptive of the tile's purpose.
My class diagram uses "UserInterface" as the name for the console UI class, whereas the given class naming convention uses "console ui." Both naming conventions are clear, but "UserInterface" is more specific and descriptive.
## Are there differences in the relations between the classes?
Yes, there are differences in the relationships between the classes in the class diagram. Here are some examples: 
Association: An association is a relationship between two classes where one class is connected to another class in some way. In the class diagram, the Board class has an association with the Tile class, which indicates that the Board class needs to keep track of the tiles on the game board. 
Dependency: A dependency is a relationship between two classes where one class depends on another class for a specific operation or piece of functionality. In the class diagram, The Player class has a dependency on the Tile class because it needs to interact with tiles to buy or sell properties and pay rent. The Player class uses methods of the Tile class, such as getOwner(), setOwner(), and getRent(), to determine the owner of a property and calculate the rent to be paid.
Inheritance: Inheritance is a relationship between two classes where one class is a subtype or specialization of another class. In the class diagram, the StartTile, FreeTile, and PropertyTile classes are all subtypes of the Tile class. This indicates that they inherit properties and methods from the Tile class, but also have their own specific properties and methods.
These different types of relationships between the classes in the class diagram help to clarify the structure and behavior of the system, and can be useful in designing and implementing the game.
## Did you connect the objects using dependency/association or did you use id-connections?
In the class diagram, I used both dependencies and associations to connect the objects. A dependency is used to show that one object relies on another object for a specific operation or piece of functionality, whereas an association is used to show a more general relationship between objects.
For example, in the class diagram, property start and free tiles are dependent on tile class i noticed latter that i had to use broken arrow to represent that but i used full line arrow.The Board class also has an association with the Tile class because it needs to keep track of the tiles on the game board.
So in summary, I used both dependencies and associations to connect the objects in the class diagram, depending on the type of relationship between the objects.
I did not use ID-connections in the class diagram. ID-connections are a notation in UML that allow objects to be uniquely identified by a number or ID. However, in this case, I did not see a need to use ID-connections since the relationships between objects could be shown using associations and dependencies.


## Did you manage to divide the complexity/behavior into different classes or do you have one central class having most of the code?
Yes, the design presented in the class diagram and the answers to the previous questions attempts to divide the complexity and behavior into different classes. Each class has a specific responsibility and a limited set of methods that relate to that responsibility.
The Board class manages the game board and the movement of players. It has methods for moving players, determining the current tile a player is on, and applying the effects of a tile.
The Player class represents a player in the game and has methods for moving the player, checking the player's balance, and buying or selling properties.
The Tile class and its subclasses represent different types of tiles on the game board and have methods for applying their specific effects, such as collecting rent or allowing a player to buy the property.
The Dice class generates random values for the dice when rolled.
Board class: manages the game board and its tiles, handles player movement based on dice rolls, determines the effects of a tile when a player lands on it.
Player class: represents a player in the game, can move around the board, buy or sell properties, receive and pay money.
Tile class and subclasses: represent different types of tiles on the game board, have specific effects on the player such as adding money or collecting rent.
Dice class: generates random values for the dice when rolled.
By breaking down the game functionality into separate classes, the code becomes more organized and easier to manage. Each class has a specific role and set of methods to accomplish its responsibilities, making it easier to add new features or modify existing ones in the future.

## What differences are there for the object diagram?
Both the given object diagram and my object diagram have nine objects and a line is used to connect the objects. This makes them similar. Apart from that, of course the name of the object is different . As the class diagram is different, these object diagrams are different. The method calls are also different. the types of the objects are also different 
Relationships between objects: The relationships between objects may be different, depending on the types of objects and the methods used in the program.
The attributes and values of the objects in the diagram are different, that is based on the properties of the objects in the program.
The method invocations between the objects are different, that is based on the methods implemented in the classes used in the program.
## What differences are there for the sequence diagram?
The given sequence diagram has all the objects. Unlike that, my sequence diagram has few objects.  
The participants shown in the sequence diagrams are different, based on the classes used in the program. 
The messages exchanged between objects differ, which is based on the specific methods used in the classes of the program. The sequence of messages is also different, which is based on the order of method invocations in the program.
Lifelines: The lifelines of the objects shown in the sequence diagrams is also different, as it is based on the specific classes used in the program and the timing of the method invocations.
The timing of the interactions between objects looks different also, which is the specific implementation of the classes in the program.
## Do you think you made a good job in your initial design, why/why not?
I do not feel I have done a super good job as it is my first time. especially with the sequence diagram. it could have been better if i had put more objects and showed more complexity in it.  In the class diagram I did not use the right arrows to show the relationship of the classes. I would say the object diagram is a good one and the class diagram is also a good one except the aforementioned thing. I still feel it is a good one and I am happy. 
## What is the most important thing you learned by designing first?
The importance of defining clear requirements: By defining clear requirements at the outset of the project, i may  avoid scope creep and ensure that the system meets the needs of its intended users.
The value of documentation: this is the most important thing that i learnt . By documenting my design decisions and system requirements, I may be able to ensure that others get a clear understanding of the system and its functionality. as only looking at long code does not show a clear picture like designing does 
By breaking down the system into smaller, more manageable modules, I can simplify the design process and make it easier to maintain and update the system over time.
By testing the system early and often, I can identify and fix bugs and errors before they become major issues. this is possible when i have a design 
By iterating on the design and testing process, I can refine and improve the system over time, ensuring that it meets the needs of its intended users and functions as expected. by going back and forth with to the code