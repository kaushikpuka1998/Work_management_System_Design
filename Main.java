import Model.*;

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String args[]) {
    System.out.println("Hello, world!");

    User b = new User(12, "kg",new ArrayList<Issue>(),new ArrayList<Issue>(),new ArrayList<SubTask>());

    User c = new User(13, "kg",new ArrayList<Issue>(),new ArrayList<Issue>(),new ArrayList<SubTask>());
    System.out.println(c.getID());
    b.setSubTask(new SubTask(12,123,"Checking Subtask"));

    System.out.println(b.getSubTaskList().get(0).getDescription());

    List<SubTask> bug1subtask = new ArrayList<>();
    Sprint sprint1  = new Sprint(1,"TT_13_01_2022","JANUARY SPRINT",new ArrayList<>());
    Issue bug1 = new Bug("BUG01", TaskStatus.ASSIGNED, "MWEB PENDING PAGE", "SOME ISSUE FOUND", bug1subtask,sprint1);
    Issue bug2 = new Bug("BUG02", TaskStatus.ASSIGNED, "DWEB PENDING PAGE", "SOME ISSUE FOUND IN DWEB PAGE", bug1subtask,sprint1);
    List<Issue> issues = new ArrayList<>();
    issues.add(bug1);
    issues.add(bug2);
    sprint1.setIssues(issues);


    System.out.println("Sprint ID:"+sprint1.getId()+"======="+sprint1.getDescription());
    System.out.println("===============================================");

    for(int i=0;i<sprint1.getIssues().size();i++)
    {
      System.out.println(sprint1.getIssues().get(i).getTitle()+"====="+sprint1.getIssues().get(i).getTaskID()+"===="+sprint1.getIssues().get(i).getTaskStatus());
    }
  

  }
}