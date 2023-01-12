import java.util.List;

class Issue{
    String taskID;
    TaskStatus taskStatus;
    String Title;
    String Description;
    List<SubTask> subTasks;
    Sprint sprint;

    public Issue(String taskID, TaskStatus taskStatus, String title, String description, List<SubTask> subTasks, Sprint sprint) {
        this.taskID = taskID;
        this.taskStatus = taskStatus;
        Title = title;
        Description = description;
        this.subTasks = subTasks;
        this.sprint = sprint;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
}