package Model;

import java.util.List;

public class Sprint {
    int id;
    String name;
    String Description;

    List<Issue> issues;

    public Sprint(int id, String name, String description, List<Issue> issues) {
        this.id = id;
        this.name = name;
        Description = description;
        this.issues = issues;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
