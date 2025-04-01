The Drone Link Assignment

 

You are a developer for ACME Inc, which produces commercial drones. You are working on the software drone and you need to implement different modules based on next requirements

1.      The drone connection module must allow other developers to connect to the device, but only one unique connection must e created. The connection entity must implement the IDroneConnection interface. Implement the DroneConnection module so developers will not be able to create more than one connection.

2.      In the backend, you need to handle the connection to different microservices REST API, like users’ service, drones service, manufacturing service. Each service has a unique name and an associated URL, based on the AbstractMicroService class. Also, each service accepts only one connection from each client. Implement a class that will handle the micro services unique connections, by extending AbstractMicroService.

3.      The drone can be accessorized with different modules (night vision, GPS tracking, high resolution camera, smart tracking, extra battery, etc). The modules framework extends the AbstractModule class. Because each module has its unique attributes (2-3 more attributes + the ones from AbstractModule) and that might change soon, implement an intermediary layer that will allow other developers to create/use different modules in a simplified way and independent from future changes.

4.      In the end, the Drone class will handle all drone details. Add more attributes to it (at least 4-5) and implement a mechanism that will allow other developers to create efficiently a drone with any combination of modules/attributes, without the possibility of changing it later (once the drone is created, the manufacture process starts, and you can’t change it)

5.      Several drone models are more frequently requested than others. To facilitate the creation of those particular types, implement a catalogue of predefined drones models (with at least 3 types) that will help other developers to instantiate them fast and simple.

6.      You work on an AI module that will be installed on drones to allow them to be autonomous. The class that handles the AI module is AutonomousDriving. In the testing phase many instances of the same version of AI module are created. The current implementation requires a lot of time to instantiate AI entities. Implement a solution that will solve this problem, allowing developers to create fast new AI modules entities.

7.      As there are different versions (at least 2 or 3) of the AI module implement a solution that will allow developers to create fast copies of them.

 

Hints

1.      Given classes are available on GitHub at https://github.com/catalinboja/cts-2023/tree/main/Laboratory/Assignment_02

2.      You can implement Lazy or Eager solutions. You can choose between them or implement both versions in 2 different solutions

3.      The solution must comply to SOLID, DRY, KISS, YAGNI principles.

4.      The solution must be Clean

5.      The solution must be compiler errors free

6.      Each pattern is implemented in its own subpackage according to the seminar approach. Each subpackage also contains a Readme.txt text file with:

-        the name of the pattern

-        advantages for the solution (2-3 bullets)

-        disadvantages (2-3 bullets)

7.      Each pattern is tested in a TestPatternName.class file inside each package. Each test must create several objects in order to show the way the pattern is used

8.      The parent package in which you work has the name name.surname.gNrGroup (like popescu.alexandru.g1068)

9.      The solution is loaded in a .zip file that contains the root of the main package (the directory in src/)

