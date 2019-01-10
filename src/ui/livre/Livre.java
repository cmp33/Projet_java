package ui.livre;

import javax.swing.*;
import java.awt.*;

public class Livre extends JPanel {
    private JPanel top;
    private JPanel main;

    public Livre() {

        top = new JPanel();
        top.setLayout(new BorderLayout());

        main = new JPanel();

        this.setLayout(new BorderLayout());

        this.add(top, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        top.setBackground(Color.RED);
        main.setBackground(Color.pink);

        GridLayout ButTopLayout = new GridLayout(1, 3);
        ButTopLayout.setHgap(5);

        JPanel ButTop = new JPanel(ButTopLayout);

        JButton AjoutLivre = new JButton("Ajouter");
        JButton ModifLivre = new JButton("Modifier");
        JButton SuppLivre = new JButton("Supprimer");

        AjoutLivre.addActionListener(e -> new FormAjoutLivre());
        ModifLivre.addActionListener(e -> new FormModifLivre());

        JLabel NomCategorie = new JLabel("Livre");

        ButTop.add(AjoutLivre);
        ButTop.add(ModifLivre);
        ButTop.add(SuppLivre);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);


    }
}

