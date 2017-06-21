

package UnitConverter;

/**
 *
 * @author s.saiteja
 */
public class UnitConverter extends javax.swing.JFrame 
{
    
    public UnitConverter()
    {
        
        initComponents();
        list1.add("meters");
            list1.add("millimetes");
            list1.add("kilometers");
            list1.add("centimeters");
            list1.add("feets");
            list1.add("inches");
            list2.add("meters");
            list2.add("millimetes");
            list2.add("kilometers");
            list2.add("centimeters");
            list2.add("feets");
            list2.add("inches");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        list1 = new java.awt.List();
        list2 = new java.awt.List();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("project");
        setBackground(new java.awt.Color(153, 102, 0));
        setPreferredSize(new java.awt.Dimension(535, 310));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("SIMPLE UNIT CONVERTER");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("select the quantity u want to convert");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "length", "time", "temperature", "mass", "speed" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("enter value to convert:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText(" to");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("converted value is:");

        jTextField2.setEditable(false);

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        list2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setText("length");

        jButton1.setText("convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 74, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        jTextField2.setText("");
         jTextField1.setText("");
        
   if( jComboBox1.getSelectedItem()=="length")
        {
            list1.removeAll();
            list2.removeAll();
            jTextField3.setText("length");
            list1.add("meters");
            list1.add("millimetes");
            list1.add("kilometers");
            list1.add("centimeters");
            list1.add("feets");
            list1.add("inches");
            list2.add("meters");
            list2.add("millimetes");
            list2.add("kilometers");
            list2.add("centimeters");
            list2.add("feets");
            list2.add("inches");
        }
   if( jComboBox1.getSelectedItem()=="time")
   {
       list1.removeAll();
            list2.removeAll();
       jTextField3.setText("time");
            list1.add("seconds");
            list1.add("minutes");
            list1.add("hours");
            list1.add("milliseconds");
            list2.add("seconds");
            list2.add("minutes");
            list2.add("hours");
            list2.add("milliseconds");
            
       
   }
    if( jComboBox1.getSelectedItem()=="temperature")
    {
       list1.removeAll();
            list2.removeAll();
        jTextField3.setText("temperature");

        list1.add("centigrade");
        list1.add("farenheat");
        list1.add("kalvin");
        
        list2.add("centigrade");
        list2.add("farenheat");
        list2.add("kalvin");
    }
    if( jComboBox1.getSelectedItem()=="speed")
    {
        list1.removeAll();
            list2.removeAll();
        jTextField3.setText("speed");
        
        list1.add("meters/sec");
        list1.add("kilometers/houe");
        
        list1.add("miles/hour");
        
        list2.add("meters/sec");
        list2.add("kilometers/houe");
       
        list2.add("miles/hour");
    }
    if( jComboBox1.getSelectedItem()=="mass")
    {
        list1.removeAll();
            list2.removeAll();
        jTextField3.setText("mass");
        list1.add("grams");
        list1.add("kilograms");
        list1.add("milligrams");
        list1.add("tons");
        list1.add("pounds");
        list2.add("grams");
        list2.add("kilograms");
        list2.add("milligrams");
        list2.add("tons");
        list2.add("pounds");
    }
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void list2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_list2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTextField1.getText().isEmpty())
        {
            jTextField2.setText("no value entered");
        }
        String s=jTextField1.getText();
        
          for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='b'|| s.charAt(i) == 'c'|| s.charAt(i) == 'd'|| s.charAt(i) == 'e'|| s.charAt(i) == 'f'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i'|| s.charAt(i) == 'j'|| s.charAt(i) == 'k'|| s.charAt(i) == 'l'|| s.charAt(i) == 'm'||s.charAt(i)=='n'||s.charAt(i) == 'o'|| s.charAt(i) == 'p'|| s.charAt(i) == 'q'||s.charAt(i)=='r'||s.charAt(i)=='s'||s.charAt(i)=='t'|| s.charAt(i) == 'u'|| s.charAt(i) == 'v'|| s.charAt(i) == 'w'|| s.charAt(i) == 'x'||s.charAt(i)=='y'||s.charAt(i)=='z')
            {
                
                jTextField2.setText("plz enter number only");
                jTextField4.setText(" :-)");
            }
            
        }
        
        String c=jTextField1.getText();
        double d=Double.parseDouble(c);
        int a=list2.getSelectedIndex();
        int b=list1.getSelectedIndex();
        
        
        
        
        if( jComboBox1.getSelectedItem()=="length")
        {
            switch (a)
           {
                case 0:
                    if(b==0)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("m");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=d*1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mm");
                         break;
                    }
                    if(b==2)
                    {
                        d=d/1000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                         break;
                    }
                    if(b==3)
                    {
                        d=d*10;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                         break;
                    }
                    if(b==4)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*3.280839895;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("feet");
                         break;
                    }
                    if(b==5)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*39.37007874;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                         break;
                    }
                    
