package pizza.project1;
public class c1 extends javax.swing.JFrame {
    public void wincheck(){
        if (jButton1.isSelected())
         {
             jLabel1.setText("Rs:=339");
                i f = new i();
                f.setVisible(true);
                this.setVisible(false);
        }
    }
    public c1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEAL 1 OPTION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 130, 287, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHOOSE YOUR PERSONAL PIZZA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 250, 598, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHOOSE YOUR 300 ML SOFT DRINK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 350, 690, 44);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 102, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pepsi ", "Mirinda ", "7up Mountain ", "Dew Diet ", "Pepsi Diet ", "7up" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(960, 350, 263, 55);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 680, 270, 67);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MUSHTAQ\\Music\\Favorites\\Desktop\\object operating program\\logo-3.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 30, 180, 130);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(153, 102, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken Supreme ", "Cheese Lover ", "Creamy Tikka ", "Ranch ", "Euro ", "Chicken Fajita ", "Fajita Sicilian ", "Chicken Tikka ", "Veggie Lover ", "Sriracha ", "Super Supreme" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(890, 240, 340, 50);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TO ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 680, 430, 67);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\MUSHTAQ\\Music\\Favorites\\Desktop\\Fast_food_Pizza_Olive_Tomatoes_Wood_planks_547526_1280x812.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1280, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       c f = new c();
       f.setVisible(true);
       this.setVisible(false);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
          String order ="your order is: 6 inch personal pan pizza & 300ml soft drink \n";
          
          order="DEAL 1 OPTION\n";
          order =order+ jLabel2.getText()+" : "+jComboBox2.getSelectedItem()+"\n";
          order=order+ jLabel3.getText()+" : "+jComboBox1.getSelectedItem()+"\n";
          order=order+"Price is Rs:339\n";
             
          this.hide();
          new i(order).setVisible(true);
    }                                        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
