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

UserXML
  -gradle UserXML:run

ClassMigration
  -gradle ClassMigration:runUser
  -gradle ClassMigration:runFileSerialize
    -gradle ClassMigration:runFileSerialize --args 'read'

GroupJson
  -gradle GroupJson:run

GroupSerialize
  -gradle GroupSerialize:run
=======
# Running the examples #
This folder contains projects about serialization. You will see JSON, Java Serialization, XML and ProtocolBuffers in here (module 4 related).

Each project has its own Gradle file and Readme, please check these for further information on the projects. 
>>>>>>> d49c65be412094b4d8c809d39820453954fdfcef
