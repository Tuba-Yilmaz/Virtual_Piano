import java.awt.event.KeyEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
public class VirtualPiano extends javax.swing.JFrame {

    
    public VirtualPiano() {
        initComponents();
        setLocation(480,200);
        //jPanel1
        jPanel1.setSize(230, 560);
    }
    public void noteCS() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        //Java File Sınıfı, bilgisayarımız üzerinde bulunan herhangi bir dosyanın bilgilerine erişmemize imkan sağlar
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\C_s.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);///sesin oynatılmasını sağlar
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteDS() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\D_s.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteFS() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\F_s.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteGS() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\G_s.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
      public void noteBb() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\Bb.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       public void noteC_s1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\C_s1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       public void noteD_s1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\D_s1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       //=========================================================================
         public void noteA() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\A.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteE() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\E.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteF() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\F.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
     public void noteG() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\G.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
      public void noteB() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\B.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       public void noteC() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\C.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       public void noteD() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\D.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
        public void noteD1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\D1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
        public void noteE1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\E1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
         public void noteC1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\C1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
          public void noteF1() throws LineUnavailableException, IOException, UnsupportedAudioFileException{
        File file=new File("C:\\netbeans\\Virtual_Piano_Keys\\Music_Note\\F1.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
         
    }
       //=========================================================================

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbtnBb = new javax.swing.JButton();
        jbtnCS = new javax.swing.JButton();
        jbtnFS = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDS = new javax.swing.JButton();
        jbtnD = new javax.swing.JButton();
        jbtnGS = new javax.swing.JButton();
        jbCs3 = new javax.swing.JButton();
        jbtnB = new javax.swing.JButton();
        jbCs4 = new javax.swing.JButton();
        jbtnF = new javax.swing.JButton();
        jbCs5 = new javax.swing.JButton();
        jbtnDS1 = new javax.swing.JButton();
        jbtnA = new javax.swing.JButton();
        jbtnE = new javax.swing.JButton();
        jbtnCS1 = new javax.swing.JButton();
        jbtnG = new javax.swing.JButton();
        jbtnC1 = new javax.swing.JButton();
        jbtnD1 = new javax.swing.JButton();
        jbtnE1 = new javax.swing.JButton();
        jbtnF1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 8));
        jPanel1.setMinimumSize(new java.awt.Dimension(10, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(null);

        jbtnBb.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnBb.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBb.setText("Bb");
        jbtnBb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnBb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBbActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBb);
        jbtnBb.setBounds(380, 30, 60, 150);

        jbtnCS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCS.setText("C#");
        jbtnCS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCSActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCS);
        jbtnCS.setBounds(70, 30, 60, 150);

        jbtnFS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnFS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFS.setText("F#");
        jbtnFS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFSActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnFS);
        jbtnFS.setBounds(260, 30, 60, 150);

        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnC);
        jbtnC.setBounds(40, 30, 60, 300);

        jbtnDS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnDS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDS.setText("D#");
        jbtnDS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDSActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDS);
        jbtnDS.setBounds(130, 30, 60, 150);

        jbtnD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnD.setText("D");
        jbtnD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnD);
        jbtnD.setBounds(100, 30, 60, 300);

        jbtnGS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnGS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGS.setText("G#");
        jbtnGS.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnGS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGSActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGS);
        jbtnGS.setBounds(320, 30, 60, 150);

        jbCs3.setBackground(new java.awt.Color(0, 0, 0));
        jbCs3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCs3.setForeground(new java.awt.Color(255, 255, 255));
        jbCs3.setText("C#");
        jbCs3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbCs3);
        jbCs3.setBounds(130, 30, 60, 150);

        jbtnB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnB.setText("B");
        jbtnB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnB);
        jbtnB.setBounds(410, 30, 60, 300);

        jbCs4.setBackground(new java.awt.Color(0, 0, 0));
        jbCs4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCs4.setForeground(new java.awt.Color(255, 255, 255));
        jbCs4.setText("C#");
        jbCs4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbCs4);
        jbCs4.setBounds(130, 30, 60, 150);

        jbtnF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnF.setText("F");
        jbtnF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnF);
        jbtnF.setBounds(230, 30, 60, 300);

        jbCs5.setBackground(new java.awt.Color(0, 0, 0));
        jbCs5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCs5.setForeground(new java.awt.Color(255, 255, 255));
        jbCs5.setText("C#");
        jbCs5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbCs5);
        jbCs5.setBounds(130, 30, 60, 150);

        jbtnDS1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDS1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnDS1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDS1.setText("D#1");
        jbtnDS1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnDS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDS1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDS1);
        jbtnDS1.setBounds(560, 30, 60, 150);

        jbtnA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnA.setText("A");
        jbtnA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnA);
        jbtnA.setBounds(350, 30, 60, 300);

        jbtnE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnE.setText("E");
        jbtnE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnE);
        jbtnE.setBounds(160, 30, 60, 300);

        jbtnCS1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCS1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCS1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCS1.setText("C#1");
        jbtnCS1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnCS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCS1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCS1);
        jbtnCS1.setBounds(500, 30, 60, 150);

        jbtnG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnG.setText("G");
        jbtnG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnG);
        jbtnG.setBounds(290, 30, 60, 300);

        jbtnC1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnC1.setText("C1");
        jbtnC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnC1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnC1);
        jbtnC1.setBounds(470, 30, 60, 300);

        jbtnD1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnD1.setText("D1");
        jbtnD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnD1);
        jbtnD1.setBounds(530, 30, 60, 300);

        jbtnE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnE1.setText("E1");
        jbtnE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnE1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnE1);
        jbtnE1.setBounds(590, 30, 60, 300);

        jbtnF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnF1.setText("F1");
        jbtnF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnF1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnF1);
        jbtnF1.setBounds(650, 30, 60, 300);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnF1ActionPerformed
        try {
            noteF1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnF1ActionPerformed

    private void jbtnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnE1ActionPerformed
        try {
            noteE1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnE1ActionPerformed

    private void jbtnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD1ActionPerformed
        try {
            noteD1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnD1ActionPerformed

    private void jbtnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnC1ActionPerformed
        try {
            noteC1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnC1ActionPerformed

    private void jbtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGActionPerformed
        try {
            noteG();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGActionPerformed

    private void jbtnCS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCS1ActionPerformed

        try {
            noteC_s1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCS1ActionPerformed

    private void jbtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEActionPerformed
        try {
            noteE();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnEActionPerformed

    private void jbtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAActionPerformed
        try {
            noteA();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAActionPerformed

    private void jbtnDS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDS1ActionPerformed
        try {
            noteD_s1();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDS1ActionPerformed

    private void jbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFActionPerformed
        try {
            noteF();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFActionPerformed

    private void jbtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBActionPerformed
        try {
            noteB();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnBActionPerformed

    private void jbtnGSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGSActionPerformed
        try {
            noteGS();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGSActionPerformed

    private void jbtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDActionPerformed
        try {
            noteD();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDActionPerformed

    private void jbtnDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDSActionPerformed
        try {
            noteDS();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDSActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        try {
            noteC();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFSActionPerformed
        try {
            noteFS();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFSActionPerformed

    private void jbtnCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCSActionPerformed
        try {
            noteCS();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCSActionPerformed

    private void jbtnBbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBbActionPerformed
        try {
            noteBb();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnBbActionPerformed

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
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirtualPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualPiano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCs3;
    private javax.swing.JButton jbCs4;
    private javax.swing.JButton jbCs5;
    private javax.swing.JButton jbtnA;
    private javax.swing.JButton jbtnB;
    private javax.swing.JButton jbtnBb;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnC1;
    private javax.swing.JButton jbtnCS;
    private javax.swing.JButton jbtnCS1;
    private javax.swing.JButton jbtnD;
    private javax.swing.JButton jbtnD1;
    private javax.swing.JButton jbtnDS;
    private javax.swing.JButton jbtnDS1;
    private javax.swing.JButton jbtnE;
    private javax.swing.JButton jbtnE1;
    private javax.swing.JButton jbtnF;
    private javax.swing.JButton jbtnF1;
    private javax.swing.JButton jbtnFS;
    private javax.swing.JButton jbtnG;
    private javax.swing.JButton jbtnGS;
    // End of variables declaration//GEN-END:variables
}
