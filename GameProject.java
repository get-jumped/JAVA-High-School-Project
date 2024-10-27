//Aidan Yamada
//GameProject.java
//4.18.20
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
public class GameProject extends JFrame
{
	//Creates the title screen and runs what button is pressed
	public static void main(String [] args)
	{
		GameProject start = new GameProject();
		start.run();
	}
	public void run()
	{
		//creates the frame in which the Program runs
		JFrame frame = new JFrame("Game Project");
		frame.setSize(1420, 865);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel titleScreen = new GamePanel();
		titleScreen.addComponentToPane(frame.getContentPane());
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
class GamePanel extends JPanel
{
	//creates the Title screen and adds buttons to the frame and chooses
	//which card to show to the player
	JPanel cards;
	public void addComponentToPane(Container pane)
	{
		//Creates all the content to panels for the game and adds the buttons to them
		JPanel card1 = new JPanel();
		card1.setLayout(null);
		JButton play = new JButton("Play");
		play.setBackground(Color.GRAY);
		play.setForeground(Color.WHITE);
        play.setFocusPainted(false);
		Button1Handler b1handler = new Button1Handler();
		play.addActionListener(b1handler);
		play.setBounds(815, 200, 400, 100);
		card1.add(play);
		JButton instructions = new JButton("Instructions");
		instructions.setBackground(Color.GRAY);
		instructions.setForeground(Color.WHITE);
        instructions.setFocusPainted(false);
		Button2Handler b2handler = new Button2Handler();
		instructions.addActionListener(b2handler);
		instructions.setBounds(815, 350, 400, 100);
		card1.add(instructions);
		JButton quit = new JButton("Quit");
		quit.setBackground(Color.GRAY);
		quit.setForeground(Color.WHITE);
		quit.setFocusPainted(false);
		Button10Handler b10handler = new Button10Handler();
		quit.addActionListener(b10handler);
		quit.setBounds(815, 500, 400, 100);
		card1.add(quit);
		JLabel gameTitle = new JLabel();
		gameTitle.setIcon(new ImageIcon("imageedit_9_4318811108.png"));
		card1.add(gameTitle);
		gameTitle.setBounds(50, 250, 600, 300);
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("Game Background.png"));
		card1.add(background);
		background.setBounds(0, 0, 1420, 840);
		
		JButton back = new JButton("Previous");
		back.setBackground(Color.GRAY);
		back.setForeground(Color.WHITE);
		JButton back2 = new JButton("Previous");
		back2.setBackground(Color.GRAY);
		back2.setForeground(Color.WHITE);
		Button3Handler b3handler = new Button3Handler();
		back.addActionListener(b3handler);
		back2.addActionListener(b3handler);
		
		JPanel card2 = new JPanel();
		Game game = new Game();
		card2.setLayout(new BorderLayout());
		card2.add(game, BorderLayout.CENTER);
		JPanel gameS = new JPanel();
		gameS.setLayout(new GridLayout(1, 3, 410, 0));
		gameS.add(back2);
		gameS.setBackground(Color.GRAY);
		card2.add(gameS, BorderLayout.SOUTH);
		
		JPanel card3 = new JPanel();
		card3.setLayout(null);
		JButton playerRules = new JButton("Player");
		playerRules.setBackground(Color.GRAY);
		playerRules.setForeground(Color.WHITE);
		Button4Handler b4handler = new Button4Handler();
		playerRules.addActionListener(b4handler);
		playerRules.setBounds(460, 257, 500, 75);
		card3.add(playerRules);
		JButton enemyRules = new JButton("Enemy");
		enemyRules.setBackground(Color.GRAY);
		enemyRules.setForeground(Color.WHITE);
		Button5Handler b5handler = new Button5Handler();
		enemyRules.addActionListener(b5handler);
		enemyRules.setBounds(460, 382, 500, 75);
		card3.add(enemyRules);
		JButton cameraRules = new JButton("Flying Monster");
		cameraRules.setBackground(Color.GRAY);
		cameraRules.setForeground(Color.WHITE);
		Button6Handler b6handler = new Button6Handler();
		cameraRules.addActionListener(b6handler);
		cameraRules.setBounds(460, 507, 500, 75);
		card3.add(cameraRules);
		back.setBounds(0, 775, 150, 50);
		card3.add(back);
		JLabel background2 = new JLabel();
		background2.setIcon(new ImageIcon("Game Background.png"));
		card3.add(background2);
		background2.setBounds(0, 0, 1420, 840);
		
		JButton instructionScreenP = new JButton("Instructions");
		instructionScreenP.setBackground(Color.GRAY);
		instructionScreenP.setForeground(Color.WHITE);
		JButton instructionScreenP2 = new JButton("Instructions");
		instructionScreenP2.setBackground(Color.GRAY);
		instructionScreenP2.setForeground(Color.WHITE);
		JButton instructionScreenP3 = new JButton("Instructions");
		instructionScreenP3.setBackground(Color.GRAY);
		instructionScreenP3.setForeground(Color.WHITE);
		JButton instructionScreenE = new JButton("Instructions");
		instructionScreenE.setBackground(Color.GRAY);
		instructionScreenE.setForeground(Color.WHITE);
		JButton instructionScreenE2 = new JButton("Instructions");
		instructionScreenE2.setBackground(Color.GRAY);
		instructionScreenE2.setForeground(Color.WHITE);
		JButton instructionScreenE3 = new JButton("Instructions");
		instructionScreenE3.setBackground(Color.GRAY);
		instructionScreenE3.setForeground(Color.WHITE);
		JButton instructionScreenC = new JButton("Instructions");
		instructionScreenC.setBackground(Color.GRAY);
		instructionScreenC.setForeground(Color.WHITE);
		JButton instructionScreenC2 = new JButton("Instructions");
		instructionScreenC2.setBackground(Color.GRAY);
		instructionScreenC2.setForeground(Color.WHITE);
		JButton instructionScreenC3 = new JButton("Instructions");
		instructionScreenC3.setBackground(Color.GRAY);
		instructionScreenC3.setForeground(Color.WHITE);
		Button7Handler b7handler = new Button7Handler();
		instructionScreenP.addActionListener(b7handler);
		instructionScreenP2.addActionListener(b7handler);
		instructionScreenP3.addActionListener(b7handler);
		instructionScreenE.addActionListener(b7handler);
		instructionScreenE2.addActionListener(b7handler);
		instructionScreenE3.addActionListener(b7handler);
		instructionScreenC.addActionListener(b7handler);
		instructionScreenC2.addActionListener(b7handler);
		instructionScreenC3.addActionListener(b7handler);
		
		Button8Handler b8handler = new Button8Handler();
		Button9Handler b9handler = new Button9Handler();
		
		PlayerInstructions1 prules1 = new PlayerInstructions1();
		JPanel card4 = new JPanel();
		card4.setLayout(new BorderLayout());
		card4.add(prules1, BorderLayout.CENTER);
		JPanel pRuleS = new JPanel();
		pRuleS.setBackground(Color.GRAY);
		pRuleS.setLayout(new GridLayout(1, 3, 410, 0));
		JPanel blank = new JPanel();
		blank.setBackground(Color.GRAY);
		pRuleS.add(blank);
		pRuleS.add(instructionScreenP);
		JButton nextP = new JButton("Next");
		nextP.setBackground(Color.GRAY);
		nextP.setForeground(Color.WHITE);
		nextP.addActionListener(b8handler);
		pRuleS.add(nextP);
		card4.add(pRuleS, BorderLayout.SOUTH);
		
		PlayerInstructions2 prules2 = new PlayerInstructions2();
		JPanel card5 = new JPanel();
		card5.setLayout(new BorderLayout());
		card5.add(prules2, BorderLayout.CENTER);
		JPanel pRuleS2 = new JPanel();
		pRuleS2.setBackground(Color.GRAY);
		pRuleS2.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevP = new JButton("Previous");
		prevP.setBackground(Color.GRAY);
		prevP.setForeground(Color.WHITE);
		prevP.addActionListener(b9handler);
		pRuleS2.add(prevP);
		pRuleS2.add(instructionScreenP2);
		JButton nextP2 = new JButton("Next");
		nextP2.setBackground(Color.GRAY);
		nextP2.setForeground(Color.WHITE);
		nextP2.addActionListener(b8handler);
		pRuleS2.add(nextP2);
		card5.add(pRuleS2, BorderLayout.SOUTH);
		
		PlayerInstructions3 prules3 = new PlayerInstructions3();
		JPanel card6 = new JPanel();
		card6.setLayout(new BorderLayout());
		card6.add(prules3, BorderLayout.CENTER);
		JPanel pRuleS3 = new JPanel();
		pRuleS3.setBackground(Color.GRAY);
		pRuleS3.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevP2 = new JButton("Previous");
		prevP2.setBackground(Color.GRAY);
		prevP2.setForeground(Color.WHITE);
		prevP2.addActionListener(b9handler);
		pRuleS3.add(prevP2);
		pRuleS3.add(instructionScreenP3);
		JPanel blank2 = new JPanel();
		blank2.setBackground(Color.GRAY);
		pRuleS3.add(blank2);
		card6.add(pRuleS3, BorderLayout.SOUTH);
		
		EnemyInstructions1 erules1 = new EnemyInstructions1();
		JPanel card7 = new JPanel();
		card7.setLayout(new BorderLayout());
		card7.add(erules1, BorderLayout.CENTER);
		JPanel eRuleS = new JPanel();
		eRuleS.setBackground(Color.GRAY);
		eRuleS.setLayout(new GridLayout(1, 3, 410, 0));
		JPanel blank3 = new JPanel();
		blank3.setBackground(Color.GRAY);
		eRuleS.add(blank3);
		eRuleS.add(instructionScreenE);
		JButton nextE = new JButton("Next");
		nextE.setBackground(Color.GRAY);
		nextE.setForeground(Color.WHITE);
		nextE.addActionListener(b8handler);
		eRuleS.add(nextE);
		card7.add(eRuleS, BorderLayout.SOUTH);
		
		EnemyInstruction2 erules2 = new EnemyInstruction2();
		JPanel card8 = new JPanel();
		card8.setLayout(new BorderLayout());
		card8.add(erules2, BorderLayout.CENTER);
		JPanel eRuleS2 = new JPanel();
		eRuleS2.setBackground(Color.GRAY);
		eRuleS2.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevE = new JButton("Previous");
		prevE.setBackground(Color.GRAY);
		prevE.setForeground(Color.WHITE);
		prevE.addActionListener(b9handler);
		eRuleS2.add(prevE);
		eRuleS2.add(instructionScreenE2);
		JButton nextE2 = new JButton("Next");
		nextE2.setBackground(Color.GRAY);
		nextE2.setForeground(Color.WHITE);
		nextE2.addActionListener(b8handler);
		eRuleS2.add(nextE2);
		card8.add(eRuleS2, BorderLayout.SOUTH);
		
		
		EnemyInstruction3 erules3 = new EnemyInstruction3();
		JPanel card9 = new JPanel();
		card9.setLayout(new BorderLayout());
		card9.add(erules3, BorderLayout.CENTER);
		JPanel eRuleS3 = new JPanel();
		eRuleS3.setBackground(Color.GRAY);
		eRuleS3.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevE2 = new JButton("Previous");
		prevE2.setBackground(Color.GRAY);
		prevE2.setForeground(Color.WHITE);
		prevE2.addActionListener(b9handler);
		eRuleS3.add(prevE2);
		eRuleS3.add(instructionScreenE3);
		JPanel blank4 = new JPanel();
		blank4.setBackground(Color.GRAY);
		eRuleS3.add(blank4);
		card9.add(eRuleS3, BorderLayout.SOUTH);
		
		CameraInstructions crules1 = new CameraInstructions();
		JPanel card10 = new JPanel();
		card10.setLayout(new BorderLayout());
		card10.add(crules1, BorderLayout.CENTER);
		JPanel cRuleS = new JPanel();
		cRuleS.setBackground(Color.GRAY);
		cRuleS.setLayout(new GridLayout(1, 3, 410, 0));
		JPanel blank5 = new JPanel();
		blank5.setBackground(Color.GRAY);
		cRuleS.add(blank5);
		cRuleS.add(instructionScreenC);
		JButton nextC = new JButton("Next");
		nextC.setBackground(Color.GRAY);
		nextC.setForeground(Color.WHITE);
		nextC.addActionListener(b8handler);
		cRuleS.add(nextC);
		card10.add(cRuleS, BorderLayout.SOUTH);
		
		CameraInstructions2 crules2 = new CameraInstructions2();
		JPanel card11 = new JPanel();
		card11.setLayout(new BorderLayout());
		card11.add(crules2, BorderLayout.CENTER);
		JPanel cRuleS2 = new JPanel();
		cRuleS2.setBackground(Color.GRAY);
		cRuleS2.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevC = new JButton("Previous");
		prevC.setBackground(Color.GRAY);
		prevC.setForeground(Color.WHITE);
		prevC.addActionListener(b9handler);
		cRuleS2.add(prevC);
		cRuleS2.add(instructionScreenC2);
		JButton nextC2 = new JButton("Next");
		nextC2.setBackground(Color.GRAY);
		nextC2.setForeground(Color.WHITE);
		nextC2.addActionListener(b8handler);
		cRuleS2.add(nextC2);
		card11.add(cRuleS2, BorderLayout.SOUTH);
		
		CameraInstructions3 crules3 = new CameraInstructions3();
		JPanel card12 = new JPanel();
		card12.setLayout(new BorderLayout());
		card12.add(crules3, BorderLayout.CENTER);
		JPanel cRuleS3 = new JPanel();
		cRuleS3.setBackground(Color.GRAY);
		cRuleS3.setLayout(new GridLayout(1, 3, 410, 0));
		JButton prevC2 = new JButton("Previous");
		prevC2.setBackground(Color.GRAY);
		prevC2.setForeground(Color.WHITE);
		prevC2.addActionListener(b9handler);
		cRuleS3.add(prevC2);
		cRuleS3.add(instructionScreenC3);
		JPanel blank6 = new JPanel();
		blank6.setBackground(Color.GRAY);
		cRuleS3.add(blank6);
		card12.add(cRuleS3, BorderLayout.SOUTH);
		
		cards = new JPanel(new CardLayout());
		cards.add(card1, "start");
		cards.add(card2, "game");
		cards.add(card3, "rules");
		cards.add(card4, "player1");
		cards.add(card5, "player2");
		cards.add(card6, "player3");
		cards.add(card7, "enemy");
		cards.add(card8, "enemy2");
		cards.add(card9, "enemy3");
		cards.add(card10, "camera");
		cards.add(card11, "camera2");
		cards.add(card12, "camera3");
		
		pane.add(cards);
	}
	class Button1Handler implements ActionListener
	{
		//the action performed if the button "Play" is pressed
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Play"))
				cl.show(cards, "game");
		}
		
	}
	class Button2Handler implements ActionListener
	{
		//the action performed if the button "instructions" is pressed
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Instructions"))
				cl.show(cards, "rules");
		}
		
	}
	class Button3Handler implements ActionListener
	{
		//moves to the previous panel if the button "Previous" on the instructions
		//screen is pressed
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Previous"))
				cl.show(cards, "start");
		}
	}
	class Button4Handler implements ActionListener
	{
		//the action performed if the button "Player" is pressed on the
		//instructions screen
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Player"))
				cl.show(cards, "player1");
		}
	}
	class Button5Handler implements ActionListener
	{
		//the action performed if the button "Enemy" is pressed on the 
		//instrucions screen
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Enemy"))
				cl.show(cards, "enemy");
		}
	}
	class Button6Handler implements ActionListener
	{
		//the action performed if the button "Camera" is pressed on the 
		//instructions screen
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Camera"))
				cl.show(cards, "camera");
		}
	}
	class Button7Handler implements ActionListener
	{
		//moves to the previous panel if the button "Previous" is pressed on the
		//Player, Enemy, or Camera Panel
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Instructions"))
				cl.show(cards, "rules");
		}
	}
	class Button8Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Next"))
				cl.next(cards);
		}
	}
	class Button9Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			CardLayout cl = (CardLayout)(cards.getLayout());
			if(e.getActionCommand().equals("Previous"))
				cl.previous(cards);
		}
	}
	class Button10Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(1);
		}
	}
}
class Game extends JPanel implements KeyListener
{ 
	//Deals with the environment for the game, the enemies, and movement of the player
	boolean first, second, thrid, forth, fifth;
	boolean up, down, right, left;
	boolean up2, down2, right2, left2;
	boolean up3, down3, right3, left3;
	boolean sneak, off, win;
	boolean pLeft, pRight, lever, lever2;
	int onex, oney, twox, twoy, threex, threey;
	int elength, ewidth, elength2, ewidth2, elength3, ewidth3, visionx, visiony, visionx2, visiony2, visionx3, visiony3;
	Timer oneTimer, twoTimer, threeTimer;
	Rectangle player, playerSneak, sneakWall, sneakWall2, sneakWall3, sneakWall4, sneakWall5, sneakWall6, sneakWall7, sneakWall8, sneakWall9;
	Rectangle wall, wall2, wall3, wall4, wall5, wall6, wall7, wall8, wall9, wall10, wall11, end;
	Rectangle enemy1, enemy2, enemy3, vision1, vision2, vision3;
	Image floor, enemyRight, enemyLeft, playerLeft, playerRight, monsterLeft, monsterRight, leveron, leveroff;
	Ellipse2D camera, camera2;
	Rectangle sneakArea1, sneakArea2, sneakArea3, sneakArea4, sneakArea5, sneakArea6, sneakArea7, sneakArea8, sneakArea9, sneakArea10,
	sneakArea11, sneakArea12, sneakArea13, sneakArea14, sneakArea15, sneakArea16, sneakArea17, sneakArea18, sneakArea19, sneakArea20,
	sneakArea21, sneakArea22, sneakArea23, sneakArea24, sneakArea25, sneakArea26, sneakArea27, sneakArea28, sneakArea29, sneakArea30,
	sneakArea31, sneakArea32, sneakArea33, sneakArea34, sneakArea35, sneakArea36, sneakArea37, sneakArea38;
	int counter, deathx, deathy;
	public Game()
	{
		//initializes variables
		setBackground(Color.GRAY);
		addKeyListener(this);
		first = true;
		second = thrid = forth = fifth = false;
		up = right = left = down2 = right2 = left2 = down3 = right3 = left3 = false;
		down = up2 = up3 = true;
		sneak = false;
		off = true;
		pLeft = false;
		pRight = true;
		lever = lever2 = false;
		win = false;
		onex = 350;
		oney = 10;
		twox = 750;
		twoy = 400;
		threex = 1100;
		threey = 700;
		enemy1 = new Rectangle(375, 10, 50, 50);
		enemy2 = new Rectangle(775, 400, 50, 50);
		enemy3 = new Rectangle(1125, 725, 50, 50);
		player = new Rectangle(25, 10, 50, 50);
		playerSneak = new Rectangle(0, 0, 0, 0);
		end = new Rectangle(1300, 0, 100, 100);
		floor = new ImageIcon("StoneFloor.jpg").getImage();
		enemyRight = new ImageIcon("enemyRight.gif").getImage();
		enemyLeft = new ImageIcon("enemyLeft.gif").getImage();
		playerLeft = new ImageIcon("WalkLeft.gif").getImage();
		playerRight = new ImageIcon("WalkRight.gif").getImage();
		monsterRight = new ImageIcon("enemy14.gif").getImage();
		monsterLeft = new ImageIcon("cameraLeft.gif").getImage();
		leveron = new ImageIcon("leveron.png").getImage();
		leveroff = new ImageIcon("leveroff.png").getImage();
		
		EnemyOne one = new EnemyOne();
		oneTimer = new Timer(10, one);
		EnemyTwo two = new EnemyTwo();
		twoTimer = new Timer(10, two);
		EnemyThree three = new EnemyThree();
		threeTimer = new Timer(10, three);
	}
	class EnemyOne implements ActionListener
	{
		//deals with the movement of one of the enemies depending on what level is showing
		public void actionPerformed(ActionEvent e) 
		{
			if(fifth)
			{
				if(up)
				{
					if(oney == 500)
					{
						up = false;
						left = true;
					}
					oney--;
				}
				else if(right)
				{
					if(onex == 500)
					{
						right = false;
						up = true;
					}
					onex++;
				}
				else if(down)
				{
					if(oney == 700)
					{
						down = false;
						right = true;
					}
					oney++;
				}
				else if(left)
				{
					if(onex == 200)
					{
						left = false;
						down = true;
					}
					onex--;
				}
			}
			else if(forth)
			{
				if(up)
				{
					if(oney == 100)
					{
						up = false;
						right = true;
					}
					oney--;
				}
				else if(right)
				{
					if(onex == 900)
					{
						right = false;
						down = true;
					}
					onex++;
				}
				else if(down)
				{
					if(oney == 400)
					{
						down = false;
						left = true;
					}
					oney++;
				}
				else if(left)
				{
					if(onex == 600)
					{
						left = false;
						up = true;
					}
					onex--;
				}
			}
			else if(thrid)
			{
				if(up)
				{
					if(oney == 500)
					{
						up = false;
						right = true;
					}
					oney--;
				}
				else if(right)
				{
					if(onex == 1300)
					{
						right = false;
						down = true;
					}
					onex++;
				}
				else if(down)
				{
					if(oney == 700)
					{
						down = false;
						left = true;
					}
					oney++;
				}
				else if(left)
				{
					if(onex == 1000)
					{
						left = false;
						up = true;
					}
					onex--;
				}
			}
			else if(second)
			{
				if(up)
				{
					if(oney == 200)
					{
						up = false;
						right = true;
					}
					oney--;
				}
				else if(right)
				{
					if(onex == 400)
					{
						right = false;
						down = true;
					}
					onex++;
				}
				else if(down)
				{
					if(oney == 500)
					{
						down = false;
						left = true;
					}
					oney++;
				}
				else if(left)
				{
					if(onex == 200)
					{
						left = false;
						up = true;
					}
					onex--;
				}
			}
			else if(first)
			{
				if(up)
				{
					if(oney == 10)
					{
						up = false;
						down = true;
					}
					oney--;
				}
				else if(down)
				{
					if(oney == 690)
					{
						up = true;
						down = false;
					}
					oney++;
				}
			}
			requestFocus();
			repaint();
		}
	}
	class EnemyTwo implements ActionListener
	{
		//deals with enemy2's movements depending on what level is shown
		public void actionPerformed(ActionEvent e)
		{
			if(fifth)
			{
				if(up2)
				{
					if(twoy == 400)
					{
						up2 = false;
						left2 = true;
					}
					twoy--;
				}
				if(right2)
				{
					if(twox == 900)
					{
						right2 = false;
						up2 = true;
					}
					twox++;
				}
				if(down2)
				{
					if(twoy == 700)
					{
						down2 = false;
						right2 = true;
					}
					twoy++;
				}
				if(left2)
				{
					if(twox == 600)
					{
						left2 = false;
						down2 = true;
					}
					twox--;
				}
			}
			if(forth)
			{
				if(up2)
				{
					if(twoy == 600)
					{
						up2 = false;
						right2 = true;
					}
					twoy--;
				}
				if(right2)
				{
					if(twox == 1300)
					{
						right2 = false;
						down2 = true;
					}
					twox++;
				}
				if(down2)
				{
					if(twoy == 700)
					{
						down2 = false;
						left2 = true;
					}
					twoy++;
				}
				if(left2)
				{
					if(twox == 800)
					{
						left2 = false;
						up2 = true;
					}
					twox--;
				}
			}
			else if(thrid)
			{
				if(up2)
				{
					if(twoy == 100)
					{
						up2 = false;
						right2 = true;
					}
					twoy--;
				}
				else if(right2)
				{
					if(twox == 1300)
					{
						right2 = false;
						down2 = true;
					}
					twox++;
				}
				else if(down2)
				{
					if(twoy == 300)
					{
						down2 = false;
						left2 = true;
					}
					twoy++;
				}
				else if(left2)
				{
					if(twox == 1000)
					{
						left2 = false;
						up2 = true;
					}
					twox--;
				}
			}
			if(second)
			{
				if(up2)
				{
					if(twox == 600)
					{
						if(twoy == 0)
						{
							up2 = false;
							right2 = true;
						}
						twoy--;
					}
					if(twox == 900)
					{
						if(twoy == 0)
						{
							up2 = false;
							left2 = true;
						}
						twoy--;
					}
				}
				if(right2)
				{
					if(twox == 899)
					{
						right2 = false;
						down2 = true;
					}
					twox++;
				}
				if(down2)
				{
					if(twox == 600)
					{
						if(twoy == 200)
						{
							down2 = false;
							up2 = true;
						}
						twoy++;
					}
					if(twox == 900)
					{
						if(twoy == 200)
						{
							down2 = false;
							up2 = true;
						}
						twoy++;
					}
				}
				if(left2)
				{
					if(twox == 601)
					{
						left2 = false;
						down2 = true;
					}
					twox--;
				}
			}
			if(first)
			{
				if(up2)
				{
					if(twoy == 10)
					{
						up2 = false;
						down2 = true;
					}
					twoy--;
				}
				if(down2)
				{
					if(twoy == 690)
					{
						up2 = true;
						down2 = false;
					}
					twoy++;
				}
			}
			requestFocus();
			repaint();
		}
	}
	class EnemyThree implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//deals with enemy3's movements depending on what level is shown
			if(fifth)
			{
				if(up3)
				{
					if(threex == 1300)
					{
						if(threey == 100)
						{
							up3 = false;
							down3 = true;
						}
						threey--;
					}
					if(threex == 1099)
					{
						if(threey == 0)
						{
							up3 = false;
							down3 = true;
						}
						threey--;
					}
				}
				if(right3)
				{
					threex++;
					if(threex == 1300)
					{
						right3 = false;
						up3 = true;
					}
				}
				if(down3)
				{
					if(threex == 1099)
					{
						if(threey == 700)
						{
							down3 = false;
							right3 = true;
						}
						threey++;
					}
					if(threex == 1300)
					{
						if(threey == 700)
						{
							down3 = false;
							left3 = true;
						}
						threey++;
					}	
				}
				if(left3)
				{
					if(threex == 1100)
					{
						left3 = false;
						up3 = true;
					}
					threex--;
				}
			}
			else if(forth)
			{
				if(up3)
				{
					if(threex == 350)
					{
						if(threey == 300)
						{
							up3 = false;
							left3 = true;
						}
						threey--;
					}
					if(threex == 49)
					{
						if(threey == 300)
						{
							up3 = false;
							right3 = true;
						}
						threey--;
					}
				}
				if(right3)
				{
					threex++;
					if(threex == 350)
					{
						right3 = false;
						down3 = true;
					}
				}
				if(down3)
				{
					if(threey == 700)
					{
						down3 = false;
						up3 = true;
					}
					threey++;
				}
				if(left3)
				{
					if(threex == 50)
					{
						left3 = false;
						down3 = true;
					}
					threex--;
				}
			}
			else if(thrid)
			{
				if(up3)
				{
					if(threey == 0)
					{
						up3 = false;
						right3 = true;
					}
					threey--;
				}
				if(right3)
				{
					if(threex == 700)
					{
						right3 = false;
						down3 = true;
					}
					threex++;
				}
				if(down3)
				{
					if(threey == 700)
					{
						down3 = false;
						left3 = true;
					}
					threey++;
				}
				if(left3)
				{
					if(threex == 600)
					{
						left3 = false;
						up3 = true;
					}
					threex--;
				}
			}
			else if(second)
			{
				if(up3)
				{
					if(threex == 600)
					{
						if(threey == 500)
						{
							up3 = false;
							down3 = true;
						}
						threey--;
					}
					if(threex == 900)
					{
						if(threey == 500)
						{
							up3 = false;
							down3 = true;
						}
						threey--;
					}
				}
				if(right3)
				{
					if(threex == 899)
					{
						right3 = false;
						up3 = true;
					}
					threex++;
				}
				if(down3)
				{
					if(threex == 600)
					{
						if(threey == 700)
						{
							down3 = false;
							right3 = true;
						}
						threey++;
					}
					if(threex == 900)
					{
						if(threey == 700)
						{
							down3 = false;
							left3 = true;
						}
						threey++;
					}
				}
				if(left3)
				{
					if(threex == 601)
					{
						left3 = false;
						up3 = true;
					}
					threex--;
				}
			}
			else if(first)
			{
				if(up3)
				{
					if(threey == 100)
					{
						up3 = false;
						right3 = true;
					}
					threey--;
				}
				if(right3)
				{
					if(threex == 1300)
					{
						right3 = false;
						down3 = true;
					}
					threex++;
				}
				if(down3)
				{
					if(threey == 700)
					{
						down3 = false;
						left3 = true;
					}
					threey++;
				}
				if(left3)
				{
					if(threex == 1100)
					{
						left3 = false;
						up3 = true;
					}
					threex--;
				}
			}
			requestFocus();
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//creates the player and chooses the level that needs to be painted
		super.paintComponent(g);

