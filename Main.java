import Model.Issue;
import Model.SubTask;
import Model.User;

import java.util.ArrayList;
class Main {
  public static void main(String args[]) {
    System.out.println("Hello, world!");

    User b = new User(12, "kg",new ArrayList<Issue>(),new ArrayList<Issue>(),new ArrayList<SubTask>());

    User c = new User(13, "kg",new ArrayList<Issue>(),new ArrayList<Issue>(),new ArrayList<SubTask>());
    System.out.println(c.getID());
    b.setSubTask(new SubTask(12,123,"Checking Subtask"));

    System.out.println(b.getSubTaskList().get(0).getDescription());
  

  }
}