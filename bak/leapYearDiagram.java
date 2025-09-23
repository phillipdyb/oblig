import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class leapYearDiagram extends JPanel {

    private int år;
    private boolean skuddår;
    private int steg; // Hvilket steg algoritmen stoppet på

    public leapYearDiagram(int år) {
        this.år = år;
        beregnSkuddår();
    }

    private void beregnSkuddår() {
        if (år % 400 == 0) {
            skuddår = true;
            steg = 1; // gikk gjennom 400-regelen
        } else if (år % 100 == 0) {
            skuddår = false;
            steg = 2; // gikk gjennom 100-regelen
        } else if (år % 4 == 0) {
            skuddår = true;
            steg = 3; // gikk gjennom 4-regelen
        } else {
            skuddår = false;
            steg = 4; // ellers
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        g2.setFont(new Font("Arial", Font.PLAIN, 14));

        // Hjelpemetode for å tegne boks med "aktiv" farge
        java.util.function.BiConsumer<Rectangle, String> drawBox = (rect, text) -> {
            if ((text.contains("400") && steg == 1) ||
                (text.contains("100") && steg == 2) ||
                (text.contains("4 ==") && steg == 3) ||
                (text.contains("Ikke") && steg == 4) ||
                (text.contains("Skuddår") && skuddår && steg != 4)) {
                g2.setColor(Color.GREEN);
                g2.fillRect(rect.x, rect.y, rect.width, rect.height);
                g2.setColor(Color.BLACK);
            }
            g2.drawRect(rect.x, rect.y, rect.width, rect.height);
            g2.drawString(text, rect.x + 10, rect.y + 25);
        };

        // Start
        g2.drawOval(150, 20, 100, 40);
        g2.drawString("Start", 185, 45);

        // Les årstall
        Rectangle r1 = new Rectangle(150, 80, 100, 40);
        drawBox.accept(r1, "Les årstall");

        // Sjekk år % 400
        Rectangle r2 = new Rectangle(130, 150, 140, 40);
        drawBox.accept(r2, "År % 400 == 0?");

        // Skuddår (fra %400)
        Rectangle r3 = new Rectangle(300, 150, 120, 40);
        drawBox.accept(r3, "Skuddår");

        // Sjekk år % 100
        Rectangle r4 = new Rectangle(130, 220, 140, 40);
        drawBox.accept(r4, "År % 100 == 0?");

        // Ikke skuddår (fra %100)
        Rectangle r5 = new Rectangle(20, 220, 120, 40);
        drawBox.accept(r5, "Ikke skuddår");

        // Sjekk år % 4
        Rectangle r6 = new Rectangle(130, 290, 140, 40);
        drawBox.accept(r6, "År % 4 == 0?");

        // Skuddår (fra %4)
        Rectangle r7 = new Rectangle(300, 290, 120, 40);
        drawBox.accept(r7, "Skuddår");

        // Ikke skuddår (fra %4)
        Rectangle r8 = new Rectangle(20, 290, 120, 40);
        drawBox.accept(r8, "Ikke skuddår");

        // Slutt
        g2.drawOval(150, 370, 100, 40);
        g2.drawString("Slutt", 185, 395);

        // Piler
        g2.drawLine(200, 60, 200, 80);   // Start -> Les år
        g2.drawLine(200, 120, 200, 150); // Les år -> %400
        g2.drawLine(270, 170, 300, 170); // %400 -> skuddår
        g2.drawLine(200, 190, 200, 220); // %400 -> %100
        g2.drawLine(130, 240, 20+120, 240); // %100 -> ikke skuddår
        g2.drawLine(200, 260, 200, 290); // %100 -> %4
        g2.drawLine(270, 310, 300, 310); // %4 -> skuddår
        g2.drawLine(130, 310, 20+120, 310); // %4 -> ikke skuddår

        // Resultat-tekst
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        if (skuddår) {
            g2.setColor(Color.BLUE);
            g2.drawString(år + " ER et skuddår", 150, 450);
        } else {
            g2.setColor(Color.RED);
            g2.drawString(år + " er IKKE et skuddår", 150, 450);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv inn et årstall: ");
        int år = scanner.nextInt();

        JFrame frame = new JFrame("Aktivitetsdiagram - Skuddår");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.add(new leapYearDiagram(år));
        frame.setVisible(true);
    
        scanner.close();
    }
}
