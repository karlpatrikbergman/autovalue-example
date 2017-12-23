
package se.patrikbergman.java.autovalue.builder;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Band extends Band {

  private final String name;
  private final int rockFactor;

  private AutoValue_Band(
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

  static final class Builder extends Band.Builder {
    private String name;
    private Integer rockFactor;
    Builder() {
    }
    Builder(Band source) {
      this.name = source.name();
      this.rockFactor = source.rockFactor();
    }
    @Override
    public Band.Builder name(String name) {
      this.name = name;
      return this;
    }
    @Override
    public Band.Builder rockFactor(int rockFactor) {
      this.rockFactor = rockFactor;
      return this;
    }
    @Override
    public Band build() {
      String missing = "";
      if (name == null) {
        missing += " name";
      }
      if (rockFactor == null) {
        missing += " rockFactor";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Band(
          this.name,
          this.rockFactor);
    }
  }

}
