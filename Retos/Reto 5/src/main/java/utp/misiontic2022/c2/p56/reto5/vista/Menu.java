package utp.misiontic2022.c2.p56.reto5.vista;


import utp.misiontic2022.c2.p56.reto5.controlador.*;

public class Menu extends javax.swing.JFrame{
    private javax.swing.JButton btnR1;
    private javax.swing.JButton btnR2;
    private javax.swing.JButton btnR3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIntro;
    private javax.swing.JLabel lblR1;
    private javax.swing.JLabel lblR2;
    private javax.swing.JLabel lblR3;

    public Menu(){
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblR1 = new javax.swing.JLabel();
        lblR2 = new javax.swing.JLabel();
        lblR3 = new javax.swing.JLabel();
        btnR1 = new javax.swing.JButton();
        btnR2 = new javax.swing.JButton();
        btnR3 = new javax.swing.JButton();
        lblIntro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P&C- Información");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al menu de J&C");

        lblR1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblR1.setText("Requerimiento 1");

        lblR2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblR2.setText("Requerimiento 2");

        lblR3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblR3.setText("Requerimiento 3");

        btnR1.setText("Generar");
        btnR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR1ActionPerformed(evt);
            }
        });

        btnR2.setText("Generar");
        btnR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR2ActionPerformed(evt);
            }
        });

        btnR3.setText("Generar");
        btnR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR3ActionPerformed(evt);
            }
        });

        lblIntro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIntro.setText("Seleccione el informe que desea generar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblR3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnR3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblR2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnR2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblR1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnR1)))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR1)
                    .addComponent(btnR1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR2)
                    .addComponent(btnR2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR3)
                    .addComponent(btnR3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    private void btnR1ActionPerformed(java.awt.event.ActionEvent evt) {    
            VistaRequerimientos.requerimiento1();
        }                              
                                         

    private void btnR2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
            VistaRequerimientos.requerimiento2();
    }                                     

    private void btnR3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
            VistaRequerimientos.requerimiento3();
    }
    
}
