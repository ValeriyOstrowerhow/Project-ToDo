import java.time.LocalDate;

public class Task implements Comparable<Task> {

  private String name;
  private LocalDate createdDate;
  private LocalDate finalDate;
  private boolean complete;

  public Task(String name, LocalDate finalDate, Boolean complete) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("NO CORRECT" + name);
    }
    if (finalDate == null || finalDate.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("NO CORRECT");
    }
    this.name = name;
    this.finalDate = finalDate;
    this.createdDate = LocalDate.now();
    this.complete = complete;
  }

  public Task(String test, LocalDate date) {
  }

  public String getName() {
    return name;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public LocalDate getFinalDate() {
    return finalDate;
  }

  public boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean status) {
    this.complete = status;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setFinalDate(LocalDate newDate) {
    this.finalDate = newDate;
  }

  @Override
  public String toString() {
    return
        name + "," + createdDate + "," + finalDate + "," + complete;
  }

  @Override
  public int compareTo(Task other) {
    return finalDate.compareTo(other.finalDate);
  }
}
