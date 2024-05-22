### Exercise: Tool Shop Management with Command Pattern

#### Objective
Create a command-line tool shop management program using the Command Pattern.  
The program should allow users to add items to the warehouse, sell items, and print out a history of transactions.

#### Requirements
The Data does not need to be stored on the hard drive. You can keep it all in memory.
But make sure the program runs in a loop to not lose your data between commands.

1. **Tool Management**:
    - The shop manages three types of items: Hammers, Saws, and Pincers.
    - Each type of item has a stack representing the quantity in the warehouse.
    - Selling an item reduces the stack and increases the money in the bank by specific amounts:
        - Hammer: 10€
        - Saw: 20€
        - Pincer: 8€

2. **Commands**:
    - Implement commands to add items, sell items, and print the transaction history.
    - Use the Command Pattern to encapsulate requests as objects.

3. **Bonus**:
    - Print out all previous transactions (adding items, removing items, and adding money).

#### Steps

1. **Define Command Interface**:
    - Create a `Command` interface with an `execute` method.

2. **Implement Concrete Commands**:
    - `AddItemCommand`: Adds items to the warehouse.
    - `SellItemCommand`: Sells items from the warehouse and adds money to the bank.
    - `PrintTransactionHistoryCommand`: Prints the transaction history.

3. **Tool Shop**:
    - Create a `ToolShop` class to manage the inventory and bank.
    - Implement methods to add items, sell items, and record transactions.

4. **Transaction History**:
    - Maintain a list to store transaction history.

5. **Main Program**:
    - Implement a loop to handle user input and execute commands.

#### Attention
Please make sure to ...
- not sell items when the stock is at 0
- give error message to the user when enters wrong input
- give success messages
- 