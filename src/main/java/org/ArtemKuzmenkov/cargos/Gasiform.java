package org.ArtemKuzmenkov.cargos;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("1") // 1 - газообразные
public class Gasiform extends Cargo {
    public Gasiform() {
        this.type = 1;
    }
}
