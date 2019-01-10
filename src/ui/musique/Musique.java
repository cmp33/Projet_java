package ui.musique;

import javax.swing.*;
import java.awt.*;

public class Musique extends JPanel {
    private JPanel top;
    private JPanel main;

    public Musique(){

        top = new JPanel();
        top.setLayout(new BorderLayout());

        main = new JPanel();

        this.setLayout(new BorderLayout());

        this.add(top, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        top.setBackground(new Color (0x8EBE7C));
        main.setBackground(new Color (0x8EBE7C));

        GridLayout ButTopLayout = new GridLayout(1, 3);
        ButTopLayout.setHgap(5);

        JPanel ButTop = new JPanel(ButTopLayout);

        JButton AjoutMusique = new JButton("Ajouter");
        JButton ModifMusique = new JButton("Modifier");
        JButton SuppMusique = new JButton("Supprimer");

        AjoutMusique.addActionListener(e -> new FromAjoutMusique());
        ModifMusique.addActionListener(e -> new FromModifMusique());

        JLabel NomCategorie = new JLabel("Vous êtes dans la catégorie: Musique");

        ButTop.add(AjoutMusique);
        ButTop.add(ModifMusique);
        ButTop.add(SuppMusique);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);




    }
}