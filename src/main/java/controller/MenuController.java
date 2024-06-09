package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.print.PrinterJob;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.stage.Window;

import java.util.Formatter;
import java.util.Locale;

public class MenuController {
    @FXML
    private Button addItem1;
    @FXML
    private Button addItem2;
    @FXML
    private Button addItem3;
    @FXML
    private Button addItem4;
    @FXML
    private Button addItem5;
    @FXML
    private Button addItem6;
    @FXML
    private Button addItem7;
    @FXML
    private Button addItem8;
    @FXML
    private TextField cash;
    @FXML
    private Button exit;
    @FXML
    private Label itemPrice1;
    @FXML
    private Label itemPrice2;
    @FXML
    private Label itemPrice3;
    @FXML
    private Label itemPrice4;
    @FXML
    private Label itemPrice5;
    @FXML
    private Label itemPrice6;
    @FXML
    private Label itemPrice7;
    @FXML
    private Label itemPrice8;
    @FXML
    private Spinner<Integer> itemQuantity1;
    @FXML
    private Spinner<Integer> itemQuantity2;
    @FXML
    private Spinner<Integer> itemQuantity3;
    @FXML
    private Spinner<Integer> itemQuantity4;
    @FXML
    private Spinner<Integer> itemQuantity5;
    @FXML
    private Spinner<Integer> itemQuantity6;
    @FXML
    private Spinner<Integer> itemQuantity7;
    @FXML
    private Spinner<Integer> itemQuantity8;
    @FXML
    private ComboBox<String> itemSize1;
    @FXML
    private ComboBox<String> itemSize2;
    @FXML
    private ComboBox<String> itemSize3;
    @FXML
    private ComboBox<String> itemSize4;
    @FXML
    private ComboBox<String> itemSize5;
    @FXML
    private ComboBox<String> itemSize6;
    @FXML
    private ComboBox<String> itemSize7;
    @FXML
    private ComboBox<String> itemSize8;
    @FXML
    private TableView<MenuItem> menuItems;
    @FXML
    private Button print;
    @FXML
    private Button purchase;
    @FXML
    private TextArea receipt;
    @FXML
    private Button remove;
    @FXML
    private Button reset;
    @FXML
    private TabPane tab;
    @FXML
    private Label total;
    @FXML
    private void addItem1Action() {
        int qty = itemQuantity1.getValue();
        String size = itemSize1.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Americano";
            int basePrice = 100;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity1.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem2Action() {
        int qty = itemQuantity2.getValue();
        String size = itemSize2.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Capuccino";
            int basePrice = 115;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity2.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem3Action() {
        int qty = itemQuantity3.getValue();
        String size = itemSize3.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Espresso";
            int basePrice = 115;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity3.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem4Action() {
        int qty = itemQuantity4.getValue();
        String size = itemSize4.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Matcha Latte";
            int basePrice = 110;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity4.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem5Action() {
        int qty = itemQuantity5.getValue();
        String size = itemSize5.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Hot Choco";
            int basePrice = 110;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity5.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem6Action() {
        int qty = itemQuantity6.getValue();
        String size = itemSize6.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Spanish Latte";
            int basePrice = 110;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity6.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem7Action() {
        int qty = itemQuantity7.getValue();
        String size = itemSize7.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "Caffe Latte";
            int basePrice = 110;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity7.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }
    @FXML
    private void addItem8Action() {
        int qty = itemQuantity8.getValue();
        String size = itemSize8.getValue();
        if (purchase.isDisabled()) {
            showAlert("Purchase is complete, click reset");
        }else if (qty > 0 && size != null) {
            String item = "White Mocha";
            int basePrice = 120;
            int price = basePrice;

            switch (size) {
                case "Medium":
                    price += 20;
                    break;
                case "Large":
                    price += 40;
                    break;
            }

            int existingIndex = findExistingItem(item + " (" + size + ")");
            if (existingIndex == -1) {
                MenuItem newItem = new MenuItem(qty, item + " (" + size + ")", price * qty);
                cartItems.add(newItem);
            } else {
                MenuItem existingItem = cartItems.get(existingIndex);
                existingItem.setQuantity(existingItem.getQuantity() + qty);
                existingItem.setPrice(existingItem.getPrice() + price * qty);
            }
            totalCost += price * qty;
            updateTotal();
            itemQuantity8.getValueFactory().setValue(0);
            menuItems.refresh();
        } else {
            showAlert("Please select a size and enter a valid quantity!");
        }
    }


    private void updatePriceLabel1() {
        String size = itemSize1.getValue();
        int basePrice = 100;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice1.setText("₱" + price);
    }
    private void updatePriceLabel2() {
        String size = itemSize2.getValue();
        int basePrice = 115;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice2.setText("₱" + price);
    }
    private void updatePriceLabel3() {
        String size = itemSize3.getValue();
        int basePrice = 115;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice3.setText("₱" + price);
    }
    private void updatePriceLabel4() {
        String size = itemSize4.getValue();
        int basePrice = 110;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice4.setText("₱" + price);
    }
    private void updatePriceLabel5() {
        String size = itemSize5.getValue();
        int basePrice = 110;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice5.setText("₱" + price);
    }
    private void updatePriceLabel6() {
        String size = itemSize6.getValue();
        int basePrice = 110;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice6.setText("₱" + price);
    }
    private void updatePriceLabel7() {
        String size = itemSize7.getValue();
        int basePrice = 110;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice7.setText("₱" + price);
    }
    private void updatePriceLabel8() {
        String size = itemSize8.getValue();
        int basePrice = 120;
        int price = basePrice;

        switch (size) {
            case "Medium":
                price += 20;
                break;
            case "Large":
                price += 40;
                break;
        }

        itemPrice8.setText("₱" + price);
    }

    private ObservableList<MenuItem> cartItems = FXCollections.observableArrayList();
    private int totalCost = 0;

    public void initialize() {
        TableColumn<MenuItem, Integer> quantityColumn = new TableColumn<>("QTY");
        TableColumn<MenuItem, String> itemColumn = new TableColumn<>("Item");
        TableColumn<MenuItem, Integer> priceColumn = new TableColumn<>("Price");

        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        quantityColumn.setPrefWidth(40);
        itemColumn.setPrefWidth(200);
        priceColumn.setPrefWidth(80);

        menuItems.getColumns().addAll(quantityColumn, itemColumn, priceColumn);
        menuItems.setItems(cartItems);
        quantityColumn.setResizable(false);
        itemColumn.setResizable(false);
        priceColumn.setResizable(false);

        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity1.setValueFactory(valueFactory);
        itemSize1.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize1.setValue("Small");
        itemSize1.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel1());

        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity2.setValueFactory(valueFactory2);
        itemSize2.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize2.setValue("Small");
        itemSize2.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel2());

        SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity3.setValueFactory(valueFactory3);
        itemSize3.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize3.setValue("Small");
        itemSize3.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel3());

        SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity4.setValueFactory(valueFactory4);
        itemSize4.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize4.setValue("Small");
        itemSize4.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel4());

        SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity5.setValueFactory(valueFactory5);
        itemSize5.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize5.setValue("Small");
        itemSize5.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel5());

        SpinnerValueFactory<Integer> valueFactory6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity6.setValueFactory(valueFactory6);
        itemSize6.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize6.setValue("Small");
        itemSize6.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel6());

        SpinnerValueFactory<Integer> valueFactory7 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity7.setValueFactory(valueFactory7);
        itemSize7.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize7.setValue("Small");
        itemSize7.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel7());

