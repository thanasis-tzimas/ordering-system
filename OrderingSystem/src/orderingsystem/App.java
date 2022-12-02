/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orderingsystem;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thanasis
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        // Render application
        initComponents();
    }
    
    public String capitalizeFirst(String s) {
        return (s.substring(0, 1).toUpperCase() 
                + s.substring(1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewOrderWindow = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        NewOrderTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        AddProductToTableButton = new javax.swing.JButton();
        CancelAddOrder = new javax.swing.JButton();
        ProceedOrderButton = new javax.swing.JButton();
        CategoriesComboBox = new javax.swing.JComboBox<>();
        ProductComboBox = new javax.swing.JComboBox<>();
        AmountSpinner = new javax.swing.JSpinner();
        WarningNothingAddedToOrder = new javax.swing.JDialog();
        DismissWarningNothingAdded = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EditOrdersWindow = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        EditOrderTable = new javax.swing.JTable();
        DoneEditOrderButton = new javax.swing.JButton();
        OrderDeleteSuccess = new javax.swing.JDialog();
        DismissOrderDeleteSuccess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JTabbedPane();
        ActiveOrdersScrollPane = new javax.swing.JScrollPane();
        ActiveOrdersTable = new javax.swing.JTable();
        UtilityMenu = new javax.swing.JMenuBar();
        NewMenu = new javax.swing.JMenu();
        NewOrderButton = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        EditOrderMenuButton = new javax.swing.JMenuItem();
        DeleteOrderMenuButton = new javax.swing.JMenuItem();

        NewOrderWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NewOrderWindow.setTitle("Add a new order");

        NewOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Cost", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(NewOrderTable);

        AddProductToTableButton.setText("Add Product");
        AddProductToTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductToTableButtonActionPerformed(evt);
            }
        });

        CancelAddOrder.setText("Cancel");
        CancelAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAddOrderActionPerformed(evt);
            }
        });

        ProceedOrderButton.setText("Proceed");
        ProceedOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedOrderButtonActionPerformed(evt);
            }
        });

        CategoriesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CategoriesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CategoriesComboBoxItemStateChanged(evt);
            }
        });

        ProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AmountSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProceedOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelAddOrder)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddProductToTableButton)
                                    .addComponent(CategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProductComboBox, 0, 108, Short.MAX_VALUE)
                                    .addComponent(AmountSpinner))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(CategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(AddProductToTableButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelAddOrder)
                    .addComponent(ProceedOrderButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout NewOrderWindowLayout = new javax.swing.GroupLayout(NewOrderWindow.getContentPane());
        NewOrderWindow.getContentPane().setLayout(NewOrderWindowLayout);
        NewOrderWindowLayout.setHorizontalGroup(
            NewOrderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewOrderWindowLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NewOrderWindowLayout.setVerticalGroup(
            NewOrderWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DismissWarningNothingAdded.setText("Dismiss");
        DismissWarningNothingAdded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DismissWarningNothingAddedActionPerformed(evt);
            }
        });

        jLabel1.setText("Warning: You have not added anything to the order!");

        javax.swing.GroupLayout WarningNothingAddedToOrderLayout = new javax.swing.GroupLayout(WarningNothingAddedToOrder.getContentPane());
        WarningNothingAddedToOrder.getContentPane().setLayout(WarningNothingAddedToOrderLayout);
        WarningNothingAddedToOrderLayout.setHorizontalGroup(
            WarningNothingAddedToOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarningNothingAddedToOrderLayout.createSequentialGroup()
                .addGroup(WarningNothingAddedToOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WarningNothingAddedToOrderLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(DismissWarningNothingAdded))
                    .addGroup(WarningNothingAddedToOrderLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        WarningNothingAddedToOrderLayout.setVerticalGroup(
            WarningNothingAddedToOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WarningNothingAddedToOrderLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(DismissWarningNothingAdded)
                .addGap(39, 39, 39))
        );

        EditOrdersWindow.setTitle("Edit Order");
        EditOrdersWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                EditOrdersWindowWindowClosing(evt);
            }
        });

        EditOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Amount", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(EditOrderTable);

        DoneEditOrderButton.setText("Done");
        DoneEditOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneEditOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditOrdersWindowLayout = new javax.swing.GroupLayout(EditOrdersWindow.getContentPane());
        EditOrdersWindow.getContentPane().setLayout(EditOrdersWindowLayout);
        EditOrdersWindowLayout.setHorizontalGroup(
            EditOrdersWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditOrdersWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EditOrdersWindowLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(DoneEditOrderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditOrdersWindowLayout.setVerticalGroup(
            EditOrdersWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditOrdersWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoneEditOrderButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        DismissOrderDeleteSuccess.setText("Dismiss");
        DismissOrderDeleteSuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DismissOrderDeleteSuccessActionPerformed(evt);
            }
        });

        jLabel2.setText("You have successfully deleted an order!");

        javax.swing.GroupLayout OrderDeleteSuccessLayout = new javax.swing.GroupLayout(OrderDeleteSuccess.getContentPane());
        OrderDeleteSuccess.getContentPane().setLayout(OrderDeleteSuccessLayout);
        OrderDeleteSuccessLayout.setHorizontalGroup(
            OrderDeleteSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderDeleteSuccessLayout.createSequentialGroup()
                .addGroup(OrderDeleteSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrderDeleteSuccessLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(DismissOrderDeleteSuccess))
                    .addGroup(OrderDeleteSuccessLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        OrderDeleteSuccessLayout.setVerticalGroup(
            OrderDeleteSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderDeleteSuccessLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(DismissOrderDeleteSuccess)
                .addGap(39, 39, 39))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordering System I");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ActiveOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Date", "Total", "Cashier"
            }
        ));
        ActiveOrdersScrollPane.setViewportView(ActiveOrdersTable);

        Dashboard.addTab("Active Orders", ActiveOrdersScrollPane);

        NewMenu.setText("New");

        NewOrderButton.setText("New order");
        NewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderButtonActionPerformed(evt);
            }
        });
        NewMenu.add(NewOrderButton);

        UtilityMenu.add(NewMenu);

        jMenu1.setText("Edit");

        EditOrderMenuButton.setText("Edit Order");
        EditOrderMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrderMenuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(EditOrderMenuButton);

        DeleteOrderMenuButton.setText("Delete Order");
        DeleteOrderMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrderMenuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(DeleteOrderMenuButton);

        UtilityMenu.add(jMenu1);

        setJMenuBar(UtilityMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrderButtonActionPerformed
        NewOrderWindow.pack();
        NewOrderWindow.setVisible(true);
        // Get categories
        try {
            CategoriesComboBox.removeAllItems();
            String sqlQuery = "SELECT getCategories();";
            PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
            ResultSet rs = sqlStatement.executeQuery();
            while(rs.next()) {
                CategoriesComboBox.addItem(rs.getString(1));
            }
            CategoriesComboBox.setSelectedIndex(0);
            ProductComboBox.removeAllItems();
            // Capitalize first letter
            String s = capitalizeFirst(CategoriesComboBox.getSelectedItem().toString());
            sqlQuery = "SELECT getProductsFromCategory(?);";
            sqlStatement = database.getConn().prepareStatement(sqlQuery);
            sqlStatement.setObject(1, s);
            rs = sqlStatement.executeQuery();
            while(rs.next()) {
                ProductComboBox.addItem(rs.getString(1));
            }
            ProductComboBox.setSelectedIndex(0);
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_NewOrderButtonActionPerformed

    private void ProceedOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedOrderButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)NewOrderTable.getModel();
        if(model.getRowCount() == 0) {
            WarningNothingAddedToOrder.pack();
            WarningNothingAddedToOrder.setVisible(true);
        } else {
            try {
                String sqlQuery = "SELECT getOrderID();";
                PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
                ResultSet rs = sqlStatement.executeQuery();
                // if next() returns false
                // then start OrderID from 
                // ID = 1, otherwise get the
                // last ID from the database.
                if(rs.next() != false) {
                    while(rs.next()) {
                        OrderID = Integer.parseInt(rs.getString(1));
                    }
                    OrderID++;
                }
                ArrayList<ArrayList<String>> tableData = new ArrayList<>();
                for(int i = 0; i < model.getRowCount(); i++) {
                    ArrayList<String> tableRow = new ArrayList<>();
                    for(int j = 0; j < model.getColumnCount(); j++) {
                        tableRow.add(model.getValueAt(i, j).toString());
                    }
                    tableData.add(tableRow);
                }
                double itemsTotalCost = 0;
                for(int i = 0; i < model.getRowCount(); i++) {
                    String product_name = tableData.get(i).get(0);
                    String product_cost = tableData.get(i).get(1);
                    String amount = tableData.get(i).get(2);
                    itemsTotalCost += Float.parseFloat(product_cost) * Integer.parseInt(amount);
                    sqlQuery = "SELECT getProductIDFromName(?);";
                    sqlStatement = database.getConn().prepareStatement(sqlQuery);
                    sqlStatement.setObject(1, product_name);
                    rs = sqlStatement.executeQuery();
                    String product_id = "1";
                    while(rs.next()) {
                        product_id = rs.getString(1);
                    }
                    String insertSql = "SELECT createNewProductOrder(?,?,?,?);";
                    PreparedStatement insertStatement = database.getConn().prepareStatement(insertSql);
                    insertStatement.setObject(1, OrderID);
                    insertStatement.setObject(2, Integer.parseInt(product_id));
                    insertStatement.setObject(3, Integer.parseInt(amount));
                    insertStatement.setObject(4, Date.valueOf("2022-11-08"));
                    insertStatement.execute();
                }
                // After all that
                // create a new receipt
                // and mark it as 'active'.
                String insertNewReceiptSQL = "SELECT createNewReceipt(?,?::DATE,?::NUMERIC,?::RECEIPT_STATE,?);";
                PreparedStatement insertNewReceiptStatement = database.getConn().prepareStatement(insertNewReceiptSQL);
                insertNewReceiptStatement.setObject(1, OrderID);
                insertNewReceiptStatement.setObject(2, Date.valueOf("2022-11-08"));
                insertNewReceiptStatement.setObject(3, itemsTotalCost);
                insertNewReceiptStatement.setObject(4, "ACTIVE");
                insertNewReceiptStatement.setObject(5, 1);
                insertNewReceiptStatement.execute();
                
                DefaultTableModel dashboardActiveModel = (DefaultTableModel)ActiveOrdersTable.getModel();
                dashboardActiveModel.addRow( new Object[] {
                    OrderID,
                    Date.valueOf("2022-11-08"),
                    itemsTotalCost,
                    "Thanasis"
                });
                
                OrderID++;
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        model.setRowCount(0);
        NewOrderWindow.dispose();
    }//GEN-LAST:event_ProceedOrderButtonActionPerformed

    private void CancelAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAddOrderActionPerformed
        DefaultTableModel model = (DefaultTableModel)NewOrderTable.getModel();
        model.setRowCount(0);
        NewOrderWindow.dispose();
    }//GEN-LAST:event_CancelAddOrderActionPerformed

    private void CategoriesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CategoriesComboBoxItemStateChanged
        try {
            if(CategoriesComboBox.getSelectedItem() != null) {
                String category = capitalizeFirst(CategoriesComboBox.getSelectedItem().toString());
                String sqlQuery = "SELECT getProductsFromCategory(?);";
                PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
                sqlStatement.setObject(1, category);
                ResultSet rs = sqlStatement.executeQuery();
                ProductComboBox.removeAllItems();
                while(rs.next()) {
                    ProductComboBox.addItem(rs.getString(1));
                }
                ProductComboBox.setSelectedIndex(0);
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CategoriesComboBoxItemStateChanged

    private void AddProductToTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductToTableButtonActionPerformed
        try {
            String productName = capitalizeFirst(ProductComboBox.getSelectedItem().toString());
            String sqlQuery = "SELECT getProductCostFromName(?);";
            PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
            sqlStatement.setObject(1, productName);
            ResultSet rs = sqlStatement.executeQuery();
            String productCost = "";
            while(rs.next()) {
                productCost = rs.getString(1);
            }
            DefaultTableModel model = (DefaultTableModel)NewOrderTable.getModel();
            model.insertRow(0, new Object[] {
                ProductComboBox.getSelectedItem().toString(),
                productCost,
                AmountSpinner.getValue().toString()
            });
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddProductToTableButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            database.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void DismissWarningNothingAddedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DismissWarningNothingAddedActionPerformed
        WarningNothingAddedToOrder.dispose();
    }//GEN-LAST:event_DismissWarningNothingAddedActionPerformed

    private void EditOrderMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOrderMenuButtonActionPerformed
        EditOrdersWindow.pack();
        EditOrdersWindow.setVisible(true);
        int rowIdx = ActiveOrdersTable.getSelectedRow();
        int orderId = (int)ActiveOrdersTable.getValueAt(rowIdx, 0);
        try {
            DefaultTableModel model = (DefaultTableModel)EditOrderTable.getModel();
            String sqlQuery = "SELECT * FROM getProductOrdersFromOrderID(?);";
            PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
            sqlStatement.setObject(1, orderId);
            ResultSet rs = sqlStatement.executeQuery();
            while(rs.next()) {
                String productName = rs.getString(1);
                String productAmount = rs.getString(2);
                String productCost = rs.getString(3);
                model.insertRow(0, new Object[] {
                    productName,
                    productCost,
                    productAmount
                });
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditOrderMenuButtonActionPerformed

    private void DeleteOrderMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrderMenuButtonActionPerformed
        int rowIdx = ActiveOrdersTable.getSelectedRow();
        if(rowIdx == -1) {
            // TODO
            JOptionPane.showMessageDialog(null, "You haven't selected anything to delete!");
            return;
        }
        ReceiptID = (int)ActiveOrdersTable.getValueAt(rowIdx, 0);
        try {
            String sqlQuery = "SELECT deleteReceiptFromReceiptID(?);";
            PreparedStatement sqlStatement = database.getConn().prepareStatement(sqlQuery);
            sqlStatement.setObject(1, ReceiptID);
            sqlStatement.execute();
            
            sqlQuery = "SELECT deleteOrdersFromOrderID(?);";
            sqlStatement = database.getConn().prepareStatement(sqlQuery);
            sqlStatement.setObject(1, ReceiptID);
            sqlStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DefaultTableModel model = (DefaultTableModel)ActiveOrdersTable.getModel();
        model.removeRow(rowIdx);
        JOptionPane.showMessageDialog(null, "You successfully deleted an order!");
    }//GEN-LAST:event_DeleteOrderMenuButtonActionPerformed

    private void DismissOrderDeleteSuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DismissOrderDeleteSuccessActionPerformed
        OrderDeleteSuccess.dispose();
    }//GEN-LAST:event_DismissOrderDeleteSuccessActionPerformed

    private void DoneEditOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneEditOrderButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)EditOrderTable.getModel();
        try {
            String sqlQuery;
            PreparedStatement sqlStatement;
            ResultSet rs;
            for(int i = 0; i <= model.getRowCount()-1; i++) {
                String productName = (String)model.getValueAt(i, 0);
                sqlQuery = "SELECT getproductid(?);";
                sqlStatement = database.getConn().prepareStatement(sqlQuery);
                sqlStatement.setObject(1, productName);
                rs = sqlStatement.executeQuery();
                int productID  = 1;
                while(rs.next()) {
                    productID = rs.getInt(1);
                }
                sqlQuery = "SELECT updateorder(?, ?, ?);";
                sqlStatement = database.getConn().prepareStatement(sqlQuery);
                sqlStatement.setObject(1, ReceiptID);
                sqlStatement.setObject(2, productID);
                int productAmount = Integer.parseInt((String)model.getValueAt(i, 1));
                sqlStatement.setObject(3, productAmount);
                sqlStatement.execute();
            }
            // TODO: Update active receipts for new total
        } catch (SQLException e) {
            e.printStackTrace();
        }
        EditOrdersWindow.dispose();
    }//GEN-LAST:event_DoneEditOrderButtonActionPerformed

    private void EditOrdersWindowWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EditOrdersWindowWindowClosing
        DefaultTableModel model = (DefaultTableModel)EditOrderTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_EditOrdersWindowWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        /* Initialise server connection*/
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        database = new LocalPSQLDatabase("dblabs.iee.ihu.gr", "5432",
                "it185287", "it185287", "AhoyScientist!0");
        database.establishConnection();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }
    
    static LocalPSQLDatabase database;
    static int OrderID = 1;
    static int ReceiptID = 1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ActiveOrdersScrollPane;
    private javax.swing.JTable ActiveOrdersTable;
    private javax.swing.JButton AddProductToTableButton;
    private javax.swing.JSpinner AmountSpinner;
    private javax.swing.JButton CancelAddOrder;
    private javax.swing.JComboBox<String> CategoriesComboBox;
    private javax.swing.JTabbedPane Dashboard;
    private javax.swing.JMenuItem DeleteOrderMenuButton;
    private javax.swing.JButton DismissOrderDeleteSuccess;
    private javax.swing.JButton DismissWarningNothingAdded;
    private javax.swing.JButton DoneEditOrderButton;
    private javax.swing.JMenuItem EditOrderMenuButton;
    private javax.swing.JTable EditOrderTable;
    private javax.swing.JFrame EditOrdersWindow;
    private javax.swing.JMenu NewMenu;
    private javax.swing.JMenuItem NewOrderButton;
    private javax.swing.JTable NewOrderTable;
    private javax.swing.JFrame NewOrderWindow;
    private javax.swing.JDialog OrderDeleteSuccess;
    private javax.swing.JButton ProceedOrderButton;
    private javax.swing.JComboBox<String> ProductComboBox;
    private javax.swing.JMenuBar UtilityMenu;
    private javax.swing.JDialog WarningNothingAddedToOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
