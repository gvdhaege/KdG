import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//deze klasse pas je niet aan!
public class Schilderij extends JFrame {
    private List<Lijn> lijnen;
    private List<Schijf> schijven;
    private Color kleur;

    public Schilderij(int breedte, int hoogte){
        super("Schilderij");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(breedte, hoogte);
        kleur = Color.BLACK;
        lijnen = new ArrayList<Lijn>();
        schijven = new ArrayList<Schijf>();
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(kleur);
        g.fillRect(0,0,getWidth(),getHeight());
        for (Lijn l: lijnen) {
            g.setColor(l.getKleur());
            g.drawLine((int)l.getX1(),
                       (int)l.getY1(),
                       (int)l.getX2(),
                       (int)l.getY2());
        }
        for (Schijf c: schijven){
            g.setColor(c.getKleur());
            g.fillOval((int)(c.getX()-c.getR()),
                       (int)(c.getY()-c.getR()),
                       (int)(c.getR()*2),
                       (int)(c.getR()*2));
        }
    }

    public void tekenLijn(Lijn l){
        lijnen.add(l);
    }

    public void tekenSchijf(Schijf c){
        schijven.add(c);
    }

    public void setKleur(Color kleur){
        this.kleur = kleur;
    }
}
