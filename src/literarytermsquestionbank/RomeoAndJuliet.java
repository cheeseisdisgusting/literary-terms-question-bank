/* Created by A. Tan
 * on 17 NovemberTo change this license header, choose License Headers in Project Properties.
 * on 17 NovemberTo change this template file, choose Tools | Templates
 * on 17 Novemberand open the template in the editor.
 */

package literarytermsquestionbank;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Aaron
 */
public class RomeoAndJuliet extends javax.swing.JFrame {

    /** Creates new form RomeoAndJuliet */
    public RomeoAndJuliet() {
        initComponents();
        getRootPane().setDefaultButton(checkButton); // Sets the default button
        this.setLocationRelativeTo(null); // Put window in middle of screen
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secondaryPanel = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        answerTabPanel = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        answerTextField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        stuckLabel = new javax.swing.JLabel();
        rescueButton = new javax.swing.JButton();
        answerLabel = new javax.swing.JLabel();
        clueTabPanel = new javax.swing.JPanel();
        clueLabel = new javax.swing.JLabel();
        commentsTabPanel = new javax.swing.JPanel();
        commentsLabel = new javax.swing.JLabel();
        exampleTabPanel = new javax.swing.JPanel();
        examplesLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        quoteBottomLabel = new javax.swing.JLabel();
        quoteTopLabel = new javax.swing.JLabel();
        actLabel = new javax.swing.JLabel();
        sceneLabel = new javax.swing.JLabel();
        lineNumberLabel = new javax.swing.JLabel();
        passageLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        roseLabel = new javax.swing.JLabel();
        knifeLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        navigationPanel = new javax.swing.JPanel();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        youAreViewingLabel = new javax.swing.JLabel();
        totalNumberLabel = new javax.swing.JLabel();
        quoteIndexTextField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Romeo and Juliet");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1140, 790));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1140, 640));
        setPreferredSize(new java.awt.Dimension(1140, 640));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        secondaryPanel.setBackground(new java.awt.Color(255, 255, 255));
        secondaryPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        secondaryPanel.setMinimumSize(new java.awt.Dimension(320, 300));
        secondaryPanel.setPreferredSize(new java.awt.Dimension(320, 300));

        tabbedPane.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        tabbedPane.setName("Answer"); // NOI18N

        answerTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        questionLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("What literary device is this?");

        answerTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerTextFieldMouseClicked(evt);
            }
        });

        checkButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        checkButton.setText("Check answer");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        stuckLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        stuckLabel.setText("Completely stuck?");

        rescueButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        rescueButton.setText("Rescue Me");
        rescueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rescueButtonActionPerformed(evt);
            }
        });

        answerLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout answerTabPanelLayout = new javax.swing.GroupLayout(answerTabPanel);
        answerTabPanel.setLayout(answerTabPanelLayout);
        answerTabPanelLayout.setHorizontalGroup(
            answerTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(checkButton, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTextField, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stuckLabel, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rescueButton, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addContainerGap())
        );
        answerTabPanelLayout.setVerticalGroup(
            answerTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerTabPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stuckLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rescueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabbedPane.addTab("Answer", answerTabPanel);

        clueTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        clueLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        clueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clueLabel.setText("<html>Bacon ipsum dolor amet hamburger doner ham tri-tip sirloin. Ham hock boudin flank, hamburger spare ribs beef ribs salami turkey brisket tri-tip fatback prosciutto. Bresaola jowl sirloin, bacon capicola biltong porchetta swine flank.</html>");
        clueLabel.setToolTipText("");

        javax.swing.GroupLayout clueTabPanelLayout = new javax.swing.GroupLayout(clueTabPanel);
        clueTabPanel.setLayout(clueTabPanelLayout);
        clueTabPanelLayout.setHorizontalGroup(
            clueTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clueTabPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(clueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        clueTabPanelLayout.setVerticalGroup(
            clueTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clueTabPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(clueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Clue", clueTabPanel);

        commentsTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        commentsLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 11)); // NOI18N
        commentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        commentsLabel.setText("<html>Bacon ipsum dolor amet hamburger doner ham tri-tip sirloin. Ham hock boudin flank, hamburger spare ribs beef ribs salami turkey brisket tri-tip fatback prosciutto. Bresaola jowl sirloin, bacon capicola biltong porchetta swine flank.</html>");
        commentsLabel.setToolTipText("");

        javax.swing.GroupLayout commentsTabPanelLayout = new javax.swing.GroupLayout(commentsTabPanel);
        commentsTabPanel.setLayout(commentsTabPanelLayout);
        commentsTabPanelLayout.setHorizontalGroup(
            commentsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentsTabPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        commentsTabPanelLayout.setVerticalGroup(
            commentsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentsTabPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("More Info", commentsTabPanel);

        exampleTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        examplesLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        examplesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        examplesLabel.setText("<html>Bacon ipsum dolor amet hamburger doner ham tri-tip sirloin. Ham hock boudin flank, hamburger spare ribs beef ribs salami turkey brisket tri-tip fatback prosciutto. Bresaola jowl sirloin, bacon capicola biltong porchetta swine flank.</html>");
        examplesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout exampleTabPanelLayout = new javax.swing.GroupLayout(exampleTabPanel);
        exampleTabPanel.setLayout(exampleTabPanelLayout);
        exampleTabPanelLayout.setHorizontalGroup(
            exampleTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exampleTabPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(examplesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        exampleTabPanelLayout.setVerticalGroup(
            exampleTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exampleTabPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(examplesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("More examples", exampleTabPanel);

        javax.swing.GroupLayout secondaryPanelLayout = new javax.swing.GroupLayout(secondaryPanel);
        secondaryPanel.setLayout(secondaryPanelLayout);
        secondaryPanelLayout.setHorizontalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        secondaryPanelLayout.setVerticalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabbedPane.getAccessibleContext().setAccessibleName("");

        getContentPane().add(secondaryPanel);
        secondaryPanel.setBounds(810, 0, 320, 320);

        mainPanel.setBackground(new java.awt.Color(251, 235, 204));
        mainPanel.setLayout(null);

        quoteBottomLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        quoteBottomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quoteBottomLabel.setText("\"");
        quoteBottomLabel.setToolTipText("");
        mainPanel.add(quoteBottomLabel);
        quoteBottomLabel.setBounds(370, 430, 50, 50);

        quoteTopLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        quoteTopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quoteTopLabel.setText("\"");
        quoteTopLabel.setToolTipText("");
        mainPanel.add(quoteTopLabel);
        quoteTopLabel.setBounds(370, 200, 50, 50);

        actLabel.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        actLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actLabel.setText("---ACT 1---");
        actLabel.setToolTipText("");
        mainPanel.add(actLabel);
        actLabel.setBounds(210, 120, 380, 40);

        sceneLabel.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        sceneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sceneLabel.setText("---Scene 1---");
        sceneLabel.setToolTipText("");
        mainPanel.add(sceneLabel);
        sceneLabel.setBounds(250, 160, 170, 20);

        lineNumberLabel.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        lineNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lineNumberLabel.setText("14-15");
        mainPanel.add(lineNumberLabel);
        lineNumberLabel.setBounds(310, 160, 230, 19);

        passageLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        passageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passageLabel.setText("<html>The passage will appear here.<br><br>Bacon ipsum dolor amet hamburger doner ham tri-tip sirloin. Ham hock boudin flank.<html>");
        passageLabel.setToolTipText("");
        mainPanel.add(passageLabel);
        passageLabel.setBounds(250, 180, 300, 330);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/Scroll_v3.png"))); // NOI18N
        mainPanel.add(backgroundLabel);
        backgroundLabel.setBounds(170, 40, 456, 510);

        roseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/rose.png"))); // NOI18N
        mainPanel.add(roseLabel);
        roseLabel.setBounds(540, 90, 430, 230);

        knifeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/knife.png"))); // NOI18N
        knifeLabel.setText("jLabel1");
        mainPanel.add(knifeLabel);
        knifeLabel.setBounds(70, 230, 220, 290);

        backButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        backButton.setText("< Back");
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        mainPanel.add(backButton);
        backButton.setBounds(10, 10, 90, 50);

        navigationPanel.setBackground(new java.awt.Color(255, 255, 255));
        navigationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        navigationPanel.setLayout(null);

        previousButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(previousButton);
        previousButton.setBounds(20, 230, 89, 27);

        nextButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 14)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(nextButton);
        nextButton.setBounds(240, 230, 69, 27);

        youAreViewingLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        youAreViewingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youAreViewingLabel.setText("You are viewing");
        navigationPanel.add(youAreViewingLabel);
        youAreViewingLabel.setBounds(62, 39, 191, 25);

        totalNumberLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 36)); // NOI18N
        totalNumberLabel.setText("of 106");
        navigationPanel.add(totalNumberLabel);
        totalNumberLabel.setBounds(171, 70, 100, 49);

        quoteIndexTextField.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        quoteIndexTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quoteIndexTextFieldMouseClicked(evt);
            }
        });
        navigationPanel.add(quoteIndexTextField);
        quoteIndexTextField.setBounds(90, 70, 70, 39);

        goButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        goButton.setText("Go!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(goButton);
        goButton.setBounds(130, 120, 71, 30);

        randomButton.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        randomButton.setText("Random!");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });
        navigationPanel.add(randomButton);
        randomButton.setBounds(110, 160, 120, 40);

        mainPanel.add(navigationPanel);
        navigationPanel.setBounds(810, 320, 320, 300);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, -1, 1130, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int totalNumberOfQuotes = 0; // Used to keep track of how many quotes there are
    int quoteIndex = 0; // Used to keep track of the current quote
    String answer; // Used to keep track of the correct answer
    ArrayList <Integer> previousQuoteIndexArray = new ArrayList(); // Used to keep track of quotes already used
    ArrayList <JSONObject> quotesList = new ArrayList(); // Used to hold all the quotes
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Set custom  icon
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/Images/book-icon_rj.png")));
        
        // Set custom fonts
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            
            // Load Old English from resources
            Font englishFontFace = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Resources/Fonts/OLDENGL.TTF"));
            ge.registerFont(englishFontFace);
            actLabel.setFont(englishFontFace.deriveFont(Font.PLAIN, 30f));
            sceneLabel.setFont(englishFontFace.deriveFont(Font.PLAIN, 16f));
            lineNumberLabel.setFont(englishFontFace.deriveFont(Font.PLAIN, 16f));
            
            // Load Matura Script font from resources
            Font maturaFontFace = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Resources/Fonts/MATURASC.TTF"));
            ge.registerFont(maturaFontFace);
            tabbedPane.setFont(maturaFontFace.deriveFont(Font.PLAIN, 18f));
            questionLabel.setFont(maturaFontFace.deriveFont(Font.PLAIN, 18f));
            checkButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            stuckLabel.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            rescueButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            answerLabel.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            youAreViewingLabel.setFont(maturaFontFace.deriveFont(Font.PLAIN, 18f));
            quoteIndexTextField.setFont(maturaFontFace.deriveFont(Font.PLAIN, 24f));
            totalNumberLabel.setFont(maturaFontFace.deriveFont(Font.PLAIN, 36f));
            goButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 24f));
            randomButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 18f));
            previousButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            nextButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            backButton.setFont(maturaFontFace.deriveFont(Font.PLAIN, 14f));
            
            // Load Corsova font from resources
            Font corsovaFontFace = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Resources/Fonts/MTCORSVA.TTF"));
            ge.registerFont(corsovaFontFace);
            clueLabel.setFont(corsovaFontFace.deriveFont(Font.PLAIN, 18f));
            passageLabel.setFont(corsovaFontFace.deriveFont(Font.PLAIN, 18f));
            examplesLabel.setFont(corsovaFontFace.deriveFont(Font.PLAIN, 18f));
            commentsLabel.setFont(corsovaFontFace.deriveFont(Font.PLAIN, 14f));
            
            // Load Imprint font from resources
            Font imprintFontFace = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Resources/Fonts/IMPRISHA.TTF"));
            ge.registerFont(imprintFontFace);
            quoteTopLabel.setFont(imprintFontFace.deriveFont(Font.PLAIN, 48f));
            quoteBottomLabel.setFont(imprintFontFace.deriveFont(Font.PLAIN, 48f));
        } catch (FontFormatException ex) {
            Logger.getLogger(RomeoAndJuliet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RomeoAndJuliet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JSONParser parser = new JSONParser();
        
        try {
            // This object is the result of parsing the JSON file at the relative filepath as defined above; the JSON file is in the Resources source package.
            Object quoteObj = parser.parse(new InputStreamReader(getClass().getResourceAsStream("/Resources/Files/db.json")));
            
            // This casts the object to a JSONObject for future manipulation
            JSONObject jsonObject = (JSONObject) quoteObj;
            
            // This array holds all the quotes
            JSONArray quotesArray = (JSONArray) jsonObject.get("Romeo and Juliet");
            Iterator <JSONObject> iterator = quotesArray.iterator();
            
            // Using the iterator as declared above, add each JSONObject in the Romeo and Juliet array to the ArrayList
            while (iterator.hasNext()) {
                Collections.addAll(quotesList, iterator.next());
                totalNumberOfQuotes++;
            }
            
            // Init randomizer
            Random rand = new Random();

            // Generate a random integer between 1 and size of the ArrayList
            quoteIndex = rand.nextInt(quotesList.size()) + 1;
            
            generateQuote(quoteIndex); // This calls a method to generate a quote and display it
        } catch (Exception e) { // This means something went very wrong when starting the program
            System.out.println("Uh oh, something bad happened. Possible database corruption.");
            JOptionPane.showMessageDialog(null, "Something went wrong while starting the app! Please tell Aaron with code 129.", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        String answerToCheck;
        try {
            answerToCheck = answerTextField.getText(); // Get the text from the text entry field
            System.out.println(answerToCheck);
            if (!answerTextField.getText().equals("")) { // User has entered a valid string
                answerToCheck = answerToCheck.substring(0).toLowerCase(); // Convert to all lowercase
                answer = answer.substring(0).toLowerCase(); // Convert to all lowercase
                if (answer.contains(answerToCheck)) { // User was correct, show on button
                    checkButton.setText("Correct!");
                    checkButton.setBackground(Color.green);
                    checkButton.setForeground(Color.white);
                    nextButton.setEnabled(true);
                } else { // User was wrong, show on button
                    checkButton.setText("Incorrect!");
                    checkButton.setBackground(Color.red);
                    checkButton.setForeground(Color.white);
                }
            } else { // User tried to check an empty string; prompt for input
                JOptionPane.showMessageDialog(null, "You have no literary device! Please enter one and check again.", "Uh-oh!", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something went wrong while checking your answer! Please tell Aaron with code 130.", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    // This shows the answer if the user is really desperate and clicks this button
    private void rescueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rescueButtonActionPerformed
        answerLabel.setText("<html>" + (String)quotesList.get(quoteIndex - 1).get("Literary Device") + "</html>");
        answerLabel.setVisible(true);
    }//GEN-LAST:event_rescueButtonActionPerformed

    // This loads the quote at the index of whatever number the user entered
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        try {
            if (Integer.parseInt(quoteIndexTextField.getText()) <= totalNumberOfQuotes && Integer.parseInt(quoteIndexTextField.getText()) >= 1) {
                quoteIndex = Integer.parseInt(quoteIndexTextField.getText());
                generateQuote(quoteIndex);
            } else {
                JOptionPane.showMessageDialog(null, "Whatever number you entered isn't valid. Try again!", "Uh oh!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Whatever number you entered isn't valid. Try again!", "Uh oh!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_goButtonActionPerformed

    // This loads the next quote
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (quoteIndex != totalNumberOfQuotes) {
            quoteIndex++;
            generateQuote(quoteIndex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    // This loads the previous quote
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        if (quoteIndex != 1) {
            --quoteIndex;
            generateQuote(quoteIndex);
        }
    }//GEN-LAST:event_previousButtonActionPerformed

    // This generates a random quote index and shows it
    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        // Init randomizer
        Random rand = new Random();

        // Generate a random integer between 0 and size of the ArrayList
        quoteIndex = rand.nextInt(quotesList.size()) + 1;
        System.out.println(quoteIndex);
        
        // Prevent generating the same index as previously used
        if (previousQuoteIndexArray.size() > totalNumberOfQuotes) {
            previousQuoteIndexArray.clear();
        }
        
        while (previousQuoteIndexArray.size() < totalNumberOfQuotes && previousQuoteIndexArray.indexOf(quoteIndex) != -1) {
            System.out.println("The quote was regenerated and the previous index was at " + previousQuoteIndexArray.indexOf(quoteIndex));
            quoteIndex = rand.nextInt(quotesList.size()) + 1;
        }
        
        // For logging
//        System.out.println(previousQuoteIndexArray.size());
//        for (int i = 0; i < previousQuoteIndexArray.size(); i++) {
//            System.out.println("The item #" + i + " is " + previousQuoteIndexArray.get(i));
//        }
        
        // Show the new quote
        generateQuote(quoteIndex);
    }//GEN-LAST:event_randomButtonActionPerformed

    // This returns the user to the main menu
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed
    
    // Set the enter key to go to question rather than checking when user clicks on this section
    private void quoteIndexTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quoteIndexTextFieldMouseClicked
        getRootPane().setDefaultButton(goButton);
    }//GEN-LAST:event_quoteIndexTextFieldMouseClicked

    // Set the enter key to check when user clicks on textfield to enter text
    private void answerTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerTextFieldMouseClicked
        getRootPane().setDefaultButton(checkButton);
    }//GEN-LAST:event_answerTextFieldMouseClicked
    
    private void generateQuote(int index) {
        // Add this index to the list of indices already used
        previousQuoteIndexArray.add(index);
        
        // Hide any previous rescue hints
        answerLabel.setVisible(false);
        
        // Reset all buttons
        checkButton.setBackground(Color.GRAY);
        checkButton.setText("Check");
        checkButton.setForeground(Color.BLACK);
        
        // Reset text field
        answerTextField.setText("");
        
        // Set comments, clue, and related numbers
        commentsLabel.setText("<html>" + (String)quotesList.get(index - 1).get("Comment") + "</html>");
        clueLabel.setText("<html>" + (String)quotesList.get(index - 1).get("Hint") + "</html>");
        examplesLabel.setText("<html>Quote numbers with the same literary device:<br><br>" + (String)quotesList.get(index - 1).get("Related") + "</html>");
        
        // Set the location of the quote
        actLabel.setText("<html>--- Act: " + (String)quotesList.get(index - 1).get("Act") + " ---</html>"); // Set the Act #
        sceneLabel.setText("<html>--- Scene " + (String)quotesList.get(index - 1).get("Scene") + "</html>"); // Set the Scene #
        if (((String)quotesList.get(index - 1).get("Line Number")).contains("-")) { // Set the Line #
            lineNumberLabel.setText("<html>Lines " + (String)quotesList.get(index - 1).get("Line Number") + " ---</html>"); // This means that there are multiple lines
        } else {
            lineNumberLabel.setText("<html>Line " + (String)quotesList.get(index - 1).get("Line Number") + " ---</html>"); // This means that there is only one line
        }

        // Set main panel
        passageLabel.setText("<html>" + (String)quotesList.get(index - 1).get("Quote") + "</html>");

        // Set the answer
        answer = (String)quotesList.get(index - 1).get("Literary Device");

        // Set the total number of quotes in navigation pane and current quote
        totalNumberLabel.setText("/" + Integer.toString(totalNumberOfQuotes));
        quoteIndexTextField.setText(Integer.toString(index - 1 + 1));
        
        // Disable appropriate buttons if there are user is at bounds of array
        if (index == totalNumberOfQuotes) {
            nextButton.setEnabled(false);
            previousButton.setEnabled(true);
        } else if ((index - 1) <= 0) {
            previousButton.setEnabled(false);
            nextButton.setEnabled(true);
        } else {
            nextButton.setEnabled(true);
            previousButton.setEnabled(true);
        }
        
        /*********************************************************************************************************************************** LOGS */
        // Log the total number of quotes
        System.out.println("The total number of quotes is: " + totalNumberOfQuotes + " and the size of the array is: " + quotesList.size());
        // Get the element of the ArrayList and print it
        System.out.println("The thing that was printed was: " + quotesList.get(quoteIndex - 1));
        // Get the generated quote of the ArrayList and get the "Quote" part
        System.out.println("The quote is " + quotesList.get(quoteIndex - 1).get("Quote"));
        /*********************************************************************************************************************************** END OF LOGS */
    }
    
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
            java.util.logging.Logger.getLogger(RomeoAndJuliet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RomeoAndJuliet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RomeoAndJuliet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RomeoAndJuliet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RomeoAndJuliet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actLabel;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JPanel answerTabPanel;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel clueLabel;
    private javax.swing.JPanel clueTabPanel;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JPanel commentsTabPanel;
    private javax.swing.JPanel exampleTabPanel;
    private javax.swing.JLabel examplesLabel;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel knifeLabel;
    private javax.swing.JLabel lineNumberLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel passageLabel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel quoteBottomLabel;
    private javax.swing.JTextField quoteIndexTextField;
    private javax.swing.JLabel quoteTopLabel;
    private javax.swing.JButton randomButton;
    private javax.swing.JButton rescueButton;
    private javax.swing.JLabel roseLabel;
    private javax.swing.JLabel sceneLabel;
    private javax.swing.JPanel secondaryPanel;
    private javax.swing.JLabel stuckLabel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel totalNumberLabel;
    private javax.swing.JLabel youAreViewingLabel;
    // End of variables declaration//GEN-END:variables

}
