package org.ArtemKuzmenkov.cargos;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "cargo")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 256)
    private String name;

    @Column(name = "type", insertable = false, updatable = false)
    protected int type;

    @Override
    public String toString() {
        return "Название: " + name.trim() + " Тип: " + this.getClass().getSimpleName();
    }
}