                case 1:
                    if(b==1)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("m");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d/1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mm");
                         break;
                    }
                    if(b==2)
                    {
                        d=d/1000000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                         break;
                    }
                    if(b==3)
                    {
                        d=d/10;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                         break;
                    }
                    if(b==4)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*0.003280839895;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("feet");
                         break;
                    }
                    if(b==5)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*0.03937007874;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                         break;
                    }
                case 2:
                    if(b==2)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m");
                         break;
                    }
                    if(b==1)
                    {
                        d=d*1000000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("mm");
                         break;
                    }
                    if(b==3)
                    {
                        d=d*100000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                         break;
                    }
                    if(b==4)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*3280.839895;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("feet");
                         break;
                    }
                    if(b==5)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*39370.07874 ;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                         break;
                    }
                case 3:
                    if(b==3)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d/100;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m");
                         break;
                    }
                    if(b==1)
                    {
                        d=d/10;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("mm");
                         break;
                    }
                    if(b==2)
                    {
                        d=d/100000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                         break;
                    }
                    if(b==4)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*0.03280839895;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("feet");
                         break;
                    }
                    if(b==5)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*0.3937007874 ;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                         break;
                    }
               case 4:
                    if(b==4)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("fts");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*0.3048;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m");
                         break;
                    }
                    if(b==1)
                    {
                        d=d*304.8;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("mm");
                         break;
                    }
                    if(b==2)
                    {
                        d=d/100000;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                         break;
                    }
                    if(b==3)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*30.48;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                         break;
                    }
                    if(b==5)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*12 ;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                         break;
                    }
                case 5:
                    if(b==5)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("inch");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*0.0254;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m");
                         break;
                    }
                    if(b==1)
                    {
                        d=d*25.4;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("mm");
                         break;
                    }
                    if(b==2)
                    {
                        d=d*0.0000254;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("km");
                         break;
                    }
                    if(b==3)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*2.54;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("cm");
                         break;
                    }
                    if(b==4)
                    {
                        //1 in = 2.54 cm=0.254m
                        d=d*0.083333333333 ;
                        c=Double.toString(d);
                        jTextField2.setText(c);
                        jTextField4.setText("fts");
                         break;
                    }
                                   
                    
            }    
                    
                
        }
      if(jComboBox1.getSelectedItem()=="time")
        {
            switch (a)
           {
                case 0:
                    if(b==0)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("sec");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=d/60;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("min");
                         break;
                    }
                    if(b==2)
                    {
                         d=d/3600;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("hrs");
                         break;
                    }
                    if(b==3)
                    {
                         d=d*100;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("msec");
                         break;
                    }
               case 1:
                    if(b==1)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("min");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*60;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("sec");
                         break;
                    }
                    if(b==2)
                    {
                         d=d/60;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("hrs");
                         break;
                    }
                    if(b==3)
                    {
                         d=d*6000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("msec");
                         break;
                    }
               case 2:
                    if(b==2)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("hrs");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*3600;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("sec");
                         break;
                    }
                    if(b==1)
                    {
                         d=d*60;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("min");
                         break;
                    }
                    if(b==3)
                    {
                         d=d*360000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("msec");
                         break;
                    }
               case 3:
                    if(b==3)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("msec");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d/100;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("sec");
                         break;
                    }
                    if(b==1)
                    {
                         d=d/6000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("min");
                         break;
                    }
                    if(b==2)
                    {
                         d=d/360000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("hrs");
                         break;
                    }
            }
        }
      
     if(jComboBox1.getSelectedItem()=="temperature")
        {
            switch (a)
           {
                case 0:
                    if(b==0)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("`C");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=(d*1.8)+32;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("`F");
                         break;
                    }
                    if(b==2)
                    {
                         d=d+273.15;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("K");
                         break;
                    }
                 case 1:
                    if(b==1)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("`F");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=(d-32)/1.8;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("`C");
                         break;
                    }
                    if(b==2)
                    {
                         d=((d-32)/1.8)-273.15;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("K");
                         break;
                    }
                case 2:
                    if(b==2)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("K");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d-273.15;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("`C");
                         break;
                    }
                    if(b==1)
                    {
                         d=((d-273.15)/1.8)+32;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("`F");
                         break;
                    }
            }
        }
        
      if(jComboBox1.getSelectedItem()=="speed")
        {
            switch (a)
           {
                case 0:
                    if(b==0)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("m/s");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=d*18/5;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("km/h");
                         break;
                    }
                    
                    if(b==2)
                    {
                         d=d*2.2369362920544;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mi/h");
                         break;
                    }
                case 1:
                    if(b==1)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("km/h");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*5/18;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m/s");
                         break;
                    }
                    
                    if(b==2)
                    {
                         d=d*0.621371192237334;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mi/h");
                         break;
                    }
                case 2:
                    if(b==2)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("mil/h");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=d*1.60934;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("k/h");
                         break;
                    }
                    
                    if(b==0)
                    {
                         d=d*0.44704;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("m/s");
                         break;
                    }
                   
            }
            
        }
            
      if(jComboBox1.getSelectedItem()=="mass")
        {
            switch (a)
           {
                case 0:
                    if(b==0)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("gms");
                        break;
                    }  
                    
                    if(b==1)
                    {
                         d=d/1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("kgs");
                         break;
                    }
                     if(b==2)
                    {
                         d=d*1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mgms");
                         break;
                    }
                      if(b==3)
                    {
                         d=d*0.00000110231;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("tons");
                         break;
                    }
                     if(b==4)
                    {
                         d=d*0.00220462;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("pds");
                         break;
                    }
                 case 1:
                    if(b==1)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("kgs");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("gms");
                         break;
                    }
                     if(b==2)
                    {
                         d=d*1000000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mgms");
                         break;
                    }
                      if(b==3)
                    {
                         d=d*0.00110231;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("tons");
                         break;
                    }
                     if(b==4)
                    {
                         d=d*2.20462;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("pds");
                         break;
                    }   
                 case 2:
                    if(b==2)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("mgs");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d/1000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("gms");
                         break;
                    }
                     if(b==1)
                    {
                         d=d/1000000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("kgms");
                         break;
                    }
                      if(b==3)
                    {
                         d=d*0.00000000110231;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("tons");
                         break;
                    }
                     if(b==4)
                    {
                         d=d*0.0000220462;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("pds");
                         break;
                    } 
                 case 3:
                      //1 kg=2.20462 pounds 1kg =0.00110231 tons
                    if(b==3)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("tons");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*907185.81887128;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("gms");
                         break;
                    }
                     if(b==1)
                    {
                         d=d*907.185818871;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("kgms");
                         break;
                    }
                      if(b==2)
                    {
                         d=d*907185818.87128;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mgs");
                         break;
                    }
                     if(b==4)
                    {
                         d=d*2000;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("pds");
                         break;
                    } 
              case 4:
                      //1 kg=2.20462 pounds 1kg =0.00110231 tons
                    if(b==4)
                    {
                        jTextField2.setText(c);
                        jTextField4.setText("pds");
                        break;
                    }  
                    
                    if(b==0)
                    {
                         d=d*453.592909436;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("gms");
                         break;
                    }
                     if(b==1)
                    {
                         d=d*0.453592909236;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("kgms");
                         break;
                    }
                      if(b==2)
                    {
                         d=d*453592.909436;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("mgs");
                         break;
                    }
                     if(b==3)
                    {
                         d=d*0.0005;
                         c=Double.toString(d);
                         jTextField2.setText(c);
                         jTextField4.setText("tons");
                         break;
                    }   
            }
        }
        
            
    
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    /*private void jComboBox1itemStateChaged(java.awt.event.ItemEvent evt1)
    {
    }*/
    /**
     *
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
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitConverter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private java.awt.List list1;
    private java.awt.List list2;
    // End of variables declaration//GEN-END:variables
}
