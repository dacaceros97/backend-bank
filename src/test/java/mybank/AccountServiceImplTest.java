package mybank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import mybank.dto.AccountDto;
import mybank.entity.Account;
import mybank.repository.AccountRepository;
import mybank.service.impl.AccountServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AccountServiceImplTest {
	@Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl accountService;

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1L, "John Doe", 1000.0);
    }

//    @Test
//    void testCreateAccount() {
//        when(accountRepository.save(any(Account.class))).thenReturn(account);
//
//        AccountDto accountDto = new AccountDto(1L, "John Doe", 1000.0);
//        AccountDto savedAccount = accountService.createAccount(accountDto);
//
//        assertEquals("John Doe", savedAccount.getAccountHolderName());
//        assertEquals(1000.0, savedAccount.getBalance());
//    }
//
//    @Test
//    void testGetAccountById() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
//
//        AccountDto accountDto = accountService.getAccountById(1L);
//
//        assertEquals(1L, accountDto.getId());
//        assertEquals("John Doe", accountDto.getAccountHolderName());
//    }
//
//    @Test
//    void testGetAccountById_NotFound() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.empty());
//
//        assertThrows(RuntimeException.class, () -> accountService.getAccountById(1L));
//    }
//
//    @Test
//    void testDeposit() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
//        when(accountRepository.save(any(Account.class))).thenReturn(account);
//
//        AccountDto accountDto = accountService.deposit(1L, 500.0);
//
//        assertEquals(1500.0, accountDto.getBalance());
//    }
//
//    @Test
//    void testWithdraw() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
//        when(accountRepository.save(any(Account.class))).thenReturn(account);
//
//        AccountDto accountDto = accountService.withdraw(1L, 200.0);
//
//        assertEquals(800.0, accountDto.getBalance());
//    }
//
//    @Test
//    void testWithdraw_InsufficientFunds() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
//
//        assertThrows(RuntimeException.class, () -> accountService.withdraw(1L, 2000.0));
//    }
//
//    @Test
//    void testGetAllAccounts() {
//        when(accountRepository.findAll()).thenReturn(Arrays.asList(account));
//
//        List<AccountDto> accounts = accountService.getAllAccounts();
//
//        assertEquals(1, accounts.size());
//        assertEquals("John Doe", accounts.get(0).getAccountHolderName());
//    }
//
//    @Test
//    void testDeleteAccount() {
//        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
//
//        accountService.deleteAccount(1L);
//
//        verify(accountRepository, times(1)).deleteById(1L);
//    }
}
