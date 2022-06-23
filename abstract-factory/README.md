# Abstract Factory

Abstract Factory is used to provide a family of classes that interact with each other, also keeping isolation between other families and products.  
In this example we want to build classes for a simple RPG game. Each class has it own kind of weapon and armor.  
Making a parallel with the Abstract Factory theory, the RPG classes are the families, and the weapons and armors are the products.   
The participants of our code are:
- AbstractFactory (ClassFactory)
- ConcreteFactory (MageFactory, RangerFactory, WarriorFactory)
- AbstractProduct (Armor, Weapon)
- ConcreteProduct (MageArmor, MageWeapon, RangerArmor, RangerWeapon, WarriorArmor, WarriorWeapon)
- Client (ClassClient)