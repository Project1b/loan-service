package pe.com.bank.loan.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.com.bank.loan.entity.LoanEntity;
import pe.com.bank.loan.service.LoanService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/v1")
public class LoanController {

    LoanService loanService;

    @GetMapping
    public Flux<LoanEntity> getAllLoan() {
        return loanService.listAllLoan();
    }

    @GetMapping("/getLoan/{id}")
    public Mono<LoanEntity> getCustomerById(@PathVariable String id) {
        return loanService.findLoanById(id);
    }

    @PostMapping("/createLoan")
    public Mono<LoanEntity> addCustomer(@RequestBody LoanEntity loanEntity) {
        return loanService.createLoan(loanEntity);
    }

    @PutMapping("/updateLoan/{id}")
    public Mono<LoanEntity> updateCustomer(@RequestBody LoanEntity loanEntity, @PathVariable String id) {
        return loanService.updateAccount(loanEntity, id);
    }

}
