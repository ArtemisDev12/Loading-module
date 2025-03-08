package org.ArtemKuzmenkov.cargos;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("3") // 3 - сыпучие
public class Loose extends Cargo {
    public Loose() {
        this.type = 3;
    }
}
