
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ingreso.java
 *
 * Created on 14/07/2010, 10:21:37 PM
 */

/**
 *
 * @author simpus
 */
public class Ingreso extends javax.swing.JDialog {

    /** Creates new form Ingreso */
    double TOTAL;
    DecimalFormat dosdigitos;

    public Ingreso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        dosdigitos = new DecimalFormat("0.00");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESO DE DINERO");

        jLabel17.setText("TOTAL");

        jTextField13.setEditable(false);
        jTextField13.setText("$ 0.00");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("<HTML>INGRESE EL NUMERO DE MONEDAS Y BILLETES QUE <BR>QUIERA AGREGAR A LA CANTIDAD ACTUAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField7.setText("0");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel10.setText("Billetes ");

        jLabel11.setText("500");

        jLabel9.setText("20");

        jLabel12.setText("200");

        jTextField8.setText("0");
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });

        jTextField9.setText("0");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("N° Billetes");

        jLabel14.setText("50");

        jTextField10.setText("0");
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });

        jLabel15.setText("100");

        jTextField11.setText("0");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });

        jLabel16.setText("1000");

        jTextField12.setText("0");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField11)
                        .addComponent(jTextField7)
                        .addComponent(jTextField8)
                        .addComponent(jTextField9)
                        .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(jTextField10))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("20");

        jLabel7.setText("10");

        jTextField6.setText("0");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });

        jTextField4.setText("0");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.setText("0");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jLabel2.setText("0.5");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("Monedas");

        jLabel6.setText("5");

        jTextField2.setText("0");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel4.setText("1");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("N° Monedas");

        jTextField1.setText("0");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jLabel5.setText("2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void calcularTotal()
    {
       try
       {
           TOTAL = Integer.parseInt(jTextField1.getText()) * Double.parseDouble(jLabel2.getText());
           TOTAL+= Integer.parseInt(jTextField2.getText()) * Double.parseDouble(jLabel4.getText());
           TOTAL+= Integer.parseInt(jTextField3.getText()) * Double.parseDouble(jLabel5.getText());
           TOTAL+= Integer.parseInt(jTextField4.getText()) * Double.parseDouble(jLabel6.getText());
           TOTAL+= Integer.parseInt(jTextField5.getText()) * Double.parseDouble(jLabel7.getText());
           TOTAL+= Integer.parseInt(jTextField6.getText()) * Double.parseDouble(jLabel8.getText());
           TOTAL+= Integer.parseInt(jTextField12.getText()) * Double.parseDouble(jLabel9.getText());
           TOTAL+= Integer.parseInt(jTextField10.getText()) * Double.parseDouble(jLabel14.getText());
           TOTAL+= Integer.parseInt(jTextField9.getText()) * Double.parseDouble(jLabel15.getText());
           TOTAL+= Integer.parseInt(jTextField8.getText()) * Double.parseDouble(jLabel12.getText());
           TOTAL+= Integer.parseInt(jTextField7.getText()) * Double.parseDouble(jLabel11.getText());
           TOTAL+= Integer.parseInt(jTextField11.getText()) * Double.parseDouble(jLabel16.getText());
           jTextField13.setText("$ "+dosdigitos.format(TOTAL));
           jButton1.setEnabled(true);
       }
       catch(NumberFormatException e)
       {
           JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n"+e,"ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
           jButton1.setEnabled(false);

       }
    }


    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().compareTo("")==0)
            jTextField1.setText("0");
        try
        {
            Integer.parseInt(jTextField1.getText());
        }
        catch(NumberFormatException e){
            jTextField1.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ServidorMysql ingreso = new ServidorMysql();
        ingreso.coneccion("localhost");
        ingreso.consulta("Select * from dinero");
        try {
            ingreso.ConjuntoResultado.next();
            ingreso.operacion("update dinero set m50c = "+(ingreso.ConjuntoResultado.getInt("m50c")+ Integer.parseInt(jTextField1.getText())));
            ingreso.operacion("update dinero set m1 = "+(ingreso.ConjuntoResultado.getInt("m1")+ Integer.parseInt(jTextField2.getText())));
            ingreso.operacion("update dinero set m2 = "+(ingreso.ConjuntoResultado.getInt("m2")+ Integer.parseInt(jTextField3.getText())));
            ingreso.operacion("update dinero set m5 = "+(ingreso.ConjuntoResultado.getInt("m5")+ Integer.parseInt(jTextField4.getText())));
            ingreso.operacion("update dinero set m10 = "+(ingreso.ConjuntoResultado.getInt("m10")+ Integer.parseInt(jTextField5.getText())));
            ingreso.operacion("update dinero set m20 = "+(ingreso.ConjuntoResultado.getInt("m20")+ Integer.parseInt(jTextField6.getText())));
            ingreso.operacion("update dinero set b20 = "+(ingreso.ConjuntoResultado.getInt("b20")+ Integer.parseInt(jTextField12.getText())));
            ingreso.operacion("update dinero set b50 = "+(ingreso.ConjuntoResultado.getInt("b50")+ Integer.parseInt(jTextField10.getText())));
            ingreso.operacion("update dinero set b100 = "+(ingreso.ConjuntoResultado.getInt("b100")+ Integer.parseInt(jTextField9.getText())));
            ingreso.operacion("update dinero set b200 = "+(ingreso.ConjuntoResultado.getInt("b200")+ Integer.parseInt(jTextField8.getText())));
            ingreso.operacion("update dinero set b500 = "+(ingreso.ConjuntoResultado.getInt("b500")+ Integer.parseInt(jTextField7.getText())));
            ingreso.operacion("update dinero set b1000 = "+(ingreso.ConjuntoResultado.getInt("b1000")+ Integer.parseInt(jTextField11.getText())));
            dispose();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR EN LA BASE DE DATOS\n","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().compareTo("")==0)
            jTextField2.setText("0");
        try
        {
            Integer.parseInt(jTextField2.getText());
        }
        catch(NumberFormatException e){
             jTextField2.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
           
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().compareTo("")==0)
            jTextField3.setText("0");
        try
        {
            Integer.parseInt(jTextField3.getText());
        }
        catch(NumberFormatException e){
            jTextField3.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
       if(jTextField4.getText().compareTo("")==0)
            jTextField4.setText("0");
       try
        {
            Integer.parseInt(jTextField4.getText());
        }
        catch(NumberFormatException e){
            jTextField4.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        if(jTextField5.getText().compareTo("")==0)
            jTextField5.setText("0");
        try
        {
            Integer.parseInt(jTextField5.getText());
        }
        catch(NumberFormatException e){
            jTextField5.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        if(jTextField6.getText().compareTo("")==0)
            jTextField6.setText("0");
        try
        {
            Integer.parseInt(jTextField6.getText());
        }
        catch(NumberFormatException e){
            jTextField6.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
         if(jTextField12.getText().compareTo("")==0)
            jTextField12.setText("0");
         try
        {
            Integer.parseInt(jTextField12.getText());
        }
        catch(NumberFormatException e){
            jTextField12.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
         if(jTextField10.getText().compareTo("")==0)
            jTextField10.setText("0");
         try
        {
            Integer.parseInt(jTextField10.getText());
        }
        catch(NumberFormatException e){
            jTextField10.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if(jTextField9.getText().compareTo("")==0)
            jTextField9.setText("0");
        try
        {
            Integer.parseInt(jTextField9.getText());
        }
        catch(NumberFormatException e){ 
            jTextField9.setText("0");
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
           
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
         if(jTextField8.getText().compareTo("")==0)
            jTextField8.setText("0");
         try
        {
            Integer.parseInt(jTextField8.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            jTextField8.setText("0");
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
         if(jTextField7.getText().compareTo("")==0)
            jTextField7.setText("0");
         try
        {
            Integer.parseInt(jTextField7.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            jTextField7.setText("0");
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        if(jTextField11.getText().compareTo("")==0)
            jTextField11.setText("0");
        try
        {
            Integer.parseInt(jTextField11.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"DEBE INTRODUCIR UNICAMENTE NUMEROS\n","ERROR DE FORMATO",JOptionPane.ERROR_MESSAGE);
            jTextField11.setText("0");
            return;
        }
        calcularTotal();
    }//GEN-LAST:event_jTextField11FocusLost



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
