/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27082021;

/**
 *
 * @author Meu Computador
 */
public class Vect extends javax.swing.JFrame {

    /**
     * Creates new form Vect
     */
    public Vect() {
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
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        btnMaior = new javax.swing.JButton();
        btnASC = new javax.swing.JButton();
        ordemDESC = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        btnMenor = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Valor");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Manipulando Vetores");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnMaior.setText("Maior");
        btnMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiorActionPerformed(evt);
            }
        });

        btnASC.setText("Ordem ASC");
        btnASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASCActionPerformed(evt);
            }
        });

        ordemDESC.setText("Ordem DESC");
        ordemDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemDESCActionPerformed(evt);
            }
        });

        lblMsg.setText("...");

        btnMenor.setText("Menor");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd)
                        .addGap(4, 4, 4)
                        .addComponent(btnExibir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnASC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordemDESC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnMaior)
                    .addComponent(btnASC)
                    .addComponent(ordemDESC)
                    .addComponent(btnMenor)
                    .addComponent(btnAdd)
                    .addComponent(btnExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lblMsg)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int[] vect = new int[10];
    int topo = 0;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int valor  = Integer.parseInt(txtValor.getText());
        lblMsg.setText(""+valor);
        
        for(int i = 0; i < vect.length; i++){
            if(vect[i] == 0){
                vect[i]  = valor;
                topo++;
                break;   
            }
        }
        
        limparTxt();
        
    }//GEN-LAST:event_btnAddActionPerformed
    public void limparTxt(){
        txtValor.setText("");
    }
    
       
public String exibir(){
        String resp = "";
        for(int i= 0; i < topo; i++){
           resp = resp+" "+ vect[i];
        }
        return resp;
    }
    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        txtValor.requestFocus();
        lblMsg.setText(""+exibir());

    }//GEN-LAST:event_btnExibirActionPerformed

    public int busca(int valor){
        for(int i = 0; i < topo; i++){
            if(vect[i] == valor){
                return i;
            }
        }
        return -1;
    }
    
    public void remove(int valor){

            for(int i = valor; i < topo-1; i++){
                  vect[i] = vect[i+1];
            }
             topo--;
    }
    
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int valor = Integer.parseInt(txtValor.getText());
        txtValor.setText("");
        txtValor.requestFocus();
        int pos = busca(valor);
        if( pos > -1){
           remove(pos);
        } 
  
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    
     int maior = 0;
     
    private void btnMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiorActionPerformed
        for(int i = 0; i < topo; i++){
            if(vect[i] > maior){
                maior = vect[i];
            }
        }
        
        lblMsg.setText(""+maior);
    }//GEN-LAST:event_btnMaiorActionPerformed

  
    public int getMenor(){
        int menor = vect[0];
        for(int i = 0; i < topo; i++){
            if(vect[i] > maior){
                maior = vect[i];
            }        }
        return menor;
   
    }
    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        lblMsg.setText(" " +getMenor() );
    }//GEN-LAST:event_btnMenorActionPerformed
    public void getOrdemCres(){
        
        int posicao_menor;
        int aux = 0;
        for(int i=0; i < topo; i++){ 
            posicao_menor = i;
            for(int j = i+1; j < topo; j++){ 
                if (vect[j] < vect[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vect[posicao_menor];
            vect[posicao_menor] = vect[i];
            vect[i] = aux;
        }
    }
    
    
    
    private void btnASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASCActionPerformed
        getOrdemCres();
        lblMsg.setText(":"+exibir());
    }//GEN-LAST:event_btnASCActionPerformed

    private void ordemDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemDESCActionPerformed
        for (int i = 1; i < topo; i++) {
            for (int j = 0; j < i; j++) {
                if (vect[i] > vect[j]) {
                    int temp = vect[i];
                    vect[i] = vect[j];
                    vect[j] = temp;
        }
    }
}

    }//GEN-LAST:event_ordemDESCActionPerformed

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
            java.util.logging.Logger.getLogger(Vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnASC;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnMaior;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JButton ordemDESC;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
