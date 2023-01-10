import java.util.List;

class User {

  int id;
  String name;
  List<Issue> Assigned;
  List<Issue> Reported;
  List<SubTask> subtasks;
  
  User(int id, String n,List<Issue> Assigned, List<Issue> Reported, List<SubTask> subtasks) {
    this.id = id;
    this.name = n;
  }

  int getID() {
    return id;
  }

  String getName() {
    return name;
  }

  void setAssignedWork(List<Issue> assignedworks)
  {
    this.Assigned = assignedworks;
  }

  void setReportedWork(List<Issue> rworks)
  {
    this.Reported = rworks;
  }

  List<SubTask> getSubTaskList()
  { 
    return subtasks;  
  }


  void setSubTask(SubTask subTask)
  {
    getSubTaskList().add(subTask);
  }

}