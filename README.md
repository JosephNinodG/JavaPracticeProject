# JavaPracticeProject
A repo to store all files relating to practice Java work

This project is to design and construct an application with a GUI that will permit users to find the fastest route between any two train stations, ignoring the time taken to travel between platforms.
The interface should allow the user to indicate that particular lines have been closed and/or that particular stations are out of service. The algorithm should adjust to such circumstances. Usability is an important consideration.

The csv files:
1. londonstations.csv contains a list of London Underground Stations with the important data attributes id, name and total_lines, together with other attributes.
2. londonlines.csv contains the attributes line_id and name, again with other less important attributes from the perspective of this assignment.
3. londonconnections.csv contains the from and to station ids of all connections between 'adjacent' stations with additional attributes line_id and time (in minutes).

Project will implement Dijkstra's shortest path algorithm.
