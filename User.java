import java.util.List;

class User {

  int id;
  String name;
  List<Issue> Assigned;
  List<Issue> Reported;
  LIst<SubTask> subtasks;
  
  User(int id, String n) {
    this.id = id;
    this.name = n;
  }

  int getID() {
    return id;
  }

  String getName() {
    return name;
  }

}