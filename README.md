Class: Computer
The Computer class contains the following attributes and methods:

Attributes
brand:



A string representing the brand of the computer (e.g., "HP", "Alienware").
model: A string representing the model of the computer.
processor: A string representing the type of processor in the computer (e.g., "Intel Core i7").
RAM: An integer representing the amount of RAM in gigabytes (GB).


Constructors




Default Constructor: Initializes a new Computer object with no specified values (all attributes are left unset).
Parameterized Constructor: Initializes a new Computer object with specified values for brand, model, processor, and RAM.
Methods
displayInfo(): This method prints out the details of the computer in a formatted manner. It checks whether each attribute has a value and only prints the non-empty attributes.
upgradeRAM(int additionalRAM): This method takes an integer value representing the amount of RAM to be added. It checks if the input value is valid (greater than 0) and updates the RAM accordingly, then displays a confirmation message.



Main Method



The main method is used for testing the Computer class:

It creates instances of Computer using both the default and parameterized constructors.
It calls displayInfo() on each instance to print their details.
It demonstrates the RAM upgrade functionality by calling upgradeRAM() on one of the instances.
















UML diagram picture:



<img width="685" alt="Снимок экрана 2024-09-20 в 19 18 18" src="https://github.com/user-attachments/assets/4fc6721e-a0e9-4bd7-883c-7b4b9f149661">
