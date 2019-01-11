package ui.film;

import javax.swing.*;
import java.awt.*;

public class TabFilm extends JPanel {

    JTable tableFilm;

    public TabFilm() {

        setLayout(new FlowLayout());

        String[] nomColonne = {
                "Titre",
                "Créateur",
                "Genre",
                "Durée",

                "Date de sortie",
                "Date d'achat",
                "Plateforme d'achat",

                "Support",
                "Version:VF?",
                "Commentaire",
                "Note"
        };

        Object[][] data = {
                {"Le Seigneur des anneaux : La Communauté de l'anneau",
                        "Peter Jackson",
                        "Fantasy",
                        "2h58m",

                        "2001",
                        "2019",
                        "Amazon",

                        "Blu-Ray",
                        "Oui",
                        "Blablabla",
                        "5"
                },

                {"Le Seigneur des anneaux : Les Deux Tours",
                        "Peter Jackson",
                        "Fantasy",
                        "2h59m",

                        "2002",
                        "2019",
                        "Amazon",

                        "Blu-Ray",
                        "Oui",
                        "Blablabla",
                        "X"
                },

        };

        tableFilm = new JTable(data, nomColonne);
        tableFilm.setPreferredScrollableViewportSize(new Dimension(1050, 550));
        tableFilm.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tableFilm);
        add(scrollPane);

    }
}
