/**
 * Displaying Cards with JLabel
 *
 * @author Jakob Wood
 * @version November 17, 2021
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class DisplayingCards
{
    //Random and Unique Card Generator Method
    public int[] randNums(){
        int[] randCard = new int[4];
        java.util.List<Integer> randList = new ArrayList<>();
        for (int i=0; i<54; i++){
            randList.add(i, i+1);
        }
        Collections.shuffle(randList);
        for (int j=0; j<4; j++){
            randCard[j] = randList.get(j);
        }
        return randCard;
    }
    
    //DisplayingCards Constructor Class for GUI Creation
    public DisplayingCards(){
        //New JFrame Object
        JFrame frame = new JFrame();
        
        //New Container Object
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //New Button Object
        JButton randButton = new JButton("Randomize");
        
        //Array Declaration for Unique Card Numbers
        int[] randCard = new int[4];
        randCard = randNums();
        
        //New JLabel Objects and Setting Icons to Unique Cards
        JLabel card1 = new JLabel();
        card1.setIcon(new ImageIcon(randCard[0]+".png"));
        JLabel card2 = new JLabel();
        card2.setIcon(new ImageIcon(randCard[1]+".png"));
        JLabel card3 = new JLabel();  
        card3.setIcon(new ImageIcon(randCard[2]+".png"));
        JLabel card4 = new JLabel();
        card4.setIcon(new ImageIcon(randCard[3]+".png"));
        
        //Button Press Event that Randomizes Cards Again and Resets Icons to New Unique Cards
        randButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] randCard = new int[4];
                randCard = randNums();
                card1.setIcon(new ImageIcon(randCard[0]+".png"));
                card2.setIcon(new ImageIcon(randCard[1]+".png"));
                card3.setIcon(new ImageIcon(randCard[2]+".png"));
                card4.setIcon(new ImageIcon(randCard[3]+".png"));
            }
        });
        
        //Displaying the JLabels
        contentPane.add(card1);
        contentPane.add(card2);
        contentPane.add(card3);
        contentPane.add(card4);
        contentPane.add(randButton);
        
        //Setting the Frame for Display
        frame.setTitle("Lab04: Task2");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        //Creation of DisplayingCards Object to Open Window
        DisplayingCards window = new DisplayingCards();        
    }
}
