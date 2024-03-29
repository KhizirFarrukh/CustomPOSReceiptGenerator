
import TokenGenerator.PrinterService;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;


public class ProgramGUI extends javax.swing.JFrame {
    PrinterService printerService;
    CompanyInfo info;
    
    public ProgramGUI() {
        initComponents();
        SaveDataCheckbox.setSelected(true);
        printerService = new PrinterService();
        ImportFromFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CompanyNameInput = new javax.swing.JTextField();
        CompanyAddrInput = new javax.swing.JTextField();
        CompanyPhoneInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CompanyEmailInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddItemButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ItemQtyField = new javax.swing.JTextField();
        ItemPriceInput = new javax.swing.JTextField();
        ItemNameInput = new javax.swing.JTextField();
        ItemQtyDecButton = new javax.swing.JButton();
        ItemQtyIncButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReceiptTaxInput = new javax.swing.JTextField();
        ReceiptTotalAmtField = new javax.swing.JTextField();
        ReceiptSubTotalField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CashierNameInput = new javax.swing.JTextField();
        ReceiptNoInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        GenReceiptButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartItemListTable = new javax.swing.JTable();
        SaveDataCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TitleLabel.setText("POS Receipt Generator");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Phone Number");

        jLabel5.setText("Email Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompanyPhoneInput)
                    .addComponent(CompanyAddrInput)
                    .addComponent(CompanyNameInput)
                    .addComponent(CompanyEmailInput))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CompanyNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CompanyAddrInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CompanyPhoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CompanyEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Company Info");

        AddItemButton.setText("Add Item");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Name");

        jLabel8.setText("Price (Rs.)");

        jLabel9.setText("Quantity");

        ItemQtyField.setEditable(false);
        ItemQtyField.setText("0");
        ItemQtyField.setMinimumSize(new java.awt.Dimension(20, 20));
        ItemQtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemQtyFieldActionPerformed(evt);
            }
        });

        ItemQtyDecButton.setText("-");
        ItemQtyDecButton.setToolTipText("");
        ItemQtyDecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemQtyDecButtonActionPerformed(evt);
            }
        });

        ItemQtyIncButton.setText("+");
        ItemQtyIncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemQtyIncButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemNameInput)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ItemQtyDecButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItemQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItemQtyIncButton))
                            .addComponent(ItemPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ItemNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ItemPriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ItemQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemQtyDecButton)
                    .addComponent(ItemQtyIncButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Items");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Sub Total");

        jLabel15.setText("Total Amount");

        jLabel10.setText("Tax (%)");
        jLabel10.setToolTipText("");

        ReceiptTaxInput.setText("0");
        ReceiptTaxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptTaxInputActionPerformed(evt);
            }
        });

        ReceiptTotalAmtField.setEditable(false);
        ReceiptTotalAmtField.setText("0");

        ReceiptSubTotalField.setEditable(false);
        ReceiptSubTotalField.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(ReceiptTotalAmtField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReceiptTaxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(ReceiptSubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ReceiptSubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ReceiptTaxInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ReceiptTotalAmtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Receipt No.");

        jLabel13.setText("Cashier");

        CashierNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierNameInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ReceiptNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 182, Short.MAX_VALUE))
                    .addComponent(CashierNameInput))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CashierNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReceiptNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Receipt Info");

        GenReceiptButton.setText("Generate Receipt");
        GenReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenReceiptButtonActionPerformed(evt);
            }
        });

        CartItemListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No", "Name", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CartItemListTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(CartItemListTable);
        if (CartItemListTable.getColumnModel().getColumnCount() > 0) {
            CartItemListTable.getColumnModel().getColumn(0).setResizable(false);
            CartItemListTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            CartItemListTable.getColumnModel().getColumn(1).setResizable(false);
            CartItemListTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            CartItemListTable.getColumnModel().getColumn(2).setResizable(false);
            CartItemListTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            CartItemListTable.getColumnModel().getColumn(3).setResizable(false);
            CartItemListTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            CartItemListTable.getColumnModel().getColumn(4).setResizable(false);
            CartItemListTable.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        SaveDataCheckbox.setText("Save data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AddItemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaveDataCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenReceiptButton))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddItemButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveDataCheckbox)
                        .addGap(18, 18, 18)
                        .addComponent(GenReceiptButton)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ImportFromFile() {
        File f = new File("CompanyInfo.bin");
        if(f.exists() && !f.isDirectory()) { 
            try {
                FileInputStream fileIn = new FileInputStream("CompanyInfo.bin");
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                Object obj = objectIn.readObject();

                System.out.println("Company info has been read from file");
                objectIn.close();
                info = (CompanyInfo) obj;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            CompanyNameInput.setText(info.getName());
            CompanyAddrInput.setText(info.getAddress());
            CompanyPhoneInput.setText(info.getPhoneNum());
            CompanyEmailInput.setText(info.getEmail());
            CashierNameInput.setText(info.getCashierName());
            ReceiptNoInput.setText(String.valueOf(info.getReceiptNo()));
            info = null;
        }
    }
    private void ItemQtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemQtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemQtyFieldActionPerformed

    private void CashierNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashierNameInputActionPerformed

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        String ItemName = ItemNameInput.getText();
        String ItemPriceStr = ItemPriceInput.getText();
        int ItemQty = Integer.parseInt(ItemQtyField.getText());
        if(checkIfEmpty(ItemName)) {
            generateMessageDialog("Enter item name");
        } else if(checkIfEmpty(ItemPriceStr)) {
            generateMessageDialog("Enter item price");
        } else if(!checkOnlyNumeric(ItemPriceStr)) {
            generateMessageDialog("Enter valid item price");
        } else if(ItemQty == 0) {
            generateMessageDialog("Minimum item quantity is 1");
        } else {
            int ItemPrice = Integer.parseInt(ItemPriceStr);
            int NewSno = 1;
            if(CartItemListTable.getRowCount() > 0) {
                NewSno = ((Integer)CartItemListTable.getValueAt(CartItemListTable.getRowCount()-1, 0)) + 1;
            }
            DefaultTableModel model = (DefaultTableModel) CartItemListTable.getModel();
            model.addRow(new Object[]{NewSno, ItemName, ItemPrice, ItemQty, ItemPrice * ItemQty});
            ItemNameInput.setText("");
            ItemPriceInput.setText("");
            ItemQtyField.setText("0");
            int subTotal = getSubTotalFromCart();
            String TaxStr = ReceiptTaxInput.getText();
            int Tax = 0;
            if(checkOnlyDecimal(TaxStr)) {
                Tax = Integer.parseInt(TaxStr);
            } else {
                generateMessageDialog("Tax can only be numeric/decimal number");
                ReceiptTaxInput.setText("0");
            }
            int TotalAmount = (int)(subTotal + (subTotal * ((float)Tax/100)));
            ReceiptSubTotalField.setText(String.valueOf(subTotal));
            ReceiptTotalAmtField.setText(String.valueOf(TotalAmount));
        }
    }//GEN-LAST:event_AddItemButtonActionPerformed
    
    private int getSubTotalFromCart() {
        int subTotal = 0;
        Object[] rowData = new Object[CartItemListTable.getRowCount()];
        for (int i = 0; i < CartItemListTable.getRowCount(); i++) {
            rowData[i] = CartItemListTable.getValueAt(i, 4);
            subTotal += (Integer)rowData[i];
        }
        return subTotal;
    }
    
    private void ItemQtyIncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemQtyIncButtonActionPerformed
        int ItemQty = Integer.parseInt(ItemQtyField.getText());
        ItemQty += 1;
        ItemQtyField.setText(String.valueOf(ItemQty));
    }//GEN-LAST:event_ItemQtyIncButtonActionPerformed

    private void ItemQtyDecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemQtyDecButtonActionPerformed
        int ItemQty = Integer.parseInt(ItemQtyField.getText());
        if(ItemQty > 0) {
            ItemQty -= 1;
            ItemQtyField.setText(String.valueOf(ItemQty));
        }
    }//GEN-LAST:event_ItemQtyDecButtonActionPerformed

    private void ReceiptTaxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptTaxInputActionPerformed
        int subTotal = getSubTotalFromCart();
        String TaxStr = ReceiptTaxInput.getText();
        int Tax = 0;
        if(checkOnlyDecimal(TaxStr)) {
            Tax = Integer.parseInt(TaxStr);
        } else {
            generateMessageDialog("Tax can only be numeric/decimal number");
            ReceiptTaxInput.setText("0");
        }
        int TotalAmount = (int)(subTotal + (subTotal * ((float)Tax/100)));
        ReceiptSubTotalField.setText(String.valueOf(subTotal));
        ReceiptTotalAmtField.setText(String.valueOf(TotalAmount));
    }//GEN-LAST:event_ReceiptTaxInputActionPerformed

    private void GenReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenReceiptButtonActionPerformed
        if(CartItemListTable.getRowCount() == 0) {
            generateMessageDialog("Enter an item first");
        } else if(checkIfEmpty(CompanyNameInput.getText())) {
            generateMessageDialog("Please provide company name");
        } else { 
            PrintToken();

            if(SaveDataCheckbox.isSelected()) {
                info = new CompanyInfo(
                    CompanyNameInput.getText(),
                    CompanyAddrInput.getText(),
                    CompanyPhoneInput.getText(),
                    CompanyEmailInput.getText(),
                    CashierNameInput.getText(),
                    Integer.parseInt(ReceiptNoInput.getText())
                );
                try {
                    FileOutputStream fileOut = new FileOutputStream("CompanyInfo.bin");
                    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                    objectOut.writeObject(info);
                    objectOut.close();
                    System.out.println("Company Info succesfully saved in file");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                info = null;
            }
            ReceiptNoInput.setText(String.valueOf(Integer.parseInt(ReceiptNoInput.getText())+1));
//            } else {
//                CompanyNameInput.setText("");
//                CompanyAddrInput.setText("");
//                CompanyPhoneInput.setText("");
//                CompanyEmailInput.setText("");
//                CashierNameInput.setText("");
//                ReceiptNoInput.setText("");
//                ReceiptTaxInput.setText("0");
//            }
            ReceiptSubTotalField.setText("0");
            ReceiptTotalAmtField.setText("0");
            DefaultTableModel model = (DefaultTableModel) CartItemListTable.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_GenReceiptButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramGUI().setVisible(true);
            }
        });
    }
    private String GetSystemTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a, dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String TimeDateString = dtf.format(now);
        return TimeDateString;
    }
    private void PrintToken()
    {
        String TimeDateString = GetSystemTime();
        
        byte[] justify1 = new byte[] { 0x1b, 0x61, 49};
        byte[] fSize1 = new byte[] { 0x1d, '!', 0 };
        byte[] fSize2 = new byte[]{ 0x1d, '!', 17 };
        byte[] fSize3 = new byte[] { 0x1d, '!', 35 };
        byte[] fSize4 = new byte[] { 0x1d, '!', 51 };
        
        byte[] cutP = new byte[] { 0x1d, 'V', 1 };
        
        String justify1Str = new String(justify1);
        String fSize1Str = new String(fSize1);
        String fSize2Str = new String(fSize2);
        String fSize3Str = new String(fSize3);
        String fSize4Str = new String(fSize4);
        String cutPStr = new String(cutP);
        
        String CompanyName = CompanyNameInput.getText();
        String CompanyAddress = CompanyAddrInput.getText();
        String CompanyPhoneNum = CompanyPhoneInput.getText();
        String CompanyEmailAddr = CompanyEmailInput.getText();
        String CashierName = CashierNameInput.getText();
        String ReceiptNo = ReceiptNoInput.getText();
        String Tax = ReceiptTaxInput.getText();
        String SubTotal = ReceiptSubTotalField.getText();
        String TotalAmount = ReceiptTotalAmtField.getText();
        
        String[] rowData = new String[CartItemListTable.getRowCount()];
        int itemRows = CartItemListTable.getRowCount();
        for (int i = 0; i < itemRows; i++) {
            String sno = String.valueOf((Integer)CartItemListTable.getValueAt(i, 0));
            String ItemName = (String)CartItemListTable.getValueAt(i, 1);
            String ItemPrice = String.valueOf((Integer)CartItemListTable.getValueAt(i, 2));
            String ItemQty = String.valueOf((Integer)CartItemListTable.getValueAt(i, 3));
            String ItemTotalPrice = String.valueOf((Integer)CartItemListTable.getValueAt(i, 4));
            
            int sno_MaxLen = 4;
            int itemName_MaxLen = 24;
            int itemPrice_MaxLen = 6;
            int itemQty_MaxLen = 4;
            int itemTotalPrice_MaxLen = 6;
            
            int temp = sno.length();
            for (int j = 0; j < sno_MaxLen - temp; j++) {
                sno+=" ";
            }
            sno += "|";
            
            temp = ItemName.length();
            int StringBreakLines = temp / 24;
            String[] ItemNameStringBreak = new String[StringBreakLines];
            for (int x = 23, y = 0; x < temp; x+=23, y++) {
                int EndIndex = 23;
                if(temp - x < 23) {
                    EndIndex = temp - x;
                }
                ItemNameStringBreak[y] = ItemName.substring(x, x+EndIndex);
            }
            int EndIndex = 23;
            if(temp < 23) {
                EndIndex = temp;
            }
            ItemName = ItemName.substring(0,EndIndex);
            temp = ItemName.length();
            for (int j = 0; j < itemName_MaxLen - temp; j++) {
                ItemName+=" ";
            }
            ItemName += "|";
            
            temp = ItemPrice.length();
            for (int j = 0; j < itemPrice_MaxLen - temp; j++) {
                ItemPrice+=" ";
            }
            ItemPrice += "|";
            
            temp = ItemQty.length();
            for (int j = 0; j < itemQty_MaxLen - temp; j++) {
                ItemQty+=" ";
            }
            ItemQty += "|";
            
            temp = ItemTotalPrice.length();
            for (int j = 0; j < itemTotalPrice_MaxLen - temp; j++) {
                ItemTotalPrice+=" ";
            }
//            ItemTotalPrice += "|";
            
            for (int y = 0; y < StringBreakLines; y++) {
                temp = ItemNameStringBreak[y].length();
                for (int j = 0; j < itemName_MaxLen - temp; j++) {
                    ItemNameStringBreak[y]+=" ";
                }
                ItemNameStringBreak[y] = "    |" + ItemNameStringBreak[y] + "|      |    |      ";
            }
            
            
            rowData[i] = sno + ItemName + ItemPrice + ItemQty + ItemTotalPrice;
            for (int y = 0;y < StringBreakLines; y++) {
                rowData[i] += "\n" + ItemNameStringBreak[y];
//                System.out.println(ItemNameStringBreak[y]);
            }
        }
        
        String currencyStr = "Rs. ";
        
        String SubTotalLine = "Sub Total";
        int subTotalSpacePadding = 48 - SubTotalLine.length() - currencyStr.length() - SubTotal.length();
        for (int i = 0; i < subTotalSpacePadding; i++) {
            SubTotalLine += " ";
        }
        SubTotalLine += currencyStr + SubTotal;
        
        String TaxAmount = String.valueOf(Integer.parseInt(TotalAmount) - Integer.parseInt(SubTotal));
        String TaxLine = "Tax (" + Tax + "%)";
        int TaxSpacePadding = 48 - TaxLine.length() - currencyStr.length() - TaxAmount.length();
        for (int i = 0; i < TaxSpacePadding; i++) {
            TaxLine += " ";
        }
        TaxLine += currencyStr + TaxAmount;
        
        String TotalAmountLine = "Total Amount";
        int TotalSpacePadding = 48 - TotalAmountLine.length() - currencyStr.length() - TotalAmount.length();
        for (int i = 0; i < TotalSpacePadding; i++) {
            TotalAmountLine += " ";
        }
        TotalAmountLine += currencyStr + TotalAmount;
        
        System.out.println(SubTotalLine);
        System.out.println(TaxLine);
        System.out.println(TotalAmountLine);
        /*
            Size 1 characters per line limit: 48.
            Size 2 characters per line limit: 24.
            Size 3 characters per line limit: 16.
            Size 4 characters per line limit: 12.
        */

        /*
            Total characters in line: 48
            S. no max: 4
            Sub Total max: 6
            Qty max: 4
            Total Amount max: 6
            Total separators: 4
            Remaining length for item name: 48 - 4 - 6 - 4 - 6 - 4 = 24
        */
//        String TimeDate_PTypeToken = "\n" + TimeDateString + "\n" + "________________________\n\n" + PatientType + " TOKEN NUMBER\n";
        String HorizontalLine = "------------------------------------------------\n";
        String Footer = "\n\n\n\n\n\nSOFTWARE DEVELOPED BY KHIZIR FARRUKH\nEMAIL: khizirfarrukh@outlook.com\n\n\n\n\n";
        String FullString = justify1Str;// + fSize3Str + CompanyName + "\n" + fSize1Str; // +  + TimeDateString + HorizontalLine + fSize4Str + TokenNumber + fSize5Str + Footer + cutPStr;
        if(CompanyName.length() <= 16) { FullString += fSize3Str; }
        else if(CompanyName.length() <= 24) { FullString += fSize2Str; }
        else { FullString += fSize1Str; }
        FullString += CompanyName + "\n" + fSize1Str;
        if(!checkIfEmpty(CompanyAddress)) { FullString += "Address: " + CompanyAddress + "\n"; }
        if(!checkIfEmpty(CompanyPhoneNum)) { FullString += "Phone Number: " + CompanyPhoneNum + "\n"; }
        if(!checkIfEmpty(CompanyEmailAddr)) { FullString += "Email Address: " + CompanyEmailAddr + "\n"; }
        FullString += HorizontalLine + TimeDateString + "\n";
        if(!checkIfEmpty(ReceiptNo)) { FullString += "Receipt No: " + ReceiptNo + "\n"; }
        if(!checkIfEmpty(CashierName)) { FullString += "Cashier: " + CashierName + "\n"; }
        FullString += HorizontalLine + "S.no|Item Name               |Price |Qty |Total\n" + HorizontalLine;
        for (int i = 0; i < itemRows; i++) {
            FullString += rowData[i] + "\n";
        }
        FullString += HorizontalLine + SubTotalLine + "\n" + TaxLine + "\n" + TotalAmountLine + "\n\n\n\n\n" + cutPStr;
        System.out.println(FullString);
        
        
//        printerService.printString("BCPrinter", FullString);
    }
    void WriteDataToFile() {
        
    }
    void generateMessageDialog(String str) {
        JOptionPane.showMessageDialog(null, str);
    }
    boolean checkOnlyAlphabets(String str) {
        return str.matches("[a-zA-Z]+");
    }
    boolean checkOnlyNumeric(String str) {
        return str.matches("[0-9]+");
    }
    boolean checkOnlyDecimal(String str) {
        return str.matches("[0-9]+\\.?[0-9]*");
    }
    boolean checkIfEmpty(String str) {
        return str.equals("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JTable CartItemListTable;
    private javax.swing.JTextField CashierNameInput;
    private javax.swing.JTextField CompanyAddrInput;
    private javax.swing.JTextField CompanyEmailInput;
    private javax.swing.JTextField CompanyNameInput;
    private javax.swing.JTextField CompanyPhoneInput;
    private javax.swing.JButton GenReceiptButton;
    private javax.swing.JTextField ItemNameInput;
    private javax.swing.JTextField ItemPriceInput;
    private javax.swing.JButton ItemQtyDecButton;
    private javax.swing.JTextField ItemQtyField;
    private javax.swing.JButton ItemQtyIncButton;
    private javax.swing.JTextField ReceiptNoInput;
    private javax.swing.JTextField ReceiptSubTotalField;
    private javax.swing.JTextField ReceiptTaxInput;
    private javax.swing.JTextField ReceiptTotalAmtField;
    private javax.swing.JCheckBox SaveDataCheckbox;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}