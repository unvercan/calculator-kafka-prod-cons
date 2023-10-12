package tr.unvercanunlu.calculator_kafka_producer_consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.unvercanunlu.calculator_kafka_producer_consumer.model.entity.Calculation;

import java.util.UUID;

@Repository
public interface ICalculationRepository extends JpaRepository<Calculation, UUID> {
}