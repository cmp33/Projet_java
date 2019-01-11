package ui.livre;

import javax.swing.*;
import java.awt.*;

public class TabLivre extends JPanel {

    JTable tableLivre;

    public TabLivre() {

        setLayout(new FlowLayout());

        String[] nomColonne = {
                "Titre",
                "Créateur",
                "Genre",
                "Nb de pages",

                "Date de création",
                "Date d'achat",
                "Plateforme d'achat",

                "Support",
                "Statue",
                "Version: VF?",

                "Commentaire",
                "Note",
        };

        Object[][] data = {
                {"L'Étranger",
                        "Albert Camus",
                        "Policier, Conte philosophique, Récit d'aventure, Fiction absurde, Fiction existentielle",
                        "123",

                        "1942",
                        "11 Janvier 2019",
                        "Amazon",

                        "Poche",
                        "Non-Fini",
                        "Oui",

                        "Blablabla",
                        "X",
                },
                {"Mémoires d'une geisha",
                        "Yuki Inoue",
                        "Histoire réel, Biographie",
                        "285",

                        "avril 1999",
                        "11 Janvier 2019",
                        "Amazon",

                        "Poche",
                        "Non-Fini",
                        "Oui",

                        "Blablabla",
                        "X",
                },
        };
        tableLivre = new JTable(data, nomColonne);
        tableLivre.setPreferredScrollableViewportSize(new Dimension(1050, 550));
        tableLivre.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tableLivre);
        add(scrollPane);

    }
}

