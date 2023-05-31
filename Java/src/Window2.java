/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.RenderingHints.Key;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author nhenaff
 */
public class Window2 extends javax.swing.JFrame {

    /**
     * Creates new form Window2
     */
    public Window2() {
        initComponents();
        tableModel = new javax.swing.table.DefaultTableModel();
        tableModel.setRowCount(0);
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Nom", "Prénom", "Adresse", "Ville", "Date d'embauche"});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        prenomField1 = new javax.swing.JTextField();
        idField1 = new javax.swing.JTextField();
        prenomField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVisits = new javax.swing.JTable();
        ajoutButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        nomField = new javax.swing.JTextField();
        prenomField = new javax.swing.JTextField();
        adresseField = new javax.swing.JTextField();
        villeField = new javax.swing.JTextField();
        cpField = new javax.swing.JTextField();
        modifButton = new javax.swing.JButton();
        recherche = new javax.swing.JTextField();
        rechercheButton = new javax.swing.JButton();

        jButton2.setText("jButton2");

        prenomField1.setText("Prénom");
        prenomField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomField1ActionPerformed(evt);
            }
        });

        idField1.setBackground(new java.awt.Color(51, 51, 51));
        idField1.setForeground(new java.awt.Color(255, 255, 255));
        idField1.setText("ID");
        idField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idField1ActionPerformed(evt);
            }
        });

        prenomField2.setBackground(new java.awt.Color(51, 51, 51));
        prenomField2.setForeground(new java.awt.Color(255, 255, 255));
        prenomField2.setText("Prénom");
        prenomField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Utilisateurs");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tableVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Adresse", "Ville", "Date d'embauche"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableVisits);

        ajoutButton.setBackground(new java.awt.Color(0, 51, 0));
        ajoutButton.setFont(new java.awt.Font("Source Sans Pro Black", 0, 12)); // NOI18N
        ajoutButton.setForeground(new java.awt.Color(255, 255, 255));
        ajoutButton.setText("Ajouter");
        ajoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutButtonActionPerformed(evt);
            }
        });

        idField.setBackground(new java.awt.Color(153, 153, 153));
        idField.setForeground(new java.awt.Color(51, 51, 51));
        idField.setText("ID");
        idField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idFieldMouseClicked(evt);
            }
        });

        nomField.setBackground(new java.awt.Color(153, 153, 153));
        nomField.setForeground(new java.awt.Color(51, 51, 51));
        nomField.setText("Nom");
        nomField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomFieldMouseClicked(evt);
            }
        });

        prenomField.setBackground(new java.awt.Color(153, 153, 153));
        prenomField.setForeground(new java.awt.Color(51, 51, 51));
        prenomField.setText("Prénom");
        prenomField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prenomFieldMouseClicked(evt);
            }
        });

        adresseField.setBackground(new java.awt.Color(153, 153, 153));
        adresseField.setForeground(new java.awt.Color(51, 51, 51));
        adresseField.setText("Adresse");
        adresseField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adresseFieldMouseClicked(evt);
            }
        });
        adresseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseFieldActionPerformed(evt);
            }
        });

        villeField.setBackground(new java.awt.Color(153, 153, 153));
        villeField.setForeground(new java.awt.Color(51, 51, 51));
        villeField.setText("Ville");
        villeField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                villeFieldMouseClicked(evt);
            }
        });

        cpField.setBackground(new java.awt.Color(153, 153, 153));
        cpField.setForeground(new java.awt.Color(51, 51, 51));
        cpField.setText("CP");
        cpField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpFieldMouseClicked(evt);
            }
        });

        modifButton.setBackground(new java.awt.Color(0, 51, 0));
        modifButton.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        modifButton.setForeground(new java.awt.Color(255, 255, 255));
        modifButton.setText("Modifier");
        modifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifButtonActionPerformed(evt);
            }
        });

        recherche.setText("login ou nom");
        recherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheMouseClicked(evt);
            }
        });
        recherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheKeyReleased(evt);
            }
        });

        rechercheButton.setBackground(new java.awt.Color(0, 51, 0));
        rechercheButton.setFont(new java.awt.Font("Source Sans Pro Black", 0, 12)); // NOI18N
        rechercheButton.setForeground(new java.awt.Color(255, 255, 255));
        rechercheButton.setText("Rechercher");
        rechercheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adresseField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(villeField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ajoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adresseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(villeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tableModel.setRowCount(0);
        String url = "jdbc:mysql://localhost/gsb_frais";
        try{
            Connection connect = DriverManager.getConnection(url, "root","");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID,login, nom, prenom, adresse, ville, dateEmbauche FROM visiteur");
            while (rs.next()) {
                String id = rs.getString("ID");
                String login = rs.getString("login");
                String r = rs.getString("nom");
                String d = rs.getString("prenom");
                String p = rs.getString("adresse");
                String i = rs.getString("ville");
                String c = rs.getString("dateEmbauche");
                Utilisateur u1 = new Utilisateur(id,login,r,d,p,i,c);
                tableModel.addRow(u1.Tr());

            }
            tableVisits.setModel(tableModel);

            connect.close();

        }
        catch(SQLException e){
            System.out.println (e.getMessage());

        }

        
    }//GEN-LAST:event_formWindowOpened

    private void ajoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutButtonActionPerformed
        // TODO add your handling code here:
        String id = idField.getText();
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String adresse = adresseField.getText();
        String ville = villeField.getText();
        String cp = cpField.getText();
        char [] lettre = prenom.toCharArray();
        char prem = lettre[0];
        String login = prem + nom;
        login = login.toLowerCase();
        String url = "jdbc:mysql://localhost/gsb_frais";
        try {
            Connection connect = DriverManager.getConnection(url, "root","");
            Statement stmt = connect.createStatement();
            stmt.executeUpdate("INSERT INTO `visiteur`(`id`, `nom`, `prenom`, `login`, `adresse`,`cp`, `ville`, `dateEmbauche`) VALUES ('"+id+"','"+nom+"','"+prenom+"','"+login+"','"+adresse+"','"+cp+"','"+ville+"', NOW())");
            ResultSet rs = stmt.executeQuery("SELECT ID,login, nom, prenom, adresse, ville, dateEmbauche FROM visiteur");
            tableModel.setRowCount(0);
            while (rs.next()) {
                String id1 = rs.getString("ID");
                String login1 = rs.getString("login");
                String r = rs.getString("nom");
                String d = rs.getString("prenom");
                String p = rs.getString("adresse");
                String i = rs.getString("ville");
                String c = rs.getString("dateEmbauche");
                Utilisateur u1 = new Utilisateur(id1,login1,r,d,p,i,c);
                tableModel.addRow(u1.Tr());

            }
            tableVisits.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(Window2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajoutButtonActionPerformed

    private void prenomField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomField1ActionPerformed

    private void idField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idField1ActionPerformed

    private void prenomField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomField2ActionPerformed

    private void modifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifButtonActionPerformed
        // TODO add your handling code here:
        int row = tableVisits.getSelectedRow();
        int column = tableVisits.getSelectedColumn();
        Object value = tableVisits.getValueAt(row, 0);
        String id = value.toString();
        System.out.println(id);
        //String adresse = adresseField.getText();
        System.out.println(adresseField.getText());
        String url = "jdbc:mysql://localhost/gsb_frais";
        try {
            Connection connect = DriverManager.getConnection(url, "root","");
      
        if ((!adresseField.getText().contains("Adresse")) && (!adresseField.getText().isEmpty()))
                {
                    Statement stmt = connect.createStatement();
                    stmt.execute("UPDATE visiteur SET adresse='"+adresseField.getText()+"'where id ='"+id+"'");
                     
                }
         if ((!villeField.getText().contains("Ville")) && (!villeField.getText().isEmpty()))
                {
                    Statement stmt = connect.createStatement();
                 stmt.execute("UPDATE visiteur SET ville='"+villeField.getText()+"'where id ='"+id+"'");   
                }
         if ((!cpField.getText().contains("CP")) && (!cpField.getText().isEmpty()))
                {
                    Statement stmt = connect.createStatement();
                   stmt.execute("UPDATE visiteur SET cp='"+cpField.getText()+"'where id ='"+id+"'");
                }
                }
                
        catch (SQLException ex) {
            Logger.getLogger(Window2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifButtonActionPerformed

    private void idFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idFieldMouseClicked
        // TODO add your handling code here:
        if (idField.getText().contains("ID")){
        idField.setText("");
        }
    }//GEN-LAST:event_idFieldMouseClicked

    private void nomFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomFieldMouseClicked
        // TODO add your handling code here:
        if (nomField.getText().contains("Nom")){
        nomField.setText("");}
    }//GEN-LAST:event_nomFieldMouseClicked

    private void prenomFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenomFieldMouseClicked
        // TODO add your handling code here:
        if (prenomField.getText().contains("Prénom")){
        prenomField.setText("");}
    }//GEN-LAST:event_prenomFieldMouseClicked

    private void adresseFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adresseFieldMouseClicked
        // TODO add your handling code here:
        if (adresseField.getText().contains("Adresse")){
        adresseField.setText("");}
    }//GEN-LAST:event_adresseFieldMouseClicked

    private void villeFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_villeFieldMouseClicked
        // TODO add your handling code here:
        if (villeField.getText().contains("Ville")){
        villeField.setText("");}
    }//GEN-LAST:event_villeFieldMouseClicked

    private void cpFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpFieldMouseClicked
        // TODO add your handling code here:
        if (cpField.getText().contains("CP")){
        cpField.setText("");}
    }//GEN-LAST:event_cpFieldMouseClicked

    private void rechercheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheButtonActionPerformed
        // TODO add your handling code here:
        String rech = recherche.getText();
        String url = "jdbc:mysql://localhost/gsb_frais";
        try{
            Connection connect = DriverManager.getConnection(url, "root","");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID,login, nom, prenom, adresse, ville, dateEmbauche FROM visiteur WHERE login LIKE'"+rech+"'");
            tableModel.setRowCount(0);
            while (rs.next()) {
                String id = rs.getString("ID");
                String login = rs.getString("login");
                String r = rs.getString("nom");
                String d = rs.getString("prenom");
                String p = rs.getString("adresse");
                String i = rs.getString("ville");
                String c = rs.getString("dateEmbauche");
                Utilisateur u1 = new Utilisateur(id,login,r,d,p,i,c);
                tableModel.addRow(u1.Tr());

            }
            tableVisits.setModel(tableModel);

            connect.close();

        }
        catch(SQLException e){
            System.out.println (e.getMessage());

        }
        
    }//GEN-LAST:event_rechercheButtonActionPerformed

    private void rechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheKeyReleased
        // TODO add your handling code here:
        String rech = recherche.getText();
        String url = "jdbc:mysql://localhost/gsb_frais";
        try{
            Connection connect = DriverManager.getConnection(url, "root","");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID,login, nom, prenom, adresse, ville, dateEmbauche FROM visiteur WHERE login LIKE'%"+rech+"%'");
            tableModel.setRowCount(0);
            while (rs.next()) {
                String id = rs.getString("ID");
                String login = rs.getString("login");
                String r = rs.getString("nom");
                String d = rs.getString("prenom");
                String p = rs.getString("adresse");
                String i = rs.getString("ville");
                String c = rs.getString("dateEmbauche");
                Utilisateur u1 = new Utilisateur(id,login,r,d,p,i,c);
                tableModel.addRow(u1.Tr());

            }
            tableVisits.setModel(tableModel);

            connect.close();

        }
        catch(SQLException e){
            System.out.println (e.getMessage());

        }
    }//GEN-LAST:event_rechercheKeyReleased

    private void rechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheMouseClicked
        // TODO add your handling code here:
        recherche.setText("");
    }//GEN-LAST:event_rechercheMouseClicked

    private void adresseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
   
  private javax.swing.table.DefaultTableModel tableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresseField;
    private javax.swing.JButton ajoutButton;
    private javax.swing.JTextField cpField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idField1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifButton;
    private javax.swing.JTextField nomField;
    private javax.swing.JTextField prenomField;
    private javax.swing.JTextField prenomField1;
    private javax.swing.JTextField prenomField2;
    private javax.swing.JTextField recherche;
    private javax.swing.JButton rechercheButton;
    private javax.swing.JTable tableVisits;
    private javax.swing.JTextField villeField;
    // End of variables declaration//GEN-END:variables
}