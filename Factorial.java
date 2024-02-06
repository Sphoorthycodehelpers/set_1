import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=Factorial.class width=300 height=300></applet>*/
public class Factorial extends Applet implements ActionListener {
    Label l1, l2;
    TextField num, fact;
    Panel p1, p2;
    Button b;

    public void init() {
        p1 = new Panel(new GridLayout(2, 2));
        b = new Button("compute");
        l1 = new Label("Number");
        l2 = new Label("Factorial");
        num = new TextField(10);
        fact = new TextField(10);
        p2 = new Panel();
        p1.add(l1);
        p1.add(num);
        p1.add(l2);
        p1.add(fact);
        p2.add(b);
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(num.getText());
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        fact.setText(String.valueOf(f));
    }
}
