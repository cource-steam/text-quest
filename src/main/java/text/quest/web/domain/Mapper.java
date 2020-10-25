package text.quest.web.domain;

public interface Mapper<From, To> {

    To mapImpl(From item);
}
