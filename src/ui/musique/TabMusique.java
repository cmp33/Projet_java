package ui.musique;

import javax.swing.*;
import java.awt.*;

public class TabMusique extends JPanel {

    JTable tableMusique;

    public TabMusique() {

        setLayout(new FlowLayout());

        String[] nomColonne = {
                "Titre Album",
                "Mourceau",
                "Artiste",
                "Genre",
                "Durée",

                "Date de sortie",
                "Date d'achat",
                "Plateforme d'achat",

                "Support",
                "Commentaire",
                "Note"
        };

        Object[][] data = {
                {"Rolling Papers 2",
                        "Hopeless Romantic",
                        "Wiz Khalifa ft Swae Lee",
                        "Hip-hop, Rap",
                        "3m52s",

                        "2018",
                        "11 Janvier 2019",
                        "Itunes",

                        "Dématérialisée",
                        "Blablabla",
                        "4.5"
                },

                {"ColorShow",
                        "300 (Henri)",
                        "Roméo Elvis",
                        "Rap",
                        "4m07s",

                        "10 Juillet 2018",
                        "11 Janvier 2019",
                        "Deezer",

                        "Dématérialisée",
                        "Blablabla",
                        "4"
                },
        };

        tableMusique = new JTable(data, nomColonne);
        tableMusique.setPreferredScrollableViewportSize(new Dimension(1050, 550));
        tableMusique.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tableMusique);
        add(scrollPane);

    }
}
