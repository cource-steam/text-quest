package text.quest.web.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "text")
    String text;

    @Column(name = "options_first")
    Integer optionFirst;

    @Column(name = "options_second")
    Integer optionSecond;

}
