import java.util.List;
import java.util.ArrayList;
class Main {
  public static void main(String args[]) {
    System.out.println("Hello, world!");

    User b = new User(12, "kg",new ArrayList<Issue>(),new ArrayList<Issue>(),new ArrayList<SubTask>());
    System.out.println(b.getID());
    b.setSubTask(new SubTask(12,123,"Checking Subtask"));

    System.out.println(b.getSubTaskList().get(0).description);
  

  }
}