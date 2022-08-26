package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext473Application;
import untitled.domain.E;

@Entity
@Table(name = "A_table")
@Data
public class A {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        E e = new E(this);
        e.publishAfterCommit();
    }

    public static ARepository repository() {
        ARepository aRepository = BoundedContext473Application.applicationContext.getBean(
            ARepository.class
        );
        return aRepository;
    }
}
