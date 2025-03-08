package org.ArtemKuzmenkov;

import org.ArtemKuzmenkov.cargos.Cargo;
import org.ArtemKuzmenkov.transports.Transport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

    public class HibernateConnect {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        try (SessionFactory sf = cfg.buildSessionFactory(); Session session = sf.openSession()) {

            List<Transport> transports = session.createQuery("FROM Transport", Transport.class).list();
            List<Cargo> cargos = session.createQuery("FROM Cargo", Cargo.class).list();

            for (Cargo cargo : cargos) { // наглядный вывод всех грузов
                System.out.println(cargo);
            }
            Cargo cargo = cargos.getFirst(); //взяли пропан
            System.out.println(cargo + " выбранный груз");
            for (Transport transport : transports) { // наглядный вывод всех транспортов и проверка может ли он перевозить Пропан
                if (transport.canTransferCargo(cargos.getFirst()))
                    System.out.println(transport + " может перевозить газообразные");
                else
                    System.out.println(transport + " не может перевозить газообразные");
            }

        }
    }
}
