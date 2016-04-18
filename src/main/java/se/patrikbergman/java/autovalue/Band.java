package se.patrikbergman.java.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Band {
    static Band create(String name, int rockFactor) {
        return new AutoValue_Band(name, rockFactor);
    }
    abstract String name();
    abstract int rockFactor();
}
