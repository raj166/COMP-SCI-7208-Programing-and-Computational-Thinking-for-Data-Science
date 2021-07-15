# Introduction 
  
    Solitaire is a card game that you play against yourself. When you play solitaire you either win or you
    lose. Solitaire players are very organised. As a result the Australian Solitaire Players Federation is
    also very organised. In this exam you are going to write code to help keep them organised by
    answering the three questions below.

## Question 1 - a Person class

    Define a Java class to represent a person in a file called Person.java. A Person has the following
    
    Attributes:
    
        a name represented as a single string e.g. "Jessica Long"
        an age represented as an integer e.g. 35

    Methods:
    
        a constructor with no parameters that sets the name to be "anon" and the age to be 0.
        a constructor with parameters representing the person's name and age that sets the name and
        age of the person.
        an accessor method called getName() that returns the name of the person.
        an accessor method called getAge() that returns the age of the person.
        a void method called setName() which takes a String parameter representing this person's name
        and sets this person's name.
        a void method called setAge() which takes an integer representing this person's age and sets this
        person's age.
        a public toString() method which returns a String with the contents: "Person: " followed by the
        person's name followed by " is age: " followed by the person's age.

## Question 2 - a Player class:

      The Australian Solitaire Players Federation keeps track of all registered solitaire players in Australia.
      This is so they can help organise clubs and work out player rankings. Write a Java class to represent
      a solitaire Player. This class should extend the Person class from question 1 and have at least the
      following additional attributes:
      
      Attributes:
      
          1)  An integer id representing the unique identifier for this player. When a new Player object is
              created they will get the next available id. To keep track of the next available id you might need a
              static variable in this class. Note that the very first player id is 1.
          2)  An integer numWins that represents the number of wins this player has had in their career.
          3)  An integer numPlayed that represents the number of times a player has played Solitaire in their career.
     
              Note that due to a quirk in the scoring of Solitaire it is possible for players to count more wins
      than games played! (it's due to a weird historical rule - nobody remembers why) Of course because Player extends Person, 
      Players also automatically have the name and age attributes of Person. 
      
      Player class Attributes:
           
           1) A constructor that takes parameters representing the player's name. 
           2) Players age.
           3) Number of wins the player has had. 
           4) Number of times the player has played. 
      
      This constructor should then initialise the name and age (in the super class) and also initialise numWins and
      numPlayed and the player id. 
      
      Note: you might also need to update the static variable.
      
     Player class Methods :
     
        1) A void method called win() that takes no parameters and increments the number of wins and the
           number of games played by this player.
      
        2) A void method called lose() that takes no parameters and just increments the number of games
           played.
      
        3) A method called getRanking() that takes no parameters and returns an integer value representing 
           this player's ranking score. This score is calculated as: numPlayed times ( numWins / numPlayed)
         
        4) A method called getId() that just returns the integer id of this player.
          
        5) A public toString() method which returns the String representing the person's attributes
        concatenated with "Id: " followed by the player's id and then " Ranking: " followed by the player's
        ranking.

      Note that all the calculations above are done with integers. This means that (due to rounding) the
      ranking is not always the same as numWins. Note that this scoring calculation is unconventional
      (its related to the quirk described above) but the calculation above faithfully implements the
      conventions of the Solitaire Federation. 
      Note also that if a player has played zero times getRanking should just return zero.
      
  ## Question 3 - a Club clas
      
     Last but not least, write a Java class file called Club.java that represents a solitaire club. A club
     keeps track of its members. Members can belong to more than one club (the Solitaire Players
     Federation is organised but not jealous!).
     
     Your class should have the following attribute:
      1) A collection to contain Players called members
      
     Methods:
      1) addMember a void method that takes a member as a parameter and adds the member to its
         collection of members.
      2) A boolean method called removeMemberById which takes an integer parameter representing
         the id of a Player and tries to remove a player with that id from its collection of members. If the
         removal is successful this method should return true. If the player can't be found then this method
         should return false.
       3) A method called getHighestRankedPlayer that returns the Player in the club that has the highest
         ranking. Note that if more than one player has the equal highest ranking the player who was
         added to the club most recently will be the one returned. If the club is empty this method should
         return null.
       4) A method called printMembers() that calls toString on each Player in the club to print out all the
         members in the order in which they were added.

