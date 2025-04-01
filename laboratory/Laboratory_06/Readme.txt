1. We are developing a game with different characters. Something like space invaders.
We will have different frameworks for
- space objects (planets, moons, meteorites, etc)
- space ship
- aliens
All classes provide different attributes and different constructors (different combinations of parameters)
Provide a solution that will allow devs to create all these things without being dependent on all these details. 
A loose coupling approach (DIP). Future changes related to the creation of different objects should not affect the existing solution.


2. Instantiation of the superhero associated with the player
- there are many attributes to allow its customization
- name, is Positive, points Life, weapon Left Hand, weapon Right Hand, super Power, is Wounded Critical, super Super Power, etc.
- an efficient solution must be found that allows the creation of the superhero without giving values for all the attributes 
but also without allowing the programmers to omit some of them