/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Car;
import model.ServiceRecordsHistory;

/**
 *
 * @author apurvazawar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    Car car;
    ServiceRecordsHistory history;
    
    public CreateJPanel(Car car, ServiceRecordsHistory history) {
        initComponents();
        this.car = car;
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        seatNo = new javax.swing.JLabel();
        oName = new javax.swing.JLabel();
        licensePlate = new javax.swing.JLabel();
        oTel = new javax.swing.JLabel();
        oEmail = new javax.swing.JLabel();
        oSSN = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        oLicence = new javax.swing.JLabel();
        oAddress = new javax.swing.JLabel();
        warrantyYear = new javax.swing.JLabel();
        serviceRecords = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        engineNo = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtLicencePlate = new javax.swing.JTextField();
        txtSeatNo = new javax.swing.JTextField();
        txtOEmail = new javax.swing.JTextField();
        txtOName = new javax.swing.JTextField();
        txtOTel = new javax.swing.JTextField();
        txtOSSN = new javax.swing.JTextField();
        txtOAddress = new javax.swing.JTextField();
        txtOLicence = new javax.swing.JTextField();
        txtWarrantyYear = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        txtServiceRecordDate = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtPhotoPath = new javax.swing.JTextField();
        serviceRecordDate = new javax.swing.JLabel();
        serviceRecordMileage = new javax.swing.JLabel();
        costOfService = new javax.swing.JLabel();
        txtMileage = new javax.swing.JTextField();
        txtCostOfService = new javax.swing.JTextField();
        btnAddServiceRecord = new javax.swing.JButton();

        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Create Car");

        brand.setText("Brand");

        color.setText("Color");

        seatNo.setText("No. of Seats");

        oName.setText("Owner's Name");

        licensePlate.setText("License Plate no.");

        oTel.setText("Owner's Tel");

        oEmail.setText("Owner's Email");

        oSSN.setText("Owner's SSN");

        oLicence.setText("Owner's License");

        oAddress.setText("Owner's Address");

        warrantyYear.setText("Warranty year ");

        serviceRecords.setText("Service Records");

        year.setText("Year");

        engineNo.setText("Engine No.");

        model.setText("Model");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtEngineNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngineNoActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        btnUpload.setText("Upload  Picture");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtPhotoPath.setText("Picture path");
        txtPhotoPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhotoPathActionPerformed(evt);
            }
        });

        serviceRecordDate.setText("Date");

        serviceRecordMileage.setText("Mileage (Km/L)");

        costOfService.setText("Cost of service");

        txtCostOfService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostOfServiceActionPerformed(evt);
            }
        });

        btnAddServiceRecord.setText("Add Record");
        btnAddServiceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(licensePlate)
                                .addComponent(color)
                                .addComponent(brand)
                                .addComponent(oAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(oLicence)
                            .addComponent(serviceRecords)
                            .addComponent(serviceRecordDate)
                            .addComponent(oName))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtColor)
                                    .addComponent(txtLicencePlate)
                                    .addComponent(txtOName)
                                    .addComponent(txtOLicence, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtServiceRecordDate))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(engineNo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(oSSN)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(oEmail)
                                                    .addComponent(serviceRecordMileage)
                                                    .addComponent(model)
                                                    .addComponent(warrantyYear))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                    .addComponent(txtEngineNo)
                                                    .addComponent(txtOEmail)
                                                    .addComponent(txtOSSN)
                                                    .addComponent(txtWarrantyYear)
                                                    .addComponent(txtMileage))))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(costOfService)
                                            .addComponent(oTel))))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOTel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCostOfService, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSeatNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOAddress)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddServiceRecord)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpload)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296)
                .addComponent(btnSave)
                .addGap(21, 21, 21))
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
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(engineNo)
                    .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNo)
                    .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(licensePlate)
                        .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(warrantyYear)
                        .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(serviceRecords)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceRecordDate)
                            .addComponent(txtServiceRecordDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceRecordMileage)
                            .addComponent(txtMileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costOfService)
                            .addComponent(txtCostOfService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(btnAddServiceRecord)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oEmail)
                    .addComponent(txtOEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oName)
                    .addComponent(oTel)
                    .addComponent(txtOTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oLicence)
                    .addComponent(txtOLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpload)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtEngineNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngineNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEngineNoActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        choose.setFileFilter(new FileNameExtensionFilter("JPEG images", "jpeg"));
        choose.showOpenDialog(null);
        File f = choose.getSelectedFile();
        String filename = f.getAbsolutePath();
        txtPhotoPath.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        photo.setIcon(icon);
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        car.setBrand(txtBrand.getText());
        car.setColor(txtColor.getText());
        car.setEngineNo(txtEngineNo.getText());
        car.setLicensePlate(txtLicencePlate.getText());
        car.setModel(txtModel.getText());
        car.setSeatsNo(Integer.parseInt(txtSeatNo.getText()));
        car.setServiceRecords(txtServiceRecordDate.getText());
        car.setWarrantyYear(Integer.parseInt(txtWarrantyYear.getText()));
        car.setYear(Integer.parseInt(txtYear.getText()));
        car.setoAddress(txtOAddress.getText());
        car.setoEmail(txtOEmail.getText());
        car.setoLicense(Integer.parseInt(txtOLicence.getText()));
        car.setoName(txtOName.getText());
        car.setoSSN(Integer.parseInt(txtOSSN.getText()));
        car.setoTel(Integer.parseInt(txtOTel.getText()));
        car.setPhoto(String.valueOf(photo.getIcon()));

        JOptionPane.showMessageDialog(this, "Car saved successfully!!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPhotoPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhotoPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoPathActionPerformed

    private void btnAddServiceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceRecordActionPerformed
        // TODO add your handling code here:
        
        String serviceRecordDate = txtServiceRecordDate.getText();
        int serviceRecordMileage = Integer.parseInt(txtMileage.getText());
        int costOfService = Integer.parseInt(txtCostOfService.getText());
        
        Car cs = history.addNewServiceRecord();
        
        cs.setMileage(serviceRecordMileage);
        cs.setCostOfService(costOfService);
        cs.setDate(serviceRecordDate);
        
        JOptionPane.showMessageDialog(this, "New service record added");
        
        txtServiceRecordDate.setText("");
        txtMileage.setText("");
        txtCostOfService.setText("");
    }//GEN-LAST:event_btnAddServiceRecordActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtCostOfServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostOfServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostOfServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnAddServiceRecord;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel color;
    private javax.swing.JLabel costOfService;
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
    private javax.swing.JLabel serviceRecordDate;
    private javax.swing.JLabel serviceRecordMileage;
    private javax.swing.JLabel serviceRecords;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCostOfService;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtMileage;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOAddress;
    private javax.swing.JTextField txtOEmail;
    private javax.swing.JTextField txtOLicence;
    private javax.swing.JTextField txtOName;
    private javax.swing.JTextField txtOSSN;
    private javax.swing.JTextField txtOTel;
    private javax.swing.JTextField txtPhotoPath;
    private javax.swing.JTextField txtSeatNo;
    private javax.swing.JTextField txtServiceRecordDate;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel warrantyYear;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
