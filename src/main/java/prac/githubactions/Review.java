package prac.githubactions;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    private LocalDateTime createDate;

    private String reviewContent;

    private float userPointNumber;

    private int likeCount;
}
