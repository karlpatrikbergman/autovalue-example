
package se.patrikbergman.java.autovalue.basic;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Band extends Band {

  private final String name;
  private final int rockFactor;

  AutoValue_Band(
      String name,
      int rockFactor) {
    if (name == null) {
      throw new NullPointerException("Null name");
    }
    this.name = name;
    this.rockFactor = rockFactor;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  int rockFactor() {
    return rockFactor;
  }

  @Override
  public String toString() {
    return "Band{"
        + "name=" + name + ", "
        + "rockFactor=" + rockFactor
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Band) {
      Band that = (Band) o;
      return (this.name.equals(that.name()))
           && (this.rockFactor == that.rockFactor());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.name.hashCode();
    h *= 1000003;
    h ^= this.rockFactor;
    return h;
  }

}
