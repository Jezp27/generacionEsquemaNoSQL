/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Regla4 extends javax.swing.JFrame {

    /**
     * Creates new form Regla4
     */
    public Regla4() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.q1Result.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q1Result = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atributosTabla1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        s1T2Queries = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        s1T3Queries = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTabla1 = new javax.swing.JTextField();
        nombreTabla2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atributosTabla3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nombreTabla3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        atributosTabla2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        s3Queries = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        q1Result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        q1Result.setForeground(new java.awt.Color(0, 153, 153));
        q1Result.setText("Q':");

        atributosTabla1.setColumns(20);
        atributosTabla1.setRows(5);
        jScrollPane2.setViewportView(atributosTabla1);

        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Ingrese en el campo correpondiente los atributos de cada query separándolos por coma. ");

        jLabel8.setText("Atributos de S1 para T2:");

        jLabel9.setText("Atributos de S1 para T3:");

        s1T2Queries.setColumns(20);
        s1T2Queries.setRows(5);
        jScrollPane3.setViewportView(s1T2Queries);

        s1T3Queries.setColumns(20);
        s1T3Queries.setRows(5);
        jScrollPane4.setViewportView(s1T3Queries);

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Creating Collections with Embedded Documents for Document Databases Taking into Account the Queries - Rule 4");

        jLabel2.setText("Nombre Tabla 1:");

        jLabel3.setText("Nombre Tabla 2:");

        nombreTabla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTabla2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Atributos Tabla 1:");

        jLabel5.setText("Atributos Tabla 3:");

        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Ingrese los atributos de las tres tablas separándolos por comas, por favor no incluya caracteres especiales");

        atributosTabla3.setColumns(20);
        atributosTabla3.setRows(5);
        jScrollPane1.setViewportView(atributosTabla3);

        jButton1.setText("Obtener Q'");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre Tabla 3:");

        jLabel11.setText("Atributos Tabla 2:");

        atributosTabla2.setColumns(20);
        atributosTabla2.setRows(5);
        jScrollPane5.setViewportView(atributosTabla2);

        s3Queries.setColumns(20);
        s3Queries.setRows(5);
        jScrollPane6.setViewportView(s3Queries);

        jLabel12.setText("Atributos S3:");

        volver.setText("Volver al Menú Principal");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("Presione enter después de ingresar todos los atributos de un query y proceda con el siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(nombreTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(nombreTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(122, 122, 122))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(133, 133, 133))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(q1Result))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButton1)
                        .addGap(92, 92, 92)
                        .addComponent(volver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel13)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTabla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(volver))
                        .addGap(29, 29, 29)))
                .addComponent(q1Result)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTabla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTabla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTabla2ActionPerformed

    //Obtiene el resultado de la union de dos conjuntos
    private ArrayList<String> union(ArrayList<String> conjunto1, ArrayList<String> conjunto2) {
        ArrayList<String> Q = new ArrayList<>();
        Q.addAll(conjunto1);

        for (String conjunto2i : conjunto2) {
            if (!Q.contains(conjunto2i)) {
                Q.add(conjunto2i);
                //System.out.println(conjunto2i);
            }
        }
        //System.out.println(Q.size());
        return Q;
    }

    //Obtiene el conjunto interseccion de dos conjuntos
    private ArrayList<String> interseccion(String[] conjunto1, ArrayList<String> conjunto2) {
        ArrayList<String> conjuntoI = new ArrayList<>();

        for (int j = 0; j < conjunto1.length; j++) {
            if (conjunto2.contains(conjunto1[j])) {
                conjuntoI.add(conjunto1[j]);
            }
        }
        //System.out.println(conjuntoI.size());
        return conjuntoI;
    }

    //Determinar si dos conjuntos son iguales (Mismos elementos, en el mismo orden)
    private boolean elementosIguales(String[] conjunto1, ArrayList<String> conjuntoN) {
        ArrayList<String> castConjunto1 = new ArrayList<>();
        castConjunto1.addAll(Arrays.asList(conjunto1));

        Collections.sort(castConjunto1);
        Collections.sort(conjuntoN);

        return castConjunto1.equals(conjuntoN);
    }

    //Devuelve el conjunto resultado de la diferencia entre  dos conjuntos
    private ArrayList<String> diferenciaConjuntos(String[] conjuntoS1, ArrayList<String> conjuntoTnS3) {
        ArrayList<String> conjuntoS1_T2S2 = new ArrayList<>();
        ArrayList<String> atributosS1i = new ArrayList<>();

        for (String conjuntoS1i : conjuntoS1) {
            String[] s1Atributos = conjuntoS1i.split("\\s*,\\s*");
            for (String S1i : s1Atributos) {
                if (!conjuntoTnS3.contains(S1i)) {
                    atributosS1i.add(S1i);
                }
            }

            if (!atributosS1i.isEmpty() && !elementosIguales(s1Atributos, atributosS1i)) {
                conjuntoS1_T2S2.addAll(atributosS1i);
            }
        }

        //Guardar solo los atributos unicos obtenidos de la diferencia
        ArrayList<String> unicosConjuntoS1_T2S2 = new ArrayList<>();

        for (String sti : conjuntoS1_T2S2) {
            if (!unicosConjuntoS1_T2S2.contains(sti)) {
                unicosConjuntoS1_T2S2.add(sti);
            }
        }

        return unicosConjuntoS1_T2S2;
    }

    private ArrayList<String> obtenerTDoblePrima(String[] conjuntoS1, ArrayList<String> conjuntoTnS3) {
        ArrayList<String> tDoblePrima = new ArrayList<>();

        for (String conjuntoS1i : conjuntoS1) {
            String[] s1Atributos = conjuntoS1i.split("\\s*,\\s*");
            if (this.interseccion(s1Atributos, conjuntoTnS3).isEmpty() && !s1Atributos[0].isEmpty()) {
                tDoblePrima.addAll(Arrays.asList(s1Atributos));
            }
        }
        return tDoblePrima;
    }

    private String obtenerTPrimas(String[] tableN, String tableName, String[] conjuntoS1, int n) {
        String[] conjuntoS3 = s3Queries.getText().split("(\n|\r)");
        ArrayList<String> conjuntoTnS3 = new ArrayList<>();
        ArrayList<String> conjuntoTN = new ArrayList<>();
        conjuntoTN.addAll(Arrays.asList(tableN));

        for (String conjuntoS3i : conjuntoS3) {
            String[] s3Atributos = conjuntoS3i.split("\\s*,\\s*");
            for (String S3i : s3Atributos) {
                //Agrega elemento al conjunto TnS3 si está en S3 y pertenece a TN
                if (conjuntoTN.contains(S3i) && !conjuntoTnS3.contains(S3i)) {
                    conjuntoTnS3.add(S3i);
                }
            }
        }
        ArrayList<String> s1SinTnS3 = this.diferenciaConjuntos(conjuntoS1, conjuntoTnS3);
        ArrayList<String> tPrimaN = this.union(conjuntoTnS3, s1SinTnS3);
        ArrayList<String> tDoblePrima = this.obtenerTDoblePrima(conjuntoS1, conjuntoTnS3);

        String qPrima = "";

        if (!tPrimaN.isEmpty() && !tableName.isEmpty()) {
            qPrima = tableName + "_of_" + this.nombreTabla1.getText() + ":{";

            for (int i = 0; i < tPrimaN.size(); i++) {
                qPrima = qPrima + tPrimaN.get(i) + ",";
            }

            qPrima = qPrima.substring(0, qPrima.length() - 1) + "}";
        }

        if (!tDoblePrima.isEmpty()) {
            qPrima = qPrima + ", T''" + n + ":{";
            for (String tPi : tDoblePrima) {
                qPrima = qPrima + tPi + ",";
            }
            qPrima = qPrima.substring(0, qPrima.length() - 1) + "}";
        }

        return qPrima;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.q1Result.setText("");
        //String[] T1 = atributosTabla1.getText().split("\\s*,\\s*");
        String[] T2 = atributosTabla2.getText().split("\\s*,\\s*");
        String[] T3 = atributosTabla3.getText().split("\\s*,\\s*");

        String[] conjuntoS1T2 = s1T2Queries.getText().split("(\n|\r)");
        String[] conjuntoS1T3 = s1T3Queries.getText().split("(\n|\r)");

        String tPrima2 = this.obtenerTPrimas(T2, this.nombreTabla2.getText(), conjuntoS1T2, 2);
        String tPrima3 = this.obtenerTPrimas(T3, this.nombreTabla3.getText(), conjuntoS1T3, 3);

        String qPrima = "Q'={" + atributosTabla1.getText();

        if (!tPrima2.equals("")) {
            qPrima = qPrima + ", " + tPrima2;
        }

        if (!tPrima3.equals("")) {
            qPrima = qPrima + ", " + tPrima3;
        }

        qPrima = qPrima + "}";

        this.q1Result.setVisible(true);
        this.q1Result.setText(qPrima);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        MenuPrincipalP1 menu = new MenuPrincipalP1();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Regla4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regla4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regla4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regla4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regla4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atributosTabla1;
    private javax.swing.JTextArea atributosTabla2;
    private javax.swing.JTextArea atributosTabla3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField nombreTabla1;
    private javax.swing.JTextField nombreTabla2;
    private javax.swing.JTextField nombreTabla3;
    private javax.swing.JLabel q1Result;
    private javax.swing.JTextArea s1T2Queries;
    private javax.swing.JTextArea s1T3Queries;
    private javax.swing.JTextArea s3Queries;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
