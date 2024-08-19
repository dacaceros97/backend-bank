package mybank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mybank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
