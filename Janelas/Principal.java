package view;

import Janelas.Cadastrar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    private void initComponents() {

        cadFicha = new javax.swing.JButton();
        conFicha = new javax.swing.JButton();
        editFicha = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadFicha.setText("Cadastrar Ficha");

        conFicha.setText("Consultar Ficha");

        editFicha.setText("Editar Ficha");

        sair.setText("Sair");


//==============cadastrar ficha==============================================================
        cadFicha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Cadastrar cadastrar =new Cadastrar();
                cadastrar.main();
            }
        });
//==============Consultar ficha==============================================================

//==============Editar ficha==============================================================

//==============Sair==============================================================



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(sair)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cadFicha)
                                                        .addGap(155, 155, 155)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(editFicha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(conFicha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(cadFicha)
                                .addGap(18, 18, 18)
                                .addComponent(conFicha)
                                .addGap(18, 18, 18)
                                .addComponent(editFicha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sair)
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }
//=======================================================================================================================================
    public void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cadFicha;
    private javax.swing.JButton conFicha;
    private javax.swing.JButton editFicha;
    private javax.swing.JButton sair;




}
