package ui.musique;

import ui.Table;

import javax.swing.*;
import java.awt.*;

public class Musique extends JPanel {

    private JPanel top;
    private JPanel main;
 //  support_type, date_achat, plateforme_achat, oeuvre_note, oeuvre_commentaire
    private String strSql = "SELECT oeuvre_titre, oeuvre_createur, oeuvre_genre, oeuvre_support, date_achat, plateforme_achat, oeuvre_note, oeuvre_commentaire " +
         "FROM oeuvre " +
         /*
         "INNER JOIN createur_oeuvre ON oeuvre.oeuvre_id = createur_oeuvre.oeuvre_id " +
         "INNER JOIN createur ON createur_oeuvre.createur_id = createur.createur_id " +
         "INNER JOIN genre_oeuvre ON oeuvre.oeuvre_id = genre_oeuvre.genre_id " +
         "INNER JOIN genre ON genre_oeuvre.genre_id = genre.genre_id " +
         */
         "WHERE categorie_id = '1' ";

        //"WHERE categorie_id = '1' ";

    private String[] columnMusic = {

            //"Select",
            "Titre",
            "Artiste",
            "Genre",
            "Support",
            "Date d'achat",
            "Boutique",
            "Note",
            "Commentaire"
    };

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
        ButTop.setBackground(new Color(0x8EBE7C));

        JButton AjoutMusique = new JButton("Ajouter");
        JButton ModifMusique = new JButton("Modifier");
        JButton SuppMusique = new JButton("Supprimer");

        AjoutMusique.addActionListener(e -> new FormAjoutMusique());
        ModifMusique.addActionListener(e -> new FormModifMusique());

        JLabel NomCategorie = new JLabel("    Catégorie: Musique");

        ButTop.add(AjoutMusique);
        //ButTop.add(ModifMusique);
        //ButTop.add(SuppMusique);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);

        Table tab = new Table(strSql, columnMusic);
        main.add(tab, BorderLayout.CENTER);



    }
}