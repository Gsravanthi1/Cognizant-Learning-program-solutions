<<Discount_Senior_Customers>>
BEGIN
   FOR rec IN (SELECT CustomerID, Age, LoanInterest FROM Customers) LOOP
      IF rec.Age > 60 THEN
         UPDATE Customers
         SET LoanInterest = LoanInterest - (LoanInterest * 0.01)
         WHERE CustomerID = rec.CustomerID;
      END IF;
   END LOOP;
   COMMIT;
END Discount_Senior_Customers;
/
