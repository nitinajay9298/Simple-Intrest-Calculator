import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SIGUI extends JFrame
{
    JPanel panel;
    JLabel p,r,t,res,resout;
    JTextField ptf,rtf,ttf;
    JButton b;
    public SIGUI(){
        setTitle("Simple Interest Calculator");
        setSize(290,350);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setBounds(10,30,250,180);
        panel.setBackground(Color.orange);
        panel.setLayout(null);
        add(panel);
        Font font = new Font(Font.SANS_SERIF,Font.BOLD,12);

        p = new JLabel("Principle :");
        p.setFont(font);
        p.setBounds(10,20,100,20);
        panel.add(p);

        ptf = new JTextField();
        ptf.setFont(font);
        ptf.setBounds(100,20,140,20);
        panel.add(ptf);

        r = new JLabel("Rate :");
        r.setFont(font);
        r.setBounds(10,50,100,20);
        panel.add(r);

        rtf = new JTextField();
        rtf.setFont(font);
        rtf.setBounds(100,50,140,20);
        panel.add(rtf);

        t = new JLabel("Time :");
        t.setFont(font);
        t.setBounds(10,80,100,20);
        panel.add(t);

        ttf = new JTextField();
        ttf.setFont(font);
        ttf.setBounds(100,80,140,20);
        panel.add(ttf);

        b = new JButton("Simple Interest");
        b.addActionListener(new SIAction());
        b.setFont(font);
        b.setBackground(Color.red);
        b.setForeground(Color.white);
        b.setBounds(10,130,230,30);
        panel.add(b);

        res=new JLabel("Result   :");
        res.setFont(font);
        res.setBounds(30,240,100,20);
        add(res);

        resout=new JLabel(".........");
        resout.setFont(font);
        resout.setBounds(170,240,100,20);
        add(resout);
    }

    class SIAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = ptf.getText();
            String s2 = rtf.getText();
            String s3 = ttf.getText();

            float p = Float.parseFloat(s1);
            float r = Float.parseFloat(s2);
            float t = Float.parseFloat(s3);

            float si;
            si=(p*r*t)/100;
            resout.setText(si+"");
        }

    }

}