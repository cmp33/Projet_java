package ui.jeu;

import javax.swing.*;
import java.awt.*;

public class Jeu extends JPanel {
    private JPanel top;
    private  JPanel main;

    public Jeu(){
        top = new JPanel();
        top.setLayout(new BorderLayout());

        main = new JPanel();

        this.setLayout(new BorderLayout());

        this.add(top, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        top.setBackground(new Color (0x9FE4FF));
        main.setBackground(new Color (0x9FE4FF));

        GridLayout ButTopLayout = new GridLayout(1, 3);
        ButTopLayout.setHgap(5);

        JPanel ButTop = new JPanel(ButTopLayout);

        JButton AjoutJeu = new JButton("Ajouter");
        JButton ModifJeu = new JButton("Modifier");
        JButton SuppJeu = new JButton("Supprimer");

        AjoutJeu.addActionListener(e -> new FormAjoutJeu());
        ModifJeu.addActionListener(e -> new FormModifJeu());

        JLabel NomCategorie = new JLabel("Vous êtes dans la catégorie: Jeu");

        ButTop.add(AjoutJeu);
        ButTop.add(ModifJeu);
        ButTop.add(SuppJeu);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);
    }
}
