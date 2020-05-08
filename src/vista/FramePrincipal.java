/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.*;
import controlador.ConexionBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fer
 */
public class FramePrincipal extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();
    Connection cn = con.getConexion();
    private String texto, atributo = "Id";

    private String setTextArea() {
        return "Cargando programa...\n";  
    }
    
    public FramePrincipal() {
        initComponents();
        jTextArea1.setText(setTextArea()+"\n"+con.getString());
        texto = jTextArea1.getText();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        crearButtonGroupBuscar();
        agregarItemsComboBoxActor();
        agregarItemsComboBoxPelicula();
        agregarItemsComboBoxModificar();
        btnGuardarCambios.setVisible(false);
    }

    public void agregarItemsComboBoxActor() {
        jComboBoxActor.addItem("idActores");
        jComboBoxActor.addItem("Nombre");
        jComboBoxActor.addItem("Apellido");
        jComboBoxActor.addItem("ANacimiento");
        jComboBoxActor.addItem("Nacionalidad");
    }
    
    public void agregarItemsComboBoxPelicula() {
        jComboBoxPelicula.addItem("idPeliculas");
        jComboBoxPelicula.addItem("Titulo");
        jComboBoxPelicula.addItem("Anio");
        jComboBoxPelicula.addItem("Duracion");
        jComboBoxPelicula.addItem("Resumen");
        
    }
    
    public void agregarItemsComboBoxModificar() {
        jComboBoxModificar.addItem("Actores");
        jComboBoxModificar.addItem("Películas");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreActor = new javax.swing.JTextField();
        txtApellidoActor = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        txtNacionalidadActor = new javax.swing.JTextField();
        btnActivarActor = new javax.swing.JButton();
        btnGuardarActor = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaRegistroActor = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTituloPelicula = new javax.swing.JTextField();
        txtAnioPelicula = new javax.swing.JTextField();
        txtDuracionPelicula = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResumenPelicula = new javax.swing.JTextArea();
        btnActivarPelicula = new javax.swing.JButton();
        btnGuardarPelicula = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRegistroPelicula = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxModificar = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtModificarActorNombre = new javax.swing.JTextField();
        txtModificarActorApellido = new javax.swing.JTextField();
        txtModificarActorEdad = new javax.swing.JTextField();
        txtModificarActorNacionalidad = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtModificarPeliculaTitulo = new javax.swing.JTextField();
        txtModificarPeliculaAnio = new javax.swing.JTextField();
        txtModificarPeliculaDuracion = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaModificarResumen = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaRegistroModificar = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        btnBuscarModificar = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableAsociarActores = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableAsociarPelicula = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnAsociar = new javax.swing.JButton();
        btnBuscarAsociar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButtonActor = new javax.swing.JRadioButton();
        jRadioButtonPelicula = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jComboBoxActor = new javax.swing.JComboBox<>();
        txtBuscarActor = new javax.swing.JTextField();
        btnBuscarActor2 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableBuscar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtBuscarPelicula = new javax.swing.JTextField();
        jComboBoxPelicula = new javax.swing.JComboBox<>();
        btnBuscarPelicula2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/5b0fe132ac361-1.png"))); // NOI18N

        jLabel2.setText("Programa de gestión cinematográfica");

        jLabel3.setText("Por Fermín Jiménez Pérez");

        jLabel4.setText("V 1.0.0");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 95, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Principal", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jPanel9.setBackground(new java.awt.Color(255, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Año nacimiento:");

        jLabel8.setText("Nacionalidad:");

        txtNombreActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtApellidoActor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreActor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNacionalidadActor))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNacionalidadActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnActivarActor.setText("Nuevo registro");

        btnGuardarActor.setText("Guardar");
        btnGuardarActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActorActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jTextAreaRegistroActor.setColumns(20);
        jTextAreaRegistroActor.setRows(5);
        jScrollPane4.setViewportView(jTextAreaRegistroActor);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnActivarActor)
                        .addGap(68, 68, 68)
                        .addComponent(btnGuardarActor)))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActivarActor)
                            .addComponent(btnGuardarActor))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar actor", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel9.setText("Título:");

        jLabel10.setText("Año::");

        jLabel11.setText("Duración:");

        jLabel12.setText("Resumen:");

        txtTituloPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloPeliculaActionPerformed(evt);
            }
        });

        jTextAreaResumenPelicula.setColumns(20);
        jTextAreaResumenPelicula.setRows(5);
        jScrollPane3.setViewportView(jTextAreaResumenPelicula);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloPelicula)
                            .addComponent(txtAnioPelicula)
                            .addComponent(txtDuracionPelicula))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAnioPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDuracionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnActivarPelicula.setText("Nuevo Registro");

        btnGuardarPelicula.setText("Guardar");
        btnGuardarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPeliculaActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jTextAreaRegistroPelicula.setColumns(20);
        jTextAreaRegistroPelicula.setRows(5);
        jScrollPane2.setViewportView(jTextAreaRegistroPelicula);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActivarPelicula)
                            .addComponent(btnGuardarPelicula))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnActivarPelicula)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarPelicula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registrar película", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel13.setText("Seleccione una opción:");

        jPanel13.setBackground(new java.awt.Color(255, 255, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Actor"));

        jLabel14.setText("Nombre:");

        jLabel15.setText("Apellido:");

        jLabel16.setText("Edad:");

        jLabel17.setText("Nacionalidad:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModificarActorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(txtModificarActorApellido)
                    .addComponent(txtModificarActorEdad)
                    .addComponent(txtModificarActorNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtModificarActorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtModificarActorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtModificarActorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtModificarActorNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Pelicula"));

        jLabel18.setText("Título:");

        jLabel19.setText("Año:");

        jLabel20.setText("Duración:");

        jLabel21.setText("Resúmen:");

        jTextAreaModificarResumen.setColumns(20);
        jTextAreaModificarResumen.setRows(5);
        jScrollPane5.setViewportView(jTextAreaModificarResumen);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModificarPeliculaTitulo)
                            .addComponent(txtModificarPeliculaAnio)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModificarPeliculaDuracion))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtModificarPeliculaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtModificarPeliculaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModificarPeliculaDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jTableModificar);

        jTextAreaRegistroModificar.setColumns(20);
        jTextAreaRegistroModificar.setRows(5);
        jScrollPane9.setViewportView(jTextAreaRegistroModificar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscarModificar.setText("Buscar");
        btnBuscarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarModificarActionPerformed(evt);
            }
        });

        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnBuscarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btnEliminar2))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardarCambios)))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar2))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnGuardarCambios)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnBuscarModificar)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane9)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jTableAsociarActores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableAsociarActores);

        jTableAsociarPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jTableAsociarPelicula);

        jLabel22.setText("Actores:");

        jLabel23.setText("Películas:");

        jLabel24.setText("Seleccione un actor y una películar y pulse \"Asociar\"");

        btnAsociar.setText("Asociar");
        btnAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarActionPerformed(evt);
            }
        });

        btnBuscarAsociar.setText("Buscar");
        btnBuscarAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsociarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAsociar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(401, 401, 401))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10)
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel24))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnBuscarAsociar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel24)
                .addGap(45, 45, 45)
                .addComponent(btnBuscarAsociar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAsociar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Asociar", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 153, 255));

        jLabel25.setText("Por favor, seleccione criterios de búsqueda");

        jRadioButtonActor.setSelected(true);
        jRadioButtonActor.setText("Actores");
        jRadioButtonActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonActorActionPerformed(evt);
            }
        });

        jRadioButtonPelicula.setText("Películas");
        jRadioButtonPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPeliculaActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Actores"));

        btnBuscarActor2.setText("Búsqueda");
        btnBuscarActor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jComboBoxActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBuscarActor))
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnBuscarActor2)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(txtBuscarActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarActor2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jTableBuscar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Películas"));

        btnBuscarPelicula2.setText("Búsqueda");
        btnBuscarPelicula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPelicula2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPelicula)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jComboBoxPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(btnBuscarPelicula2)
                .addGap(92, 92, 92))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(txtBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarPelicula2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar.setText("Eliminar registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jRadioButtonPelicula)
                                    .addComponent(jRadioButtonActor)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonActor)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPelicula)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Configuración", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloPeliculaActionPerformed

    private void txtNombreActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActorActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = jTableModificar.getSelectedRow();
        
        limpiarModificar();
        
        if ((jComboBoxModificar.getSelectedIndex()==0) && (fila >= 0)) {
            desactivarPeliculaModificar();
            txtModificarActorNombre.setText(jTableModificar.getValueAt(fila, 1).toString());
            txtModificarActorApellido.setText(jTableModificar.getValueAt(fila, 2).toString());
            txtModificarActorEdad.setText(jTableModificar.getValueAt(fila, 3).toString());
            txtModificarActorNacionalidad.setText(jTableModificar.getValueAt(fila, 4).toString());
            btnGuardarCambios.setVisible(true);
        }else if ((jComboBoxModificar.getSelectedIndex()==0) && (fila < 0)) {
            jTextAreaRegistroModificar.setText("Por favor, seleccione primero un Actor");
        }else if ((jComboBoxModificar.getSelectedIndex()==1) && (fila >= 0)) {
            desactivarActorModificar();
            txtModificarPeliculaTitulo.setText(jTableModificar.getValueAt(fila, 1).toString());
            txtModificarPeliculaAnio.setText(jTableModificar.getValueAt(fila, 2).toString());
            txtModificarPeliculaDuracion.setText(jTableModificar.getValueAt(fila, 3).toString());
            jTextAreaModificarResumen.setText(jTableModificar.getValueAt(fila, 4).toString());
            btnGuardarCambios.setVisible(true);
        }else if ((jComboBoxModificar.getSelectedIndex()==1) && (fila < 0)) {
            jTextAreaRegistroModificar.setText("Por favor, seleccione primero una película");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    public void desactivarActorModificar() {
        txtModificarActorNombre.setEditable(false);
        txtModificarActorApellido.setEditable(false);
        txtModificarActorEdad.setEditable(false);
        txtModificarActorNacionalidad.setEditable(false);
        
        txtModificarPeliculaTitulo.setEditable(true);
        txtModificarPeliculaAnio.setEditable(true);
        txtModificarPeliculaDuracion.setEditable(true);
        jTextAreaModificarResumen.setEditable(true);
    }
    
    public void desactivarPeliculaModificar() {
        txtModificarActorNombre.setEditable(true);
        txtModificarActorApellido.setEditable(true);
        txtModificarActorEdad.setEditable(true);
        txtModificarActorNacionalidad.setEditable(true);
        
        txtModificarPeliculaTitulo.setEditable(false);
        txtModificarPeliculaAnio.setEditable(false);
        txtModificarPeliculaDuracion.setEditable(false);
        jTextAreaModificarResumen.setEditable(false);
    }
    
    public void limpiarModificar() {
        txtModificarActorNombre.setText("");
        txtModificarActorApellido.setText("");
        txtModificarActorEdad.setText("");
        txtModificarActorNacionalidad.setText("");

        txtModificarPeliculaTitulo.setText("");
        txtModificarPeliculaAnio.setText("");
        txtModificarPeliculaDuracion.setText("");
        jTextAreaModificarResumen.setText("");
    }
    
    private void btnAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarActionPerformed

        int fila = jTableAsociarActores.getSelectedRow();
        int fila2 = jTableAsociarPelicula.getSelectedRow();
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO Actores_has_Peliculas (Actores_idActores,Peliculas_idPeliculas) VALUES (?,?)");
            String valor = jTableAsociarActores.getValueAt(fila, 0).toString();
            String valor2 = jTableAsociarPelicula.getValueAt(fila, 0).toString();
            pps.setString(0, valor);
            pps.setString(1, valor2);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Correcto");

        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAsociarActionPerformed

    private void jRadioButtonActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonActorActionPerformed
        desbloquearBusquedaActor();
        bloquearBusquedaPelicula();
    }//GEN-LAST:event_jRadioButtonActorActionPerformed

    private void btnGuardarActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActorActionPerformed

        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO Actores (Nombre,Apellido,ANacimiento,Nacionalidad) VALUES (?,?,?,?)");
            if (txtNombreActor.getText().equals("") | txtApellidoActor.getText().equals("") | txtNacimiento.getText().equals("") | txtNacionalidadActor.getText().equals("")){
                jTextAreaRegistroActor.setText("Error al guardar el Actor en la base de datos, rellene todos los campos");
                jTextArea1.setText(texto+"\nError al guardar un Actor en la base de datos");
                texto = jTextArea1.getText();
            }else{
                String texto2 = "";
                pps.setString(1, txtNombreActor.getText());
                pps.setString(2, txtApellidoActor.getText());
                pps.setString(3, txtNacimiento.getText());
                pps.setString(4, txtNacionalidadActor.getText());
                pps.executeUpdate();        
                jTextArea1.setText(texto2+"\nSe ha guardado el actor "+txtNombreActor.getText()+" correctamente");
                jTextAreaRegistroActor.setText(texto2+"\nSe ha guardado el actor "+txtNombreActor.getText()+" correctamente");
                texto2 = jTextAreaRegistroActor.getText();               
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActorActionPerformed

    private void btnGuardarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPeliculaActionPerformed
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO Peliculas (Titulo,Anio,Duracion,Resumen) VALUES (?,?,?,?)");
            if (txtTituloPelicula.getText().equals("") | txtAnioPelicula.getText().equals("") | txtDuracionPelicula.getText().equals("")){
                jTextAreaRegistroPelicula.setText("Error al guardar la Película en la base de datos, rellene los campos");
                jTextArea1.setText(texto+"\nError al guardar una Película en la base de datos");
                texto = jTextArea1.getText();
            }else{
                String texto2 = "";
                pps.setString(1, txtTituloPelicula.getText());
                pps.setString(2, txtAnioPelicula.getText());
                pps.setString(3, txtDuracionPelicula.getText());
                pps.setString(4, jTextAreaResumenPelicula.getText());
                pps.executeUpdate();        
                jTextArea1.setText(texto2+"\nSe ha guardado la película "+txtTituloPelicula.getText()+" correctamente");
                jTextAreaRegistroPelicula.setText(texto2+"\nSe ha guardado la película "+txtTituloPelicula.getText()+" correctamente");
                texto2 = jTextAreaRegistroPelicula.getText();               
                JOptionPane.showMessageDialog(null, "Datos guardados");
            }   
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarPeliculaActionPerformed

    public void crearButtonGroupBuscar() {
        buttonGroup1.add(jRadioButtonActor);
        buttonGroup1.add(jRadioButtonPelicula);
        jComboBoxPelicula.setVisible(false);
        txtBuscarPelicula.setEditable(false);
    }

    public void desbloquearBusquedaPelicula() {
        jComboBoxPelicula.setVisible(true);
        txtBuscarPelicula.setEditable(true); 
    }
    
    public void bloquearBusquedaActor() {
        jComboBoxActor.setVisible(false);
        txtBuscarActor.setEditable(false);
        txtBuscarActor.setText("");
    }
    
    public void bloquearBusquedaPelicula() {
        jComboBoxPelicula.setVisible(false);
        txtBuscarPelicula.setEditable(false);
        txtBuscarPelicula.setText("");
    }
    
    public void desbloquearBusquedaActor() {
        jComboBoxActor.setVisible(true);
        txtBuscarActor.setEditable(true);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (jRadioButtonActor.isSelected()) {
            mostrarTablaActor();
        }else if (jRadioButtonPelicula.isSelected()){
            mostrarTablaPelicula();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jRadioButtonPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPeliculaActionPerformed
       desbloquearBusquedaPelicula();
       bloquearBusquedaActor();  
    }//GEN-LAST:event_jRadioButtonPeliculaActionPerformed

    private void btnBuscarActor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActor2ActionPerformed
     
        atributo = jComboBoxActor.getSelectedItem().toString();
        mostrarTablaActor2(txtBuscarActor.getText());
        txtBuscarActor.setText("");
        
    }//GEN-LAST:event_btnBuscarActor2ActionPerformed

    private void btnBuscarPelicula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPelicula2ActionPerformed
        atributo = jComboBoxPelicula.getSelectedItem().toString();
        mostrarTablaPelicula2(txtBuscarPelicula.getText());
        txtBuscarPelicula.setText("");  
    }//GEN-LAST:event_btnBuscarPelicula2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int fila = jTableBuscar.getSelectedRow();
        
        if (jRadioButtonActor.isSelected() && (fila >=0)) {
            String valor = jTableBuscar.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Actores WHERE idActores='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrada eliminada correctamente");
                mostrarTablaActor();
            } catch (SQLException ex) {
                Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (jRadioButtonPelicula.isSelected() && (fila >=0)) {
            String valor = jTableBuscar.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Peliculas WHERE idPeliculas='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrada eliminada correctamente");
                mostrarTablaPelicula();
            } catch (SQLException ex) {
                Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void btnBuscarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarModificarActionPerformed
        
    limpiarModificar();
    String datos [] = new String [5];
                
    if (jComboBoxModificar.getSelectedIndex()==0) {
        DefaultTableModel modeloActor = new DefaultTableModel();
        modeloActor.addColumn("Id");
        modeloActor.addColumn("Nombre");
        modeloActor.addColumn("Apellido");
        modeloActor.addColumn("A.Nacimiento");
        modeloActor.addColumn("Nacionalidad");
        jTableModificar.setModel(modeloActor);
            
        try {  
            CallableStatement cst = cn.prepareCall("{call buscarActores}");
            cst.execute();
            ResultSet rs = cst.executeQuery();
            
            while (rs.next()) {               
                    datos [0] = rs.getString(1);
                    datos [1] = rs.getString(2);
                    datos [2] = rs.getString(3);
                    datos [3] = rs.getString(4);
                    datos [4] = rs.getString(5);
                    modeloActor.addRow(datos);
            } 
            
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else if (jComboBoxModificar.getSelectedIndex()==1){
        DefaultTableModel modeloPelicula = new DefaultTableModel();
        modeloPelicula.addColumn("Id");
        modeloPelicula.addColumn("Titulo");
        modeloPelicula.addColumn("Año");
        modeloPelicula.addColumn("Duración");
        modeloPelicula.addColumn("Resúmen");   
        jTableModificar.setModel(modeloPelicula);
              
        try {   
            CallableStatement cst = cn.prepareCall("{call buscarPeliculas}");
            cst.execute();
            ResultSet rs = cst.executeQuery();
            while (rs.next()) {               
                    datos [0] = rs.getString(1);
                    datos [1] = rs.getString(2);
                    datos [2] = rs.getString(3);
                    datos [3] = rs.getString(4);
                    datos [4] = rs.getString(5);
                    modeloPelicula.addRow(datos);
            } 
            
            jTableModificar.setModel(modeloPelicula);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
 
    }//GEN-LAST:event_btnBuscarModificarActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        int fila = jTableModificar.getSelectedRow();
        
        if (jComboBoxModificar.getSelectedIndex()==0 && (fila >=0)) {
            String valor = jTableModificar.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Actores WHERE idActores='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrada eliminada correctamente");
                mostrarTablaActor();
            } catch (SQLException ex) {
                Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (jComboBoxModificar.getSelectedIndex()==0 && (fila >=1)) {
            String valor = jTableModificar.getValueAt(fila, 0).toString();
            try {
                PreparedStatement pps = cn.prepareStatement("DELETE FROM Peliculas WHERE idPeliculas='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Entrada eliminada correctamente");
                mostrarTablaPelicula();
            } catch (SQLException ex) {
                Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed

        int fila = jTableModificar.getSelectedRow();
        
        if ((jComboBoxModificar.getSelectedIndex()==0)) {
            if (txtModificarActorNombre.getText().equals("") | txtModificarActorApellido.getText().equals("") | txtModificarActorEdad.getText().equals("") | txtModificarActorNacionalidad.getText().equals("")) {   
                jTextAreaRegistroModificar.setText("Error, por favor, rellene los campos");
            }else{
                try {
                PreparedStatement pps = cn.prepareStatement("UPDATE Actores SET Nombre='"+txtModificarActorNombre.getText()+"',Apellido='"+txtModificarActorApellido.getText()+"',ANacimiento='"+txtModificarActorEdad.getText()+"',Nacionalidad='"+txtModificarActorNacionalidad.getText()+"' WHERE idActores='"+jTableModificar.getValueAt(fila, 0).toString()+"'");
                pps.executeUpdate();
                jTextAreaRegistroModificar.setText("Se ha modificado el Actor "+txtModificarActorNombre.getText()+ " correctamente");
                btnGuardarCambios.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else if ((jComboBoxModificar.getSelectedIndex()==1)) { 
            if (txtModificarPeliculaTitulo.getText().equals("") | txtModificarPeliculaAnio.getText().equals("") | txtModificarPeliculaDuracion.getText().equals("")) {
                jTextAreaRegistroModificar.setText("Error, por favor, rellene los campos");
            }else {               
                try {
                    PreparedStatement pps = cn.prepareStatement("UPDATE Peliculas SET Titulo='"+txtModificarPeliculaTitulo.getText()+"',Anio='"+txtModificarPeliculaAnio.getText()+"',Duracion='"+txtModificarPeliculaDuracion.getText()+"',Resumen='"+jTextAreaModificarResumen.getText()+"' WHERE idPeliculas='"+jTableModificar.getValueAt(fila, 0).toString()+"'");
                    pps.executeUpdate();
                    jTextAreaRegistroModificar.setText("Se ha modificado la Película "+txtModificarPeliculaTitulo.getText()+ " correctamente");
                    btnGuardarCambios.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnBuscarAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsociarActionPerformed
        DefaultTableModel modeloActor = new DefaultTableModel();
            modeloActor.addColumn("Id");
            modeloActor.addColumn("Nombre");
            modeloActor.addColumn("Apellido");
            modeloActor.addColumn("A.Nacimiento");
            modeloActor.addColumn("Nacionalidad");
            jTableAsociarActores.setModel(modeloActor);
            
            String datos [] = new String [5];
            CallableStatement cst;
            ResultSet rs;
            
            DefaultTableModel modeloPelicula = new DefaultTableModel();
            modeloPelicula.addColumn("Id");
            modeloPelicula.addColumn("Titulo");
            modeloPelicula.addColumn("Año");
            modeloPelicula.addColumn("Duración");
            modeloPelicula.addColumn("Resúmen");
            jTableAsociarPelicula.setModel(modeloPelicula);
                        
        try { 
            cst = cn.prepareCall("{call buscarActores}");
            cst.execute();
            rs = cst.executeQuery();
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloActor.addRow(datos);
            } 
            cst = cn.prepareCall("{call buscarPeliculas}");
            cst.execute();
            rs = cst.executeQuery();
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloPelicula.addRow(datos);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_btnBuscarAsociarActionPerformed

    public void mostrarTablaActor2 (String valor) {
        DefaultTableModel modeloActor = new DefaultTableModel();
        modeloActor.addColumn("Id");
        modeloActor.addColumn("Nombre");
        modeloActor.addColumn("Apellido");
        modeloActor.addColumn("A.Nacimiento");
        modeloActor.addColumn("Nacionalidad");
            
        jTableBuscar.setModel(modeloActor);
            
        String sql = "SELECT * FROM Actores WHERE "+atributo+"='"+valor+"'";
            
        String datos [] = new String [5];
            
        try {   
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloActor.addRow(datos);
            } 
            jTableBuscar.setModel(modeloActor);
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void mostrarTablaActor() {
            DefaultTableModel modeloActor = new DefaultTableModel();
            modeloActor.addColumn("Id");
            modeloActor.addColumn("Nombre");
            modeloActor.addColumn("Apellido");
            modeloActor.addColumn("A.Nacimiento");
            modeloActor.addColumn("Nacionalidad");
            
            jTableBuscar.setModel(modeloActor);
            
            String sql = "SELECT * FROM Actores";
            
            String datos [] = new String [5];
            
        try {   
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloActor.addRow(datos);
            } 
            jTableBuscar.setModel(modeloActor);
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void mostrarTablaPelicula2(String valor) {
        DefaultTableModel modeloPelicula = new DefaultTableModel();
    
        modeloPelicula.addColumn("Id");
        modeloPelicula.addColumn("Titulo");
        modeloPelicula.addColumn("Año");
        modeloPelicula.addColumn("Duración");
        modeloPelicula.addColumn("Resúmen");
            
        jTableBuscar.setModel(modeloPelicula);
            
        String sql = "SELECT * FROM Peliculas WHERE "+atributo+"='"+valor+"'";
            
        String datos [] = new String [5];
            
        try {   
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloPelicula.addRow(datos);
            } 
            jTableBuscar.setModel(modeloPelicula);
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void mostrarTablaPelicula() {
            DefaultTableModel modeloPelicula = new DefaultTableModel();
            modeloPelicula.addColumn("Id");
            modeloPelicula.addColumn("Titulo");
            modeloPelicula.addColumn("Año");
            modeloPelicula.addColumn("Duración");
            modeloPelicula.addColumn("Resúmen");
            
            jTableBuscar.setModel(modeloPelicula);
            
            String sql = "SELECT * FROM Peliculas";
            
            String datos [] = new String [5];
            
        try {   
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos [0] = rs.getString(1);
                datos [1] = rs.getString(2);
                datos [2] = rs.getString(3);
                datos [3] = rs.getString(4);
                datos [4] = rs.getString(5);
                modeloPelicula.addRow(datos);
            } 
            jTableBuscar.setModel(modeloPelicula);
        } catch (SQLException ex) {
            Logger.getLogger(FramePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarActor;
    private javax.swing.JButton btnActivarPelicula;
    private javax.swing.JButton btnAsociar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarActor2;
    private javax.swing.JButton btnBuscarAsociar;
    private javax.swing.JButton btnBuscarModificar;
    private javax.swing.JButton btnBuscarPelicula2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnGuardarActor;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnGuardarPelicula;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxActor;
    private javax.swing.JComboBox<String> jComboBoxModificar;
    private javax.swing.JComboBox<String> jComboBoxPelicula;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButtonActor;
    private javax.swing.JRadioButton jRadioButtonPelicula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableAsociarActores;
    private javax.swing.JTable jTableAsociarPelicula;
    private javax.swing.JTable jTableBuscar;
    private javax.swing.JTable jTableModificar;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaModificarResumen;
    private javax.swing.JTextArea jTextAreaRegistroActor;
    private javax.swing.JTextArea jTextAreaRegistroModificar;
    private javax.swing.JTextArea jTextAreaRegistroPelicula;
    private javax.swing.JTextArea jTextAreaResumenPelicula;
    private javax.swing.JTextField txtAnioPelicula;
    private javax.swing.JTextField txtApellidoActor;
    private javax.swing.JTextField txtBuscarActor;
    private javax.swing.JTextField txtBuscarPelicula;
    private javax.swing.JTextField txtDuracionPelicula;
    private javax.swing.JTextField txtModificarActorApellido;
    private javax.swing.JTextField txtModificarActorEdad;
    private javax.swing.JTextField txtModificarActorNacionalidad;
    private javax.swing.JTextField txtModificarActorNombre;
    private javax.swing.JTextField txtModificarPeliculaAnio;
    private javax.swing.JTextField txtModificarPeliculaDuracion;
    private javax.swing.JTextField txtModificarPeliculaTitulo;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNacionalidadActor;
    private javax.swing.JTextField txtNombreActor;
    private javax.swing.JTextField txtTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
