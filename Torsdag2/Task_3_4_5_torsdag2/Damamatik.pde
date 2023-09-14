Teacher Teacher1;
Student Student1;
Student Student2;

void setup(){
  
  Teacher1 = new Teacher("Susanne", 99, true);
  Student1 = new Student("Marcus", "Datamatiker B", 22, false);
  Student2 = new Student("Sander", "Datamatiker B", 21, true);
  
  println(Teacher1.name);
  
  //println(Student1.name + " " +  Student1.datamatikerTeam);
  //println(Student2.name + " " +  Student2.datamatikerTeam);
  
  Teacher1.ChangeName("Ole");
  println("Teacher1 new name: " + Teacher1.name);
  
 
  
  boolean mates = isClassmates(Student1, Student2);
  
   if (mates == true) {
    println(Student1.name + " and " + Student2.name + " are classmates ");
  } else {
    println(Student1.name + " and " + Student2.name + " are not classmates ");
  }
  
}

boolean isClassmates(Student a, Student b){
  if (a.datamatikerTeam == b.datamatikerTeam){
    return  true;
  }
  return false;
}
  
