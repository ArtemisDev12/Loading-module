package org.ArtemKuzmenkov.transports;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("2") // 2 - корабль
public class Ship extends Transport {
    public Ship() {
        this.type = 2;
    }
}
