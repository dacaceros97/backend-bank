package mybank.mapper;

import mybank.dto.AccountDto;
import mybank.entity.Account;

public class AccountMapper {

//Using a normal dto
//	public static Account mapToAccount(AccountDto accountDto) {
//		Account account = new Account(
//				accountDto.getId(),
//				accountDto.getAccountHolderName(),
//				accountDto.getBalance()
//				);
//		
//		return account;
//	}
	
	//using a record
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.id(),
				accountDto.accountHolderName(),
				accountDto.balance()
				);
		
		return account;
	}
	
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				);
		
		return accountDto;
	}
}
