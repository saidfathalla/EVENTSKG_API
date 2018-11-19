
import javax.swing.DefaultListModel;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;

import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EVENTSKG_Updater_Add extends javax.swing.JFrame {

    public EVENTSKG_Updater_Add() {

        initComponents();
        this.getRootPane().setDefaultButton(SearchBtn);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        clearTextFields();
        jLabel20.setVisible(false);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EVENTSKG Updater API");
        setAutoRequestFocus(false);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setEnabled(false);
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

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpdateBtn.setText("Add");
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
        jLabel13.setText("3. Add");

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

        jTextField2.setEditable(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OnlineBtn)
                                        .addGap(29, 29, 29)
                                        .addComponent(LocalFileBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField13)
                                    .addComponent(jTextField14))))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LocalFileBtn, OnlineBtn, SearchBtn, UpdateBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnlineBtn)
                    .addComponent(LocalFileBtn))
                .addGap(9, 9, 9)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel13)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LocalFileBtn, OnlineBtn, SearchBtn, UpdateBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed

        clearTextFields();
        String queryString = "";
        String q = jTextField1.getText();

        try {

//            if(model.isEmpty()) throw new java.net.UnknownHostException();
//            model.write(System.out);
            queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> "
                    + "PREFIX conference-ontology:<https://w3id.org/scholarlydata/ontology/conference-ontology.owl#> "
                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> "
                    + "PREFIX seo: <http://purl.org/seo/>"
                    + "SELECT  ?e   ?series ?type ?field ?country ?state ?city ?webpage ?startdate ?enddate ?submittedPapers ?acceptedPapers  ?acceptanceRate " // variables to be added to resultset
                    + " WHERE {  "
                    + "?e a conference-ontology:Conference. "
                    + " FILTER (regex( str(?e),\"" + q.replaceAll(" ", "") + "\", \'i\' )) ."
                    + "?e a ?type. "
                    + "?e seo:belongsToSeries ?series. "
                    + "?e seo:field ?field. "
                    + "?e seo:country ?country. "
                    + "?e seo:city ?city. "
                    + "?e seo:webpage ?webpage. "
                    + "?e conference-ontology:startDate ?startdate. "
                    + "?e conference-ontology:endDate ?enddate. "
                    + "OPTIONAL {?e seo:submittedPapers ?submittedPapers. }"
                    + "OPTIONAL { ?e seo:acceptedPapers ?acceptedPapers. }"
                    + "OPTIONAL { ?e seo:acceptanceRate ?acceptanceRate. }"
                    + "OPTIONAL { ?e seo:state ?state. }"
                    + "}";
        
            Query query = QueryFactory.create(queryString);
            QueryExecution qe = QueryExecutionFactory.create(query, model);

            ResultSet results = qe.execSelect();

//            ResultSetFormatter.out(System.out, results, query);
            if (!results.hasNext()) {
                qe.close();
                JOptionPane.showMessageDialog(rootPane, "Event not found.", "EVENTSKG Updater API", JOptionPane.ERROR_MESSAGE);
                return;
            }

            QuerySolution soln = results.nextSolution();

//            System.out.println(results.+" rows retrieved");
//            NodeIterator iter = model.listObjects();
//    while (iter.hasNext()) {
//        
//        System.out.println(" " + iter.next().toString());
//    }
//            
            jTextField2.setText(soln.getResource("e").toString());
            jTextField3.setText(soln.getResource("type").toString().replaceAll(".+#", ""));
            jTextField4.setText(soln.getResource("series").toString());
            jTextField5.setText(soln.getLiteral("field").getLexicalForm());

            jTextField8.setText(soln.getLiteral("webpage").getLexicalForm());
            jTextField9.setText(soln.getLiteral("country").getLexicalForm());
            jTextField6.setText(soln.getLiteral("startdate").getLexicalForm());
            jTextField7.setText(soln.getLiteral("enddate").getLexicalForm());
            jTextField10.setText(soln.getLiteral("city").getLexicalForm());

            jTextField11.setText(soln.getLiteral("submittedPapers").getLexicalForm());
            jTextField12.setText(soln.getLiteral("acceptedPapers").getLexicalForm());
            jTextField13.setText(soln.getLiteral("acceptanceRate").getLexicalForm());

            jTextField14.setText(soln.getLiteral("state").getLexicalForm());
            System.out.println(" x");

            qe.close();
        } catch (Exception ex) {
            jLabel20.setText("The dataset is not available.");
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
            //        Resource jenaCls = model.getResource("http://purl.org/eventskg/AAAI1980");
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

            r.removeAll(cityProp); // remove the property with the old valiue
            r.addProperty(cityProp, jTextField10.getText());// add the property with the new valiue

            r.removeAll(sdateProp); // remove the property with the old valiue
            r.addProperty(sdateProp, jTextField6.getText());// add the property with the new valiue

            r.removeAll(edateProp); // remove the property with the old valiue
            r.addProperty(edateProp, jTextField7.getText());// add the property with the new valiue

            r.removeAll(submittedPapersProp); // remove the property with the old valiue
            r.addProperty(submittedPapersProp, jTextField11.getText());// add the property with the new valiue

            r.removeAll(acceptanceRateProp); // remove the property with the old valiue
            r.addProperty(acceptanceRateProp, jTextField13.getText());// add the property with the new valiue

            r.removeAll(fieldProp); // remove the property with the old valiue
            r.addProperty(fieldProp, jTextField5.getText());// add the property with the new valiue

            r.removeAll(acceptedPapersProp); // remove the property with the old valiue
            r.addProperty(acceptedPapersProp, jTextField12.getText());// add the property with the new valiue

//            r.removeAll(belongsToSeriesProp); // remove the property with the old valiue
//            r.addProperty(belongsToSeriesProp, jTextField4.getText());// add the property with the new valiue
            r.removeAll(stateProp); // remove the property with the old valiue
            r.addProperty(stateProp, jTextField14.getText());// add the property with the new valiue

            r.removeAll(countryProp); // remove the property with the old valiue
            r.addProperty(countryProp, jTextField9.getText());// add the property with the new valiue

            r.removeAll(cityProp); // remove the property with the old valiue
            r.addProperty(cityProp, jTextField10.getText());// add the property with the new valiue

            // write to the file
            File outFile = new File("EVENTSKG.rdf");
            FileOutputStream out = new FileOutputStream(outFile);
            model.write(out, "RDF/XML");
            if (onlinesource) {
                JOptionPane.showMessageDialog(rootPane, "A the updated copy of the dataset has been saved in " + System.getProperty("user.dir") + "\\" + outFile.getPath() + " .", "EVENTSKG Updater API", JOptionPane.ERROR_MESSAGE);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Updater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void OnlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineBtnActionPerformed
        jLabel20.setVisible(true);
        String url = "https://saidfathalla.github.io/EVENTS-Dataset/EVENTSKG-40.rdf";
        try {
            model.read(url);

        } catch (Exception e) {
            jLabel20.setText("Dataset file: ERROR");

        }
        jLabel20.setText("Dataset URL: https://saidfathalla.github.io/EVENTS-Dataset/EVENTSKG-40.rdf");
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
    Boolean onlinesource;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LocalFileBtn;
    private javax.swing.JButton OnlineBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
