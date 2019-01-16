package ui.film;

import ui.Table;

import javax.swing.*;
import java.awt.*;

public class Film extends JPanel {

    private JPanel top;
    private JPanel main;

    private  String strSql = "SELECT oeuvre_titre, oeuvre_createur, oeuvre_genre, oeuvre_support, date_achat, plateforme_achat, oeuvre_terminer, oeuvre_vf, oeuvre_note, oeuvre_commentaire "
                             + "FROM oeuvre "
                             + "WHERE categorie_id = '4' ";

    private String[] columnMovie = {

            //"Select",
            "Titre",
            "Réalisateur",
            "Genre",
            "Support",
            "Date d'achat",
            "Boutique",
            "Status",
            "VF",
            "Note",
            "Commentaire"
    };

    public Film(){

        top = new JPanel();
        top.setLayout(new BorderLayout());

        main = new JPanel();

        this.setLayout(new BorderLayout());

        this.add(top, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        top.setBackground(new Color (0xE3A0D7));
        main.setBackground(new Color (0xE3A0D7));

        GridLayout ButTopLayout = new GridLayout(1, 3);
        ButTopLayout.setHgap(5);

        JPanel ButTop = new JPanel(ButTopLayout);
        ButTop.setBackground(new Color(0xE3A0D7));

        JButton AjoutFilm = new JButton("Ajouter");
        JButton ModifFilm = new JButton("Modifier");
        JButton SuppFilm = new JButton("Supprimer");

        AjoutFilm.addActionListener(e -> new FormAjoutFilm());
        ModifFilm.addActionListener(e -> new FormModifFilm());

        JLabel NomCategorie = new JLabel("    Catégorie: Film");

        ButTop.add(AjoutFilm);
        //ButTop.add(ModifFilm);
        //ButTop.add(SuppFilm);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);

        Table tab = new Table(strSql, columnMovie);
        main.add(tab, BorderLayout.CENTER);

    }
}
