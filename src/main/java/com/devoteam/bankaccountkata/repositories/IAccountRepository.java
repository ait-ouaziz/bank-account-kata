package com.devoteam.bankaccountkata.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.devoteam.bankaccountkata.models.Account;
import com.devoteam.bankaccountkata.models.Transaction;

@Repository
public interface IAccountRepository extends CrudRepository<Account, String> {

	@Query("SELECT t FROM Transaction t where t.account.accountId = (:accountId) and t.date >= startDate and t.date <= endDate")
	public List<Transaction> findByAccountIdAndDate(@Param("accountId") String accountId,
			@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}