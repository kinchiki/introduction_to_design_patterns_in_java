package ch01;

// 自作　Iterator は使わない
import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
