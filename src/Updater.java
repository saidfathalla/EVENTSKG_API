
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;

import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import static com.hp.hpl.jena.util.tuple.TupleItem.URI;
import static com.hp.hpl.jena.vocabulary.DCTerms.URI;
import com.hp.hpl.jena.vocabulary.RDF;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.net.URISyntaxException;

public class Updater extends javax.swing.JFrame {

    public Updater() {

        initComponents();
        this.getRootPane().setDefaultButton(SearchBtn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        clearTextFields();
        jLabel20.setVisible(false);
        setIconImage(img.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        OnlineBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        LocalFileBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemOpenRepo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemReportIssue = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemInstructions = new javax.swing.JMenuItem();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVENTSKG Updater API");
        setAutoRequestFocus(false);
        setResizable(false);

        jTextField1.setText("ESWC2017");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Acronym:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Series:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("City:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("startDate:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("endDate:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Webpage:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("country:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("field:");

        jTextField3.setText("jTextField3");
        jTextField3.setEnabled(false);

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateBtn.setText("Update/Add");
        UpdateBtn.setEnabled(false);
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("1. Load");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("2. Search");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setText("3. Update/Add");

        OnlineBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OnlineBtn.setText("Online repo.");
        OnlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Enter event acronym: (e.g. AAAI2016 or AAAI 2016)");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("URI:");

        jTextField2.setText("jTextField2");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Submitted:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Accepted:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Acc. rate:");

        jTextField11.setText("jTextField11");

        jTextField12.setText("jTextField12");

        jTextField13.setText("jTextField13");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("State:");

        jTextField14.setText("jTextField14");

        LocalFileBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LocalFileBtn.setText("Local file");
        LocalFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalFileBtnActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("The dataset has been loaded from ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Conference", "Symposium", "Workshop" }));

        jLabel21.setText("DATE FORMAT: YYYY-MM-DD");

        jMenu1.setText("File");

        jMenuItemOpenRepo.setText("Open EVENTSKG Github repo.");
        jMenuItemOpenRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenRepoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOpenRepo);

        jMenuItem2.setText("Open EVENTSKG webpage");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Tools");

        jMenuItemReportIssue.setText("Report a Dataset issue");
        jMenuItemReportIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportIssueActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemReportIssue);

        jMenuItem1.setText("Report an API issue");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");

        jMenuItemInstructions.setText("Instructions");
        jMenuItemInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstructionsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemInstructions);

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel21))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(64, 64, 64)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(71, 71, 71)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(38, 38, 38)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(34, 34, 34)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(71, 71, 71)
                                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel19)
                                                            .addGap(61, 61, 61)
                                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel7)
                                                                    .addGap(33, 33, 33)
                                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addGap(40, 40, 40)
                                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                            .addComponent(jLabel5)
                                                                            .addGap(33, 33, 33)
                                                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel9)
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(57, 57, 57)
                                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))))))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(UpdateBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(OnlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(LocalFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocalFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OnlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel13)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed

        clearTextFields();
        String queryString = "";
        String q = jTextField1.getText();

        try {
//            if(model.isEmpty()) throw new java.net.UnknownHostException();
//            model.write(System.out);
            //     model.read("https://saidfathalla.github.io/EVENTS-Dataset/EVENTSKG-40.rdf");
         //   model.read(new BufferedInputStream(new FileInputStream("D:\\Bonn Research\\My Github Repos\\EVENTSKG-Dataset\\EVENTKG_R2.rdf")), null);
            queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
                    + "PREFIX conference-ontology:<https://w3id.org/scholarlydata/ontology/conference-ontology.owl#> "
                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
                    + "PREFIX seo: <http://purl.org/seo/>"
                    + "SELECT  ?e ?series ?type ?field ?country ?state ?city ?webpage ?startdate ?enddate ?submittedPapers ?acceptedPapers  ?acceptanceRate ?acronym" // variables to be added to resultset
                    + " WHERE {  "
                    + " {?e a conference-ontology:Conference} UNION { ?e a seo:Symposium }."
                    + " FILTER (regex( str(?e),\"" + q.replaceAll(" ", "") + "\", \'i\' )) ."
                    + "?e a ?type. "
                    + "?e seo:belongsToSeries ?series. "
                    + "OPTIONAL { ?e seo:field ?field.} "
                    + "OPTIONAL {?e seo:holdsInCountry ?country. }"
                    + "OPTIONAL { ?e seo:city ?city. }"
                    + "OPTIONAL { ?e seo:EventWebpage ?webpage. }"
                    + "OPTIONAL { ?e conference-ontology:startDate ?startdate. }"
                    + "OPTIONAL { ?e conference-ontology:endDate ?enddate. }"
                    + "OPTIONAL { ?e seo:submittedPapers ?submittedPapers. }"
                    + "OPTIONAL { ?e seo:acceptedPapers  ?acceptedPapers. }"
                    + "OPTIONAL { ?e seo:acceptanceRate  ?acceptanceRate. }"
                    + "OPTIONAL { ?e seo:state ?state. }"
                    + "OPTIONAL { ?e conference-ontology:acronym ?acronym. }"
                    + "}";

            Query query = QueryFactory.create(queryString);
            QueryExecution qe = QueryExecutionFactory.create(query, model);

            ResultSet results = qe.execSelect();
//            ResultSetFormatter.out(System.out, results, query);
            if (!results.hasNext()) {
                qe.close();
                JOptionPane.showMessageDialog(rootPane, "Event not found. You can add this event by entering metadata of the event and  press Update/Add button.", "EVENTSKG Updater API", JOptionPane.ERROR_MESSAGE);
                jTextField2.setText("http://purl.org/events_ds/" + jTextField1.getText().replaceAll(" ", "").toUpperCase());
                UpdateBtn.setEnabled(true);
                return;
            }

            QuerySolution soln = results.nextSolution();

//            System.out.println(results.+" rows retrieved");
//            NodeIterator iter = model.listObjects();
//    while (iter.hasNext()) {
//        
//        System.out.println(" " + iter.next().toString());
//    }
            jTextField2.setText(soln.getResource("e").toString());
            jTextField3.setText(soln.getResource("type").toString());
            jComboBox1.setSelectedItem(soln.getResource("type").toString().replaceAll(".+#", "").replaceAll("http://purl.org/seo/", ""));
            jTextField4.setText(soln.getResource("series").toString());
            jTextField5.setText(soln.getLiteral("field").getLexicalForm());

            jTextField8.setText(soln.getLiteral("webpage").getLexicalForm());

            jTextField9.setText(soln.getResource("country").toString());

            jTextField6.setText(soln.getLiteral("startdate").getLexicalForm());
            jTextField7.setText(soln.getLiteral("enddate").getLexicalForm());
            jTextField10.setText(soln.getLiteral("city").getLexicalForm());

            jTextField11.setText(soln.getLiteral("submittedPapers").getLexicalForm());
            jTextField12.setText(soln.getLiteral("acceptedPapers").getLexicalForm());
            jTextField13.setText(soln.getLiteral("acceptanceRate").getLexicalForm());

            jTextField14.setText(soln.getLiteral("state").getLexicalForm());
            System.out.println("x ");

            qe.close();
        } catch (Exception ex) {
            jLabel20.setText("The dataset is not available.");
            System.out.println("" + ex.getMessage());
        }
        UpdateBtn.setEnabled(true);
//        catch (FileNotFoundException  e) {
//            System.out.println(e.getMessage());
//        }


    }//GEN-LAST:event_SearchBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

//        InputStream in = null;
        try {
            //        Resource jenaCls = model.getResource("http://purl.org/events_ds/AAAI1980");
//Property jenaProp = model.getProperty("http://purl.org/seo/city");
//JenaOWLModel owlModel = ProtegeOWL.createJenaOWLModel(); //or use an existing owlModel

//            in = new BufferedInputStream(new FileInputStream(new File("EVENTSKG.rdf")));
//            model.read(in, null);
            Resource r = model.getResource(jTextField2.getText()); // get the traget resource
            Property cityProp = model.getProperty("http://purl.org/seo/city"); // define the property
            Property sdateProp = model.getProperty("https://w3id.org/scholarlydata/ontology/conference-ontology.owl#startDate");
//            Property acronymProp = model.getProperty("https://w3id.org/scholarlydata/ontology/conference-ontology.owl#acronym");
            Property edateProp = model.getProperty("https://w3id.org/scholarlydata/ontology/conference-ontology.owl#endDate");
            Property submittedPapersProp = model.getProperty("http://purl.org/seo/submittedPapers");
            Property acceptanceRateProp = model.getProperty("http://purl.org/seo/acceptanceRate");
            Property fieldProp = model.getProperty("http://purl.org/seo/field");
            Property acceptedPapersProp = model.getProperty("http://purl.org/seo/acceptedPapers");
            Property belongsToSeriesProp = model.getProperty("http://purl.org/seo/belongsToSeries");
            Property stateProp = model.getProperty("http://purl.org/seo/state");
            Property countryProp = model.getProperty("http://purl.org/seo/country");
            Property typeProp = model.getProperty("rdf:type");

            r.removeAll(cityProp); // remove the property with the old valiue
            r.addProperty(cityProp, jTextField10.getText());// add the property with the new valiue

            r.removeAll(sdateProp); // remove the property with the old valiue
            r.addProperty(sdateProp, jTextField6.getText(), XSDDatatype.XSDdate);// add the property with the new valiue

            r.removeAll(edateProp); // remove the property with the old valiue
            r.addProperty(edateProp, jTextField7.getText(), XSDDatatype.XSDdate);// add the property with the new valiue

            r.removeAll(submittedPapersProp); // remove the property with the old valiue
            r.addProperty(submittedPapersProp, jTextField11.getText(), XSDDatatype.XSDint);// add the property with the new valiue

            r.removeAll(acceptanceRateProp); // remove the property with the old valiue
            r.addProperty(acceptanceRateProp, jTextField13.getText(), XSDDatatype.XSDdecimal);// add the property with the new valiue

            r.removeAll(fieldProp); // remove the property with the old valiue
            r.addProperty(fieldProp, jTextField5.getText());// add the property with the new valiue

            r.removeAll(acceptedPapersProp); // remove the property with the old valiue
            r.addProperty(acceptedPapersProp, jTextField12.getText(), XSDDatatype.XSDint);// add the property with the new valiue

//            r.removeAll(belongsToSeriesProp); // remove the property with the old valiue
//            r.addProperty(belongsToSeriesProp, jTextField4.getText());// add the property with the new valiue
            r.removeAll(stateProp); // remove the property with the old valiue
            r.addProperty(stateProp, jTextField14.getText());// add the property with the new valiue

            r.removeAll(countryProp); // remove the property with the old valiue
            r.addProperty(countryProp, jTextField9.getText());// add the property with the new valiue

            r.removeAll(cityProp); // remove the property with the old valiue
            r.addProperty(cityProp, jTextField10.getText());// add the property with the new valiue

            r.removeAll(RDF.type); // remove rdf:type 
            if (String.valueOf(jComboBox1.getSelectedItem()).equals("Conference")) {
                Resource conceptURIResource = model.createResource("https://w3id.org/scholarlydata/ontology/conference-ontology.owl#Conference");
                r.addProperty(RDF.type, conceptURIResource);// add the property with the new valiue
            } else if (String.valueOf(jComboBox1.getSelectedItem()).equals("Symposium")) {
                Resource conceptURIResource = model.createResource("http://purl.org/seo/Symposium");
                r.addProperty(RDF.type, conceptURIResource);// add the property with the new valiue
            } else {
                Resource conceptURIResource = model.createResource("https://w3id.org/scholarlydata/ontology/conference-ontology.owl#Workshop");
                r.addProperty(RDF.type, conceptURIResource);// add the property with the new valiue
            }

            // write to the file
//            File outFile = new File("EVENTSKG.rdf");
            FileOutputStream out = new FileOutputStream(sourceFile);
            model.write(out, "RDF/XML");
            if (onlinesource) {
                JOptionPane.showMessageDialog(rootPane, "A the updated copy of the dataset has been saved in " + System.getProperty("user.dir") + "\\" + sourceFile.getPath() + " .", "EVENTSKG Updater API", JOptionPane.ERROR_MESSAGE);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void OnlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineBtnActionPerformed
        jLabel20.setVisible(true);
        String url = "https://raw.githubusercontent.com/saidfathalla/EVENTSKG-Dataset/master/EVENTKG_R2.rdf";
        try {
            model.read(url);
        } catch (Exception e) {
            jLabel20.setText("Dataset file: ERROR");
        }
        jLabel20.setText("URL: " + url);
        onlinesource = true;
        SearchBtn.setEnabled(true);
    }//GEN-LAST:event_OnlineBtnActionPerformed

    private void LocalFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalFileBtnActionPerformed
        jLabel20.setVisible(true);
        JFileChooser chooser = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("RDF FILES", "rdf", "RDF");
        chooser.setFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);

        int option = chooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {

            sourceFile = chooser.getSelectedFile();

            try {
                in = new BufferedInputStream(new FileInputStream(sourceFile));
                model.read(in, null);
                jLabel20.setText("Dataset file: " + sourceFile.getPath());
            } catch (Exception e) {
            }
        }
        SearchBtn.setEnabled(true);
    }//GEN-LAST:event_LocalFileBtnActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstructionsActionPerformed
        // TODO add your handling code here:
        String msg = "1. load the dataset either form the online repository (online repo. button) or from a local file (button)."
                + "\n2. search for a specific event by its acronym."
                + "\n3. update its metadata when found, "
                + "\n4. if not found, you can enter the metadata for the new event and an the updated copy of the dataset will be saved in " + System.getProperty("user.dir") + "\\" + " .";
        //+ " more information about the dataset can be found on the dataset webpage:http://sda.tech/EVENTS-Dataset/EVENTS.html";
        JOptionPane.showMessageDialog(rootPane, msg, "EVENTSKG Updater API", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItemInstructionsActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "This API has been developed by: Said Fathalla, PhD student at University of Bonn, Germany. \n Contacts: fathalla@cs.uni-bonn.de  ", "EVENTSKG Updater API", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jMenuItemOpenRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenRepoActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://github.com/saidfathalla/EVENTSKG-Dataset"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItemOpenRepoActionPerformed

    private void jMenuItemReportIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportIssueActionPerformed
        // TODO add your handling code here:

        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://github.com/saidfathalla/EVENTSKG-Dataset/issues/new/choose"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItemReportIssueActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new java.net.URI("https://github.com/saidfathalla/EVENTSKG_API/issues/new"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new java.net.URI("http://kddste.sda.tech/EVENTSKG-Dataset/EVENTSKG_R2.html"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updater().setVisible(true);
            }

        });
    }

    void clearTextFields() {
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField13.setText(null);
        jTextField14.setText(null);

    }
    File sourceFile;
    InputStream in = null;
    Model model = ModelFactory.createDefaultModel();
    Boolean onlinesource = false;
    ImageIcon img = new ImageIcon("icon.jpg");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocalFileBtn;
    private javax.swing.JButton OnlineBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemInstructions;
    private javax.swing.JMenuItem jMenuItemOpenRepo;
    private javax.swing.JMenuItem jMenuItemReportIssue;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
//  queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
//                    + "PREFIX conference-ontology:<https://w3id.org/scholarlydata/ontology/conference-ontology.owl#> "
//                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
//                    + "PREFIX seo: <http://purl.org/seo/>"
//                    + "SELECT  ?e   ?series ?type ?field ?country ?city ?webpage ?startdate ?enddate ?submittedPapers ?acceptedPapers  ?acceptanceRate " // variables to be added to resultset
//                    + " WHERE {  "
//                    + "?e a conference-ontology:Conference. "
//                    + " FILTER (regex( str(?e),\"" + q + "\", \'i\' )) ."
//                    + "?e a ?type. "
//                    + "?e seo:belongsToSeries ?series. "
//                    + "?e seo:field ?field. "
//                    + "?e seo:country ?country. "
//                    + "?e seo:city ?city. "
//                    + "?e seo:webpage ?webpage. "
//                    + "?e conference-ontology:startDate ?startdate. "
//                    + "?e conference-ontology:endDate ?enddate. "
//                    + "?e seo:submittedPapers ?submittedPapers. "
//                    + "?e seo:acceptedPapers ?acceptedPapers. "
//                    + "?e seo:acceptanceRate ?acceptanceRate. "
//                    + "}";
