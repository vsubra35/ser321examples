<<<<<<< HEAD
# Running the examples #
This is a multi project gradle setup. 

Meaning each project has its own gradle file but there is one setting file and overall grading file so you can run things from the example folders or from the top level folder. 

In the top level folder: 
 - gradle projects
 ==> gives you a list of projects

You can run a project through:
 - gradle projectname:taskname
 - e.g. gradle Deadlock:run

Deadlock
  - gradle Deadlock:run

FileCopy
  - gradle FileCopy:run

FirstThread
  - gradle FirstThread:run
    - gradle FirstThread:run --args '5 5'

MusicThread
  - gradle MusicThread:run

Synchronization
  - gradle Synchronization:run
    - gradle Synchronization:run --args '5 5'
  - gradle Synchronization:SynchExample2
    - gradle Synchronization:SynchExample2 --args '5 40'

ThreadsShareData
  - gradle ThreadsShareData:run
    - gradle ThreadsShareData:run --args '5 5'

=======
# Running the examples #

The examples in this folder mainly concern threads but also use sockets and other things that were in previous modules. 

Each project has its own Gradle file and Readme, please check these for further information on the projects. 


>>>>>>> d49c65be412094b4d8c809d39820453954fdfcef
