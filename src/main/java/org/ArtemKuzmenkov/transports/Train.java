package org.ArtemKuzmenkov.transports;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("3") // 3 - поезд
public class Train extends Transport {
    public Train() {
        this.type = 3;
    }
}
