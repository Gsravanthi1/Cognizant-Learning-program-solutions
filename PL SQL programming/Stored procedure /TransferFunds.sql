CREATE OR REPLACE PROCEDURE TransferFunds(
   p_SourceAccountID   NUMBER,
   p_TargetAccountID   NUMBER,
   p_Amount            NUMBER
) IS
   v_SourceBalance NUMBER;
BEGIN
   -- Get current balance of source account
   SELECT Balance INTO v_SourceBalance
   FROM Accounts
   WHERE AccountID = p_SourceAccountID;
   
   -- Check if sufficient funds
   IF v_SourceBalance >= p_Amount THEN
      -- Deduct from source
      UPDATE Accounts
      SET Balance = Balance - p_Amount
      WHERE AccountID = p_SourceAccountID;
      
      -- Add to target
      UPDATE Accounts
      SET Balance = Balance + p_Amount
      WHERE AccountID = p_TargetAccountID;
      
      COMMIT;
   ELSE
      RAISE_APPLICATION_ERROR(-20001, 'Insufficient Balance');
   END IF;
END TransferFunds;
/
