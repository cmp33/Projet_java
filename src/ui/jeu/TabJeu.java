package ui.jeu;

import javax.swing.*;
import java.awt.*;

public class TabJeu extends JPanel {

    JTable tableJeu;

    public TabJeu() {

        setLayout(new FlowLayout());

        String[] nomColonne = {
                "Titre",
                "Genre",

                "Date de sortie",
                "Date d'achat",
                "Plateforme d'achat",

                "Support",
                "Status",

                "Commentaire",
                "Note"
        };

        Object[][] data = {
                {"Assassin's Creed Odyssey",
                        "Action-RPG, Jeu d'infiltration, Monde ouvert",

                        "5 octobre 2018",
                        "11 janvier 2019",
                        "Steam",

                        "Dématérialisée",
                        "Fini",

                        "Blablabla",
                        "5"
                },
                {"Red Dead Redemption 2",
                        "Action-RPG, Aventure, Monde Ouvert",

                        "26 octobre 2018",
                        "11 Janvier 2019",
                        "Steam",

                        "Dématérialisée",
                        "Non-Fini",

                        "Blablabla",
                        "X"
                },

        };

        tableJeu = new JTable(data, nomColonne);
        tableJeu.setPreferredScrollableViewportSize(new Dimension(1050, 550));
        tableJeu.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tableJeu);
        add(scrollPane);

    }
}
