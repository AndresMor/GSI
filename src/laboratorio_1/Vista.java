/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public static Hashtable<String, ArrayList<String>> directory;
    public static Vector<Integer> vec;
    public static BigInteger n, m, k;
    File archivo = new File("Archivo.txt");
    BufferedWriter bw;

    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btn_llenar = new javax.swing.JButton();
        Btn_sort = new javax.swing.JButton();
        Btn_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_max_min = new javax.swing.JButton();
        Btn_promedio = new javax.swing.JButton();
        btn_moda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Llenar Campos: ");

        Btn_llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_llenarActionPerformed(evt);
            }
        });

        Btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sortActionPerformed(evt);
            }
        });

        Btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_searchActionPerformed(evt);
            }
        });

        jLabel2.setText("Ordenar : ");

        jLabel3.setText("Buscar:");

        Btn_max_min.setText("Max / Min");

        Btn_promedio.setText("Media");

        btn_moda.setText("Moda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_max_min, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_moda, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_llenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_max_min, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_llenarActionPerformed
        n = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de registros N ")));
        m = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de campos M ")));
        k = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longuitud de los campos K ")));
        directory = new Hashtable<>();
        int sw;
        String key, cad, camps = "";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));) {
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {//Direccionar información
            ArrayList<String> campos = new ArrayList<>();
            sw = 0;
            camps = "";
                for (BigInteger j = BigInteger.ZERO; j.compareTo(m) < 0; j = j.add(BigInteger.ONE)) {
                    switch (sw) {
                        case 0:
                            cad = RandomNum(k, BigInteger.ZERO, "");
                            campos.add(cad);
                            camps += cad + "|";
                            sw = 1;
                            break;
                        case 1:
                            cad = RandomLetter(k, BigInteger.ZERO, "");
                            campos.add(cad);
                            camps += cad + "|";
                            sw = 0;
                            break;
                    }
                }

                do {
                    key = RandomNum(BigInteger.valueOf(5), BigInteger.ZERO, "");
                } while (directory.containsKey(key)); //Verificar que la clave no se repita

                bw.write("Llaves: " + key + " " + camps);
                bw.newLine();
                directory.put(key, campos);
           
        }
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Btn_llenarActionPerformed

    private void Btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_searchActionPerformed
        int seleccion = JOptionPane.showOptionDialog(null, "Buscar por : ",
                "Select", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Llave", "Campo"}, "LLave");

        if (seleccion == 0) {
            String key = (JOptionPane.showInputDialog("Ingrese la llave: "));
            if (directory.containsKey(key)) {
                String dat = (JOptionPane.showInputDialog("Ingrese el dato: "));
                ArrayList<String> r = directory.get(key);
                if (r.contains(dat)) {
                    JOptionPane.showMessageDialog(null, "El " + dat + " se encontro");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Llave incorrecta");
            }
        } else {
            int camp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el campo: ")) - 1;
            if (camp < m.intValue() && camp >= 0) {
                String dat = (JOptionPane.showInputDialog("Ingrese el dato: "));
                Enumeration<String> llaves = directory.keys();
                String cad;
                ArrayList<String> c;
                boolean sw = true;
                while (llaves.hasMoreElements() && sw == true) {
                    cad = llaves.nextElement();
                    c = directory.get(cad);
                    if (c.get(camp).equals(dat)) {
                        sw = false;
                    }
                }
                if (!sw) {
                    JOptionPane.showMessageDialog(null, "El " + dat + " se encontro");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }
        }

    }//GEN-LAST:event_Btn_searchActionPerformed

    private void Btn_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sortActionPerformed
        Collections.sort(vec);
        ArrayList<String> r;
        String val;
        System.out.println("_");
        for (int i = 0; i < vec.size(); i++) {
            val = vec.get(i).toString();
            r = directory.get(val);
            System.out.print("Llaves: " + val + " " + "Datos: ");
            for (int j = 0; j < r.size(); j++) {
                System.out.print(r.get(j) + "|");
            }
            System.out.println("");
        }
    }//GEN-LAST:event_Btn_sortActionPerformed

    public static String RandomNum(BigInteger tam, BigInteger i, String numbers) {
        while (i.compareTo(tam) < 0) {
            String num = "" + ((int) (Math.random() * 9) + 1);
            numbers += num;
            i = i.add(BigInteger.ONE);
        }
        return numbers;

    }

    public static String RandomLetter(BigInteger tam, BigInteger i, String letters) {
        while (i.compareTo(tam) < 0) {
            letters += (char) (Math.random() * (91 - 65) + 65);
            i = i.add(BigInteger.ONE);
        }
        return letters;
    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_llenar;
    private javax.swing.JButton Btn_max_min;
    private javax.swing.JButton Btn_promedio;
    private javax.swing.JButton Btn_search;
    private javax.swing.JButton Btn_sort;
    private javax.swing.JButton btn_moda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
