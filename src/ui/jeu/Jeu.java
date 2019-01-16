package ui.jeu;
import ui.Table;

import javax.swing.*;
import java.awt.*;

public class Jeu extends JPanel {

    private JPanel top;
    private  JPanel main;

    private String strSql = "SELECT oeuvre_titre, oeuvre_genre, oeuvre_support, date_achat, plateforme_achat, oeuvre_terminer, oeuvre_note, oeuvre_commentaire "
                            + "FROM oeuvre "
                            + "WHERE categorie_id = '3' ";

    private String[] columnGame = {

            //"Select",
            "Nom",
            "Genre",
            "Support",
            "Date d'achat",
            "Boutique",
            "Status",
            "Note",
            "Commentaire"
    };

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
        ButTop.setBackground(new Color(0x9FE4FF));

        JButton AjoutJeu = new JButton("Ajouter");
        JButton ModifJeu = new JButton("Modifier");
        JButton SuppJeu = new JButton("Supprimer");

        AjoutJeu.addActionListener(e -> new FormAjoutJeu());
        ModifJeu.addActionListener(e -> new FormModifJeu());

        JLabel NomCategorie = new JLabel("    Catégorie: Jeu");

        ButTop.add(AjoutJeu);
        //ButTop.add(ModifJeu);
        //ButTop.add(SuppJeu);
        top.add(NomCategorie);

        top.add(ButTop, BorderLayout.LINE_END);

        Table tab = new Table(strSql, columnGame);
        main.add(tab, BorderLayout.CENTER);
    }
}
