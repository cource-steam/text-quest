package entity.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "text")
    String text;

    @Column(name = "next_first")
    Integer nextFirst;

    @Column(name = "next_second")
    Integer nextSecond;
}
