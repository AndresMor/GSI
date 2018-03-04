/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public static Hashtable<String, ArrayList<String>> directory;
    public static Vector<String> vec;
    public static BigInteger n, m;
    File archivo = new File("test.txt");
    File archive;

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

        Fc = new javax.swing.JFileChooser();
        Btn_max_min = new javax.swing.JButton();
        Btn_promedio = new javax.swing.JButton();
        btn_moda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        Txt_rp = new javax.swing.JTextField();
        btn_archivo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_sort = new javax.swing.JButton();
        Btn_llenar = new javax.swing.JButton();
        Btn_search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_max_min.setBackground(new java.awt.Color(204, 204, 204));
        Btn_max_min.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        Btn_max_min.setText("Max / Min");
        Btn_max_min.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_max_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_max_minActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_max_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 20, 100, 31));

        Btn_promedio.setBackground(new java.awt.Color(204, 204, 204));
        Btn_promedio.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        Btn_promedio.setText("Media");
        Btn_promedio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_promedioActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 20, 100, 31));

        btn_moda.setBackground(new java.awt.Color(204, 204, 204));
        btn_moda.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        btn_moda.setText("Moda");
        btn_moda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_moda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_moda, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 20, 100, 31));

        JTable.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(JTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 909, 400));

        Txt_rp.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        getContentPane().add(Txt_rp, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 80, 580, 40));

        btn_archivo.setBackground(new java.awt.Color(204, 204, 204));
        btn_archivo.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        btn_archivo.setText("Cargar Archivo");
        btn_archivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_archivoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 20, 140, 31));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Llenar Campos: ");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ordenar : ");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar:");

        Btn_sort.setBackground(new java.awt.Color(204, 204, 204));
        Btn_sort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sort.png"))); // NOI18N
        Btn_sort.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sortActionPerformed(evt);
            }
        });

        Btn_llenar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_llenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder.png"))); // NOI18N
        Btn_llenar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_llenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_llenarActionPerformed(evt);
            }
        });

        Btn_search.setBackground(new java.awt.Color(204, 204, 204));
        Btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loupe.png"))); // NOI18N
        Btn_search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_llenar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 155));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_llenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_llenarActionPerformed
        try {
            n = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de registros N ")));
            do {
                m = BigInteger.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de campos M ")));
            } while (m.compareTo(BigInteger.ZERO) <= 0);
            directory = new Hashtable<>();
            vec = new Vector<>();
            String[] rows = new String[m.intValue() + 1];
            int sw;
            String key, cad, camps;
            int[] random = new int[m.intValue()];
            random = RandomPos(random);
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            for (int i = 0; i < m.intValue() + 1; i++) {
                if (i == 0) {
                    model.addColumn("Key");
                } else {
                    model.addColumn("C." + i);
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));) {
                for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
                    ArrayList<String> campos = new ArrayList<>();
                    sw = 0;
                    camps = "";
                    for (BigInteger j = BigInteger.ZERO; j.compareTo(m) < 0; j = j.add(BigInteger.ONE)) {
                        switch (sw) {
                            case 0:
                                cad = RandomNum(BigInteger.valueOf(random[j.intValue()]), BigInteger.ZERO, "");
                                campos.add(cad);
                                camps += cad + ";";
                                rows[j.intValue() + 1] = cad;
                                sw = 1;
                                break;
                            case 1:
                                cad = RandomLetter(BigInteger.valueOf(random[j.intValue()]), BigInteger.ZERO, "");
                                campos.add(cad);
                                camps += cad + ";";
                                rows[j.intValue() + 1] = cad;
                                sw = 0;
                                break;
                        }
                    }
                    do {
                        key = RandomNum(BigInteger.valueOf(10), BigInteger.ZERO, "");
                    } while (directory.containsKey(key)); //Verificar que la clave no se repita
                    rows[0] = key;
                    vec.add(key);
                    bw.write(key + ";" + camps);
                    bw.newLine();
                    directory.put(key, campos);//Direccionar información
                    model.addRow(rows);
                }
                JTable.setModel(model);
                System.out.println("¬Arhivo Cargado¬");
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_Btn_llenarActionPerformed

    private void Btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_searchActionPerformed
        try {
            int seleccion = JOptionPane.showOptionDialog(null, "Buscar por : ",
                    "Select", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                    new Object[]{"Llave", "Campo", "Dato"}, "LLave");

            if (seleccion == 0) {
                String key = (JOptionPane.showInputDialog("Ingrese la llave: "));
                if (directory.containsKey(key)) {
                    String dat = (JOptionPane.showInputDialog("Ingrese el dato: "));
                    ArrayList<String> r = directory.get(key);
                    if (r.contains(dat)) {
                        JOptionPane.showMessageDialog(null, "El " + dat + " se encontro con la llave " + key);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Llave incorrecta");
                }
            } else if (seleccion == 1) {
                int camp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el campo: ")) - 1;
                if (camp < m.intValue() && camp >= 0) {
                    String dat = (JOptionPane.showInputDialog("Ingrese el dato: "));
                    Enumeration<String> llaves = directory.keys();
                    String cad;
                    boolean sw = true;
                    ArrayList<String> c;
                    while (llaves.hasMoreElements()) {
                        cad = llaves.nextElement();
                        c = directory.get(cad);
                        if (c.get(camp).equals(dat)) {
                            sw = false;
                            break;
                        }
                    }
                    if (!sw) {
                        JOptionPane.showMessageDialog(null, "El " + dat + " se encontro en el campo " + camp);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Campo incorrecto");
                }
            } else {
                Enumeration<String> enumeration = directory.keys();
                String dat = (JOptionPane.showInputDialog("Ingrese el dato: "));
                int i = 0;
                int j = 0;
                boolean sw = true;
                while (enumeration.hasMoreElements()) {
                    String key = enumeration.nextElement();
                    ArrayList<String> r = directory.get(key);
                    while (i < r.size()) {
                        if (r.get(i).contains(dat)) {
                            JOptionPane.showMessageDialog(null, "Se encontro el dato: " + dat + " en el campo " + (i + 1) + " registro con llave " + key);
                            sw = false;
                            break;
                        }
                        i++;
                    }
                    i = 0;
                    if (!sw) {
                        break;
                    }
                }
                if (sw) {
                    JOptionPane.showMessageDialog(null, "No se encontro");
                }
            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_Btn_searchActionPerformed

    private void Btn_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sortActionPerformed
        if (!vec.isEmpty()) {
            Collections.sort(vec);
            ArrayList<String> r;
            String[] rows = new String[m.intValue() + 1];
            String val, camps;
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            for (int i = 0; i < m.intValue() + 1; i++) {
                if (i == 0) {
                    model.addColumn("Key");
                } else {
                    model.addColumn("C." + i);
                }
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));) {
                for (int i = 0; i < vec.size(); i++) {
                    val = vec.get(i);
                    r = directory.get(val);
                    camps = "";
                    for (int j = 0; j < r.size(); j++) {
                        camps += r.get(j) + "|";
                        rows[j + 1] = r.get(j);
                    }
                    rows[0] = val;
                    bw.write("Llaves: " + val + " " + camps);
                    bw.newLine();
                    model.addRow(rows);
                }
                JTable.setModel(model);
                System.out.println("¬Arhivo Ordenado Cargado¬");
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_Btn_sortActionPerformed

    private void Btn_max_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_max_minActionPerformed
        try {
            Txt_rp.setText("");
            String max = "", min = "", data;
            int camp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el campo: ")) - 1;
            if (camp < m.intValue() && camp >= 0) {
                Enumeration<String> llaves = directory.keys();
                String cad;
                ArrayList<String> c;
                boolean sw = true;
                while (llaves.hasMoreElements()) {
                    cad = llaves.nextElement();
                    c = directory.get(cad);
                    if (sw == true) {
                        min = c.get(camp);
                        max = min;
                        sw = false;
                    } else {
                        data = c.get(camp);
                        if (data.compareTo(max) > 0) {
                            max = data;
                        }
                        if (data.compareTo(min) < 0) {
                            min = data;
                        }
                    }
                }
                Txt_rp.setText("El dato mayor y menor del campo " + (camp + 1) + " es: " + max + "/" + min);

            } else {
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_Btn_max_minActionPerformed

    private void Btn_promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_promedioActionPerformed
        try {
            Txt_rp.setText("");
            int camp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el campo: ")) - 1;
            BigInteger sum = BigInteger.ZERO;
            if (camp < m.intValue() && camp >= 0) {
                Enumeration<String> llaves = directory.keys();
                String cad;
                ArrayList<String> c;
                boolean sw = true;
                while (llaves.hasMoreElements()) {
                    cad = llaves.nextElement();
                    c = directory.get(cad);
                    if (isNumeric(c.get(camp))) {
                        sum = sum.add(new BigInteger(c.get(camp)));
                    } else {
                        sw = false;
                        break;
                    }

                }
                if (sw) {
                    Txt_rp.setText("El promedio de datos del campo " + (camp + 1) + " es: " + sum.divide(n));
                } else {
                    JOptionPane.showMessageDialog(null, "El campo no es numerico");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_Btn_promedioActionPerformed

    private void btn_modaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modaActionPerformed
        try {
            Txt_rp.setText("");
            int camp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el campo: ")) - 1;
            if (camp < m.intValue() && camp >= 0) {
                Enumeration<String> llaves = directory.keys();
                String cad;
                ArrayList<String> c;
                ArrayList<String> r = new ArrayList<>();
                int cont = 0, dis = 0;
                String me = "0";
                while (llaves.hasMoreElements()) {
                    cad = llaves.nextElement();
                    c = directory.get(cad);
                    r.add(c.get(camp));
                }
                Collections.sort(r);//Campos ordenados
                for (int i = 0; i < r.size() - 1; i++) {//Moda : Se compara la distancia de los datos consecutivos 
                    if (r.get(i).compareTo(r.get(i + 1)) == 0) {
                        cont++;
                        if (cont > dis) {
                            me = r.get(i) + "";
                            dis = cont;
                        } else if (cont == dis) {
                            me = r.get(i);
                        }
                    } else {
                        cont = 0;
                    }
                }
                Txt_rp.setText("La moda en el campo " + (camp + 1) + " es: " + me);
            } else {
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_modaActionPerformed

    private void btn_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_archivoActionPerformed
        FileNameExtensionFilter filter
                = new FileNameExtensionFilter("Archivos.txt", "txt", "texto");
        Fc.setFileFilter(filter);
        int Opcion = Fc.showOpenDialog(this); //Mostrar el FileChooser
        if (Opcion == JFileChooser.APPROVE_OPTION) {//Si el usuario escogió abrir
            directory = new Hashtable<>();
            vec = new Vector<>();
            n = BigInteger.ZERO;
            archive = Fc.getSelectedFile();
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            try (Scanner lector = new Scanner(archive)) {//Mientras el archivo tenga otra linea
                String[] datos;
                String Linea = lector.nextLine();
                datos = Linea.split(";");//Obtengo la primera linea del archivo para obtener el numero de campos y crear las columnas
                m = BigInteger.valueOf(datos.length);
                for (int i = 0; i < m.intValue(); i++) {
                    if (i == 0) {
                        model.addColumn("Key");
                    } else {
                        model.addColumn("C." + i);
                    }
                }
                m = m.subtract(BigInteger.ONE);
                ArrayList<String> campos = new ArrayList<>(Arrays.asList(datos));
                String key = campos.get(0);
                campos.remove(0);
                vec.add(key);
                directory.put(key, campos);
                n = n.add(BigInteger.ONE);
                model.addRow(datos);
                while (lector.hasNext()) {
                    Linea = lector.nextLine();//Pedir Linea
                    datos = Linea.split(";");//Separar los datos
                    model.addRow(datos);//Agregamos datos a la table
                    //Hash
                    campos = new ArrayList<>(Arrays.asList(datos)); //Convertimos el vector en Arraylist
                    key = campos.get(0); //Obtenemos la llave
                    campos.remove(0); //Eliminamos la llave del Arraylist de campos
                    directory.put(key, campos); // La agregarmos al HashTable
                    vec.add(key);
                    n = n.add(BigInteger.ONE);
                }
                //System.out.println(vec.size());
            } catch (FileNotFoundException ex) {
                // TODO enviar mensaje al usuario
            } catch (NumberFormatException ex) {
                // TODO enviar mensaje al usuario
            } catch (Exception ex) {
                // TODO enviar mensaje al usuario
            }
        }

    }//GEN-LAST:event_btn_archivoActionPerformed

    public static String RandomNum(BigInteger tam, BigInteger i, String numbers) {
        while (i.compareTo(tam) < 0) {
            String num = "" + (int) (Math.random() * 10);
            numbers += num;
            i = i.add(BigInteger.ONE);
        }
        return numbers;

    }

    public static String RandomLetter(BigInteger tam, BigInteger i, String letters) {
        while (i.compareTo(tam) < 0) {
            letters += (char) (Math.random() * (123 - 97) + 97);
            i = i.add(BigInteger.ONE);
        }
        return letters;
    }

    public static int[] RandomPos(int[] random) {
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 15 + 1);
        }
        return random;
    }

    public static boolean isNumeric(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
    private javax.swing.JFileChooser Fc;
    private javax.swing.JTable JTable;
    private javax.swing.JTextField Txt_rp;
    private javax.swing.JButton btn_archivo;
    private javax.swing.JButton btn_moda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
