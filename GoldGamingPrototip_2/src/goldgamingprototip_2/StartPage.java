
package goldgamingprototip_2;

import java.awt.Dimension;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class StartPage extends javax.swing.JFrame {

    
    public StartPage() throws IOException {
        this.aw = new FileWriter(atxt);
        this.bw = new FileWriter(btxt);
        this.cw = new FileWriter(ctxt);
        this.dw = new FileWriter(dtxt);
        
        initComponents();
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
        but4.setVisible(false);
        buta.setVisible(false);
        butb.setVisible(false);
        butc.setVisible(false);
        butd.setVisible(false);
        
        butbitti.setVisible(false);

    }
    GameBoard3 gb = new GameBoard3();
    JFrame jf = new JFrame();
    int x;
    String xs;
    int y;
    String ys;
    int gold_field;
    int secret_gold;
    int[][] matris ;
    int[][] matris2;
    int puan;
    int adim;
    String puans;
    String adims;
    int birpuan;
    int ikipuan;
    int ucpuan;
    int dortpuan;
    
    int bayrak=0;
    
    int birhedefx;
    int birhedefy;
    int birkonumx=0;
    int birkonumy=0;
    int biraltın=200;
    int biradimsayisi=0;
    int birtoplanan=0;
    int birharcanan=0;
    int birkez=1;
    
    int ikihedefx;
    int ikihedefy;
    int ikikonumx=0;
    int ikikonumy=0;
    int ikialtın=200;
    int ikiadimsayisi=0;
    int ikitoplanan=0;
    int ikiharcanan=0;
    int ikikez=1;
    
    int uchedefx;
    int uchedefy;
    int uckonumx=0;
    int uckonumy=0;
    int ucaltın=200;
    int ucadimsayisi=0;
    int uctoplanan=0;
    int ucharcanan=0;
    int uckez=1;
    
    int dorthedefx;
    int dorthedefy;
    int dortkonumx=0;
    int dortkonumy=0;
    int dortaltın=200;
    int dortadimsayisi=0;
    int dorttoplanan=0;
    int dortharcanan=0;
    int dortkez=1;
    
    File atxt = new File("Aoyuncusu.txt");
    File btxt = new File("Boyuncusu.txt");
    File ctxt = new File("Coyuncusu.txt");
    File dtxt = new File("Doyuncusu.txt");
    
    FileWriter aw;
    FileWriter bw;
    FileWriter cw;
    FileWriter dw;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonstart = new javax.swing.JButton();
        textX = new javax.swing.JTextField();
        textY = new javax.swing.JTextField();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        textpuan = new javax.swing.JTextField();
        textadim = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buta = new javax.swing.JButton();
        butb = new javax.swing.JButton();
        butc = new javax.swing.JButton();
        butd = new javax.swing.JButton();
        butbitti = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        buttonstart.setBackground(new java.awt.Color(51, 51, 51));
        buttonstart.setForeground(new java.awt.Color(255, 255, 255));
        buttonstart.setText("START");
        buttonstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonstartActionPerformed(evt);
            }
        });
        getContentPane().add(buttonstart);
        buttonstart.setBounds(320, 20, 150, 110);

        textX.setBackground(new java.awt.Color(204, 204, 0));
        textX.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        textX.setText("20");
        textX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textXActionPerformed(evt);
            }
        });
        getContentPane().add(textX);
        textX.setBounds(150, 20, 140, 50);

        textY.setBackground(new java.awt.Color(204, 204, 0));
        textY.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        textY.setText("20");
        textY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYActionPerformed(evt);
            }
        });
        getContentPane().add(textY);
        textY.setBounds(150, 80, 140, 50);

        but1.setBackground(new java.awt.Color(51, 51, 51));
        but1.setForeground(new java.awt.Color(255, 255, 255));
        but1.setText("A Oyna ");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        getContentPane().add(but1);
        but1.setBounds(10, 260, 140, 50);

        but2.setBackground(new java.awt.Color(51, 51, 51));
        but2.setForeground(new java.awt.Color(255, 255, 255));
        but2.setText("B Oyna");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        getContentPane().add(but2);
        but2.setBounds(10, 310, 140, 50);

        but3.setBackground(new java.awt.Color(51, 51, 51));
        but3.setForeground(new java.awt.Color(255, 255, 255));
        but3.setText("C Oyna");
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        getContentPane().add(but3);
        but3.setBounds(10, 360, 140, 50);

        but4.setBackground(new java.awt.Color(51, 51, 51));
        but4.setForeground(new java.awt.Color(255, 255, 255));
        but4.setText("D Oyna");
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        getContentPane().add(but4);
        but4.setBounds(10, 410, 140, 50);

        textpuan.setBackground(new java.awt.Color(204, 204, 0));
        textpuan.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textpuan.setText("200");
        textpuan.setCaretColor(new java.awt.Color(153, 153, 0));
        textpuan.setDisabledTextColor(new java.awt.Color(102, 102, 0));
        getContentPane().add(textpuan);
        textpuan.setBounds(150, 140, 140, 50);

        textadim.setBackground(new java.awt.Color(204, 204, 0));
        textadim.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        textadim.setText("3");
        getContentPane().add(textadim);
        textadim.setBounds(150, 200, 140, 50);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sütun");
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 80, 120, 50);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Satır");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 20, 120, 50);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Adım Sayısı");
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 200, 120, 50);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Puan");
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 140, 120, 50);

        buta.setBackground(new java.awt.Color(51, 51, 51));
        buta.setForeground(new java.awt.Color(255, 255, 255));
        buta.setText("jButton5");
        getContentPane().add(buta);
        buta.setBounds(170, 260, 340, 40);

        butb.setBackground(new java.awt.Color(51, 51, 51));
        butb.setForeground(new java.awt.Color(255, 255, 255));
        butb.setText("jButton6");
        getContentPane().add(butb);
        butb.setBounds(170, 313, 340, 40);

        butc.setBackground(new java.awt.Color(51, 51, 51));
        butc.setForeground(new java.awt.Color(255, 255, 255));
        butc.setText("jButton7");
        getContentPane().add(butc);
        butc.setBounds(170, 363, 340, 40);

        butd.setBackground(new java.awt.Color(51, 51, 51));
        butd.setForeground(new java.awt.Color(255, 255, 255));
        butd.setText("jButton8");
        getContentPane().add(butd);
        butd.setBounds(170, 420, 340, 40);

        butbitti.setBackground(new java.awt.Color(204, 0, 0));
        butbitti.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        butbitti.setText("Altınlar Bitti");
        getContentPane().add(butbitti);
        butbitti.setBounds(300, 133, 210, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldgamingprototip_2/goldminer2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYActionPerformed
        
    private void buttonstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonstartActionPerformed
       
        
        
        xs=textX.getText();
       x= Integer.parseInt(xs);
       ys=textY.getText();
       y= Integer.parseInt(ys);
       ikikonumy=(y-1);
       uckonumx=(x-1);
       dortkonumx=(x-1);
       dortkonumy=(y-1);
       
       puans=textpuan.getText();
       adims=textadim.getText();
       puan=Integer.parseInt(puans);
       adim=Integer.parseInt(adims);
       birpuan=puan;
       ikipuan=puan;
       ucpuan=puan;
       dortpuan=puan;
       
       
        matris = new int [x][y];    //Bu matrisin amacı altın yerlerini ve gizli altınları tutmaktır.
        matris2 = new int [x][y];   //Bu matrisin amacı altınların değerini tutmaktır.
        
        //Tabloyu oluşturma ** Birinci Matris için
        for (int i = 0; i < x; i++) {
            for(int j = 0; j < y ;j++){
               matris[i][j]=0;   
            }    
        }
        
        //İkinci Matrisi oluşturma
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matris2[i][j]=0;    
            }
        }
        
        matris[0][0] =5 ;
        matris[x-1][0] =6 ;
        matris[0][y-1] =7 ;
        matris[x-1][y-1] =8 ;
        
        //Altınların yerini bulmak
        
        
      gold_field = (x*y)/5;
      
      int gold_count = 0;
      int golds[] = {5,10,15,20};
      
       secret_gold = gold_field/10;
      int secret_gold_count = 0;
        
      while(true){
          int  a = (int) ((Math.random()*(x-1))+1);
          int  b = (int) ((Math.random()*(y-1))+1);
          
          //Random Altın atama işlemi
           
         if(matris[a][b]==1){
               continue;
          }
          else if(gold_count == gold_field){
              
              break;
          } 
         else if(matris[a][b]==0){
                 matris[a][b]=1;
                 gold_count++;
          } 
      }
      
     while(true){
          int  a = (int) ((Math.random()*(x-1))+1);
          int  b = (int) ((Math.random()*(y-1))+1);
          
          //Random 'Gizli' Altın atama işlemi
           
         if(matris[a][b]==1||matris[a][b]==2){
               continue;
          }
          else if(secret_gold == secret_gold_count){
              break;
          } 
         else if(matris[a][b]==0){
              matris[a][b]=2;
              secret_gold_count++;
          } 
      }
     
      //Altın değerlerini atama işlemi
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1 || matris[i][j]==2)
                {
                    matris2[i][j]=golds[(int)(Math.random()*4)];
                }
                
            } 
        }
        
              for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" "+matris[i][j]);
                
            }
             System.out.println();
        }
         System.out.println();
         System.out.println("------------------------------------------------------------------------");
         System.out.println();
         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" "+matris2[i][j]);
                
            }
             System.out.println();
        }
       
        
        but1.setVisible(true);
        but2.setVisible(true);
        but3.setVisible(true);
        but4.setVisible(true);

        gb.initializeGui(x, y,matris,matris2);
        
        jf.add(gb.getGui());
        jf.setLocationByPlatform(true);
        jf.setMinimumSize(jf.getSize());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setPreferredSize(new Dimension(600,600));
        jf.setMinimumSize(new Dimension(600,600));
        jf.setLocation(650,50);
        jf.pack();
        jf.setVisible(true);
        
        birincihedefbul(matris, x, y, gold_field, birkonumx, birkonumy);
        ikincihedefbul(matris, matris2, x, y, gold_field, ikikonumx, ikikonumy);
         ucuncuhedefbul(x, y, gold_field, secret_gold, uckonumx, uckonumy);
    }//GEN-LAST:event_buttonstartActionPerformed

    public void birincihedefbul(int [][] matris1,int x,int y,int gold_field,int birkonumx,int birkonumy){
        
          double a_mesafe;
        double [] mesafeler = new double [gold_field];
        int k = 0;
       
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris1[i][j]==1){
                    a_mesafe = Math.sqrt(((i-birkonumx)*(i-birkonumx))+((j-birkonumy)*(j-birkonumy)));
                    mesafeler[k] = a_mesafe ;
                    k++;
                   
                }
            } 
        }
        
        
        double A_temp =mesafeler[0];
        for (int i = 0; i < mesafeler.length ; i++) {
            if(mesafeler[i]!=0 && mesafeler[i]<A_temp){
                A_temp=mesafeler[i];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris1[i][j]==1){
                    a_mesafe = Math.sqrt(((i-birkonumx)*(i-birkonumx))+((j-birkonumy)*(j-birkonumy)));
                    if(A_temp == a_mesafe){
                        birhedefx=i;
                        birhedefy=j;
                        birpuan=birpuan-5;
                        birharcanan=birharcanan+5;
                    }
                     
                   
                }
            } 
        }


        
       
        }
    
    public void ikincihedefbul(int [][] matris1,int [][] matris2 ,int x,int y,int gold_field,int ikikonumx,int ikikonumy){
        
        double b_maliyet[] = new double [gold_field];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                    if(matris1[i][j]==1){
                    b_maliyet[k] = (matris2[i][j])/Math.sqrt(((i-ikikonumx)*(i-ikikonumx))+((j-ikikonumy)*(j-ikikonumy)));
                        
                    k++;
                }
            }
        }
        
                
        double b_temp = b_maliyet[0];
        for (int i = 0; i < b_maliyet.length; i++) {
            if(b_maliyet[i]>b_temp){
                b_temp=b_maliyet[i];
            }  
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               if(matris1[i][j]==1 && (matris2[i][j])/Math.sqrt(((i-ikikonumx)*(i-ikikonumx))+((j-ikikonumy)*(j-ikikonumy))) == b_temp){
                  
                   
                   ikihedefx=i;
                   ikihedefy=j;
                   ikipuan=ikipuan-10;
                   ikiharcanan=ikiharcanan+10;
               }
                
            }
            
        }
        
       
    }
    
    public void ucuncuhedefbul(int x,int y,int goid_field,int sect_gold,int uckonumx,int uckonumy){
        double c_mesafe[]=new double[secret_gold];
        
        int k = 0;
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==2){
                    c_mesafe[k]=(Math.sqrt(((i-uckonumx)*(i-uckonumx))+((j-uckonumy)*(j-uckonumy))));
                   
                    k++;
                }  
            } 
        }
        if(c_mesafe.length>0){
           double c_gizlitemp = c_mesafe[0];
        for (int i = 0; i < c_mesafe.length; i++) {
            if(c_mesafe[i]<c_gizlitemp){
                c_gizlitemp=c_mesafe[i];   
            }  
        }
        
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==2 && (Math.sqrt(((i-uckonumx)*(i-uckonumx))+((j-uckonumy)*(j-uckonumy))))==c_gizlitemp ){
                   if(bayrak>0){
                       matris[i][j]=1;
                    secret_gold=secret_gold-1;
                    gold_field=gold_field+1;  
                   }
                                       
                }  
            } 
        } 
        }
        
        double c_maliyet[] = new double [gold_field+secret_gold];
       int m=0;
        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1){
                    c_maliyet[m]=(matris2[i][j])/(Math.sqrt(((i-uckonumx)*(i-uckonumx))+((j-uckonumy)*(j-uckonumy))));
                    m++;
                }  
            } 
        }
        double c_temp = c_maliyet[0];
        for (int i = 0; i < c_maliyet.length; i++) {
            if(c_maliyet[i]>c_temp){
                c_temp=c_maliyet[i];   
            }  
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               if(matris[i][j]==1 && (matris2[i][j])/(Math.sqrt(((i-uckonumx)*(i-uckonumx))+((j-uckonumy)*(j-uckonumy)))) == c_temp){
                   
                   uchedefx=i;
                   uchedefy=j;
                   ucpuan=ucpuan-15;
                   ucharcanan=ucharcanan+15;
               }
                
            }
            
        }
        
        
    }
    
    public void dortuncuhedefbul(int x,int y){
        
        double b_maliyet[] = new double [gold_field];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                    if(matris[i][j]==1){
                    b_maliyet[k] = (matris2[i][j])/Math.sqrt(((i-dortkonumx)*(i-dortkonumx))+((j-dortkonumy)*(j-dortkonumy)));
                        
                    k++;
                }
            }
        }
        int ttm=0;
        double b_temp = b_maliyet[0];
        for (int i = 0; i < b_maliyet.length; i++) {
            if(b_maliyet[i]>b_temp){
                b_temp=b_maliyet[i];
                ttm=i;
            }  
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               if(matris[i][j]==1 && (matris2[i][j])/Math.sqrt(((i-dortkonumx)*(i-dortkonumx))+((j-dortkonumy)*(j-dortkonumy))) == b_temp){
                  
                   dorthedefx=i;
                   dorthedefy=j;
                   if(dorthedefx==birhedefx && dorthedefy==birhedefy && Math.sqrt(((birkonumx-birhedefx)*(birkonumx-birhedefx))+((birkonumy-birhedefy)*(birkonumy-birhedefy))) < Math.sqrt(((dortkonumx-dorthedefx)*(dortkonumx-dorthedefx))+((dortkonumy-dorthedefy)*(dorthedefy-dortkonumy))) ){
                       b_maliyet[ttm]=0;
                       b_temp = b_maliyet[0];
                      for (int l = 0; l < b_maliyet.length; l++) {
                         if(b_maliyet[l]>b_temp){
                          b_temp=b_maliyet[l];     
                         }  
                         }
                   }
                      if(dorthedefx==ikihedefx && dorthedefy==ikihedefy && Math.sqrt(((ikikonumx-birhedefx)*(ikikonumx-birhedefx))+((ikikonumy-birhedefy)*(ikikonumy-birhedefy))) < Math.sqrt(((dortkonumx-dorthedefx)*(dortkonumx-dorthedefx))+((dortkonumy-dorthedefy)*(dorthedefy-dortkonumy))) ){
                       b_maliyet[ttm]=0;
                       b_temp = b_maliyet[0];
                      for (int l = 0; l < b_maliyet.length; l++) {
                         if(b_maliyet[l]>b_temp){
                          b_temp=b_maliyet[l];     
                         }  
                         }
                      
                      }
                      
                      if(dorthedefx==uchedefx && dorthedefy==uchedefy && Math.sqrt(((uckonumx-birhedefx)*(uckonumx-birhedefx))+((uckonumy-birhedefy)*(uckonumy-birhedefy))) < Math.sqrt(((dortkonumx-dorthedefx)*(dortkonumx-dorthedefx))+((dortkonumy-dorthedefy)*(dorthedefy-dortkonumy))) ){
                       b_maliyet[ttm]=0;
                       b_temp = b_maliyet[0];
                      for (int l = 0; l < b_maliyet.length; l++) {
                         if(b_maliyet[l]>b_temp){
                          b_temp=b_maliyet[l]; 
                          
                          
                         }  
                         }
                      
                   
                   }
                   
                  
                   
               }
                
            }
            
        }
        
        b_temp = b_maliyet[0];
        for (int i = 0; i < b_maliyet.length; i++) {
            if(b_maliyet[i]>b_temp){
                b_temp=b_maliyet[i];
                
            }  
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
               if(matris[i][j]==1 && (matris2[i][j])/Math.sqrt(((i-dortkonumx)*(i-dortkonumx))+((j-dortkonumy)*(j-dortkonumy))) == b_temp){
                  
                   
                   dorthedefx=i;
                   dorthedefy=j;
                   dortpuan=dortpuan-20;
                   dortharcanan=dortharcanan+20;
               }
                
            }
            
        }
        
        
        
    }
    
    public void birrun(int hedefx,int hedefy ){
            
           
                 /////////////////////////////////////////////////////////////////////////////////////////////////////////// 
                 matris[birkonumx][birkonumy]=0;
                 int gold;
                 int p=0;
                 while(p!=adim && (birkonumx!=hedefx || birkonumy != hedefy)){
                        
                     while(p!=adim && birkonumx!=hedefx){
                          if(birkonumx < hedefx){
                              birkonumx++;
                              p++;
                              
                           }
                          else {
                              birkonumx--;
                              p++;
                             
                           } 
                          
                          if(matris[birkonumx][birkonumy]==2){
                              matris[birkonumx][birkonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                     while(p!=adim && birkonumy!=hedefy){
                         if(birkonumy < hedefy){
                              birkonumy++;
                              p++;
                           }
                          else{
                              birkonumy--;
                              p++;
                           }    
                         
                          if(matris[birkonumx][birkonumy]==2){
                              matris[birkonumx][birkonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                 }
                
                      matris[birkonumx][birkonumy]=5;
                      biradimsayisi=biradimsayisi+p;
                      birpuan=birpuan-5;
                      birharcanan=birharcanan+5;
                 if(birkonumx==hedefx && birkonumy==hedefy){
                     gold=matris2[hedefx][hedefy];
                     birpuan=birpuan + gold;
                     birtoplanan=birtoplanan+gold;
                     
                     matris2[hedefx][hedefy]=0 ;
                     
                 }
                 
             
             
        gb.renk(x, y, matris, matris2);
        
    }
    
    public void ikirun(int hedefx,int hedefy ){
            
       
                   
                 /////////////////////////////////////////////////////////////////////////////////////////////////////////// 
                 matris[ikikonumx][ikikonumy]=0;
                 int gold;
                 int p=0;
                 while(p!=adim && (ikikonumx!=hedefx || ikikonumy != hedefy)){
                        
                     while(p!=adim && ikikonumx!=hedefx){
                          if(ikikonumx < hedefx){
                             ikikonumx++;
                              p++;
                              
                           }
                          else {
                              ikikonumx--;
                              p++;
                             
                           }  
                          
                           if(matris[ikikonumx][ikikonumy]==2){
                              matris[ikikonumx][ikikonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                     while(p!=adim && ikikonumy!=hedefy){
                         if(ikikonumy < hedefy){
                              ikikonumy++;
                              p++;
                           }
                          else{
                              ikikonumy--;
                              p++;
                           }
                         
                          if(matris[ikikonumx][ikikonumy]==2){
                              matris[ikikonumx][ikikonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                 }
                      ikiadimsayisi=ikiadimsayisi+p;
                      matris[ikikonumx][ikikonumy]=7;
                      ikipuan=ikipuan-5;
                      ikiharcanan=ikiharcanan+5;
                 if(ikikonumx==hedefx && ikikonumy==hedefy){
                     gold=matris2[hedefx][hedefy];
                     ikipuan=ikipuan + gold;
                     ikitoplanan=ikitoplanan+gold;
                     matris2[hedefx][hedefy]=0 ;
                     
                 }
                 
                 gb.renk(x, y, matris, matris2);
                 
             
        
         
    }
    
    public void ucrun(int hedefx,int hedefy){
        
                 matris[uckonumx][uckonumy]=0;
                 int gold;
                 int p=0;
                 while(p!=adim && (uckonumx!=hedefx || uckonumy != hedefy)){
                        
                     while(p!=adim && uckonumx!=hedefx){
                          if(uckonumx < hedefx){
                             uckonumx++;
                              p++;
                              
                           }
                          else {
                              uckonumx--;
                              p++;
                             
                           }  
                          
                           if(matris[uckonumx][uckonumy]==2){
                              matris[uckonumx][uckonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                     while(p!=adim && uckonumy!=hedefy){
                         if(uckonumy < hedefy){
                              uckonumy++;
                              p++;
                           }
                          else{
                              uckonumy--;
                              p++;
                           }
                         
                          if(matris[uckonumx][uckonumy]==2){
                              matris[uckonumx][uckonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                 }
                      ucadimsayisi=ucadimsayisi+p;
                      matris[uckonumx][uckonumy]=6;
                      ucpuan=ucpuan-5;
                                            ucharcanan=ucharcanan+5;

                 if(uckonumx==hedefx && uckonumy==hedefy){
                     gold=matris2[hedefx][hedefy];
                     ucpuan=ucpuan + gold;
                     uctoplanan=uctoplanan+gold;
                     
                     matris2[hedefx][hedefy]=0 ;
                     
                 }
                 
                 gb.renk(x, y, matris, matris2);
                 
        
    }
    
    public void dortrun(int hedefx,int hedefy){
        
         matris[dortkonumx][dortkonumy]=0;
                 int gold;
                 int p=0;
                 while(p!=adim && (dortkonumx!=hedefx || dortkonumy != hedefy)){
                        
                     while(p!=adim && dortkonumx!=hedefx){
                          if(dortkonumx < hedefx){
                             dortkonumx++;
                              p++;
                              
                           }
                          else {
                              dortkonumx--;
                              p++;
                             
                           }  
                          
                           if(matris[dortkonumx][dortkonumy]==2){
                              matris[dortkonumx][dortkonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                     while(p!=adim && dortkonumy!=hedefy){
                         if(dortkonumy < hedefy){
                              dortkonumy++;
                              p++;
                           }
                          else{
                              dortkonumy--;
                              p++;
                           }
                         
                          if(matris[dortkonumx][dortkonumy]==2){
                              matris[dortkonumx][dortkonumy]=1;
                              secret_gold=secret_gold-1;
                               gold_field=gold_field+1; 
                          }
                         
                     }
                     
                 }
                      dortadimsayisi=dortadimsayisi+p;
                      matris[dortkonumx][dortkonumy]=8;
                      dortpuan=dortpuan-5;
                                            dortharcanan=dortharcanan+5;

                 if(dortkonumx==hedefx && dortkonumy==hedefy){
                     gold=matris2[hedefx][hedefy];
                     dortpuan=dortpuan + gold;
                     dorttoplanan=dorttoplanan+gold;
                     
                     matris2[hedefx][hedefy]=0 ;
                     
                 }
                 
                 gb.renk(x, y, matris, matris2);
                 
        
        
    }
    
    private void textXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textXActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textXActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        // TODO add your handling code here:
        
        
        int v=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1){
                    v++;
                }
                
            }
        }
        if(v!=0){
            
            if(ikipuan>0){
                
                
                 
                 ikirun(ikihedefx, ikihedefy);
                 ikincihedefbul(matris, matris2, x, y, gold_field, ikikonumx, ikikonumy);
                  try {
                    BufferedWriter bbw = new BufferedWriter(bw);
                    
                    bbw.newLine();
                    bbw.newLine();
                    bw.write(ikikez+".Hamle  "+"Puan:"+ikipuan+"  Konum Kordinatları "+ikikonumx+"-"+ikikonumy  +"  Hedef Kordinatları"+ikihedefx+"-"+ikihedefy+"  Toplam adım sayısı:"+ikiadimsayisi+"  Harcanan Altın Miktarı:"+ikiharcanan+"  Toplanan Altın Miktarı"+ikitoplanan);
                    bbw.flush();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                 but2.setText("B Oyna (Puan:"+ikipuan);
                 ikikez++;
                 gb.renk(x, y, matris, matris2);
                
            }else{
                but2.setText("Elendi (Altın Bitti) ");
                but2.setBackground(new java.awt.Color(250, 51, 51));
               butb.setText("Adım:"+ikiadimsayisi+"  Harcanan:"+ikiharcanan+"  Kasa:"+ikipuan+"  Toplanan:"+ikitoplanan);
               butb.setVisible(true);
               
                 
               
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        
        }
        else{
             butbitti.setVisible(true);
             buta.setText("Adım:"+biradimsayisi+"  Harcanan:"+birharcanan+"  Kasa:"+birpuan+"  Toplanan:"+birtoplanan);
             buta.setVisible(true);
             butb.setText("Adım:"+ikiadimsayisi+"  Harcanan:"+ikiharcanan+"  Kasa:"+ikipuan+"  Toplanan:"+ikitoplanan);
             butb.setVisible(true);
             butc.setText("Adım:"+ucadimsayisi+"  Harcanan:"+ucharcanan+"  Kasa:"+ucpuan+"  Toplanan:"+uctoplanan);
             butc.setVisible(true);
              try {
                aw.close();
                bw.close();
                cw.close();
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but2ActionPerformed
 
    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        // TODO add your handling code here:
        
        int v=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1){
                    v++;
                }
                
            }
        }
        if(v!=0){
            
            if(birpuan>0){
                
                
                birrun(birhedefx,birhedefy);
                birincihedefbul( matris,x,y,gold_field,birkonumx,birkonumy);
                try {
                    BufferedWriter abw = new BufferedWriter(aw);
                    
                    abw.newLine();
                    abw.newLine();
                    aw.write(birkez+".Hamle "+"Puan:"+birpuan+"  Konum Kordinatları "+birkonumx+"-"+birkonumy  +"  Hedef Kordinatları"+birhedefx+"-"+birhedefy+"  Toplam adım sayısı:"+biradimsayisi+"  Harcanan Altın Miktarı:"+birharcanan+"  Toplanan Altın Miktarı"+birtoplanan);
                    abw.flush();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                but1.setText("A Oyna (Puan:"+birpuan);
                gb.renk(x, y, matris, matris2);
                birkez++;
            }else{
                but1.setText("Elendi (Altın Bitti) ");
                but1.setBackground(new java.awt.Color(250, 51, 51));
                 buta.setText("Adım:"+biradimsayisi+"  Harcanan:"+birharcanan+"  Kasa:"+birpuan+"  Toplanan:"+birtoplanan);
                 buta.setVisible(true);
                 
                
                 
                try {
                    aw.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
        
        
        }
        else{
             butbitti.setVisible(true);
             buta.setText("Adım:"+biradimsayisi+"  Harcanan:"+birharcanan+"  Kasa:"+birpuan+"  Toplanan:"+birtoplanan);
             buta.setVisible(true);
             butb.setText("Adım:"+ikiadimsayisi+"  Harcanan:"+ikiharcanan+"  Kasa:"+ikipuan+"  Toplanan:"+ikitoplanan);
             butb.setVisible(true);
             butc.setText("Adım:"+ucadimsayisi+"  Harcanan:"+ucharcanan+"  Kasa:"+ucpuan+"  Toplanan:"+uctoplanan);
             butc.setVisible(true);
             
              try {
                aw.close();
                bw.close();
                cw.close();
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_but1ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        // TODO add your handling code here:
        bayrak++;
        int v=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1){
                    v++;
                }
                
            }
        }
        if(v!=0){
            
            if(ucpuan>0){
                
                
                ucrun(uchedefx,uchedefy);
                ucuncuhedefbul(x, y, gold_field, secret_gold, uckonumx, uckonumy);
                but3.setText("C Oyna (Puan:"+ucpuan);
                
                try {
                    BufferedWriter cbw = new BufferedWriter(cw);
                    
                    cbw.newLine();
                    cbw.newLine();
                    cw.write(uckez+".Hamle "+"  Puan:"+ucpuan+"  Konum Kordinatları "+uckonumx+"-"+uckonumy  +"  Hedef Kordinatları"+uchedefx+"-"+uchedefy+"  Toplam adım sayısı:"+ucadimsayisi+"  Harcanan Altın Miktarı:"+ucharcanan+"  Toplanan Altın Miktarı"+uctoplanan);
                    cbw.flush();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                uckez++;
               gb.renk(x, y, matris, matris2);
            }else{
                but3.setText("Elendi (Altın Bitti) ");
                but3.setBackground(new java.awt.Color(250, 51, 51));
                butc.setText("Adım:"+ucadimsayisi+"  Harcanan:"+ucharcanan+"  Kasa:"+ucpuan+"  Toplanan:"+uctoplanan);
                butc.setVisible(true);
                
                
                try {
                    cw.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
        
        
        }
        else{
             butbitti.setVisible(true);
             buta.setText("Adım:"+biradimsayisi+"  Harcanan:"+birharcanan+"  Kasa:"+birpuan+"  Toplanan:"+birtoplanan);
             buta.setVisible(true);
             butb.setText("Adım:"+ikiadimsayisi+"  Harcanan:"+ikiharcanan+"  Kasa:"+ikipuan+"  Toplanan:"+ikitoplanan);
             butb.setVisible(true);
             butc.setText("Adım:"+ucadimsayisi+"  Harcanan:"+ucharcanan+"  Kasa:"+ucpuan+"  Toplanan:"+uctoplanan);
             butc.setVisible(true);
             
            try {
                aw.close();
                bw.close();
                cw.close();
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        // TODO add your handling code here:
        
        
        int v=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matris[i][j]==1){
                    v++;
                }
                
            }
        }
        if(v!=0){
            
            if(dortpuan>0){
                
                
                 
                 dortrun(dorthedefx, dorthedefy);
                 dortuncuhedefbul( x, y);
                  try {
                    BufferedWriter dbw = new BufferedWriter(dw);
                    
                    dbw.newLine();
                    dbw.newLine();
                    dw.write(dortkez+".Hamle  "+"Puan:"+dortpuan+"  Konum Kordinatları "+dortkonumx+"-"+dortkonumy  +"  Hedef Kordinatları"+dorthedefx+"-"+dorthedefy+"  Toplam adım sayısı:"+dortadimsayisi+"  Harcanan Altın Miktarı:"+dortharcanan+"  Toplanan Altın Miktarı"+dorttoplanan);
                    dbw.flush();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                 but4.setText("D Oyna (Puan:"+dortpuan);
                 dortkez++;
                 gb.renk(x, y, matris, matris2);
                
            }else{
                but4.setText("Elendi (Altın Bitti) ");
                but4.setBackground(new java.awt.Color(250, 51, 51));
               butd.setText("Adım:"+dortadimsayisi+"  Harcanan:"+dortharcanan+"  Kasa:"+dortpuan+"  Toplanan:"+dorttoplanan);
               butd.setVisible(true);
               
                 
               
                try {
                    dw.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        
        }
        else{
             butbitti.setVisible(true);
             buta.setText("Adım:"+biradimsayisi+"  Harcanan:"+birharcanan+"  Kasa:"+birpuan+"  Toplanan:"+birtoplanan);
             buta.setVisible(true);
             butb.setText("Adım:"+ikiadimsayisi+"  Harcanan:"+ikiharcanan+"  Kasa:"+ikipuan+"  Toplanan:"+ikitoplanan);
             butb.setVisible(true);
             butc.setText("Adım:"+ucadimsayisi+"  Harcanan:"+ucharcanan+"  Kasa:"+ucpuan+"  Toplanan:"+uctoplanan);
             butc.setVisible(true);
              try {
                aw.close();
                bw.close();
                cw.close();
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_but4ActionPerformed

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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StartPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton buta;
    private javax.swing.JButton butb;
    private javax.swing.JButton butbitti;
    private javax.swing.JButton butc;
    private javax.swing.JButton butd;
    private javax.swing.JButton buttonstart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textX;
    private javax.swing.JTextField textY;
    private javax.swing.JTextField textadim;
    private javax.swing.JTextField textpuan;
    // End of variables declaration//GEN-END:variables
}
