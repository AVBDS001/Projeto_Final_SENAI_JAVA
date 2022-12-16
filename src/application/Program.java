package application;

import entities.Client;
import entities.Employee;
import entities.Product;
import entities.Sale;
import entities_exceptions.ClientException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Inserting items in a list
        Product p1 = new Product("XBOXONE",10, 2500.00, Menu.generateCode(10));
        Product p2 = new Product("Computer",10, 4500.00, Menu.generateCode(10));
        Product p3 = new Product("Mouse Gamer",10, 100.00, Menu.generateCode(10));
        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        int qtyToBuy = 0;
        double totalValue = 0.0;
        //-------------------------------------------------------------------------------------------------

        //Inserting items in a list
        Sale sale = new Sale(0.0, Menu.generateID());
        Sale sale1 = new Sale(0.0, Menu.generateID());
        Sale sale2 = new Sale(0.0, Menu.generateID());
        Sale sale3 = new Sale(0.0, Menu.generateID());
        List<Sale> salesReportsList = new ArrayList<>();
        salesReportsList.add(sale);
        salesReportsList.add(sale1);
        salesReportsList.add(sale2);
        salesReportsList.add(sale3);
        //-------------------------------------------------------------------------------------------------

        //Inserting items in a list
        Client c1 = new Client(Menu.generateID(), "Joey Perez", "Joey@gmail.com", "(71) 22383-6703");
        Client c2 = new Client(Menu.generateID(), "John Doe", "JDoe@outlook.com", "(71) 85411-6443");
        Client c3 = new Client(Menu.generateID(), "Trevor Phillip", "trevorPhilip@hotmail.com", "(71) 40675-9270");
        List<Client> clientList = new ArrayList<>();
        clientList.add(c1);
        clientList.add(c2);
        clientList.add(c3);
        //------------------------------------------------------------------------------------------------

        //Inserting items in a list
        Employee e1 = new Employee(Menu.generateID(), "Andreas Kasparov", "andreas.kasparov@gmail.com", "(71) 82860-6393");
        Employee e2 = new Employee(Menu.generateID(), "Kevin hart", "khart@outlook.com", "(71) 963432-8373");
        Employee e3 = new Employee(Menu.generateID(), "Dave Chapelle", "dave101@hotmail.com", "(71) 916561-6108");
        Employee e4 = new Employee(Menu.generateID(), "Dua Lipa", "duaLipa@gmail.com", "(71) 945454-7402");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        //------------------------------------------------------------------------------------------------

        int mainMenuOption = 0;
        while (mainMenuOption != 4) {
            Menu.showMainMenu();
            System.out.print("Choose one option: ");
            mainMenuOption = scan.nextInt();
            System.out.println();

            switch (mainMenuOption) {
                case 1:
                    //Records Menu
                    int recordsMenuOption = 0;
                    while (recordsMenuOption != 4) {
                        Menu.showRecordsMenu();
                        System.out.print("Choose one option: ");
                        recordsMenuOption = scan.nextInt();
                        System.out.println();

                        if (recordsMenuOption == 1) {
                            //This code is used to show the registered products
                            String[] labels = {"CODE", "PRODUCT", "QTY", "PRICE"};
                            System.out.printf("%30s %30s %30s %30s \n", labels[0], labels[1], labels[2], labels[3]);

                            //This code is used to show the table
                            for (int i = 0; i < productList.size(); i++) {
                                System.out.printf("%30s %30s %30d %30.2f", productList.get(i).getCode(), productList.get(i).getName(), productList.get(i).getQuantity(), productList.get(i).getPrice());
                                System.out.println();
                            }
                        }
                        else if (recordsMenuOption == 2) {
                            String[] labels = {"ID", "NAME", "EMAIL", "PHONE NUMBER"};
                            System.out.printf("%30s %30s %30s %30s \n", labels[0], labels[1], labels[2], labels[3]);

                            for (int i = 0; i < clientList.size(); i++) {
                                System.out.printf("%30d %30s %30s %30s", clientList.get(i).getId(), clientList.get(i).getName(), clientList.get(i).getEmail(), clientList.get(i).getPhoneNumber());
                                System.out.println();
                            }
                        }
                        else if (recordsMenuOption == 3) {
                            String[] labels = {"ID", "NAME", "EMAIL", "PHONE NUMBER"};
                            System.out.printf("%30s %30s %30s %30s \n", labels[0], labels[1], labels[2], labels[3]);

                            for (int i = 0; i < employeeList.size(); i++) {
                                System.out.printf("%30d %30s %30s %30s", employeeList.get(i).getId(), employeeList.get(i).getName(), employeeList.get(i).getEmail(), employeeList.get(i).getPhoneNumber());
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 2:
                    //Sales menu
                    int salesMenuOption = 0;
                    while (salesMenuOption != 4) {
                        Menu.showSalesMenu();
                        System.out.print("Choose one option: ");
                        salesMenuOption = scan.nextInt();
                        System.out.println();

                        if (salesMenuOption == 1) {
                            System.out.print("Do you want to register a new product (Y --> yes/N --> No): ");
                            char registerANewProduct = scan.next().charAt(0);

                            if (registerANewProduct == 'Y' || registerANewProduct == 'y') {
                                System.out.print("How many new products do you want to register: ");
                                int newProductSize = scan.nextInt();

                                for (int i = 0; i < newProductSize; i++) {
                                    scan.nextLine();
                                    System.out.print("Enter product name: ");
                                    String newProductName = scan.nextLine();
                                    System.out.print("Enter product quantity (please no floating value): ");
                                    int newProductQuantity = scan.nextInt();
                                    System.out.print("Enter product price: ");
                                    double newProductPrice = scan.nextDouble();
                                    String newProductCode = Menu.generateCode(10);
                                    System.out.println();
                                    Product newProduct = new Product(newProductName, newProductQuantity, newProductPrice, newProductCode);
                                    productList.add(newProduct);
                                }
                                System.out.println();
                            }
                        }
                        else if (salesMenuOption == 2) {
                            //This code is used to show the registered products
                            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                            String[] labels = {"CODE", "PRODUCT", "QTY", "PRICE"};
                            System.out.printf("%30s %30s %30s %30s \n", labels[0], labels[1], labels[2], labels[3]);

                            //This code is used to show the table
                            for (int i = 0; i < productList.size(); i++) {
                                System.out.printf("%30s %30s %30d %30.2f", productList.get(i).getCode(), productList.get(i).getName(), productList.get(i).getQuantity(), productList.get(i).getPrice());
                                System.out.println();
                            }

                            System.out.print("Choose product by code: ");
                            String productCode = scan.next();
                            System.out.println();
                            System.out.println("Choose employee that will make the sale: ");
                            for (int i = 0; i < employeeList.size(); i++) {
                                System.out.println((i+1) + " - " + employeeList.get(i).getId());
                            }
                            System.out.print("Choose employee ID: ");
                            int choosedEmployeeID = scan.nextInt();

                            for (int i = 0; i < employeeList.size(); i++) {
                                if (choosedEmployeeID == employeeList.get(i).getId()) {
                                    System.out.println("Employee: " + employeeList.get(i).getName() + " selected");
                                }
                            }

                            System.out.println("Choose the client requesting the sale: ");
                            for (int i = 0; i < clientList.size(); i++) {
                                System.out.println((i+1) + " - " + clientList.get(i).getId());
                            }

                            System.out.print("Choose client ID: ");
                            int choosedClientID = scan.nextInt();

                            for (int i = 0; i < clientList.size(); i++) {
                                if (choosedClientID == clientList.get(i).getId()) {
                                    System.out.println("Client: " + clientList.get(i).getName() + " selected");
                                }
                            }


                            for (int i = 0; i < productList.size(); i++) {
                                if (productCode.equals(productList.get(i).getCode())) {
                                    System.out.print("Enter how many products you will buy (or press 0 to exit): ");
                                    qtyToBuy = scan.nextInt();
                                    if (qtyToBuy == 0) {
                                        break;
                                    }
                                    productList.get(i).removeProductFromStock(qtyToBuy);
                                    totalValue = productList.get(i).totalValue(productList.get(i).getPrice(), qtyToBuy);
                                    System.out.println("Total value: " + totalValue);
                                    Sale regularSale = new Sale(totalValue, Menu.generateID());
                                    System.out.println("Sale ID: " + regularSale.getSaleID());
                                    salesReportsList.add(regularSale);
                                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                            }
                        }
                        else if (salesMenuOption == 3) {
                            int newClientId = Menu.generateID();
                            scan.nextLine();
                            System.out.print("Enter client name: ");
                            String newClientName = scan.nextLine();
                            System.out.print("Enter client email: ");
                            String newClientEmail = scan.next();
                            System.out.print("Enter client phone number: ");
                            String newClientPhoneNumber = scan.next();

                            System.out.println();
                            Client newClient = new Client(newClientId, newClientName, newClientEmail, newClientPhoneNumber);
                            try {
                                if (newClientPhoneNumber.length() <= 9) {
                                    newClient.clientException();
                                }
                                else {
                                    clientList.add(newClient);
                                }
                            } catch (ClientException e) {
                                System.out.println("ERROR: " + e.getMessage());
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 3:
                    //Reports Menu
                    int reportsMenuOption = 0;
                    while (reportsMenuOption != 4) {
                        Menu.showReportsMenu();
                        System.out.print("Choose one option: ");
                        reportsMenuOption = scan.nextInt();
                        System.out.println();

                        if (reportsMenuOption == 1) {
                            double biggestValue = 0;
                            int biggestSaleID = 0;
                            for (int i = 0; i < salesReportsList.size(); i++) {
                                if (biggestValue < salesReportsList.get(i).getTotalValue()) {
                                    biggestValue = salesReportsList.get(i).getTotalValue();
                                    biggestSaleID = salesReportsList.get(i).getSaleID();
                                }

                            }
                            System.out.println("BIGGEST SALE: $ " + biggestValue);
                            System.out.println("FROM SALE ID: " + biggestSaleID);
                            System.out.println();
                        }
                        else if (reportsMenuOption == 2) {
                            double sum = 0;
                            for (int i = 0; i < salesReportsList.size(); i++) {
                                sum += salesReportsList.get(i).getTotalValue();
                            }
                            System.out.println("TOTAL AMOUNT OF SALES: $ " + sum);
                            System.out.println();
                        }
                        else if (reportsMenuOption == 3) {
                            for (int i = 0; i < clientList.size(); i++) {
                                System.out.printf("%30d %30s %30s %30s", clientList.get(i).getId(), clientList.get(i).getName(), clientList.get(i).getEmail(), clientList.get(i).getPhoneNumber());
                                System.out.println();
                            }
                            System.out.print("Choose one client ID printed above: ");
                            int choosedClientID = scan.nextInt();
                            System.out.println();

                            for (int i = 0; i < clientList.size(); i++) {
                                if (choosedClientID == clientList.get(i).getId()) {
                                    System.out.print("Insert the sale code printed above: ");
                                    int choosedSaleID = scan.nextInt();
                                    System.out.println();
                                    for (i = 0; i < salesReportsList.size(); i++) {
                                        if (choosedSaleID == salesReportsList.get(i).getSaleID()) {
                                            System.out.println(salesReportsList.get(i));
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
        }

        scan.close();
        }
    }
