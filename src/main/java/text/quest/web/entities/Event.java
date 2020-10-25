package text.quest.web.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
