:book: **Steps**

:spiral_notepad: **Migrating a project**

1. Manually migrated a traditional project (copy src folder)
2. Maven (easily create different types of projects (copy))

:spiral_notepad: **layered arch +interface driven development**

:book: **Revision History**

- Git & Git Hub

:spiral_notepad: **Moving to Interface Driven Development**

:eye: _Challenges with our existing code...._

:book: **Classes, Interfaces and abstract classes**

- classes are concrete (fully defined)
- abstract class (partially implemented)
- interface (only abstract methods
  )

:memo: _Instant Practice_

- create NetBanking class which can do payments using the Payment interface and perform fund transfers using FundTransfer interface.
- The statement should be dislayed by the NetBanking class.
- PaymentApp : Use the Netbanking class to perform only payments.
- FundTransferApp : Use the Netbanking class to perform only fund transfer.
- NetBankingApp : Use the Netbanking class to perform all operations

  Note : When you access the other methods, it should be a compilation error.

:memo: _Instant Practice_  
Migrate a rigid application to a loosely-coupled system.

:memo: _Lab_

- perform update & delete using Statement interface.
- perform update & delete using Prepared Statement.

:lock: POwn wants to save products to a file and perform CRUD.

:memo: _Lab_ ArrayList + File IO

- Display the arraylist from the File
- update any one product and delete another product.
- save to file and display to verify

:memo: _Lab_ ArrayList + Collection
As an extension to the above lab, remove a product using the collection interface.
