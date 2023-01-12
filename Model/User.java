package Model;

import java.util.List;

public class User {

  int id;
  String name;
  List<Issue> Assigned;
  List<Issue> Reported;
  List<SubTask> subtasks;
  
  public User(int id, String n, List<Issue> Assigned, List<Issue> Reported, List<SubTask> subtasks) {
    this.id = id;
    this.name = n;
    this.Assigned = Assigned;
    this.Reported = Reported;
    this.subtasks = subtasks;
  }

  public int getID() {
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

  public List<SubTask> getSubTaskList()
  { 
    return subtasks;  
  }


  public void setSubTask(SubTask subTask)
  {
    getSubTaskList().add(subTask);
  }

}