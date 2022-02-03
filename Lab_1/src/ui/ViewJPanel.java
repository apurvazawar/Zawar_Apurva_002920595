/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Car;

/**
 *
 * @author apurvazawar
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    Car car;
    
    public ViewJPanel(Car car) {
        initComponents();
        this.car = car;
        
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brand = new javax.swing.JLabel();
        oSSN = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtOLicence = new javax.swing.JTextField();
        txtOSSN = new javax.swing.JTextField();
        txtOName = new javax.swing.JTextField();
        txtServiceRecord = new javax.swing.JTextField();
        year = new javax.swing.JLabel();
        txtSeatNo = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        licensePlate = new javax.swing.JLabel();
        warrantyYear = new javax.swing.JLabel();
        serviceRecords = new javax.swing.JLabel();
        oEmail = new javax.swing.JLabel();
        oName = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        txtLicencePlate = new javax.swing.JTextField();
        txtOAddress = new javax.swing.JTextField();
        oLicence = new javax.swing.JLabel();
        txtOEmail = new javax.swing.JTextField();
        model = new javax.swing.JLabel();
        oAddress = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        engineNo = new javax.swing.JLabel();
        txtEngineNo = new javax.swing.JTextField();
        oTel = new javax.swing.JLabel();
        seatNo = new javax.swing.JLabel();
        txtOTel = new javax.swing.JTextField();

        brand.setText("Brand");

        oSSN.setText("Owner's SSN");

        photo.setText("Photo");

        txtYear.setText("jTextField1");

        txtOLicence.setText("jTextField1");

        txtOSSN.setText("jTextField1");

        txtOName.setText("jTextField1");

        txtServiceRecord.setText("jTextField1");

        year.setText("Year");

        txtSeatNo.setText("jTextField1");

        txtBrand.setText("jTextField1");

        licensePlate.setText("License Plate no.");

        warrantyYear.setText("Warranty year ");

        serviceRecords.setText("Service Records");

        oEmail.setText("Owner's Email");

        oName.setText("Owner's Name");

        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Create Car");

        txtModel.setText("jTextField1");
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        color.setText("Color");

        txtLicencePlate.setText("jTextField1");

        txtOAddress.setText("jTextField1");

        oLicence.setText("Owner's License");

        txtOEmail.setText("jTextField1");

        model.setText("Model");

        oAddress.setText("Owner's Address");

        txtWarrantyYear.setText("jTextField1");

        txtColor.setText("jTextField1");

        engineNo.setText("Engine No.");

        txtEngineNo.setText("jTextField1");
        txtEngineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngineNoActionPerformed(evt);
            }
        });

        oTel.setText("Owner's Tel");

        seatNo.setText("No. of Seats");

        txtOTel.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(licensePlate, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(oLicence, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(color)
                            .addComponent(brand))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(txtColor)
                                .addComponent(txtLicencePlate)
                                .addComponent(txtOName))
                            .addComponent(txtOLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serviceRecords)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(warrantyYear)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(engineNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(model)
                                .addGap(388, 388, 388))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oEmail)
                                    .addComponent(oSSN))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txtEngineNo)
                                    .addComponent(txtServiceRecord)
                                    .addComponent(txtOEmail)
                                    .addComponent(txtOSSN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oTel)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOTel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oAddress)
                            .addComponent(photo))
                        .addGap(18, 18, 18)
                        .addComponent(txtOAddress)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand)
                    .addComponent(model)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(engineNo)
                    .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNo)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(licensePlate)
                        .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serviceRecords)
                        .addComponent(txtServiceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(warrantyYear)
                        .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oName)
                    .addComponent(oEmail)
                    .addComponent(txtOName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oTel)
                    .addComponent(txtOTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oLicence)
                    .addComponent(txtOLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oAddress)
                    .addComponent(txtOAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(photo)
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtEngineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngineNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel brand;
    private javax.swing.JLabel color;
    private javax.swing.JLabel engineNo;
    private javax.swing.JLabel licensePlate;
    private javax.swing.JLabel model;
    private javax.swing.JLabel oAddress;
    private javax.swing.JLabel oEmail;
    private javax.swing.JLabel oLicence;
    private javax.swing.JLabel oName;
    private javax.swing.JLabel oSSN;
    private javax.swing.JLabel oTel;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel seatNo;
    private javax.swing.JLabel serviceRecords;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOAddress;
    private javax.swing.JTextField txtOEmail;
    private javax.swing.JTextField txtOLicence;
    private javax.swing.JTextField txtOName;
    private javax.swing.JTextField txtOSSN;
    private javax.swing.JTextField txtOTel;
    private javax.swing.JTextField txtSeatNo;
    private javax.swing.JTextField txtServiceRecord;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel warrantyYear;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        txtBrand.setText(car.getBrand());
        txtColor.setText(car.getColor());
        txtEngineNo.setText(car.getEngineNo());
        txtLicencePlate.setText(car.getLicensePlates());
        txtModel.setText(car.getModel());
        txtOAddress.setText(car.getoAddress());
        txtOEmail.setText(car.getoEmail());
        txtOLicence.setText(String.valueOf(car.getoLicense()));
        txtOName.setText(car.getoName());
        txtOSSN.setText(String.valueOf(car.getoSSN()));
        txtOTel.setText(String.valueOf(car.getoTel()));
        txtSeatNo.setText(String.valueOf(car.getSeatsNo()));
        txtServiceRecord.setText(car.getServiceRecords());
        txtWarrantyYear.setText(String.valueOf(car.getWarrantyYear()));
        txtYear.setText(String.valueOf(car.getYear()));
    }
}