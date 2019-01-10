package ui.film;

import javax.swing.*;
import java.awt.*;

public class Film extends JPanel {
    private JPanel top;
    private JPanel main;

    public Film(){

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

        JButton AjoutFilm = new JButton("Ajouter");
        JButton ModifFilm = new JButton("Modifier");
        JButton SuppFilm = new JButton("Supprimer");

        AjoutFilm.addActionListener(e -> new FormAjoutFilm());
        ModifFilm.addActionListener(e -> new FormModifFilm());

        JLabel NomCategorie = new JLabel("Musique");

        ButTop.add(AjoutFilm);
        ButTop.add(ModifFilm);
        ButTop.add(SuppFilm);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);


    }
}
