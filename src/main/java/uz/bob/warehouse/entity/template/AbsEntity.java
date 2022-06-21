package uz.bob.warehouse.entity.template;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private boolean active=true;
}