        SpinnerValueFactory<Integer> valueFactory8 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0);
        itemQuantity8.setValueFactory(valueFactory8);
        itemSize8.setItems(FXCollections.observableArrayList("Small", "Medium", "Large"));
        itemSize8.setValue("Small");
        itemSize8.valueProperty().addListener((observable, oldValue, newValue) -> updatePriceLabel8());


        remove.setOnAction(event -> {
            MenuItem selectedItem = menuItems.getSelectionModel().getSelectedItem();
            if (purchase.isDisabled()) {
                showAlert("Purchase is complete, click reset");
            } else{
                if (selectedItem != null) {

                    cartItems.remove(selectedItem);
                    totalCost -= selectedItem.getPrice();
                    updateTotal();
                    menuItems.getSelectionModel().clearSelection();
                    menuItems.refresh();
                } else {
                    showAlert("Please select an item to remove!");
                }
            }
        });


        reset.setOnAction(event -> {
            cartItems.clear();
            totalCost = 0;
            updateTotal();
            cash.clear();
            menuItems.refresh();
            tab.getSelectionModel().select(0);
            purchase.setDisable(false);
            cash.setDisable(false);
        });

        purchase.setOnAction(event -> {
            if (!cartItems.isEmpty()) {
                try {
                    int cashAmount = Integer.parseInt(cash.getText());
                    if (cashAmount >= totalCost) {
                        int change = cashAmount - totalCost;
                        receipt.setText(generateReceipt(totalCost, cashAmount, change));
                        updateTotal();
                        menuItems.refresh();
                        tab.getSelectionModel().select(1);
                        purchase.setDisable(true);
                        cash.setDisable(true);
                    } else {
                        showAlert("Insufficient cash!");
                    }
                } catch (NumberFormatException e) {
                    showAlert("Invalid cash amount!");
                }
            } else {
                showAlert("Cart is empty!");
            }
        });

        print.setOnAction(event -> {
                if (purchase.isDisabled()) {
                        PrinterJob job = PrinterJob.createPrinterJob();
                        if (job != null && job.showPrintDialog(menuItems.getScene().getWindow())) {
                            Text textNode = new Text(receipt.getText());
                            boolean success = job.printPage(textNode);
                            if (success) {
                                job.endJob();
                            }
                        }
                } else {
                    showAlert("Purchase a product first");
                }
        });

        exit.setOnAction(event -> showExitConfirmation());

        updatePriceLabel1();
        updatePriceLabel2();
        updatePriceLabel3();
        updatePriceLabel4();
        updatePriceLabel5();
        updatePriceLabel6();
        updatePriceLabel7();
        updatePriceLabel8();
    }

    private int findExistingItem(String item) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItem().equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void updateTotal() {
        total.setText("₱" + totalCost);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showExitConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");

        ButtonType yesButton = new ButtonType("Yes");
        ButtonType noButton = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(yesButton, noButton);

        alert.showAndWait().ifPresent(type -> {
            if (type == yesButton) {
                Stage stage = (Stage) exit.getScene().getWindow();
                stage.close();
            }
        });
    }

    private String generateReceipt(int totalCost, int cashAmount, int change) {
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("\n\t\tKapeez Cafe\n")
                .append("\t\tGroup 6\n")
                .append("\t    STI College Lucena City\n")
                .append("-------------------------------------------\n")
                .append("Item:\t\t\t    Price:\n\n");

        int maxItemNameLength = 0;
        for (MenuItem item : cartItems) {
            maxItemNameLength = Math.max(maxItemNameLength, item.getItem().length());
        }

        for (MenuItem item : cartItems) {
            String itemName = String.format("%-30s", item.getQuantity() + "x " + item.getItem());
            String price = String.format("₱%d", item.getPrice());
            receiptText.append(itemName).append(price).append("\n");
        }

        receiptText.append("\n-------------------------------------------\n")
                .append("Total:\t\t\t    ₱").append(totalCost).append("\n")
                .append("Cash:\t\t\t    ₱").append(cashAmount).append("\n\n")
                .append("Change:\t\t\t    ₱").append(change).append("\n")
                .append("-----------Thanks for Purchasing------------\n");

        return receiptText.toString();
    }

    public static class MenuItem {
        private int quantity;
        private String item;
        private int price;

        MenuItem(int quantity, String item, int price) {
            this.quantity = quantity;
            this.item = item;
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getItem() {
            return item;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
