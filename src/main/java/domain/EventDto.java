package domain;

import lombok.Data;

@Data
public class EventDto {
    private int id;
    private String text;
    private Integer nextFirst;
    private Integer nextSecond;

}
