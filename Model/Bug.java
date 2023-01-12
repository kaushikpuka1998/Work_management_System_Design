package Model;

import java.util.List;

public class Bug extends Issue{

    public Bug(String taskID, TaskStatus taskStatus, String title, String description, List<SubTask> subTasks, Sprint sprint) {
        super(taskID, taskStatus, title, description, subTasks, sprint);
    }
    String  rootcause;
    List<Environment> affectedEnvironment;

    public String getRootcause() {
        return rootcause;
    }

    public void setRootcause(String rootcause) {
        this.rootcause = rootcause;
    }

    public List<Environment> getAffectedEnvironment() {
        return affectedEnvironment;
    }

    public void setAffectedEnvironment(List<Environment> affectedEnvironment) {
        this.affectedEnvironment = affectedEnvironment;
    }
}
