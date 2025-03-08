package org.ArtemKuzmenkov.transports;

import jakarta.persistence.*;
import org.ArtemKuzmenkov.cargos.Cargo;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "transport")
public abstract class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 256)
    private String name;

    @Column(insertable=false, updatable=false)
    protected int type;

    public boolean canTransferCargo(Cargo cargo) {
        return true;
    }

    @Override
    public String toString() {
        return "Название: " + name.trim() + " Тип: " + this.getClass().getSimpleName();
    }
}
