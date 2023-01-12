package Model;

public class SubTask{
  int id;
  int mainTaskid;
  String description;

  public SubTask(int id, int mid, String desc)
  {
    this.id = id;
    this.mainTaskid = mid;
    this.description = desc;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getMainTaskid() {
    return mainTaskid;
  }

  public void setMainTaskid(int mainTaskid) {
    this.mainTaskid = mainTaskid;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}