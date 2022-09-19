package bera31.Project.domain.page;


import bera31.Project.domain.comment.Comment;
import bera31.Project.domain.member.Member;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Contents {
    @Id @GeneratedValue
    @Column(name = "CONTENTS_ID")
    Long id;
    String title;

    @OneToMany(mappedBy = "contents")
    List<Comment> comments = new ArrayList<>();
    LocalDateTime postTime;
}
