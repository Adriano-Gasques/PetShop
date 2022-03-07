package Janelas;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        login = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        senha1 = new javax.swing.JPasswordField();
        login1 = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login.setText("Login");

        senha.setText("Senha");

        entrar.setText("Entrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(senha)
                                        .addComponent(login))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(login1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addComponent(senha1))
                                .addGap(18, 18, 18)
                                .addComponent(entrar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(login)
                                                        .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(senha)
                                                        .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(entrar)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }
    public void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    private javax.swing.JButton entrar;
    private javax.swing.JLabel login;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JTextField login1;


}
