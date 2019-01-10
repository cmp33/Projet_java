package ui;

import ui.film.Film;
import ui.jeu.Jeu;
import ui.livre.Livre;
import ui.musique.Musique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class FirstInterface extends JFrame {
    private String[] listContent = {"musique", "livre", "film", "jeu"};

    public FirstInterface(){

        this.setTitle("Ma bibliothèque");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

//
//Container qui fait toute la dimension (containerPrinc) du JFrame(pour pouvoir les moduler)
        JPanel containerPrinc = new JPanel();
        containerPrinc.setLayout(new BorderLayout());
//
//Container de gauche (containerLeftMenu) dans lequel il y a les boutons pour séléctionner la catégorie voulu
        JPanel containerLeftMenu = new JPanel();
        containerLeftMenu.setLayout(new GridBagLayout());
        containerLeftMenu.setBackground(new Color(0xFFCC5A));
//
//Création du choix & positionnement
        JPanel choix = new JPanel();
        choix.setLayout(new GridLayout(4, 1));
//
//
        JPanel containerRight = new JPanel();
        CardLayout pileCategorie = new CardLayout();
//
//Button pour séléctionner la catégorie à afficher dans 'menu'
        JButton butMusique = new JButton("Musiques");
        butMusique.addActionListener(e -> pileCategorie.show(containerRight, listContent[0]));
        choix.add(butMusique);

        JButton butLivre = new JButton("Livres");
        butLivre.addActionListener(e -> pileCategorie.show(containerRight, listContent[1]));
        choix.add(butLivre);

        JButton butFilm = new JButton("Films");
        butFilm.addActionListener(e -> pileCategorie.show(containerRight, listContent[2]));
        choix.add(butFilm);

        JButton butJeu = new JButton("Jeux");
        butJeu.addActionListener(e -> pileCategorie.show(containerRight, listContent[3]));
        choix.add(butJeu);

//
//On créer 4 JPanel (1 pour chaque catégorie)

        JPanel musique = new Musique();

        JPanel livre = new Livre();

        JPanel film = new Film();

        JPanel jeu = new Jeu();

//
        containerPrinc.add(containerRight, BorderLayout.CENTER);
        containerRight.setLayout(pileCategorie);

        containerRight.add(musique, listContent[0]);
        containerRight.add(livre, listContent[1]);
        containerRight.add(film, listContent[2]);
        containerRight.add(jeu, listContent[3]);

//
//Enbrication des JPanel
        this.setContentPane(containerPrinc);
        containerPrinc.add(containerLeftMenu, BorderLayout.LINE_START);
        containerLeftMenu.add(choix);

        //Confirmation fermeture
       this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(null,
                        "Voulez-vous quitter l'application ?", "Fermeture",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        this.setVisible(true);

    }
}