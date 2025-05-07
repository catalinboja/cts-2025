1. In order to allow other companies or players to develop external solutions that connect to the game, 
a library (an API) must be developed.
- The API contains many classes with many details
- not all classes are documented
- The API should provide a simplified interface for a set of basic functions

2. To efficiently manage (from a memory point of view) scenarios in which players interact with multiple computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations


3. Create the possibility that the players and the game should be able to handle groups of characters
- multiple players or NPCs can be grouped together
- groups can grow by including other groups or individual characters
- some characters can control groups