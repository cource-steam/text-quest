package domain;

import java.util.List;
import java.util.stream.Collectors;

public interface Mapper<From, To> {

    To mapImpl(From item);

    List<To> mapImpl(List<From> item);
}
