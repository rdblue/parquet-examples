package netflix.example;

import com.google.common.base.Objects;

public class Pojo {
  private long id;
  private String data;

  public Pojo() {
  }

  public Pojo(long id, String data) {
    this.id = id;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public String getData() {
    return data;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("id", id)
        .add("data", data)
        .toString();
  }
}
