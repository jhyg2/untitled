package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class E extends AbstractEvent {

    private Long id;

    public E(A aggregate) {
        super(aggregate);
    }

    public E() {
        super();
    }
    // keep

}
