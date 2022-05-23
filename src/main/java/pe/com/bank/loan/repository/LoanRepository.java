package pe.com.bank.loan.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import pe.com.bank.loan.entity.LoanEntity;

@Repository
public interface LoanRepository extends ReactiveMongoRepository<LoanEntity,String> {

}
