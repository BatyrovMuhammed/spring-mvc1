package web.models;


import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    private long id;
    private String carName;
    private int whatYear; // kanchanchy jyly chykkan
    private String mark;

}
