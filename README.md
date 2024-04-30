# VS Code Java Project

Welcome to the VS Code Java world. This project includes a simple console-based banking application written in Java.

## Banking Application

The banking application allows users to create accounts, deposit money, withdraw money, and check their balance.

### How to Use

1. **Start the Application**: Run the `Principal` class. This will start the application and display the main menu.

2. **Navigate the Menu**: The main menu provides the following options:

    - `1 - Cadastrar Conta`: Create a new account. You will be asked to enter your name, agency number, and account number.
    - `2 - Depositar`: Deposit money into an existing account. You will be asked to enter the account number and the amount you want to deposit.
    - `3 - Sacar`: Withdraw money from an existing account. You will be asked to enter the account number and the amount you want to withdraw.
    - `4 - Consultar Saldo`: Check the balance of an existing account. You will be asked to enter the account number.
    - `5 - Sair`: Exit the application.

3. **Enter Your Choice**: After the menu is displayed, enter the number of your choice and press Enter. The application will perform the corresponding action.

4. **Follow the Prompts**: Depending on your choice, the application may ask you for additional information, such as your name, agency number, account number, or the amount to deposit or withdraw. Enter the requested information and press Enter.

5. **Exit the Application**: To exit the application, choose the `Sair` option from the main menu.

Please note that this application does not persist data between sessions. If you exit the application, all data will be lost.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).