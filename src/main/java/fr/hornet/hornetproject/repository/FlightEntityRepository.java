package fr.hornet.hornetproject.repository;

import fr.hornet.hornetproject.entities.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightEntityRepository extends JpaRepository<FlightEntity, String> {
}