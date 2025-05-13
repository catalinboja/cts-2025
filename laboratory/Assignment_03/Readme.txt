Drone Link Assignment – Structural Extensions

Extend the existing Drone Link system (which manages drone connections and modules) with the following new requirements. 

Base type for all drone sensor modules is the given AbstractModule abstract class.


New Functional Requirements

8. Third-Party Sensor Integration
Incorporate a thermal-sensing component from a vendor library whose interface (SpectrumThermalInterface) does not match our existing module interface. Provide a class that adapts the vendor’s API so it can be used interchangeably with other modules.

9. Runtime Module Logging
Enable runtime logging for selected modules (e.g. camera, GPS). When a module is activated or deactivated, log a timestamped message without modifying the module’s original implementation.

10. Simplified Mission Control
Offer a single entry point for starting and stopping drone missions. This entry point should handle: establishing the drone connection, loading all configured modules, performing pre-flight checks, and initiating or shutting down the mission.

11. Grouped Sensor Management
Allow multiple sensor modules (e.g., camera, LIDAR, night-vision) to be treated as a single unit. Users should be able to add or remove sensor modules from the group and then activate or deactivate the entire group with one command.

12. Shared AI Resources
Your AI navigation modules use large parameter data sets. Create a factory that reuses shared parameter data in memory, while allowing each drone to have its own lightweight module instance with customized settings.

13. Remote Service Access
All interactions with external microservices (e.g., weather, no-fly zones) should go through a middle layer component. This component must lazily initialize the HTTP client and cache recent responses in memory for a short duration. All external microservices extend ExternalMicroservice abstract class.
Hints


1.      Given classes are available on GitHub at https://github.com/catalinboja/cts-2025/tree/main/laboratory/Assignment_03

2.      You can implement Lazy or Eager solutions. You can choose between them or implement both versions in 2 different solutions

3.      The solution must comply to SOLID, DRY, KISS, YAGNI principles.

4.      The solution must be Clean

5.      The solution must be compiler errors free

6.      Each pattern is implemented in its own subpackage according to the seminar approach. Each subpackage also contains a Readme.txt text file with:

the name of the pattern
advantages for the solution (2-3 bullets)
disadvantages (2-3 bullets)
7.      Each pattern is tested in a TestPatternName.class file inside each package. Each test must create several objects in order to show the way the pattern is used

8.      The parent package in which you work has the name name.surname.gNrGroup (like popescu.alexandru.g1068)

9.      The solution is loaded in a .zip file that contains the root of the main package (the directory in src/)