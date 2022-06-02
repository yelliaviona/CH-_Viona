package repository;

import java.util.HashMap;
import java.util.List;

public interface ReadFileRepository {
    Integer getMode();
    Double getAverage();
    double getMedian();
    HashMap<Integer, Integer> getCountWithBounding();
    int getGreaterThan(Integer input);
    int getEqual(Integer input);
    int getLessThan(Integer input);

}