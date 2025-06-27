CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
   FOR rec IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'SAVINGS') LOOP
      UPDATE Accounts
      SET Balance = Balance + (Balance * 0.01)
      WHERE AccountID = rec.AccountID;
   END LOOP;
   COMMIT;
END ProcessMonthlyInterest;
/
