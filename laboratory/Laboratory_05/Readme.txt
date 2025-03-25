The problems


1. The solution needs a logging mechanism based on files and
in order to avoid exceptions by trying to open the same log file multiple times,
is required a class that will allow developers to log messages and use the same unique file.
The logging class must allow developers to use the same unique object.

Because creating the log file requires time, the solution must create the log file object as soon as possible, during boot. (EAGER INSTANTIATION)

The log class implements the ILogging interface (given)

2. In time, you realize that you need multiple unique log files for errors, info, status, etc updates.

3. In many scenarios the game is creating multiple identical (same attributes) objects for different 3D models. It has been observed that creating
each object individually takes a lot of time to get the entire collection. A better solution must be implemented.