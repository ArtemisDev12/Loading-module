package org.ArtemKuzmenkov.cargos;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("2") // 2 - текучие
public class Fluid extends Cargo {
    public Fluid() {
        this.type = 2;
    }
}