		wall = new Rectangle(0, 0, 0, 0);
		wall2 = new Rectangle(0, 0, 0, 0);
		wall3 = new Rectangle(0, 0, 0, 0);
		wall4 = new Rectangle(0, 0, 0, 0);
		wall5 = new Rectangle(0, 0, 0, 0);
		wall6 = new Rectangle(0, 0, 0, 0);
		wall7 = new Rectangle(0, 0, 0, 0);
		wall8 = new Rectangle(0, 0, 0, 0);
		wall9 = new Rectangle(0, 0, 0, 0);
		wall10 = new Rectangle(0, 0, 0, 0);
		wall11 = new Rectangle(0, 0, 0, 0);
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(0, 0, 5, 800);
		g.fillRect(100, 0, 1195, 5);
		g.fillRect(0, 795, 1395, 5);
		g.fillRect(1395, 0, 5, 800);
		g.setColor(Color.BLUE);
		g.fillRect(1300, 0, 100, 100);
		/*for(int i=0; i<1500; i+=100)
		{
			g.drawLine(i, 0, i, 800);
			if(i < 900)
				g.drawLine(0, i, 1400, i);
		}*/
		g.setColor(Color.BLUE);
		if(sneak)
		{
			if(playerSneak.x > 0||playerSneak.y > 0)
			{
				g.setColor(Color.YELLOW);
				g.fillRect(playerSneak.x, playerSneak.y, 50, 50);
			}
			g.setColor(Color.GREEN);
		}
		else
			g.setColor(Color.BLUE);
		if(pRight)
			g.drawImage(playerRight, player.x, player.y, 50, 50, null);
		else if(pLeft)
			g.drawImage(playerLeft, player.x, player.y, 50, 50, null);
		if(first)
			level1(g);
		if(second)
			level2(g);
		if(thrid)
			level3(g);
		if(forth)
			level4(g);
		if(fifth)
			level5(g);
		if(win)
			finish(g);
	}
	public void level1(Graphics g)
	{
		//draws environment for level 1 and enemies
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		wall = new Rectangle(100, 0, 200, 700);
		wall2 = new Rectangle(500, 100, 200, 700);
		wall3 = new Rectangle(900, 0, 200, 700);
		sneakArea1 = new Rectangle(99,0, 1, 700);
		sneakArea2 = new Rectangle(100, 700, 200, 1);
		sneakArea3 = new Rectangle(300, 0, 1, 700);
		sneakArea4 = new Rectangle(499, 100, 1, 700);
		sneakArea5 = new Rectangle(500, 99, 200, 1);
		sneakArea6 = new Rectangle(700, 100, 1, 700);
		sneakArea7 = new Rectangle(899, 0, 1, 700);
		sneakArea8 = new Rectangle(900, 700, 200, 1);
		sneakArea9 = new Rectangle(1100, 0, 1, 700);
		g.fillRect(100, 0, 200, 700);
		g.fillRect(500, 100, 200, 700);
		g.fillRect(900, 0, 200, 700);
		g.setColor(Color.BLACK);
		g.drawLine(150, 0, 150, 650);
		g.drawLine(100, 700, 150, 650);
		g.drawLine(150, 650, 250, 650);
		g.drawLine(300, 700, 250, 650);
		g.drawLine(250, 0, 250, 650);
		g.drawLine(550, 150, 550, 800);
		g.drawLine(500, 100, 550, 150);
		g.drawLine(550, 150, 650, 150);
		g.drawLine(700, 100, 650, 150);
		g.drawLine(650, 150, 650, 800);
		g.drawLine(950, 0, 950, 650);
		g.drawLine(900, 700, 950, 650);
		g.drawLine(950, 650, 1050, 650);
		g.drawLine(1100, 700, 1050, 650);
		g.drawLine(1050, 0, 1050, 650);
		g.setColor(Color.RED);
		oneTimer.start();
		twoTimer.start();
		threeTimer.start();
		g.setColor(Color.YELLOW);
		//shows enemy1 vision
		if(up)
		{
			g.fillRect(onex+20, oney-150, 60, 200);
			vision1 = new Rectangle(onex+20, oney-150, 60, 200);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else
		{
			g.fillRect(onex+20, oney+50, 60, 200);
			vision1 = new Rectangle(onex+20, oney+50, 60, 200);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		//shows enemy2 vision
		if(up2)
		{
			g.fillRect(twox+20, twoy-150, 60, 200);
			vision2 = new Rectangle(twox+20, twoy-150, 60, 200);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else
		{
			g.fillRect(twox+20, twoy+50, 60, 200);
			vision2 = new Rectangle(twox+20, twoy+50, 60, 200);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		//shows enemy3 vision
		if(up3)
		{
			g.fillRect(threex+20, threey-150, 60, 200);
			vision3 = new Rectangle(threex+20, threey-150, 50, 200);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(right3)
		{
			g.fillRect(threex+50, threey+20, 200, 60);
			vision3 = new Rectangle(threex+50, threey, 200, 60);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(down3)
		{
			g.fillRect(threex+20, threey+50, 60, 200);
			vision3 = new Rectangle(threex+20, threey+50, 60, 200);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		else
		{
			g.fillRect(threex-150, threey+20, 200, 60);
			vision3 = new Rectangle(threex-150, threey, 200, 60);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		if(counter > 0)
		{
			player.x = deathx;
			player.y = deathy;
		}
		if(player.intersects(vision1)||player.intersects(vision2)||player.intersects(vision3))
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
	}
	public void level2(Graphics g)
	{
		//draws environment for level 2 and enemies
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		wall = new Rectangle(100, 0, 100, 300);
		wall2 = new Rectangle(100, 500, 100, 300);
		wall3 = new Rectangle(300, 300, 100, 200);
		wall4 = new Rectangle(500, 300, 100, 200);
		wall5 = new Rectangle(300, 100, 300, 100);
		wall6 = new Rectangle(300, 600, 300, 100);
		wall7 = new Rectangle(700, 100, 200, 600);
		wall8 = new Rectangle(1000, 0, 100, 200);
		wall9 = new Rectangle(1000, 300, 100, 500);
		wall10 = new Rectangle(1200, 0, 100, 600);
		wall11 = new Rectangle(1200, 700, 100, 100);
		sneakArea1 = new Rectangle(99, 0, 1, 300);
		sneakArea2 = new Rectangle(100, 300, 100, 1);
		sneakArea3 = new Rectangle(200, 0, 1, 300);
		sneakArea4 = new Rectangle(99, 500, 1, 300);
		sneakArea5 = new Rectangle(100, 499, 100, 1);
		sneakArea6 = new Rectangle(200, 500, 1, 300);
		sneakArea7 = new Rectangle(299, 300, 1, 200);
		sneakArea8 = new Rectangle(300, 299, 1, 100);
		sneakArea9 = new Rectangle(400, 300, 1, 200);
		sneakArea10 = new Rectangle(300, 500, 100, 1);
		sneakArea11 = new Rectangle(499, 300, 1, 200);
		sneakArea12 = new Rectangle(500, 299, 100, 1);
		sneakArea13 = new Rectangle(600, 300, 1, 200);
		sneakArea14 = new Rectangle(500, 500, 100, 1);
		sneakArea15 = new Rectangle(299, 100, 1, 100);
		sneakArea16 = new Rectangle(300, 99, 300, 1);
		sneakArea17 = new Rectangle(600, 100, 1, 100);
		sneakArea18 = new Rectangle(300, 200, 300, 1);
		sneakArea19 = new Rectangle(299, 600, 1, 100);
		sneakArea20 = new Rectangle(300, 599, 300, 1);
		sneakArea21 = new Rectangle(600, 600, 1, 100);
		sneakArea22 = new Rectangle(300, 700, 300, 1);
		sneakArea23 = new Rectangle(699, 100, 1, 600);
		sneakArea24 = new Rectangle(700, 99, 200, 1);
		sneakArea25 = new Rectangle(900, 100, 1, 600);
		sneakArea26 = new Rectangle(700, 700, 200, 1);
		sneakArea27 = new Rectangle(999, 0, 1, 200);
		sneakArea28 = new Rectangle(1000, 200, 100, 1);
		sneakArea29 = new Rectangle(1100, 0, 1, 200);
		sneakArea30 = new Rectangle(999, 300, 1, 500);
		sneakArea31 = new Rectangle(1000, 299, 100, 1);
		sneakArea32 = new Rectangle(1100, 300, 1, 500);
		sneakArea33 = new Rectangle(1199, 0, 1, 600);
		sneakArea34 = new Rectangle(1200, 600, 100, 1);
		sneakArea35 = new Rectangle(1300, 0, 1, 600);
		sneakArea36 = new Rectangle(1199, 700, 1, 100);
		sneakArea37 = new Rectangle(1200, 699, 100, 1);
		sneakArea38 = new Rectangle(1300, 700, 1, 100);
		g.fillRect(100, 0, 100, 300);
		g.fillRect(100, 500, 100, 300);
		g.fillRect(300, 300, 100, 200);
		g.fillRect(500, 300, 100, 200);
		g.fillRect(300, 100, 300, 100);
		g.fillRect(300, 600, 300, 100);
		g.fillRect(700, 100, 200, 600);
		g.fillRect(1000, 0, 100, 200);
		g.fillRect(1000, 300, 100, 500);
		g.fillRect(1200, 0, 100, 600);
		g.fillRect(1200, 700, 100, 100);
		g.setColor(Color.BLACK);
		g.drawLine(150, 0, 150, 250);
		g.drawLine(100, 300, 150, 250);
		g.drawLine(150, 250, 200, 300);
		g.drawLine(150, 550, 150, 800);
		g.drawLine(100, 500, 150, 550);
		g.drawLine(150, 550, 200, 500);
		g.drawLine(300, 300, 350, 350);
		g.drawLine(350, 350, 400, 300);
		g.drawLine(350, 350, 350, 450);
		g.drawLine(300, 500, 350, 450);
		g.drawLine(400, 500, 350, 450);
		g.drawLine(500, 300, 550, 350);
		g.drawLine(600, 300, 550, 350);
		g.drawLine(550, 350, 550, 450);
		g.drawLine(500, 500, 550, 450);
		g.drawLine(600, 500, 550, 450);
		g.drawLine(300, 100, 350, 150);
		g.drawLine(300, 200, 350, 150);
		g.drawLine(350, 150, 550, 150);
		g.drawLine(600, 100, 550, 150);
		g.drawLine(600, 200, 550, 150);
		g.drawLine(300, 600, 350, 650);
		g.drawLine(300, 700, 350, 650);
		g.drawLine(350, 650, 550, 650);
		g.drawLine(600, 600, 550, 650);
		g.drawLine(600, 700, 550, 650);
		g.drawLine(700, 100, 750, 150);
		g.drawLine(900, 100, 850, 150);
		g.drawLine(750, 150, 850, 150);
		g.drawLine(750, 150, 750, 650);
		g.drawLine(850, 150, 850, 650);
		g.drawLine(750, 650, 850, 650);
		g.drawLine(700, 700, 750, 650);
		g.drawLine(900, 700, 850, 650);
		g.drawLine(1050, 0, 1050, 150);
		g.drawLine(1000, 200, 1050, 150);
		g.drawLine(1100, 200, 1050, 150);
		g.drawLine(1000, 300, 1050, 350);
		g.drawLine(1100, 300, 1050, 350);
		g.drawLine(1050, 350, 1050, 800);
		g.drawLine(1250, 0, 1250, 550);
		g.drawLine(1200, 600, 1250, 550);
		g.drawLine(1300, 600, 1250, 550);
		g.drawLine(1200, 700, 1250, 750);
		g.drawLine(1300, 700, 1250, 750);
		g.drawLine(1250, 750, 1250, 800);
		g.setColor(Color.RED);
		oneTimer.start();
		twoTimer.start();
		threeTimer.start();
		g.setColor(Color.YELLOW);
		//shows enemy1 vision
		if(up)
		{
			g.fillRect(onex+20, oney-150, 60, 200);
			vision1 = new Rectangle(onex+20, oney-150, 60, 200);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(right)
		{
			g.fillRect(onex+50, oney+20, 200, 60);
			vision1 = new Rectangle(onex+50, oney+20, 200, 60);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(down)
		{
			ewidth = 200;
			if(oney >= 350)
				ewidth = 600-oney-50;
			g.fillRect(onex+20, oney+50, 60, ewidth);
			vision1 = new Rectangle(onex+20, oney+50, 60, ewidth);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		else if(left)
		{
			visionx = onex-150;
			elength = 200;
			if(onex <= 350)
			{
				visionx = 200;
				elength = onex-150;
			}
			g.fillRect(visionx, oney+20, elength, 60);
			vision1 = new Rectangle(visionx, oney+20, elength, 60);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		//shows enemy2 vision
		if(up2)
		{
			g.fillRect(twox+20, twoy-150, 60, 200);
			vision2 = new Rectangle(twox+20, twoy-150, 60, 200);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(right2)
		{
			elength2 = 200;
			if(twox >= 750)
				elength2 = 1000-twox-50;
			g.fillRect(twox+50, twoy+20, elength2, 60);
			vision2 = new Rectangle(twox+50, twoy+20, elength2, 60);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(down2)
		{
			g.fillRect(twox+20, twoy+50, 60, 200);
			vision2 = new Rectangle(twox+20, twoy+50, 60, 200);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		else if(left2)
		{
			g.fillRect(twox-150, twoy+20, 200, 60);
			vision2 = new Rectangle(twox-150, twoy+20, 200, 60);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		//shows enemy3 vision
		if(down3)
		{
			g.fillRect(threex+20, threey+50, 60, 200);
			vision3 = new Rectangle(threex+20, threey+50, 60, 200);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		else if(right3)
		{
			elength3 = 200;
			if(threex >= 750)
				elength3 = 1000-threex-50;
			g.fillRect(threex+50, threey+20, elength3, 60);
			vision3 = new Rectangle(threex+50, threey+20, elength3, 60);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(up3)
		{
			g.fillRect(threex+20, threey-150, 60, 200);
			vision3 = new Rectangle(threex+20, threey-150, 60, 200);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(left3)
		{
			g.fillRect(threex-150, threey+20, 200, 60);
			vision3 = new Rectangle(threex-150, threey+20, 200, 60);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		if(counter > 0)
		{
			player.x = deathx;
			player.y = deathy;
		}
		if(player.intersects(vision1)||player.intersects(vision2)||player.intersects(vision3))
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
	}
	public void level3(Graphics g)
	{
		//draws environment for level 3 and enemies
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		wall = new Rectangle(100, 300, 500, 400);
		wall2 = new Rectangle(500, 700, 100, 100);
		wall3 = new Rectangle(800, 0, 200, 700);
		wall4 = new Rectangle(1100, 600, 200, 100);
		wall5 = new Rectangle(1100, 400, 200, 100);
		wall6 = new Rectangle(1100, 200, 200, 100); 
		sneakArea1 = new Rectangle(99, 300, 1, 400);
		sneakArea2 = new Rectangle(100, 299, 500, 1);
		sneakArea3 = new Rectangle(100, 700, 400, 1);
		sneakArea4 = new Rectangle(499, 700, 1, 100);
		sneakArea5 = new Rectangle(600, 300, 1, 500);
		sneakArea6 = new Rectangle(799, 0, 1, 700);
		sneakArea7 = new Rectangle(800, 700, 200, 1);
		sneakArea8 = new Rectangle(1000, 0, 1, 700);
		sneakArea9 = new Rectangle(1100, 599, 200, 1);
		sneakArea10 = new Rectangle(1300, 600, 1, 100);
		sneakArea11 = new Rectangle(1100, 700, 200, 1);
		sneakArea12 = new Rectangle(1099, 600, 1, 100);
		sneakArea13 = new Rectangle(1100, 399, 200, 1);
		sneakArea14 = new Rectangle(1300, 400, 1, 100);
		sneakArea15 = new Rectangle(1100, 500, 200, 1);
		sneakArea16 = new Rectangle(1099, 400, 1, 100);
		sneakArea17 = new Rectangle(1100, 199, 200, 1);
		sneakArea18 = new Rectangle(1300, 200, 1, 100);
		sneakArea19 = new Rectangle(1100, 300, 200, 1);
		sneakArea20 = new Rectangle(1099, 200, 1, 100);
		g.fillRect(100, 300, 500, 400);
		g.fillRect(500, 700, 100, 100);
		g.fillRect(800, 0, 200, 700);
		g.fillRect(1100, 600, 200, 100);
		g.fillRect(1100, 400, 200, 100);
		g.fillRect(1100, 200, 200, 100);
		g.setColor(Color.BLACK);
		g.drawLine(100, 300, 150, 350);
		g.drawLine(150, 350, 550, 350);
		g.drawLine(600, 300, 550, 350);
		g.drawLine(150, 350, 150, 650);
		g.drawLine(550, 350, 550, 800);
		g.drawLine(150, 650, 550, 650);
		g.drawLine(100, 700, 150, 650);
		g.drawLine(550, 650, 500, 700);
		g.drawLine(850, 0, 850, 650);
		g.drawLine(950, 0, 950, 650);
		g.drawLine(850, 650, 950, 650);
		g.drawLine(800, 700, 850, 650);
		g.drawLine(1000, 700, 950, 650);
		g.drawLine(1100, 600, 1150, 650);
		g.drawLine(1100, 700, 1150, 650);
		g.drawLine(1150, 650, 1250, 650);
		g.drawLine(1300, 600, 1250, 650);
		g.drawLine(1300, 700, 1250, 650);
		g.drawLine(1100, 400, 1150, 450);
		g.drawLine(1100, 500, 1150, 450);
		g.drawLine(1150, 450, 1250, 450);
		g.drawLine(1300, 400, 1250, 450);
		g.drawLine(1300, 500, 1250, 450);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1100, 300, 1150, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1300, 300, 1250, 250);
		camera = new Ellipse2D.Double(200, 0, 300, 300); 
		g.drawImage(monsterRight, 325, 300, 50, 50, null);
		if(lever)
			g.drawImage(leveron, 425, 725, 50, 50, null);
		else
		{
			g.setColor(Color.GREEN);
			g.fillOval(200, 0, 300, 300);
			g.drawImage(leveroff, 425, 725, 50, 50, null);
		}
		oneTimer.start();
		twoTimer.start();
		threeTimer.start();
		g.setColor(Color.YELLOW);
		//shows enemy1 vision
		if(up)
		{
			g.fillRect(onex+20, oney-150, 60, 200);
			vision1 = new Rectangle(onex+20, oney-150, 60, 200);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(right)
		{
			g.fillRect(onex+50, oney+20, 200, 60);
			vision1 = new Rectangle(onex+50, oney+20, 200, 60);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(down)
		{
			g.fillRect(onex+20, oney+50, 60, 200);
			vision1 = new Rectangle(onex+20, oney+50, 60, 200);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		else if(left)
		{
			g.fillRect(onex-150, oney+20, 200, 60);
			vision1 = new Rectangle(onex-150, oney+20, 200, 60);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		//shows enemy2 vision
		if(up2)
		{
			g.fillRect(twox+20, twoy-150, 60, 200);
			vision2 = new Rectangle(twox+20, twoy-150, 60, 200);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(right2)
		{
			g.fillRect(twox+50, twoy+20, 200, 60);
			vision2 = new Rectangle(twox+50, twoy+20, 200, 60);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(down2)
		{
			g.fillRect(twox+20, twoy+50, 60, 200);
			vision2 = new Rectangle(twox+20, twoy+50, 60, 200);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		else if(left2)
		{
			elength2 = 200;
			visionx2 = twox-150;
			if(twox <= 1150)
			{
				visionx2 = 1000;
				elength2 = twox-950;
			}
			g.fillRect(visionx2, twoy+20, elength2, 60);
			vision2 = new Rectangle(visionx2, twoy+20, elength2, 60);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		if(up3)
		{
			g.fillRect(threex+20, threey-150, 60, 200);
			vision3 = new Rectangle(threex+20, threey-150, 60, 200);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(right3)
		{
			elength3 = 200;
			if(threex >= 600)
				elength3 = 800-threex-50;
			g.fillRect(threex+50, threey+20, elength3, 60);
			vision3 = new Rectangle(threex+50, threey+20, elength3, 60);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(down3)
		{
			g.fillRect(threex+20, threey+50, 60, 200);
			vision3 = new Rectangle(threex+20, threey+50, 60, 200);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		else if(left3)
		{
			visionx3 = twox-150;
			elength3 = 200;
			if(threex <= 700)
			{
				visionx3 = 600;
				elength3 = threex-550;
			}
			g.fillRect(visionx3, threey+20, elength3, 60);
			vision3 = new Rectangle(visionx3, threey+20, elength3, 60);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		if(counter > 0)
		{
			player.x = deathx;
			player.y = deathy;
		}
		if(player.intersects(vision1)||player.intersects(vision2)||player.intersects(vision3))
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
		if(camera.intersects(player.x, player.y, 50, 50)&&lever == false)
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
	}
	public void level4(Graphics g)
	{
		//draws environment for level 4 and enemies
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		wall = new Rectangle(0, 100, 600, 200);
		wall2 = new Rectangle(500, 300, 100, 200);
		wall3 = new Rectangle(200, 400, 100, 400);
		wall4 = new Rectangle(1000, 0, 100, 600);
		sneakArea1 = new Rectangle(0, 99, 600, 1);
		sneakArea2 = new Rectangle(600, 100, 1, 400);
		sneakArea3 = new Rectangle(500, 500, 100, 1);
		sneakArea4 = new Rectangle(499, 300, 1, 200);
		sneakArea5 = new Rectangle(0, 300, 500, 1);
		sneakArea6 = new Rectangle(300, 400, 1, 400);
		sneakArea7 = new Rectangle(200, 399, 100, 1);
		sneakArea8 = new Rectangle(199, 400, 1, 400);
		sneakArea9 = new Rectangle(999, 0, 1, 600);
		sneakArea10 = new Rectangle(1000, 600, 100, 1);
		sneakArea11 = new Rectangle(1100, 0, 1, 600);
		g.fillRect(0, 100, 600, 200);
		g.fillRect(500, 300, 100, 200);
		g.fillRect(200, 400, 100, 400);
		g.fillRect(1000, 0, 100, 600);
		g.setColor(Color.BLACK);
		g.drawLine(0, 150, 550, 150);
		g.drawLine(0, 250, 550, 250);
		g.drawLine(600, 100, 550, 150);
		g.drawLine(550, 150, 550, 450);
		g.drawLine(500, 500, 550, 450);
		g.drawLine(600, 500, 550, 450);
		g.drawLine(550, 250, 500, 300);
		g.drawLine(200, 400, 250, 450);
		g.drawLine(300, 400, 250, 450);
		g.drawLine(250, 450, 250, 800);
		g.drawLine(1050, 0, 1050, 550);
		g.drawLine(1000, 600, 1050, 550);
		g.drawLine(1100, 600, 1050, 550);
		camera = new Ellipse2D.Double(500, 500, 300, 300); 
		camera2 = new Ellipse2D.Double(1100, 300, 300, 300); 
		if(lever)
			g.drawImage(leveron, 925, 25, 50, 50, null);
		else
		{
			g.setColor(Color.GREEN);
			g.fillOval(500, 500, 300, 300);
			g.drawImage(leveroff, 925, 25, 50, 50, null);
		}
		if(lever2)
			g.drawImage(leveron, 25, 725, 50, 50, null);
		else
		{
			g.setColor(Color.GREEN);
			g.fillOval(1100, 300, 300, 300);
			g.drawImage(leveroff, 25, 725, 50, 50, null);
		}
		g.drawImage(monsterRight, 525, 400, 50, 50, null);
		g.drawImage(monsterRight, 1025, 400, 50, 50, null);
		oneTimer.start();
		twoTimer.start();
		threeTimer.start();
		g.setColor(Color.YELLOW);
		//shows enemy1 vision
		if(up)
		{
			g.fillRect(onex+20, oney-150, 60, 200);
			vision1 = new Rectangle(onex+20, oney-150, 60, 200);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(right)
		{
			elength = 200;
			if(onex >= 750)
				elength = 1000-onex-50;
			g.fillRect(onex+50, oney+20, elength, 60);
			vision1 = new Rectangle(onex+50, oney+20, elength, 60);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(down)
		{
			g.fillRect(onex+20, oney+50, 60, 200);
			vision1 = new Rectangle(onex+20, oney+50, 60, 200);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		else if(left)
		{
			visionx = onex-150;
			elength = 200;
			if(onex <= 750)
			{
				visionx = 600;
				elength = onex-550;
			}
			g.fillRect(visionx, oney+20, elength, 60);
			vision1 = new Rectangle(visionx-150, oney+20, elength, 60);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		//shows enemy2 vision
		if(up2)
		{
			g.fillRect(twox+20, twoy-150, 60, 200);
			vision2 = new Rectangle(twox+20, twoy-150, 60, 200);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(right2)
		{
			g.fillRect(twox+50, twoy+20, 200, 60);
			vision2 = new Rectangle(twox+50, twoy+20, 200, 60);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(down2)
		{
			g.fillRect(twox+20, twoy+50, 60, 200);
			vision2 = new Rectangle(twox+20, twoy+50, 60, 200);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		else if(left2)
		{
			g.fillRect(twox-150, twoy+20, 200, 60);
			vision2 = new Rectangle(twox-150, twoy+20, 200, 60);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		if(up3)
		{
			visiony3 = threey-150;
			ewidth3 = 200;
			if(threey <= 450)
			{
				visiony3 = 300;
				ewidth3 = threey-250;
			}
			g.fillRect(threex+20, visiony3, 60, ewidth3);
			vision3 = new Rectangle(threex+20, visiony3, 60, ewidth3);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(right3)
		{
			elength3 = 200;
			if(threex >= 250)
				elength3 = 500-threex-50;
			g.fillRect(threex+50, threey+20, elength3, 60);
			vision3 = new Rectangle(threex+50, threey+20, elength3, 60);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(down3)
		{
			g.fillRect(threex+20, threey+50, 60, 200);
			vision3 = new Rectangle(threex+20, threey+50, 60, 200);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		else if(left3)
		{
			g.fillRect(threex-150, threey+20, 200, 60);
			vision3 = new Rectangle(threex-150, threey+20, 200, 60);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		if(counter > 0)
		{
			player.x = deathx;
			player.y = deathy;
		}
		if(player.intersects(vision1)||player.intersects(vision2))
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
		if(camera.intersects(player.x, player.y, 50, 50)&&lever == false)
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
		if(camera2.intersects(player.x, player.y, 50, 50)&&lever2 == false)
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
	}
	public void level5(Graphics g)
	{
		//draws environment for level 5 and enemies
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		wall = new Rectangle(100, 0, 100, 700);
		wall2 = new Rectangle(200, 300, 200, 100);
		wall3 = new Rectangle(300, 100, 200, 100);
		wall4 = new Rectangle(500, 0, 100, 500);
		wall5 = new Rectangle(600, 100, 100, 100);
		wall6 = new Rectangle(700, 300, 100, 100);
		wall7 = new Rectangle(800, 0, 100, 300);
		wall8 = new Rectangle(1000, 300, 100, 500);
		wall9 = new Rectangle(1200, 0, 100, 700);
		sneakArea1 = new Rectangle(99, 0, 1, 700);
		sneakArea2 = new Rectangle(100, 700, 100, 1);
		sneakArea3 = new Rectangle(200, 400, 1, 300);
		sneakArea4 = new Rectangle(200, 400, 200, 1);
		sneakArea5 = new Rectangle(400, 300, 1, 100);
		sneakArea6 = new Rectangle(200, 299, 200, 1);
		sneakArea7 = new Rectangle(200, 0, 1, 300);
		sneakArea8 = new Rectangle(499, 0, 1, 100);
		sneakArea9 = new Rectangle(300, 99, 200, 1);
		sneakArea10 = new Rectangle(299, 100, 1, 100);
		sneakArea11 = new Rectangle(300, 200, 200, 1);
		sneakArea12 = new Rectangle(499, 200, 1, 300);
		sneakArea13 = new Rectangle(500, 500, 100, 1);
		sneakArea14 = new Rectangle(600, 200, 1, 300);
		sneakArea15 = new Rectangle(600, 200, 100, 1);
		sneakArea16 = new Rectangle(700, 100, 1, 100);
		sneakArea17 = new Rectangle(600, 99, 100, 1);
		sneakArea18 = new Rectangle(600, 0, 1, 100);
		sneakArea19 = new Rectangle(799, 0, 1, 300);
		sneakArea20 = new Rectangle(700, 299, 100, 1);
		sneakArea21 = new Rectangle(699, 300, 1, 100);
		sneakArea22 = new Rectangle(700, 400, 200, 1);
		sneakArea23 = new Rectangle(900, 0, 1, 400);
		sneakArea24 = new Rectangle(999, 300, 1, 500);
		sneakArea25 = new Rectangle(1000, 299, 100, 1);
		sneakArea26 = new Rectangle(1100, 300, 1, 500);
		sneakArea27 = new Rectangle(1199, 0, 1, 700);
		sneakArea28 = new Rectangle(1200, 700, 100, 1);
		sneakArea29 = new Rectangle(1300, 0, 1, 700);
		g.fillRect(100, 0, 100, 700);
		g.fillRect(200, 300, 200, 100);
		g.fillRect(300, 100, 200, 100);
		g.fillRect(500, 0, 100, 500);
		g.fillRect(600, 100, 100, 100);
		g.fillRect(700, 300, 100, 100);
		g.fillRect(800, 0, 100, 400);
		g.fillRect(1000, 300, 100, 500);
		g.fillRect(1200, 0, 100, 700);
		g.setColor(Color.BLACK);
		g.drawLine(150, 0, 150, 650);
		g.drawLine(100, 700, 150, 650);
		g.drawLine(200, 700, 150, 650);
		g.drawLine(150, 350, 350, 350);
		g.drawLine(400, 300, 350, 350);
		g.drawLine(400, 400, 350, 350);
		g.drawLine(150, 350, 200, 300);
		g.drawLine(150, 350, 200, 400);
		g.drawLine(550, 0, 550, 450);
		g.drawLine(550, 150, 350, 150);
		g.drawLine(550, 150, 650, 150);
		g.drawLine(550, 450, 500, 500);
		g.drawLine(550, 450, 600, 500);
		g.drawLine(300, 100, 350, 150);
		g.drawLine(300, 200, 350, 150);
		g.drawLine(650, 150, 700, 100);
		g.drawLine(650, 150, 700, 200);
		g.drawLine(550, 150, 550, 100);
		g.drawLine(550, 150, 600, 100);
		g.drawLine(550, 150, 550, 200);
		g.drawLine(550, 150, 600, 200);
		g.drawLine(850, 0, 850, 350);
		g.drawLine(800, 300, 900, 400);
		g.drawLine(750, 350, 850, 350);
		g.drawLine(700, 300, 750, 350);
		g.drawLine(700, 400, 750, 350);
		g.drawLine(1050, 350, 1050, 800);
		g.drawLine(1000, 300, 1050, 350);
		g.drawLine(1100, 300, 1050, 350);
		g.drawLine(1250, 0, 1250, 650);
		g.drawLine(1200, 700, 1250, 650);
		g.drawLine(1300, 700, 1250, 650);
		camera = new Ellipse2D.Double(300, 500, 300, 300); 
		camera2 = new Ellipse2D.Double(900, 0, 300, 300); 
		if(lever)
			g.drawImage(leveron, 425, 25, 50, 50, null);
		else
		{
			g.setColor(Color.GREEN);
			g.fillOval(300, 500, 300, 300);
			g.drawImage(leveroff, 425, 25, 50, 50, null);
		}
		if(lever2)
			g.drawImage(leveron, 625, 25, 50, 50, null);
		else
		{
			g.setColor(Color.GREEN);
			g.fillOval(900, 0, 300, 300);
			g.drawImage(leveroff, 625, 25, 50, 50, null);
		}
		g.drawImage(monsterLeft, 525, 400, 50, 50, null);
		g.drawImage(monsterLeft, 1225, 100, 50, 50, null);
		oneTimer.start();
		twoTimer.start();
		threeTimer.start();
		g.setColor(Color.YELLOW);
		//shows enemy1 vision
		if(up)
		{
			visiony = oney-150;
			ewidth = 200;
			if(oney <= 650)
			{
				visiony = 500;
				ewidth = oney-450;
			}
			g.fillRect(onex+20, visiony, 60, ewidth);
			vision1 = new Rectangle(onex+20, visiony, 60, ewidth);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(right)
		{
			
			g.fillRect(onex+50, oney+20, 200, 60);
			vision1 = new Rectangle(onex+50, oney+20, 200, 60);
			g.drawImage(enemyRight, onex, oney, 100, 100, null);
		}
		else if(down)
		{
			g.fillRect(onex+20, oney+50, 60, 200);
			vision1 = new Rectangle(onex+20, oney+50, 60, 200);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		else if(left)
		{
			visionx = onex-150;
			elength = 200;
			if(onex <= 350)
			{
				visionx = 200;
				elength = onex-150;
			}
			g.fillRect(visionx, oney+20, elength, 60);
			vision1 = new Rectangle(visionx, oney+20, elength, 60);
			g.drawImage(enemyLeft, onex, oney, 100, 100, null);
		}
		//shows enemy2 vision
		if(up2)
		{
			g.fillRect(twox+20, twoy-150, 60, 200);
			vision2 = new Rectangle(twox+20, twoy-150, 60, 200);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(right2)
		{
			elength2 = 200;
			if(twox >= 750)
				elength2 = 1000-twox-50;
			g.fillRect(twox+50, twoy+20, elength2, 60);
			vision2 = new Rectangle(twox+50, twoy+20, elength2, 60);
			g.drawImage(enemyRight, twox, twoy, 100, 100, null);
		}
		else if(down2)
		{
			g.fillRect(twox+20, twoy+50, 60, 200);
			vision2 = new Rectangle(twox+20, twoy+50, 60, 200);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		else if(left2)
		{
			visionx2 = twox-150;
			elength2 = 200;
			if(twox <= 750)
			{
				visionx2 = 600;
				elength2 = twox-550;
			}
			g.fillRect(visionx2, twoy+20, elength2, 60);
			vision2 = new Rectangle(visionx2, twoy+20, elength2, 60);
			g.drawImage(enemyLeft, twox, twoy, 100, 100, null);
		}
		if(up3)
		{
			g.fillRect(threex+20, threey-150, 60, 200);
			vision3 = new Rectangle(threex+20, threey-150, 60, 200);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(right3)
		{
			g.fillRect(threex+50, threey+20, 200, 60);
			vision3 = new Rectangle(threex+50, threey+20, 200, 60);
			g.drawImage(enemyRight, threex, threey, 100, 100, null);
		}
		else if(down3)
		{
			g.fillRect(threex+20, threey+50, 60, 200);
			vision3 = new Rectangle(threex+20, threey+50, 60, 200);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		else if(left3)
		{
			visionx3 = threex-150; 
			elength3 = 200;
			if(threex <= 1250)
			{
				visionx3 = 1100;
				elength3 = threex-1050;
			}
			g.fillRect(visionx3, threey+20, elength3, 60);
			vision3 = new Rectangle(visionx3, threey+20, elength3, 60);
			g.drawImage(enemyLeft, threex, threey, 100, 100, null);
		}
		if(counter > 0)
		{
			player.x = deathx;
			player.y = deathy;
		}
		if(player.intersects(vision1)||player.intersects(vision2))
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
		if(camera.intersects(player.x, player.y, 50, 50)&&lever == false)
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
		if(camera2.intersects(player.x, player.y, 50, 50)&&lever2 == false)
		{
			if(counter == 0)
			{
				deathx = player.x;
				deathy = player.y;
			}
			counter++;
			oneTimer.stop();
			twoTimer.stop();
			threeTimer.stop();
			DeathScreen dead = new DeathScreen();
			dead.paintComponent(g);
		}
	}
	public void finish(Graphics g)
	{
		//draw final screen after beating the last level
		Image trophy = new ImageIcon("win.png").getImage();
		Image confetti = new ImageIcon("confetti.png").getImage();
		Font font = new Font("SANS_SERIF", Font.BOLD, 100);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1420, 840);
		g.drawImage(confetti, 0, 0, 1420, 840, null);
		g.drawImage(trophy, 500, 300, 400, 500, null);
		g.setColor(Color.BLACK);
		g.drawString("YOU WIN", 480, 200);
	}
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e)
	{
		//deals with the key inputs for movement and sneaking
		char c = e.getKeyChar();
		if((int)c == 32)
		{
			//deals with the sneak action and checks if the player is 
			//next to a wall so they can use the sneak function
			playerSneak = new Rectangle(player.x, player.y, 50, 50);
			if(fifth)
			{
				//checks if the player is next to a wall for level 5
				if(player.intersects(sneakArea1))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea2))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea3))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea4))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea5))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea6))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea7))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea8))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea9))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea10))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea11))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea12))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea13))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea14))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea15))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea16))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea17))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea18))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea19))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea20))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea21))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea22))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea23))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea24))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea25))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea26))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea27))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea28))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea29))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
			}
			else if(forth)
			{
				//checks if the player is next to a wall for level 4
				if(player.intersects(sneakArea1))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea2))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea3))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea4))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea5))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea6))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea7))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea8))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea9))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea10))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea11))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
			}
			else if(thrid)
			{
				//checks if the player is next to a wall for level 3
				if(player.intersects(sneakArea1))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea2))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else

						sneak = true;
				}
				else if(player.intersects(sneakArea3))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea4))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea5))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea6))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea7))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea8))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea9))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea10))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea11))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea12))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea13))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea14))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea15))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea16))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea17))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea18))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea19))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea20))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
			}
			else if(second)
			{
				//checks if the player is next to a wall for level 2
				if(player.intersects(sneakArea1))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea2))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea3))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea4))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea5))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea6))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea7))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea8))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea9))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea10))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea11))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea12))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea13))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea14))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea15))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea16))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea17))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea18))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea19))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea20))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea21))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea22))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea23))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea24))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea25))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea26))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea27))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea28))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea29))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea30))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				if(player.intersects(sneakArea31))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea32))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea33))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea34))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea35))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea36))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea37))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea38))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
			}
			else if(first)
			{
				//checks if the player is next to a wall for level 1
				if(player.intersects(sneakArea1))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea2))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea3))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea4))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea5))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				} 
				else if(player.intersects(sneakArea6))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea7))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea8))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
				else if(player.intersects(sneakArea9))
				{
					if(sneak)
					{
						sneak = false;
						playerSneak = new Rectangle(player.x, player.y, 50, 50);
					}
					else
						sneak = true;
				}
			}
		}
		if(sneak)
		{
			//if the player is in the sneak function it shows where the
			//player can move and by pressing enter you can move your 
			//character to the shown location
			sneakWall = new Rectangle(0, 0, 0, 0);
			sneakWall2 = new Rectangle(0, 0, 0, 0);
			sneakWall3 = new Rectangle(0, 0, 0, 0);
			sneakWall4 = new Rectangle(0, 0, 0, 0);
			sneakWall5 = new Rectangle(0, 0, 0, 0);
			sneakWall6 = new Rectangle(0, 0, 0, 0);
			sneakWall7 = new Rectangle(0, 0, 0, 0);
			sneakWall8 = new Rectangle(0, 0, 0, 0);
			sneakWall9 = new Rectangle(0, 0, 0, 0);
			//determines the walls that a player can move to when in the sneak function
			if(fifth)
			{
				//determines the walls for level 5 that a player can sneak to
				if(player.intersects(sneakArea1))
					sneakWall = new Rectangle(sneakArea1);
				else if(player.intersects(sneakArea2))
					sneakWall = new Rectangle(sneakArea2);
				else if(player.intersects(sneakArea3))
				{
					sneakWall = new Rectangle(sneakArea3);
					sneakWall2 = new Rectangle(sneakArea4);
				}
				else if(player.intersects(sneakArea4))
				{
					sneakWall = new Rectangle(sneakArea4);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea12);
				}
				else if(player.intersects(sneakArea5))
				{
					sneakWall = new Rectangle(sneakArea5);
					sneakWall2 = new Rectangle(sneakArea11);
					sneakWall3 = new Rectangle(sneakArea12);
				}
				else if(player.intersects(sneakArea6))
				{
					sneakWall = new Rectangle(sneakArea6);
					sneakWall2 = new Rectangle(sneakArea7);
					sneakWall3 = new Rectangle(sneakArea10);
					sneakWall4 = new Rectangle(sneakArea11);
					sneakWall5 = new Rectangle(sneakArea12);
				}
				else if(player.intersects(sneakArea7))
				{
					sneakWall = new Rectangle(sneakArea7);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea9);
					sneakWall4 = new Rectangle(sneakArea10);
					sneakWall5 = new Rectangle(sneakArea11);
				}
				else if(player.intersects(sneakArea8))
				{
					sneakWall = new Rectangle(sneakArea8);
					sneakWall2 = new Rectangle(sneakArea9);
				}
				else if(player.intersects(sneakArea9))
				{
					sneakWall = new Rectangle(sneakArea9);
					sneakWall2 = new Rectangle(sneakArea7);
					sneakWall3 = new Rectangle(sneakArea8);
				}
				else if(player.intersects(sneakArea10))
				{
					sneakWall = new Rectangle(sneakArea10);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea11))
				{
					sneakWall = new Rectangle(sneakArea11);
					sneakWall2 = new Rectangle(sneakArea5);
					sneakWall3 = new Rectangle(sneakArea6);
					sneakWall4 = new Rectangle(sneakArea7);
					sneakWall5 = new Rectangle(sneakArea12);
				}
				else if(player.intersects(sneakArea12))
				{
					sneakWall = new Rectangle(sneakArea12);
					sneakWall2 = new Rectangle(sneakArea4);
					sneakWall3 = new Rectangle(sneakArea5);
					sneakWall4 = new Rectangle(sneakArea6);
					sneakWall5 = new Rectangle(sneakArea11);
				}
				else if(player.intersects(sneakArea13))
					sneakWall = new Rectangle(sneakArea13);
				else if(player.intersects(sneakArea14))
				{
					sneakWall = new Rectangle(sneakArea14);
					sneakWall2 = new Rectangle(sneakArea15);
					sneakWall3 = new Rectangle(sneakArea19);
					sneakWall4 = new Rectangle(sneakArea20);
					sneakWall5 = new Rectangle(sneakArea21);
					sneakWall6 = new Rectangle(sneakArea22);
				}
				else if(player.intersects(sneakArea15))
				{
					sneakWall = new Rectangle(sneakArea15);
					sneakWall2 = new Rectangle(sneakArea14);
					sneakWall3 = new Rectangle(sneakArea19);
					sneakWall4 = new Rectangle(sneakArea21);
				}
				else if(player.intersects(sneakArea16))
				{
					sneakWall = new Rectangle(sneakArea16);
					sneakWall2 = new Rectangle(sneakArea19);
					sneakWall3 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea17))
				{
					sneakWall = new Rectangle(sneakArea17);
					sneakWall2 = new Rectangle(sneakArea18);
					sneakWall3 = new Rectangle(sneakArea19);
				}
				else if(player.intersects(sneakArea18))
				{
					sneakWall = new Rectangle(sneakArea18);
					sneakWall2 = new Rectangle(sneakArea17);
					sneakWall3 = new Rectangle(sneakArea19);
				}
				else if(player.intersects(sneakArea19))
				{
					sneakWall = new Rectangle(sneakArea19);
					sneakWall2 = new Rectangle(sneakArea14);
					sneakWall3 = new Rectangle(sneakArea15);
					sneakWall4 = new Rectangle(sneakArea16);
					sneakWall5 = new Rectangle(sneakArea17);
					sneakWall6 = new Rectangle(sneakArea18);
					sneakWall7 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea20))
				{
					sneakWall = new Rectangle(sneakArea20);
					sneakWall2 = new Rectangle(sneakArea14);
					sneakWall3 = new Rectangle(sneakArea16);
					sneakWall4 = new Rectangle(sneakArea19);
				}
				else if(player.intersects(sneakArea21))
				{
					sneakWall = new Rectangle(sneakArea21);
					sneakWall2 = new Rectangle(sneakArea14);
					sneakWall3 = new Rectangle(sneakArea15);
				}
				else if(player.intersects(sneakArea22))
				{
					sneakWall = new Rectangle(sneakArea22);
					sneakWall2 = new Rectangle(sneakArea14);
					sneakWall3 = new Rectangle(sneakArea24);
				}
				else if(player.intersects(sneakArea23))
				{
					sneakWall = new Rectangle(sneakArea23);
					sneakWall2 = new Rectangle(sneakArea24);
					sneakWall3 = new Rectangle(sneakArea25);
				}
				else if(player.intersects(sneakArea24))
				{
					sneakWall = new Rectangle(sneakArea24);
					sneakWall2 = new Rectangle(sneakArea22);
					sneakWall3 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea25))
				{
					sneakWall = new Rectangle(sneakArea25);
					sneakWall2 = new Rectangle(sneakArea23);
					sneakWall3 = new Rectangle(sneakArea27);
				}
				else if(player.intersects(sneakArea26))
				{
					sneakWall = new Rectangle(sneakArea26);
					sneakWall2 = new Rectangle(sneakArea27);
					sneakWall3 = new Rectangle(sneakArea28);
				}
				else if(player.intersects(sneakArea27))
				{
					sneakWall = new Rectangle(sneakArea27);
					sneakWall2 = new Rectangle(sneakArea25);
					sneakWall3 = new Rectangle(sneakArea26);
				}
				else if(player.intersects(sneakArea28))
				{
					sneakWall = new Rectangle(sneakArea28);
					sneakWall2 = new Rectangle(sneakArea26);
				}
				else if(player.intersects(sneakArea29))
					sneakWall = new Rectangle(sneakArea29);
			}
			else if(forth)
			{
				//determines the walls for level 4 that a player can sneak to
				if(player.intersects(sneakArea1))
					sneakWall = new Rectangle(sneakArea1);
				else if(player.intersects(sneakArea2))
					sneakWall = new Rectangle(sneakArea2);
				else if(player.intersects(sneakArea3))
				{
					sneakWall = new Rectangle(sneakArea3);
					sneakWall2 = new Rectangle(sneakArea6);
				}
				else if(player.intersects(sneakArea4))
				{
					sneakWall = new Rectangle(sneakArea4);
					sneakWall2 = new Rectangle(sneakArea5);
					sneakWall3 = new Rectangle(sneakArea6);
					sneakWall4 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea5))
				{
					sneakWall = new Rectangle(sneakArea5);
					sneakWall2 = new Rectangle(sneakArea4);
					sneakWall3 = new Rectangle(sneakArea6);
					sneakWall4 = new Rectangle(sneakArea7);
					sneakWall5 = new Rectangle(sneakArea8);
				}
				else if(player.intersects(sneakArea6))
				{
					sneakWall = new Rectangle(sneakArea6);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea4);
					sneakWall4 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea7))
				{
					sneakWall = new Rectangle(sneakArea7);
					sneakWall2 = new Rectangle(sneakArea4);
					sneakWall3 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea8))
				{
					sneakWall = new Rectangle(sneakArea8);
					sneakWall2 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea9))
					sneakWall = new Rectangle(sneakArea9);
				else if(player.intersects(sneakArea10))
					sneakWall = new Rectangle(sneakArea10);
				else if(player.intersects(sneakArea11))
					sneakWall = new Rectangle(sneakArea11);
			}
			else if(thrid)
			{
				//determines the walls for level 3 that a player can sneak to
				if(player.intersects(sneakArea1))
				{
					sneakWall = new Rectangle(sneakArea1);

				}
				else if(player.intersects(sneakArea2))
				{
					sneakWall = new Rectangle(sneakArea2);
					sneakWall2 = new Rectangle(sneakArea6);
				}
				else if(player.intersects(sneakArea3))
				{
					sneakWall = new Rectangle(sneakArea3);
					sneakWall2 = new Rectangle(sneakArea4);
				}
				else if(player.intersects(sneakArea4))
				{
					sneakWall = new Rectangle(sneakArea4);
					sneakWall2 = new Rectangle(sneakArea3);
				}
				else if(player.intersects(sneakArea5))
				{
					sneakWall = new Rectangle(sneakArea5);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea6))
				{
					sneakWall = new Rectangle(sneakArea6);
					sneakWall2 = new Rectangle(sneakArea2);
					sneakWall3 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea7))
				{
					sneakWall = new Rectangle(sneakArea7);
					sneakWall2 = new Rectangle(sneakArea5);
					sneakWall3 = new Rectangle(sneakArea11);
				}
				else if(player.intersects(sneakArea8))
				{
					sneakWall = new Rectangle(sneakArea8);
					sneakWall2 = new Rectangle(sneakArea9);
					sneakWall3 = new Rectangle(sneakArea12);
					sneakWall4 = new Rectangle(sneakArea13);
					sneakWall5 = new Rectangle(sneakArea15);
					sneakWall6 = new Rectangle(sneakArea16);
					sneakWall7 = new Rectangle(sneakArea17);
					sneakWall8 = new Rectangle(sneakArea19);
					sneakWall9 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea9))
				{
					sneakWall = new Rectangle(sneakArea9);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea15);
				}
				else if(player.intersects(sneakArea10))
				{
					sneakWall = new Rectangle(sneakArea10);
					sneakWall2 = new Rectangle(sneakArea14);
				}
				else if(player.intersects(sneakArea11))
				{
					sneakWall = new Rectangle(sneakArea11);
					sneakWall2 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea12))
				{
					sneakWall = new Rectangle(sneakArea12);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea16);
				}
				else if(player.intersects(sneakArea13))
				{
					sneakWall = new Rectangle(sneakArea13);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea19);
				}
				else if(player.intersects(sneakArea14))
				{
					sneakWall = new Rectangle(sneakArea14);
					sneakWall2 = new Rectangle(sneakArea10);
					sneakWall3 = new Rectangle(sneakArea18);
				}
				else if(player.intersects(sneakArea15))
				{
					sneakWall = new Rectangle(sneakArea15);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea9);
				}
				else if(player.intersects(sneakArea16))
				{
					sneakWall = new Rectangle(sneakArea16);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea12);
					sneakWall4 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea17))
				{
					sneakWall = new Rectangle(sneakArea17);
					sneakWall2 = new Rectangle(sneakArea8);
				}
				else if(player.intersects(sneakArea18))
				{
					sneakWall = new Rectangle(sneakArea18);
					sneakWall2 = new Rectangle(sneakArea14);
				}
				else if(player.intersects(sneakArea19))
				{
					sneakWall = new Rectangle(sneakArea19);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea13);
				}
				else if(player.intersects(sneakArea20))
				{
					sneakWall = new Rectangle(sneakArea20);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea16);
				}
			}
			else if(second)
			{
				//determines the walls for level 2 that a player can sneak to
				if(player.intersects(sneakArea1))
				{
					sneakWall = new Rectangle(sneakArea1);
					sneakWall2 = new Rectangle(sneakArea4);
				}
				else if(player.intersects(sneakArea2))
				{
					sneakWall = new Rectangle(sneakArea2);
					sneakWall2 = new Rectangle(sneakArea5);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea3))
				{
					sneakWall = new Rectangle(sneakArea3);
					sneakWall2 = new Rectangle(sneakArea15);
					sneakWall3 = new Rectangle(sneakArea16);
					sneakWall4 = new Rectangle(sneakArea18);
					sneakWall5 = new Rectangle(sneakArea8);
				}
				else if(player.intersects(sneakArea4))
				{
					sneakWall = new Rectangle(sneakArea4);
					sneakWall2 = new Rectangle(sneakArea1);
				}
				else if(player.intersects(sneakArea5))
				{
					sneakWall = new Rectangle(sneakArea5);
					sneakWall2 = new Rectangle(sneakArea2);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea6))
				{
					sneakWall = new Rectangle(sneakArea6);
					sneakWall2 = new Rectangle(sneakArea10);
					sneakWall3 = new Rectangle(sneakArea19);
					sneakWall4 = new Rectangle(sneakArea20);
					sneakWall5 =  new Rectangle(sneakArea22);
				}
				else if(player.intersects(sneakArea7))
				{
					sneakWall = new Rectangle(sneakArea7);
					sneakWall2 = new Rectangle(sneakArea2);
					sneakWall3 = new Rectangle(sneakArea5);
					sneakWall4 = new Rectangle(sneakArea15);
					sneakWall5 = new Rectangle(sneakArea19);
				}
				else if(player.intersects(sneakArea8))
				{
					sneakWall = new Rectangle(sneakArea8);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea12);
					sneakWall4 = new Rectangle(sneakArea18);
				}
				else if(player.intersects(sneakArea9))
				{
					sneakWall = new Rectangle(sneakArea9);
					sneakWall2 = new Rectangle(sneakArea11);
					sneakWall3 = new Rectangle(sneakArea18);
					sneakWall4 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea10))
				{
					sneakWall = new Rectangle(sneakArea10);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea14);
					sneakWall4 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea11))
				{
					sneakWall = new Rectangle(sneakArea11);
					sneakWall2 = new Rectangle(sneakArea9);
					sneakWall3 = new Rectangle(sneakArea18);
					sneakWall4 = new Rectangle(sneakArea20);
				}
				else if(player.intersects(sneakArea12))
				{
					sneakWall = new Rectangle(sneakArea12);
					sneakWall2 = new Rectangle(sneakArea8);
					sneakWall3 = new Rectangle(sneakArea18);
					sneakWall4 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea13))
				{
					sneakWall = new Rectangle(sneakArea13);
					sneakWall2 = new Rectangle(sneakArea17);
					sneakWall3 = new Rectangle(sneakArea21);
					sneakWall4 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea14))
				{
					sneakWall = new Rectangle(sneakArea14);
					sneakWall2 = new Rectangle(sneakArea10);
					sneakWall3 = new Rectangle(sneakArea20);
					sneakWall4 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea15))
				{
					sneakWall = new Rectangle(sneakArea15);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea16))
				{
					sneakWall = new Rectangle(sneakArea16);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea24);
				}
				else if(player.intersects(sneakArea17))
				{
					sneakWall = new Rectangle(sneakArea17);
					sneakWall2 = new Rectangle(sneakArea13);
					sneakWall3 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea18))
				{
					sneakWall = new Rectangle(sneakArea18);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea8);
					sneakWall4 = new Rectangle(sneakArea9);
					sneakWall5 = new Rectangle(sneakArea11);
					sneakWall6 = new Rectangle(sneakArea12);
					sneakWall7 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea19))
				{
					sneakWall = new Rectangle(sneakArea19);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea20))
				{
					sneakWall = new Rectangle(sneakArea20);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea9);
					sneakWall4 = new Rectangle(sneakArea10);
					sneakWall5 = new Rectangle(sneakArea11);
					sneakWall6 = new Rectangle(sneakArea14);
					sneakWall7 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea21))
				{
					sneakWall = new Rectangle(sneakArea21);
					sneakWall2 = new Rectangle(sneakArea13);
					sneakWall3 = new Rectangle(sneakArea23);
				}
				else if(player.intersects(sneakArea22))
				{
					sneakWall = new Rectangle(sneakArea22);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea26);
				}
				else if(player.intersects(sneakArea23))
				{
					sneakWall = new Rectangle(sneakArea23);
					sneakWall2 = new Rectangle(sneakArea12);
					sneakWall3 = new Rectangle(sneakArea13);
					sneakWall4 = new Rectangle(sneakArea14);
					sneakWall5 = new Rectangle(sneakArea17);
					sneakWall6 = new Rectangle(sneakArea18);
					sneakWall7 = new Rectangle(sneakArea20);
					sneakWall8 = new Rectangle(sneakArea21);
				}
				else if(player.intersects(sneakArea24))
				{
					sneakWall = new Rectangle(sneakArea24);
					sneakWall2 = new Rectangle(sneakArea16);
					sneakWall3 = new Rectangle(sneakArea27);
				}
				else if(player.intersects(sneakArea25))
				{
					sneakWall = new Rectangle(sneakArea25);
					sneakWall2 = new Rectangle(sneakArea27);
					sneakWall3 = new Rectangle(sneakArea28);
					sneakWall4 = new Rectangle(sneakArea30);
					sneakWall5 = new Rectangle(sneakArea31);
				}
				else if(player.intersects(sneakArea26))
				{
					sneakWall = new Rectangle(sneakArea26);
					sneakWall2 = new Rectangle(sneakArea22);
					sneakWall3 = new Rectangle(sneakArea30);
				}
				else if(player.intersects(sneakArea27))
				{
					sneakWall = new Rectangle(sneakArea27);
					sneakWall2 = new Rectangle(sneakArea24);
					sneakWall3 = new Rectangle(sneakArea25);
					sneakWall4 = new Rectangle(sneakArea30);
				}
				else if(player.intersects(sneakArea28))
				{
					sneakWall = new Rectangle(sneakArea28);
					sneakWall2 = new Rectangle(sneakArea25);
					sneakWall3 = new Rectangle(sneakArea31);
					sneakWall4 = new Rectangle(sneakArea33);
				}
				else if(player.intersects(sneakArea29))
				{
					sneakWall = new Rectangle(sneakArea29);
					sneakWall2 = new Rectangle(sneakArea32);
					sneakWall3 = new Rectangle(sneakArea33);
				}
				else if(player.intersects(sneakArea30))
				{
					sneakWall = new Rectangle(sneakArea30);
					sneakWall2 = new Rectangle(sneakArea25);
					sneakWall3 = new Rectangle(sneakArea26);
					sneakWall4 = new Rectangle(sneakArea27);
				}
				else if(player.intersects(sneakArea31))
				{
					sneakWall = new Rectangle(sneakArea31);
					sneakWall2 = new Rectangle(sneakArea25);
					sneakWall3 = new Rectangle(sneakArea28);
					sneakWall4 = new Rectangle(sneakArea33);
				}
				else if(player.intersects(sneakArea32))
				{
					sneakWall = new Rectangle(sneakArea32);
					sneakWall2 = new Rectangle(sneakArea29);
					sneakWall3 = new Rectangle(sneakArea33);
					sneakWall4 = new Rectangle(sneakArea34);
					sneakWall5 = new Rectangle(sneakArea36);
					sneakWall6 = new Rectangle(sneakArea37);
				}
				else if(player.intersects(sneakArea33))
				{
					sneakWall = new Rectangle(sneakArea33);
					sneakWall2 = new Rectangle(sneakArea28);
					sneakWall3 = new Rectangle(sneakArea29);
					sneakWall4 = new Rectangle(sneakArea31);
					sneakWall5 = new Rectangle(sneakArea32);
					sneakWall6 = new Rectangle(sneakArea36);
				}
				else if(player.intersects(sneakArea34))
				{
					sneakWall = new Rectangle(sneakArea34);
					sneakWall2 = new Rectangle(sneakArea32);
					sneakWall3 = new Rectangle(sneakArea37);
				}
				else if(player.intersects(sneakArea35))
				{
					sneakWall = new Rectangle(sneakArea35);
					sneakWall2 = new Rectangle(sneakArea38);
				}
				else if(player.intersects(sneakArea36))
				{
					sneakWall = new Rectangle(sneakArea36);
					sneakWall2 = new Rectangle(sneakArea32);
					sneakWall3 = new Rectangle(sneakArea33);
				}
				else if(player.intersects(sneakArea37))
				{
					sneakWall = new Rectangle(sneakArea37);
					sneakWall2 = new Rectangle(sneakArea32);
					sneakWall3 = new Rectangle(sneakArea34);
				}
				else if(player.intersects(sneakArea38))
				{
					sneakWall = new Rectangle(sneakArea38);
					sneakWall2 = new Rectangle(sneakArea35);
				}
			}
			else if(first)
			{
				//determines the walls for level 1 that a player can sneak to
				if(player.intersects(sneakArea1))
					sneakWall = new Rectangle(sneakArea1);
				else if(player.intersects(sneakArea2))
				{
					sneakWall = new Rectangle(sneakArea2);
					sneakWall2 = new Rectangle(sneakArea4);
				}
				else if(player.intersects(sneakArea3))
				{
					sneakWall = new Rectangle(sneakArea3);
					sneakWall2 = new Rectangle(sneakArea4);
					sneakWall3 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea4))
				{
					sneakWall = new Rectangle(sneakArea4);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea2);
				}
				else if(player.intersects(sneakArea5))
				{
					sneakWall = new Rectangle(sneakArea5);
					sneakWall2 = new Rectangle(sneakArea3);
					sneakWall3 = new Rectangle(sneakArea7);
				}
				else if(player.intersects(sneakArea6))
				{
					sneakWall = new Rectangle(sneakArea6);
					sneakWall2 = new Rectangle(sneakArea7);
					sneakWall3 = new Rectangle(sneakArea8);
				}
				else if(player.intersects(sneakArea7))
				{
					sneakWall = new Rectangle(sneakArea7);
					sneakWall2 = new Rectangle(sneakArea6);
					sneakWall3 = new Rectangle(sneakArea5);
				}
				else if(player.intersects(sneakArea8))
				{
					sneakWall = new Rectangle(sneakArea8);
					sneakWall2 = new Rectangle(sneakArea6);
				}
				else if(player.intersects(sneakArea9))
					sneakWall = new Rectangle(sneakArea9);
			}
			int code = e.getKeyCode();
			if(c == 'w')
			{
				//determines the place in which a player can move when in the sneak function
				playerSneak = new Rectangle(player.x, player.y-200, 50, 50);
				if(playerSneak.intersects(wall)||playerSneak.intersects(wall2)||playerSneak.intersects(wall3)||playerSneak.intersects(wall4)||
				playerSneak.intersects(wall5)||playerSneak.intersects(wall6)||playerSneak.intersects(wall7)||playerSneak.intersects(wall8)||
				playerSneak.intersects(wall9)||playerSneak.intersects(wall10)||playerSneak.intersects(wall11))
				{
					int distance = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance--;
						playerSneak = new Rectangle(player.x, player.y-distance, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x, playerSneak.y+49, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x, playerSneak.y+49, 50, 50);
					repaint();
				}
				else if(playerSneak.intersects(sneakWall))
				{
					if(playerSneak.y < sneakWall.y)
						playerSneak.y = sneakWall.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall2))
				{
					if(playerSneak.y < sneakWall2.y)
						playerSneak.y = sneakWall2.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall3))
				{
					if(playerSneak.y < sneakWall3.y)
						playerSneak.y = sneakWall3.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall4))
				{
					if(playerSneak.y < sneakWall4.y)
						playerSneak.y = sneakWall4.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall5))
				{
					if(playerSneak.y < sneakWall5.y)
						playerSneak.y = sneakWall5.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall6))
				{
					if(playerSneak.y < sneakWall6.y)
						playerSneak.y = sneakWall6.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall7))
				{
					if(playerSneak.y < sneakWall7.y)
						playerSneak.y = sneakWall7.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall8))
				{
					if(playerSneak.y < sneakWall8.y)
						playerSneak.y = sneakWall8.y;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall9))
				{
					if(playerSneak.y < sneakWall9.y)
						playerSneak.y = sneakWall9.y;
					repaint();
				}
				else
				{
					int distance2 = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance2--;
						playerSneak = new Rectangle(player.x, player.y-distance2, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x, playerSneak.y+49, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x, playerSneak.y+49, 50, 50);
					repaint();
				}
			}
			else if(c == 'a')
			{
				//determines the place in which a player can move when in the sneak function
				playerSneak = new Rectangle(player.x-200, player.y, 50, 50);
				if(playerSneak.intersects(wall)||playerSneak.intersects(wall2)||playerSneak.intersects(wall3)||playerSneak.intersects(wall4)||
				playerSneak.intersects(wall5)||playerSneak.intersects(wall6)||playerSneak.intersects(wall7)||playerSneak.intersects(wall8)||
				playerSneak.intersects(wall9)||playerSneak.intersects(wall10)||playerSneak.intersects(wall11))
				{
					int distance = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance--;
						playerSneak = new Rectangle(player.x-distance, player.y, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x+49, playerSneak.y, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x+49, playerSneak.y, 50, 50);
					repaint();
				}
				else if(playerSneak.intersects(sneakWall))
				{
					if(playerSneak.x < sneakWall.x)
						playerSneak.x = sneakWall.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall2))
				{
					if(playerSneak.x < sneakWall2.x)
						playerSneak.x = sneakWall2.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall3))
				{
					if(playerSneak.x < sneakWall3.x)
						playerSneak.x = sneakWall3.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall4))
				{
					if(playerSneak.x < sneakWall4.x)
						playerSneak.x = sneakWall4.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall5))
				{
					if(playerSneak.x < sneakWall5.x)
						playerSneak.x = sneakWall5.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall6))
				{
					if(playerSneak.x < sneakWall6.x)
						playerSneak.x = sneakWall6.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall7))
				{
					if(playerSneak.x < sneakWall7.x)
						playerSneak.x = sneakWall7.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall8))
				{
					if(playerSneak.x < sneakWall8.x)
						playerSneak.x = sneakWall8.x;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall9))
				{
					if(playerSneak.x < sneakWall9.x)
						playerSneak.x = sneakWall9.x;
					repaint();
				}
				else
				{
					int distance2 = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance2--;
						playerSneak = new Rectangle(player.x-distance2, player.y, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x+49, playerSneak.y, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x+49, playerSneak.y, 50, 50);
					repaint();
				}
			}
			else if(c == 's')
			{
				//determines the place in which a player can move when in the sneak function
				playerSneak = new Rectangle(player.x, player.y+200, 50, 50);
				if(playerSneak.intersects(wall)||playerSneak.intersects(wall2)||playerSneak.intersects(wall3)||playerSneak.intersects(wall4)||
				playerSneak.intersects(wall5)||playerSneak.intersects(wall6)||playerSneak.intersects(wall7)||playerSneak.intersects(wall8)||
				playerSneak.intersects(wall9)||playerSneak.intersects(wall10)||playerSneak.intersects(wall11))
				{
					int distance = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance--;
						playerSneak = new Rectangle(player.x, player.y+distance, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x, playerSneak.y-49, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x, playerSneak.y-49, 50, 50);
					repaint();
				}
				else if(playerSneak.intersects(sneakWall))
				{
					if(playerSneak.y > (sneakWall.y+sneakWall.height)-50)
						playerSneak.y = (sneakWall.y+sneakWall.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall2))
				{
					if(playerSneak.y > (sneakWall2.y+sneakWall2.height)-50)
						playerSneak.y = (sneakWall2.y+sneakWall2.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall3))
				{
					if(playerSneak.y > (sneakWall3.y+sneakWall3.height)-50)
						playerSneak.y = (sneakWall3.y+sneakWall3.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall4))
				{
					if(playerSneak.y > (sneakWall4.y+sneakWall4.height)-50)
						playerSneak.y = (sneakWall4.y+sneakWall4.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall5))
				{
					if(playerSneak.y > (sneakWall5.y+sneakWall5.height)-50)
						playerSneak.y = (sneakWall5.y+sneakWall5.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall6))
				{
					if(playerSneak.y > (sneakWall6.y+sneakWall6.height)-50)
						playerSneak.y = (sneakWall6.y+sneakWall6.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall7))
				{
					if(playerSneak.y > (sneakWall7.y+sneakWall7.height)-50)
						playerSneak.y = (sneakWall7.y+sneakWall7.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall8))
				{
					if(playerSneak.y > (sneakWall8.y+sneakWall8.height)-50)
						playerSneak.y = (sneakWall8.y+sneakWall8.height)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall9))
				{
					if(playerSneak.y > (sneakWall9.y+sneakWall9.height)-50)
						playerSneak.y = (sneakWall9.y+sneakWall9.height)-50;
					repaint();
				}
				else
				{
					int distance2 = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance2--;
						playerSneak = new Rectangle(player.x, player.y+distance2, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x, playerSneak.y-49, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x, playerSneak.y-49, 50, 50);
					repaint();
				}
			}
			else if(c == 'd')
			{
				//determines the place in which a player can move when in the sneak function
				playerSneak = new Rectangle(player.x+200, player.y, 50, 50); 
				if(playerSneak.intersects(wall)||playerSneak.intersects(wall2)||playerSneak.intersects(wall3)||playerSneak.intersects(wall4)||
				playerSneak.intersects(wall5)||playerSneak.intersects(wall6)||playerSneak.intersects(wall7)||playerSneak.intersects(wall8)||
				playerSneak.intersects(wall9)||playerSneak.intersects(wall10)||playerSneak.intersects(wall11))
				{
					int distance = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance--;
						playerSneak = new Rectangle(player.x+distance, player.y, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x-49, playerSneak.y, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x-49, playerSneak.y, 50, 50);
					repaint();
				}
				else if(playerSneak.intersects(sneakWall))
				{
					if(playerSneak.x > (sneakWall.x+sneakWall.width)-50)
						playerSneak.x = (sneakWall.x+sneakWall.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall2))
				{
					if(playerSneak.x > (sneakWall2.x+sneakWall2.width)-50)
						playerSneak.x = (sneakWall2.x+sneakWall2.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall3))
				{
					if(playerSneak.x > (sneakWall3.x+sneakWall3.width)-50)
						playerSneak.x = (sneakWall3.x+sneakWall3.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall4))
				{
					if(playerSneak.x > (sneakWall4.x+sneakWall4.width)-50)
						playerSneak.x = (sneakWall4.x+sneakWall4.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall5))
				{
					if(playerSneak.x > (sneakWall5.x+sneakWall5.width)-50)
						playerSneak.x = (sneakWall5.x+sneakWall5.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall6))
				{
					if(playerSneak.x > (sneakWall6.x+sneakWall6.width)-50)
						playerSneak.x = (sneakWall6.x+sneakWall6.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall7))
				{
					if(playerSneak.x > (sneakWall7.x+sneakWall7.width)-50)
						playerSneak.x = (sneakWall7.x+sneakWall7.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall8))
				{
					if(playerSneak.x > (sneakWall8.x+sneakWall8.width)-50)
						playerSneak.x = (sneakWall8.x+sneakWall8.width)-50;
					repaint();
				}
				else if(playerSneak.intersects(sneakWall9))
				{
					if(playerSneak.x > (sneakWall9.x+sneakWall9.width)-50)
						playerSneak.x = (sneakWall9.x+sneakWall9.width)-50;
					repaint();
				}
				else
				{
					int distance2 = 200;
					while(playerSneak.intersects(sneakWall) == false&&playerSneak.intersects(sneakWall2) == false&&playerSneak.intersects(sneakWall3) == false&&
					playerSneak.intersects(sneakWall4) == false&&playerSneak.intersects(sneakWall5) == false&&playerSneak.intersects(sneakWall6) == false&&
					playerSneak.intersects(sneakWall7) == false&&playerSneak.intersects(sneakWall8) == false&&playerSneak.intersects(sneakWall9) == false)
					{
						distance2--;
						playerSneak = new Rectangle(player.x+distance2, player.y, 50, 50);
					}
					if(playerSneak.intersects(sneakWall))
					{
						if(playerSneak.contains(player)||playerSneak.intersects(player))
							playerSneak = new Rectangle(player.x, player.y, 50, 50);
						else
							playerSneak = new Rectangle(playerSneak.x-49, playerSneak.y, 50, 50);
					}
					else if(playerSneak.intersects(sneakWall2)||playerSneak.intersects(sneakWall3)||playerSneak.intersects(sneakWall4)||
					playerSneak.intersects(sneakWall5)||playerSneak.intersects(sneakWall6)||playerSneak.intersects(sneakWall7)||
					playerSneak.intersects(sneakWall8)||playerSneak.intersects(sneakWall9))
						playerSneak = new Rectangle(playerSneak.x-49, playerSneak.y, 50, 50);
					repaint();
				}
			}
			if(code == 10)
			{
				//moves the player to the highted location
				player.x = playerSneak.x;
				player.y = playerSneak.y;
			}
		}
		else if(sneak == false)
		{
			//deals with the movement of the player when they are not
			//sneaking and stopping them from leaving the frame
			if(c == 'w')
				player.y-=10;
			if(c == 'a')
			{
				player.x-=10;
				pLeft = true;
				pRight = false;
			}
			if(c == 's')
				player.y+=10;
			if(c == 'd')
			{
				player.x+=10;
				pRight = true;
				pLeft = false;
			}
			if(player.x <= 0)
				player.x = 0;
			if(player.x >= 1350)
				player.x = 1350;
			if(player.y <= 0)
				player.y = 0;
			if(player.y >= 750)
				player.y = 750;
		}
		if(fifth)
		{
			//checks if the player is within a wall in level 5 and then
			//if the player is in a wall moves the player back onto the path
			if(player.intersects(wall))
			{
				if(player.x == 55||player.x == 60)
					player.x = 50;
				else if(player.x == 195||player.x == 190)
					player.x = 200;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall2))
			{
				if(player.x == 395||player.x == 390)
					player.x = 400;
				else if(player.y == 260)
					player.y = 250;
				else if(player.y == 390)
					player.y = 400;
			}
			else if(player.intersects(wall3))
			{
				if(player.x == 255||player.x == 260)
					player.x = 250;
				else if(player.y == 60)
					player.y = 50;
				else if(player.y == 190)
					player.y = 200;
			}
			else if(player.intersects(wall4))
			{
				if(player.x == 455||player.x == 460)
					player.x = 450;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 490)
					player.y = 500;
			}
			else if(player.intersects(wall5))
			{
				if(player.x == 695||player.x == 690)
					player.x = 700;
				else if(player.y == 60)
					player.y = 50;
				else if(player.y == 190)
					player.y = 200;
			}
			else if(player.intersects(wall6))
			{
				if(player.x == 655||player.x == 660)
					player.x = 650;
				else if(player.x == 895||player.x == 890)
					player.x = 900;
				else if(player.y == 390)
					player.y = 400;
				else if(player.y == 260)
					player.y = 250;
			}
			else if(player.intersects(wall7))
			{
				if(player.x == 755||player.x == 760)
					player.x = 750;
				else if(player.x == 895||player.x == 890)
					player.x = 900;
			}
			else if(player.intersects(wall8))
			{
				if(player.x == 955||player.x == 960)
					player.x = 950;
				else if(player.x == 1095||player.x == 1090)
					player.x = 1100;
				else if(player.y == 260)
					player.y = 250;
			}
			else if(player.intersects(wall9))
			{
				if(player.x == 1155||player.x == 1160)
					player.x = 1150;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(425, 25, 50, 50))
				lever = true;
			else if(player.intersects(625, 25, 50, 50))
				lever2 = true;
			else if(end.contains(player))
			{
				fifth = false;
				win = true;
				oneTimer.stop();
				twoTimer.stop();
				threeTimer.stop();
			}
		}
		else if(forth)
		{
			//checks if the player is within a wall in level 4 and then
			//if the player is in a wall moves the player back onto the path
			if(player.intersects(wall))
			{
				if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 60)
					player.y = 50;
				else if(player.y == 290)
					player.y = 300;
			}
			else if(player.intersects(wall2))
			{
				if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.x == 455||player.x == 460)
					player.x = 450;
				else if(player.y == 490)
					player.y = 500;
			}
			else if(player.intersects(wall3))
			{
				if(player.x == 155||player.x == 160)
				 	player.x = 150;
				else if(player.x == 295||player.x == 290)
					player.x = 300;
				else if(player.y == 360)
					player.y = 350;
			}
			else if(player.intersects(wall4))
			{
				if(player.x == 955||player.x == 960)
					player.x = 950;
				else if(player.x == 1095||player.x == 1090)
					player.x = 1100;
				else if(player.y == 590)
					player.y = 600;
			}
			else if(player.intersects(925, 25, 50, 50))
				lever = true;
			else if(player.intersects(25, 725, 50, 50))
				lever2 = true;
			else if(end.contains(player))
			{
				forth = false;
				fifth = true;
				player.x = 25;
				player.y = 10;
				onex = 200;
				oney = 500;
				twox = 900;
				twoy = 400;
				threex = 1300;
				threey = 100;
				down = left2 = down3 = true;
				right = up = left = down2 = right2 = up2 = right3 = left3 = up3 = false;
				lever = lever2 = false;
				oneTimer.stop();
				twoTimer.stop();
				threeTimer.stop();
			}
		}
		else if(thrid)
		{
			//checks if the player is within a wall in level 3 and then
			//if the player is in a wall moves the player back onto the path
			if(player.intersects(wall))
			{
				if(player.x == 55||player.x == 60)
					player.x = 50;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 260)
					player.y = 250;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall2))
			{
				if(player.x == 455||player.x == 460)
					player.x = 450;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
			}
			else if(player.intersects(wall3))
			{
				if(player.x == 755||player.x == 760)
					player.x = 750;
				else if(player.x == 995||player.x == 990)
					player.x = 1000;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall4))
			{
				if(player.x == 1055||player.x == 1060)
					player.x = 1050;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 560)
					player.y = 550;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall5))
			{
				if(player.x == 1055||player.x == 1060)
					player.x = 1050;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 360)
					player.y = 350;
				else if(player.y == 490)
					player.y = 500;
			}
			else if(player.intersects(wall6))
			{
				if(player.x == 1055||player.x == 1060)
					player.x = 1050;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 160)
					player.y = 150;
				else if(player.y == 290)
					player.y = 300;
			}
			else if(player.intersects(425, 725, 50, 50))
				lever = true;
			else if(end.contains(player))
			{
				thrid = false;
				forth = true;
				player.x = 25;
				player.y = 10;
				onex = 600;
				oney = 100;
				twox = 800;
				twoy = 600;
				threex = 350;
				threey = 700;
				right = right2 = up3 = true;
				up = left = down = up2 = left2 = down2 = right3 = left3 = down3 = false;
				lever = false;
				oneTimer.stop();
				twoTimer.stop();
				threeTimer.stop();
			}
		}
		else if(second)
		{
			//checks if the player is within a wall in level 2 and then
			//if the player is in a wall moves the player back onto the path
			if(player.intersects(wall))
			{
				if(player.x == 55||player.x == 60)
					player.x = 50;
				else if(player.x == 195||player.x == 190)
					player.x = 200;
				else if(player.y == 290)
					player.y = 300;
			}
			else if(player.intersects(wall2))
			{
				if(player.x == 55||player.x == 60)
					player.x = 50;
				else if(player.x == 195||player.x == 190)
					player.x = 200;
				else if(player.y == 460)
					player.y = 450;
			}
			else if(player.intersects(wall3))
			{
				if(player.x == 255||player.x == 260)
					player.x = 250;
				else if(player.x == 395||player.x == 390)
					player.x = 400;
				else if(player.y == 260)
					player.y = 250;
				else if(player.y == 490)
					player.y = 500;
			}
			else if(player.intersects(wall4))
			{
				if(player.x == 455||player.x == 460)
					player.x = 450;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 260)
					player.y = 250;
				else if(player.y == 490)
					player.y = 500;
			}
			else if(player.intersects(wall5))
			{
				if(player.x == 255||player.x == 260)
					player.x = 250;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 60)
					player.y = 50;
				else if(player.y == 190)
					player.y = 200;
			}
			else if(player.intersects(wall6))
			{
				if(player.x == 255||player.x == 260)
					player.x = 250;
				else if(player.x == 595||player.x == 590)
					player.x = 600;
				else if(player.y == 560)
					player.y = 550;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall7))
			{
				if(player.x == 655||player.x == 660)
					player.x = 650;
				else if(player.x == 895||player.x == 890)
					player.x = 900;
				else if(player.y == 60)
					player.y = 50;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(player.intersects(wall8))
			{
				if(player.x == 955||player.x == 960)
					player.x = 950;
				else if(player.x == 1095||player.x == 1090)
					player.x = 1100;
				else if(player.y == 190)
					player.y = 200;
			}
			else if(player.intersects(wall9))
			{
				if(player.x == 955||player.x == 960)
					player.x = 950;
				else if(player.x == 1095||player.x == 1090)
					player.x = 1100;
				else if(player.y == 260)
					player.y = 250;
			}
			else if(player.intersects(wall10))
			{
				if(player.x == 1155||player.x == 1160)
					player.x = 1150;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 590)
					player.y = 600;
			}
			else if(player.intersects(wall11))
			{
				if(player.x == 1155||player.x == 1160)
					player.x = 1150;
				else if(player.x == 1295||player.x == 1290)
					player.x = 1300;
				else if(player.y == 660)
					player.y = 650;
			}
			else if(end.contains(player))
			{
				second = false;
				thrid = true;
				player.x = 25;
				player.y = 10;
				onex = 1300;
				oney = 700;
				twox = 1000;
				twoy = 100;
				threex = 600;
				threey = 200;
				right = left2 = up3 = true;
				up = left = down = up2 = right2 = down2 = right3 = left3 = down3 = false;
				oneTimer.stop();
				twoTimer.stop();
				threeTimer.stop();	
			}
		}
		else if(first)
		{
			//checks if the player is within a wall in level 1 and then
			//if the player is in a wall moves the player back onto the path
			if(player.intersects(wall))
			{
				//Deals with interactions between wall and the player for level 1(one)
				if(player.x == 55 || player.x == 60)
					player.x = 50;
				else if(player.x == 295 || player.x == 290)
					player.x = 300;
				else if(player.y == 690)
					player.y = 700;

			}
			else if(player.intersects(wall2))
			{
				//deals with interactions between wall2 and the player for level 1(one)
				if(player.x == 455||player.x == 460)
					player.x = 450;
				else if(player.x == 695||player.x == 690)
					player.x = 700;
				else if(player.y == 60)
					player.y = 50;
			}
			else if(player.intersects(wall3))
			{
				//deals with interactions between wall3 and the player for level 1(one)
				if(player.x == 855||player.x == 860)
					player.x = 850;
				else if(player.x == 1095||player.x == 1090)
					player.x = 1100;
				else if(player.y == 690)
					player.y = 700;
			}
			else if(end.contains(player))
			{
				//deals if the player reaches the end
				first = false;
				second = true;
				player.x = 25;
				player.y = 10;
				onex = 200;
				oney = 300;
				twox = 600;
				twoy = 200;
				threex = 900;
				threey = 500;
				up = up2 = down3 = true;
				left = right = down = left2 = right2 = down2 = up3 = left3 = right3 = false;
				oneTimer.stop();
				twoTimer.stop();
				threeTimer.stop();	
			}
		}
		//System.out.println(player.x+" "+player.y);
		repaint();
	}
	public void keyReleased(KeyEvent e){}
}

