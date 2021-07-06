Object-Oriented Programming Concepts are very important. Without having an idea about OOPS
concepts, you will not be able to design systems in the object-oriented programming model. In this
part, you are required to develop several classes for different uses. For each class, you must develop
accessors and mutators;


## Base classes:

    ++ Person
      ++ attributes: givenName (String), lastName (String), age (int), gender (String), citizenship (String)

    ++ Shape
      ++ attributes: width (double), height (double), radius (double), length (double)
    
    ++ Book
       ++ attributes: title (String), year (int), publish (String), pages (int)
    
    ++ Animal
      ++ attributes: name (String), weight (double), favouriteFood (String), age (int)


## Extended class
  +Person 

    ++ Student
      +++ attributes: marks (double []), disciplines (String [])
      +++ methods: averageMarks(), displayDisciplines ()

    ++ Lecturer
      +++ attributes: salary (double), disciplines (String [])
      +++ methods: annualSalary(), displayDisciplines ()
    
    ++ Doctor
       +++ attributes: speciality (String)

    ++ Patient
       +++ attributes: diagnostic (String); inTime (String); prevTime (String)
       
      
  +Shape 

    ++ Rectangle
      +++ methods: area()

    ++ Circle
      +++ methods: area()
    
    ++ Triangle
       +++  methods: area()

      
  +Book 

    ++ EBook
      +++ attributes: url (String)

    ++ PhysicalBook
      +++ attributes: shelf (int), aisle (int), floor (int)
      +++ method: displayBookLocation()

 
 +Animal 

    ++ Lion
      +++ methods:  makeSound()

    ++ Turtle
      +++ methods:  makeSound()
    
    ++ Chameleon
       +++  methods:  makeSound()

**Vehicle Class Constraints**
----------------------------------------------------------------------------------------
+Interface Class:
  
    + Vehicle
       ++ methods: changeGear (double), checkBreak (double)
     
+Abstract Class
    
    + VehicleAbstract
     ++ attributes: color, year, numberGears

+Base Class
  
    + Bicycle
      ++ attributes: is_serviced (bool), inDate (String), outDate (String), serviceResponsible (String)
      ++ methods: checkoutService()

+Children Classes
 
    + Electric Bike
      ++ attributes: battery;
      ++ methods: chargeBike();
  
    + MountainBike
      ++ attributes: suspension (String), forks (string)

    + RoadBike
      ++ attributes: tyres (String)
  
    + Hibrid
      ++ attributes: suspension (String)
