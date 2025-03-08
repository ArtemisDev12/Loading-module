package org.ArtemKuzmenkov.transports;

import jakarta.persistence.*;
import org.ArtemKuzmenkov.cargos.Cargo;
import org.ArtemKuzmenkov.cargos.Gasiform;

@Entity
@DiscriminatorValue("1") // 1 - самолёт
public class Airplane extends Transport {
    public Airplane() {
        this.type = 1;
    }
    @Override
    public boolean canTransferCargo(Cargo cargo) {
        return !(cargo instanceof Gasiform);
    }
}