class PlayerInstructions1 extends JPanel
{
	//Draws instructions and animation for panel 1 of the player instructions
	Timer Animation;
	boolean down, up, right, sneak, square;
	String prules, prules2, prules3, prules4, prules5;
	int playerx, playery;
	public PlayerInstructions1()
	{
		//initilize variables 
		setBackground(Color.GRAY);
		playerx = 25;
		playery = 10;
		down = true;
		right = up = sneak = square = false;
		prules = "Use WASD To";
		prules2 = "move the player";
		prules3 = "around the level";
		
		PlayerAnimation animation = new PlayerAnimation();
		Animation = new Timer(5, animation);
	}
	class PlayerAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(down)
			{
				if(playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 1325||playerx == 1025)
				{
					right = false;
					up = true;
				}
				playerx++;
			}
			else if(up)
			{
				if(playery == 0)
				{
					down = true;
					up = false;
					playerx = 25;
					playery = 0;
				}
				else if(playery == 125)
				{
					up = false;
					right = true;
				}
				playery--;
			}
			requestFocus();
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		Image playerWalk = new ImageIcon("WalkRight.gif").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 800, 600);
		g.fillRect(1100, 200, 200, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(250, 550, 950, 550);
		g.drawLine(950, 550, 1000, 600);
		g.drawLine(950, 0, 950, 550);
		g.drawLine(1150, 250, 1150, 800);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1250, 250, 1250, 800);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		Animation.start();
		g.drawString(prules, 250, 100);
		g.drawString(prules2, 250, 200);
		g.drawString(prules3, 250, 300);
		g.drawImage(playerWalk, playerx, playery, 50, 50, null);
	}
}
class PlayerInstructions2 extends JPanel
{
	//Draws instructions and animation for panel 2 of the player instructions
	Timer Animation, sneaking;
	boolean down, up, right, change;
	String prules, prules2, prules3, prules4, prules5;
	int playerx, playery, counter;
	public PlayerInstructions2()
	{
		//draws the text and environment onto the panel
		setBackground(Color.GRAY);
		playerx = 25;
		playery = 10;
		down = true;
		right = up = change = false;
		prules = "Press space";
		prules2 = "next to a wall";
		prules3 = "to sneak by it";
		
		PlayerAnimation animation = new PlayerAnimation();
		Animation = new Timer(5, animation);
		PlayerSneaked buffer = new PlayerSneaked();
		sneaking = new Timer(1500, buffer);
	}
	class PlayerAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			counter = 0;
			if(down)
			{
				if(playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 525)
				{
					right = false;
					up = true;
				}
				playerx++;
			}
			else if(up)
			{
				if(playery == 600)
				{
					up = false;
					down = true;
					change = true;
					playery = 550;
				}
				playery--;
			}
			requestFocus();
			repaint();
		}
	}
	class PlayerSneaked implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(counter == 1)
			{
				change = false;
				playerx = 25;
				playery = 10;
			}
			counter++;
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		Image playerWalk = new ImageIcon("WalkRight.gif").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 800, 600);
		g.fillRect(1100, 200, 200, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(250, 550, 950, 550);
		g.drawLine(950, 550, 1000, 600);
		g.drawLine(950, 0, 950, 550);
		g.drawLine(1150, 250, 1150, 800);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1250, 250, 1250, 800);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		g.setColor(Color.BLACK);
		if(change)
		{
			Animation.stop();
			sneaking.start();
		}
		else
		{
			sneaking.stop();
			Animation.start();
		}
		g.drawString(prules, 250, 100);
		g.drawString(prules2, 250, 200);
		g.drawString(prules3, 250, 300);
		g.drawImage(playerWalk, playerx, playery, 50, 50, null);
	}
}
class PlayerInstructions3 extends JPanel
{
	//Draws instructions and animation for panel 3 of the player instructions
	Timer Animation, sneakMove;
	boolean down, up, right, change, square;
	String prules, prules2, prules3, prules4, prules5;
	int playerx, playery, counter;
	public PlayerInstructions3()
	{
		//initilize variables 
		setBackground(Color.GRAY);
		playerx = 25;
		playery = 10;
		down = true;
		right = up = change = square = false;
		prules = "Press WASD to";
		prules2 = "highlight an";
		prules3 = "area where the";
		prules4 = "player can";
		prules5 = "travel to";
		
		PlayerAnimation animation = new PlayerAnimation();
		Animation = new Timer(5, animation);
		PlayerSneakMove move = new PlayerSneakMove();
		sneakMove = new Timer(1000, move);
	}
	class PlayerAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			square = false;
			counter = 0;
			if(down)
			{
				if(playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 525)
				{
					right = false;
					up = true;
				}
				playerx++;
			}
			else if(up)
			{
				if(playery == 600)
				{
					up = false;
					change = down = true;
					playery = 550;
				}
				playery--;
			}
			requestFocus();
			repaint();
		}
	}
	class PlayerSneakMove implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(counter == 1)
				square = true;
			else if(counter == 2)
				playerx = 725;
			else if(counter == 3)
			{
				change = false;
				playerx = 25;
				playery = 10;
			}
			counter++;
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		Image playerWalk = new ImageIcon("WalkRight.gif").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 800, 600);
		g.fillRect(1100, 200, 200, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(250, 550, 950, 550);
		g.drawLine(950, 550, 1000, 600);
		g.drawLine(950, 0, 950, 550);
		g.drawLine(1150, 250, 1150, 800);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1250, 250, 1250, 800);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		if(change)
		{
			Animation.stop();
			sneakMove.start();
		}
		else
		{
			sneakMove.stop();
			Animation.start();
		}
		g.drawString(prules, 250, 100);
		g.drawString(prules2, 250, 200);
		g.drawString(prules3, 250, 300);
		g.drawString(prules4, 250, 400);
		g.drawString(prules5, 250, 500);
		if(square)
		{
			g.setColor(Color.YELLOW);
			g.fillRect(725, 550, 50, 50);
		}
		g.drawImage(playerWalk, playerx, playery, 50, 50, null);
	}
}
class EnemyInstructions1 extends JPanel
{
	//Draws instructions and animation for panel 1 of the enemy instructions
	int enemyx, enemyy;
	Image enemyRight, enemyLeft;
	boolean left, right;
	Timer enemyMove;
	String eRule, eRule2, eRule3;
	public EnemyInstructions1()
	{
		//paints background
		enemyx = 1000;
		enemyy = 650;
		enemyRight = new ImageIcon("enemyRight.gif").getImage();
		enemyLeft = new ImageIcon("enemyLeft.gif").getImage();
		left = true;
		right = false;
		eRule = "Enemies move";
		eRule2 = "on a set path";
		eRule3 = "around the level";
		
		EnemyAnimation animate = new EnemyAnimation();
		enemyMove = new Timer(5, animate);
	}
	class EnemyAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(left)
			{
				if(enemyx == 25)
				{
					left = false;
					right = true;
				}
				enemyx--;
			}
			else if(right)
			{
				if(enemyx == 1000)
				{
					right = false;
					left = true;
				}
				enemyx++;
			}
			repaint();
			requestFocus();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 800, 600);
		g.fillRect(1100, 200, 200, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(250, 550, 950, 550);
		g.drawLine(950, 550, 1000, 600);
		g.drawLine(950, 0, 950, 550);
		g.drawLine(1150, 250, 1150, 800);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1250, 250, 1250, 800);
		enemyMove.start();
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		g.drawString(eRule, 250, 100);
		g.drawString(eRule2, 250, 200);
		g.drawString(eRule3, 250, 300);
		if(left)
			g.drawImage(enemyLeft, enemyx, enemyy, 100, 100, null);
		else if(right)
			g.drawImage(enemyRight, enemyx, enemyy, 100, 100, null);
	}
}
class EnemyInstruction2 extends JPanel
{
	//Draws instructions and animation for panel 2 of the enemy instructions
	int enemyx, enemyy;
	Image enemyRight, enemyLeft;
	boolean left, right;
	Timer enemyMove;
	String eRule, eRule2, eRule3, eRule4;
	public EnemyInstruction2()
	{
		enemyx = 1000;
		enemyy = 650;
		enemyRight = new ImageIcon("enemyRight.gif").getImage();
		enemyLeft = new ImageIcon("enemyLeft.gif").getImage();
		left = true;
		right = false;
		eRule = "The enemy has";
		eRule2 = "a yellow block";
		eRule3 = "infront of them";
		eRule4 = "to show vision";
		
		EnemyAnimation animate = new EnemyAnimation();
		enemyMove = new Timer(5, animate);
	}
	class EnemyAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(left)
			{
				if(enemyx == 25)
				{
					left = false;
					right = true;
				}
				enemyx--;
			}
			else if(right)
			{
				if(enemyx == 1000)
				{
					right = false;
					left = true;
				}
				enemyx++;
			}
			repaint();
			requestFocus();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 800, 600);
		g.fillRect(1100, 200, 200, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(250, 550, 950, 550);
		g.drawLine(950, 550, 1000, 600);
		g.drawLine(950, 0, 950, 550);
		g.drawLine(1150, 250, 1150, 800);
		g.drawLine(1100, 200, 1150, 250);
		g.drawLine(1300, 200, 1250, 250);
		g.drawLine(1150, 250, 1250, 250);
		g.drawLine(1250, 250, 1250, 800);
		enemyMove.start();
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		g.drawString(eRule, 250, 100);
		g.drawString(eRule2, 250, 200);
		g.drawString(eRule3, 250, 300);
		g.drawString(eRule4, 250, 400);
		g.setColor(Color.YELLOW);
		if(left)
		{
			g.fillRect(enemyx-150, enemyy+20, 200, 60);
			g.drawImage(enemyLeft, enemyx, enemyy, 100, 100, null);
		}
		else if(right)
		{
			g.fillRect(enemyx+50, enemyy+20, 200, 60);
			g.drawImage(enemyRight, enemyx, enemyy, 100, 100, null);
		}
	}
}
class EnemyInstruction3 extends JPanel
{
	//Draws instructions and animation for panel 3 of the enemy instructions
	int enemyx, enemyy, playerx, playery, counter;
	Image enemyRight, enemyLeft, playerWalk;
	boolean down, right, endScreen;
	Timer enemyMove, end;
	String eRule, eRule2, eRule3, eRule4, eRule5;
	public EnemyInstruction3()
	{
		enemyx = 1000;
		enemyy = 650;
		playerx = 25;
		playery = 10;
		enemyRight = new ImageIcon("enemyRight.gif").getImage();
		enemyLeft = new ImageIcon("enemyLeft.gif").getImage();
		playerWalk = new ImageIcon("WalkRight.gif").getImage();
		down = true;
		right = endScreen = false;
		eRule = "If the player is";
		eRule2 = "in the enemies";
		eRule3 = "vision the player";
		eRule4 = "loses and the";
		eRule5 = "game ends";
		
		EnemyAnimation animate = new EnemyAnimation();
		enemyMove = new Timer(5, animate);
		GameEnd screen = new GameEnd();
		end = new Timer(1500, screen);
	}
	class EnemyAnimation implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			counter = 0;
			enemyx--;
			if(down)
			{
				if(playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 100)
				{
					right = false;
					down = true;
					endScreen = true;
				}
				playerx++;
			}
			repaint();
			requestFocus();
		}
	}
	class GameEnd implements ActionListener
	{
		//creates end screen for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(counter == 1)
				endScreen = false;
			enemyx = 1000;
			enemyy = 650;
			playerx = 25;
			playery = 10;
			counter++;
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		if(endScreen)
		{
			enemyMove.stop();
			end.start();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 1420, 840);
			g.setColor(Color.BLACK);
			Font dead = new Font("SANS_SERIF", Font.PLAIN, 40);
			g.setFont(dead);
			g.drawString("YOU DIED", 600, 420);
		}
		else
		{
			Image floor = new ImageIcon("StoneFloor.jpg").getImage();
			g.drawImage(floor, 0, 0, 710, 420, null);
			g.drawImage(floor, 710, 0, 710, 420, null);
			g.drawImage(floor, 0, 420, 710, 420, null);
			g.drawImage(floor, 710, 420, 710, 420, null);
			Color color = new Color(92, 32, 32);
			g.setColor(color);
			g.fillRect(200, 0, 800, 600);
			g.fillRect(1100, 200, 200, 600);
			g.setColor(Color.BLACK);
			g.drawLine(250, 0, 250, 550);
			g.drawLine(200, 600, 250, 550);
			g.drawLine(250, 550, 950, 550);
			g.drawLine(950, 550, 1000, 600);
			g.drawLine(950, 0, 950, 550);
			g.drawLine(1150, 250, 1150, 800);
			g.drawLine(1100, 200, 1150, 250);
			g.drawLine(1300, 200, 1250, 250);
			g.drawLine(1150, 250, 1250, 250);
			g.drawLine(1250, 250, 1250, 800);
			Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
			g.setFont(font);
			end.stop();
			enemyMove.start();
			g.drawString(eRule, 250, 100);
			g.drawString(eRule2, 250, 200);
			g.drawString(eRule3, 250, 300);
			g.drawString(eRule4, 250, 400);
			g.drawString(eRule5, 250, 500);
			g.setColor(Color.YELLOW);
			g.fillRect(enemyx-150, enemyy+20, 200, 60);
			g.drawImage(enemyLeft, enemyx, enemyy, 100, 100, null);
			g.drawImage(playerWalk, playerx, playery, 50, 50, null);
		}
	}
}
class CameraInstructions extends JPanel
{
	//Draws instructions and animation for panel 1 of the monster instruction
	public CameraInstructions()
	{
		//paints background
		setBackground(Color.GRAY);
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		Image monsterRight = new ImageIcon("enemy14.gif").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(Color.GREEN);
		g.fillOval(1100, 200, 300, 300);
		g.setColor(color);
		g.fillRect(200, 0, 900, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(1050, 0, 1050, 550);
		g.drawLine(250, 550, 1050, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(1100, 600, 1050, 550);
		g.drawImage(monsterRight, 1025, 300, 50, 50, null);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		g.drawString("Monsters vision is", 250, 100);
		g.drawString("shown by a green", 250, 200);
		g.drawString("circle and the", 250, 300);
		g.drawString("monster flying", 250, 400);
		g.drawString("near it", 250, 500);
		repaint();
	}
}
class CameraInstructions2 extends JPanel
{
	//Draws instructions and animation for panel 2 of the monster instructions
	Timer move, end;
	int playerx, playery, counter;
	boolean down, right, up, endScreen;
	public CameraInstructions2()
	{
		//paints background
		setBackground(Color.GRAY);
		playerx = 25;
		playery = 10;
		down = true;
		right = up = endScreen = false;
		
		playerMove go = new playerMove();
		move = new Timer(5, go);
		GameStop stop = new GameStop();
		end = new Timer(1500, stop);
	}
	class playerMove implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(down)
			{
				if(playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 1225)
				{
					right = false;
					up = true;
				}
				playerx++;
			}
			else if(up)
			{
				if(playery == 490)
				{
					up = false;
					down = endScreen = true;
				}
				playery--;
			}
			repaint();
		}
	}
	class GameStop implements ActionListener
	{
		//used to show the death screen and then restart the animation
		public void actionPerformed(ActionEvent e)
		{
			if(counter == 1)
				endScreen = false;
			playerx = 25;
			playery = 10;
			counter++;
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		if(endScreen)
		{
			move.stop();
			end.start();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 1420, 840);
			g.setColor(Color.BLACK);
			Font dead = new Font("SANS_SERIF", Font.PLAIN, 40);
			g.setFont(dead);
			g.drawString("YOU DIED", 600, 420);
		}
		else
		{
			Image floor = new ImageIcon("StoneFloor.jpg").getImage();
			Image monsterRight = new ImageIcon("enemy14.gif").getImage();
			g.drawImage(floor, 0, 0, 710, 420, null);
			g.drawImage(floor, 710, 0, 710, 420, null);
			g.drawImage(floor, 0, 420, 710, 420, null);
			g.drawImage(floor, 710, 420, 710, 420, null);
			Color color = new Color(92, 32, 32);
			g.setColor(Color.GREEN);
			g.fillOval(1100, 200, 300, 300);
			g.setColor(color);
			g.fillRect(200, 0, 900, 600);
			g.setColor(Color.BLACK);
			g.drawLine(250, 0, 250, 550);
			g.drawLine(1050, 0, 1050, 550);
			g.drawLine(250, 550, 1050, 550);
			g.drawLine(200, 600, 250, 550);
			g.drawLine(1100, 600, 1050, 550);
			g.drawImage(monsterRight, 1025, 300, 50, 50, null);
			Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
			g.setFont(font);
			g.drawString("If a player comes", 250, 100);
			g.drawString("in contact with the", 250, 200);
			g.drawString("monsters vision", 250, 300);
			g.drawString("the game ends", 250, 400);
			Image playerWalk = new ImageIcon("WalkRight.gif").getImage();
			end.stop();
			move.start();
			g.drawImage(playerWalk, playerx, playery, 50, 50, null);
		}
	}
}
class CameraInstructions3 extends JPanel
{
	//Draws instructions and animation for panel 3 of the monster instructions
	Timer movement;
	int playerx, playery;
	boolean down, right, up, left, leveron;
	public CameraInstructions3()
	{
		//initilize variables
		setBackground(Color.GRAY);
		playerx = 25;
		playery = 10;
		down = true;
		right = up = left = leveron = false;
		
		playerMove move = new playerMove();
		movement = new Timer(5, move);
	}
	class playerMove implements ActionListener
	{
		//creates animation for the panel
		public void actionPerformed(ActionEvent e)
		{
			if(down)
			{
				if(playery == 225||playery == 675)
				{
					down = false;
					right = true;
				}
				playery++;
			}
			else if(right)
			{
				if(playerx == 75&&leveron == false)
				{
					right = false;
					left = true;
					leveron = true;
				}
				else if(playerx == 1225)
				{
					right = false;
					up = true;
				}
				else if(playerx == 1325)
				{
					playerx = 25;
					playery = 10;
					leveron = false;
					down = true;
					right = false;
				}
				playerx++;
			}
			else if(left)
			{
				if(playerx == 25)
				{
					left = false;
					down = true;
				}
				playerx--;
			}
			else if(up)
			{
				if(playery == 25)
				{
					up = false;
					right = true;
				}
				playery --;
			}
			repaint();
		}
	}
	public void paintComponent(Graphics g)
	{
		//draws the text and environment onto the panel
		super.paintComponent(g);
		Image floor = new ImageIcon("StoneFloor.jpg").getImage();
		Image monsterRight = new ImageIcon("enemy14.gif").getImage();
		Image on = new ImageIcon("leveron.png").getImage();
		Image off = new ImageIcon("leveroff.png").getImage();
		Image playerWalk = new ImageIcon("WalkRight.gif").getImage();
		g.drawImage(floor, 0, 0, 710, 420, null);
		g.drawImage(floor, 710, 0, 710, 420, null);
		g.drawImage(floor, 0, 420, 710, 420, null);
		g.drawImage(floor, 710, 420, 710, 420, null);
		Color color = new Color(92, 32, 32);
		g.setColor(color);
		g.fillRect(200, 0, 900, 600);
		g.setColor(Color.BLACK);
		g.drawLine(250, 0, 250, 550);
		g.drawLine(1050, 0, 1050, 550);
		g.drawLine(250, 550, 1050, 550);
		g.drawLine(200, 600, 250, 550);
		g.drawLine(1100, 600, 1050, 550);
		movement.start();
		if(leveron)
			g.drawImage(on, 125, 225, 50, 50, null);
		else
		{
			g.drawImage(monsterRight, 1025, 300, 50, 50, null);
			g.setColor(Color.GREEN);
			g.fillOval(1100, 200, 300, 300);
			g.drawImage(off, 125, 225, 50, 50, null);
		}
		g.setColor(Color.BLACK);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 100);
		g.setFont(font);
		g.drawString("To deactivate it", 250, 100);
		g.drawString("the player needs", 250, 200);
		g.drawString("to run into the", 250, 300);
		g.drawString("switch making the", 250, 400);
		g.drawString("monster disappear", 250, 500); 
		g.drawImage(playerWalk, playerx, playery, 50, 50, null);
	}
}
class DeathScreen extends JPanel
{
	public DeathScreen()
	{
		setBackground(Color.BLACK);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1420, 840);
		Font font = new Font("SANS_SERIF", Font.PLAIN, 40);
		g.setFont(font);
		g.setColor(Color.RED);
		g.drawString("YOU DIED", 600, 420);
	}
}
