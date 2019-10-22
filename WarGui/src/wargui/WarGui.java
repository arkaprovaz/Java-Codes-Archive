package wargui; 
import java.awt.event.*; 
import java.util.Arrays;
import javax.swing.*; 
class WarGui extends JFrame implements ActionListener { 
	 
	static JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,s1,s2,s3,s4,s5,s6,s7,s8,s9; 

	
	static JFrame f; 

	
	static JButton b; 

	
	static JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,r1,l23,l24; 

	
	WarGui() 
	{ 
	} 

	
	public static void main(String[] args) 
	{ 
            
		
		f = new JFrame("War Game"); 

		
                l1 = new JLabel("                                                                                          Soldier 1 ");
                l2 = new JLabel("                                                                                          Soldier 2 ");
                l3 = new JLabel("                                                                                          Soldier 3 ");
                l4 = new JLabel("                                                                                          Soldier 4 ");
                l5 = new JLabel("                                                                                          Soldier 5 ");
                l6 = new JLabel("                                                                                          Soldier 6 ");
                l7 = new JLabel("                                                                                          Soldier 7 ");
                l8 = new JLabel("                                                                                          Soldier 8 ");
                l9 = new JLabel("                                                                                          Soldier 9 ");
     
                l12= new JLabel("                                                                                          Terrorist 1 ");
                l13= new JLabel("                                                                                          Terrorist 2 ");
                l14= new JLabel("                                                                                          Terrorist 3 ");
                l15= new JLabel("                                                                                          Terrorist 4 ");
                l16= new JLabel("                                                                                          Terrorist 5 ");
                l17= new JLabel("                                                                                          Terrorist 6 ");
                l18= new JLabel("                                                                                          Terrorist 7 ");
                l19= new JLabel("                                                                                          Terrorist 8 ");
                l20= new JLabel("                                                                                          Terrorist 9 ");
            
                l23= new JLabel("                                                                                          The Strengths of Soldiers");
                l24= new JLabel("                                                                                          The Strengths of Terrorists");
                r1=new JLabel("");
              
		
		b = new JButton("Submit"); 

		
		WarGui te = new WarGui(); 

		
		b.addActionListener(te); 

		
		t = new JTextField(5);
                t1 = new JTextField(5);
                t2 = new JTextField(5);
                t3 = new JTextField(5);
                t4 = new JTextField(5);
                t5 = new JTextField(5);
                t6 = new JTextField(5);
                t7 = new JTextField(5);
                t8 = new JTextField(5);
              
                s1 = new JTextField(5);
                s2 = new JTextField(5);
                s3 = new JTextField(5);
                s4 = new JTextField(5);
                s5 = new JTextField(5);
                s6 = new JTextField(5);
                s7 = new JTextField(5);
                s8 = new JTextField(5);
                s9 = new JTextField(5);
                

		
		JPanel p = new JPanel(); 
               

		p.add(l23);
                p.add(l1);
		p.add(t);
                p.add(l2);
                p.add(t1);
                p.add(l3);
                p.add(t2);
                p.add(l4);
                p.add(t3);
                p.add(l5);
                p.add(t4);
                p.add(l6);
                p.add(t5);
                p.add(l7);
                p.add(t6);
                p.add(l8);
                p.add(t7);
                p.add(l9);
                p.add(t8);
                
                p.add(l24);
                p.add(l12);
                p.add(s1);
                p.add(l13);
                p.add(s2);
                p.add(l14);
                p.add(s3);
                p.add(l15);
                p.add(s4);
                p.add(l16);
                p.add(s5);
                p.add(l17);
                p.add(s6);
                p.add(l18);
                p.add(s7);
                p.add(l19);
                p.add(s8);
                p.add(l20);
                p.add(s9);
               
		p.add(b); 
                p.add(r1);
                
                
               
		
		f.add(p); 

		
		f.setSize(500, 1500); 

		f.show(); 
	} 


	
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("Submit")) { 
                        int[] soldiers_strength = new int[9];
			int[] terrorist_strength = new int[9];
			
                        soldiers_strength[0]=Integer.valueOf(t.getText());
                        soldiers_strength[1]=Integer.valueOf(t1.getText());
                        soldiers_strength[2]=Integer.valueOf(t2.getText());
                        soldiers_strength[3]=Integer.valueOf(t3.getText());
                        soldiers_strength[4]=Integer.valueOf(t4.getText());
                        soldiers_strength[5]=Integer.valueOf(t5.getText());
                        soldiers_strength[6]=Integer.valueOf(t6.getText());
                        soldiers_strength[7]=Integer.valueOf(t7.getText());
                        soldiers_strength[8]=Integer.valueOf(t8.getText());
                        
                        terrorist_strength[0]=Integer.valueOf(s1.getText());
                        terrorist_strength[1]=Integer.valueOf(s2.getText());
                        terrorist_strength[2]=Integer.valueOf(s3.getText());
                        terrorist_strength[3]=Integer.valueOf(s4.getText());
                        terrorist_strength[4]=Integer.valueOf(s5.getText());
                        terrorist_strength[5]=Integer.valueOf(s6.getText());
                        terrorist_strength[6]=Integer.valueOf(s7.getText());
                        terrorist_strength[7]=Integer.valueOf(s8.getText());
                        terrorist_strength[8]=Integer.valueOf(s9.getText());
                       
			
                        
                        
                        Arrays.sort(soldiers_strength);
			Arrays.sort(terrorist_strength);
                        
                        boolean result = true;
			for (int i = 0; i < 9; i++) {
				if (soldiers_strength[i] > terrorist_strength[i]) {
					result = true;
				} else {
					result = false;
				}
			}
			if (result) {
				r1.setText("WIN");
			} else {
				r1.setText("LOSE");
			}
		} 
	} 
} 
