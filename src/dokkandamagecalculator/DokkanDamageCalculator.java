
package dokkandamagecalculator;
//Homework 15
//Steven Eivaz and Alec Peterson
//Code partially taken from some inclass examples, Textpad/Linedraw etc
//The following is a calculator to determine an "Attack Stat" for certain characters
//Various multipliers and modifiers exist in the game, and this tool applies them in the correct order




import java.awt.BorderLayout;
import java.awt.Container;  // All of the imports for this program to work
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PointIO {  //Taken from the class example, but unfortunately will not work
	public boolean writePoints(String  points, File f) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter(f)));
			pw.println();
			pw.close();
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	public void readPoints(File f) {
		String result;
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				result = sc.nextLine();
				
				
			}
			sc.close();
			
		} catch (Exception ex) {
			
		}
	}
}

class TxtPd extends JFrame{  // The main function that allows the program to work.
    public String str;
    public String strs;
    public String strss;
    public String sta = "";
    public int Damage;
    int damage = 1;
    public  int getText() {
    return damage;
 }
    public void setText(int damage){
        this.damage = damage;
 }

    public void TextPad(){  
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Dokkan Battle Damage Calculator");
    setBounds(300,300,300,300);
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    JTextField text = new JTextField(15);
    text.setPreferredSize( new Dimension( 200, 50 ) );
    c.add(text, BorderLayout.NORTH);
    JPanel f=new JPanel();  
    JPanel a = new JPanel();
    JButton et = new JButton("ET"); //Action listener for ENTER
    et.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, str );
					}
				}
                        );
    JButton bc = new JButton("Clear");  // Action listener for Clear
    bc.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						e.getSource();
                                                str = " ";
                                                text.getText();
                                                text.setText( str );
                                                text.repaint();
					}
				}
                        );
    
    JButton N1 = new JButton("1");  //Action Listener for 1
    N1.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						e.getSource();
                                                String st = Integer.toString(1);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N2 = new JButton("2");  //Action Listener for 2
    N2.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(2);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N3 = new JButton("3");  //Action Listener for 3
    N3.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(3);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N4 = new JButton("4"); //Action Listener for 4
    N4.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(4);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N5 = new JButton("5");  //Action Listener for 5
    N5.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(5);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N6 = new JButton("6");  //Action Listener for 6
    N6.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(6);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N7 = new JButton("7");  //Action Listener for 7
    N7.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(7);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N8 = new JButton("8");  //Action Listener for 8
    N8.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(8);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton N9 = new JButton("9");  //Action Listener for 9
    N9.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(9);
                                                sta = sta + st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    JButton NO = new JButton("0");  //Action Listener for 0
    NO.addActionListener(
				new ActionListener() {
                                        @Override
					public void actionPerformed(ActionEvent e) {
						String st = Integer.toString(0);
                                                sta = sta +st;
                                                text.getText();
                                                text.setText( sta );
                                                text.repaint();
					}
				}
                        );
    f.setLayout(new GridLayout(3,4));  
    f.setSize(300,300);  
    f.setVisible(true);  
    f.add(N1);
    f.add(N2);
    f.add(N3);
    f.add(N4);
    f.add(N5);
    f.add(N6);
    f.add(N7);
    f.add(N8);
    f.add(N9);
    f.add(NO);
    f.add(et);
    f.add(bc);
    c.add(f, BorderLayout.CENTER);
    JMenuBar bar = new JMenuBar();
		JMenu mnuFile = new JMenu("Exit Menu");
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuFile.add(miExit);
		bar.add(mnuFile);
		JMenu mnuLead = new JMenu("Leader Skill");
		JMenuItem mi120 = new JMenuItem("120");
                JMenuItem mi130 = new JMenuItem("130");
                JMenuItem mi150 = new JMenuItem("150");
                JMenuItem mi170 = new JMenuItem("170");
                mi120.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
                                int a = Integer.parseInt(sta);
                                damage = a * 120;
                                String st = Integer.toString( damage);
                                str = st;
                                text.getText();
                                text.setText( str );
                                text.repaint();

			}
		});
		mnuLead.add(mi120);
                mi130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
                                int a = Integer.parseInt(sta);
                                damage = a * 130;
                                String st = Integer.toString( damage);
                                str = st;
                                text.getText();
                                text.setText( str );
                                text.repaint();

			}
		});
		mnuLead.add(mi130);
                mi150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
                                int a = Integer.parseInt(sta);
                                damage = a * 150;
                                String st = Integer.toString( damage);
                                str = st;
                                text.getText();
                                text.setText( str );
                                text.repaint();
				
			}
		});
		mnuLead.add(mi150);
                mi170.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
                                int a = Integer.parseInt(sta);
                                damage = a * 170;
                                String st = Integer.toString( damage);
                                str = st;
                                text.getText();
                                text.setText( str );
                                text.repaint();
				
			}
		});
		mnuLead.add(mi150);
		bar.add(mnuLead);
		JMenu mnuPassive = new JMenu("Passive");
		mnuLead.add(mi170);
                JMenu mnuMlt = new JMenu("SA Multiplier");
                bar.add(mnuMlt);
                bar.add(mnuPassive);
                JMenuItem miP90 = new JMenuItem("90");
                JMenuItem miP120 = new JMenuItem("120");
                JMenuItem miP130 = new JMenuItem("130");
                JMenuItem miP150 = new JMenuItem("150");
		JMenuItem mi430 = new JMenuItem("Supreme");
		mi430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(str);
                                damage = a * 430;
                                String st = Integer.toString( damage);
                                strs = st;
                                text.getText();
                                text.setText( strs );
                                text.repaint();
			}
		});
		mnuMlt.add(mi430);
		JMenuItem mi505 = new JMenuItem("Immense");
		mi505.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(str);
                                damage = a * 505;
                                String st = Integer.toString( damage);
                                strs = st;
                                text.getText();
                                text.setText( strs );
                                text.repaint();
			}
		});
		mnuMlt.add(mi430);
		mnuMlt.add(mi505);
                JMenuItem mi425 = new JMenuItem("Colossal");
		mi425.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(str);
                                damage = a * 425;
                                String st = Integer.toString( damage);
                                strs = st;
                                text.getText();
                                text.setText( strs );
                                text.repaint();
			}
		});
		mnuMlt.add(mi425);
                JMenuItem mi570 = new JMenuItem("Mega-Colossal");
		mi570.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(str);
                                damage = a * 570;
                                String st = Integer.toString( damage);
                                strs = st;
                                text.getText();
                                text.setText( strs );
                                text.repaint();
			}
		});
		mnuMlt.add(mi570);
		miP90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int a = Integer.parseInt(strs);
                                damage = a * 430;
                                String st = Integer.toString( damage);
                                strss = st;
                                text.getText();
                                text.setText( strss );
                                text.repaint();
			}
		});
                miP120.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(strs);
                                damage = a * 430;
                                String st = Integer.toString( damage);
                                strss = st;
                                text.getText();
                                text.setText( strss );
                                text.repaint();
			}
		});
                miP130.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(strs);
                                damage = a * 430;
                                String st = Integer.toString( damage);
                                strss = st;
                                text.getText();
                                text.setText( strss );
                                text.repaint();
			}
		});
                miP150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(strs);
                                damage = a * 430;
                                String st = Integer.toString( damage);
                                strss = st;
                                text.getText();
                                text.setText( strss );
                                text.repaint();
			}
		});
                mnuPassive.add(miP90);
                mnuPassive.add(miP120);
                mnuPassive.add(miP130);
                mnuPassive.add(miP150);
                
		setJMenuBar(bar);
}
    
    public TxtPd(){
        TextPad();
    }
}

    public class DokkanDamageCalculator{
            public static void main(String[] args) {  // The main function that calls the textpad function.
                        TxtPd bt = new TxtPd();
                        bt.setVisible(true);  
}  
}
    