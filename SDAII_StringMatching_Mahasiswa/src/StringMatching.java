
public class StringMatching extends javax.swing.JFrame {

    public StringMatching() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        TitleTeks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        TitleKata = new javax.swing.JLabel();
        Pattern = new javax.swing.JTextField();
        Btn_Matching = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SDA II String Matching");

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setText("SDA II STRING MATCHING");

        TitleTeks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TitleTeks.setText("TEKS :");

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        TitleKata.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TitleKata.setText("PATTERN :");

        Btn_Matching.setText("MATCHING");
        Btn_Matching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MatchingActionPerformed(evt);
            }
        });

        Status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Status.setText("Status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TitleTeks)
                            .addComponent(jScrollPane1)
                            .addComponent(TitleKata)
                            .addComponent(Pattern)
                            .addComponent(Btn_Matching, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleTeks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleKata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Matching)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_MatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MatchingActionPerformed
        
    }//GEN-LAST:event_Btn_MatchingActionPerformed

    public static int brute(String text, String pattern) {
        
    } // end of brute()

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringMatching().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Matching;
    private javax.swing.JTextField Pattern;
    private javax.swing.JLabel Status;
    private javax.swing.JTextArea Text;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TitleKata;
    private javax.swing.JLabel TitleTeks;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
