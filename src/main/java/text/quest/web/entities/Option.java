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
@Table(name = "options")
public class Option {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "text")
    String text;

    @Column(name = "next_event_id")
    Integer nextEventId;
}
