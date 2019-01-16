package ui.livre;

import ui.Table;

import javax.swing.*;
import java.awt.*;

public class Livre extends JPanel {

    private JPanel top;
    private JPanel main;

    private String strSql = "SELECT oeuvre_titre, oeuvre_createur, oeuvre_genre, oeuvre_support, date_achat, plateforme_achat, oeuvre_terminer, oeuvre_note, oeuvre_commentaire "
            + "FROM oeuvre "
            /*
            + "INNER JOIN createur_oeuvre ON oeuvre.oeuvre_id = createur_oeuvre.oeuvre_id "
            + "INNER JOIN createur ON createur_oeuvre.createur_id = createur.createur_id "
            + "INNER JOIN genre_oeuvre ON oeuvre.oeuvre_id = genre_oeuvre.genre_id "
            + "INNER JOIN genre ON genre_oeuvre.genre_id = genre.genre_id "
            + "INNER JOIN support ON oeuvre.support_id = support.support_id "
            */
            + "WHERE categorie_id = '2' ";

    private String[] columnBook = {

            //"Select",
            "Titre",
            "Auteur",
            "Genre",
            "Support",
            "Date d'achat",
            "Boutique",
            "Status",
            "Note",
            "Commentaire"
    };

    public Livre() {

        top = new JPanel();
        top.setLayout(new BorderLayout());

        main = new JPanel();

        this.setLayout(new BorderLayout());

        this.add(top, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        top.setBackground(new Color (0xF76E6C));
        main.setBackground(new Color (0xF76E6C));

        GridLayout ButTopLayout = new GridLayout(1, 3);
        ButTopLayout.setHgap(5);

        JPanel ButTop = new JPanel(ButTopLayout);
        ButTop.setBackground(new Color(0xF76E6C));

        JButton AjoutLivre = new JButton("Ajouter");
        JButton ModifLivre = new JButton("Modifier");
        JButton SuppLivre = new JButton("Supprimer");

        AjoutLivre.addActionListener(e -> new FormAjoutLivre());
        ModifLivre.addActionListener(e -> new FormModifLivre());

        JLabel NomCategorie = new JLabel("    Catégorie: Livre");

        ButTop.add(AjoutLivre);
        //ButTop.add(ModifLivre);
        //ButTop.add(SuppLivre);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);

        Table tab = new Table(strSql, columnBook);
        main.add(tab, BorderLayout.CENTER);

    }
}

