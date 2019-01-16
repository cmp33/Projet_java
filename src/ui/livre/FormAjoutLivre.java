package ui.livre;

import BDD.Connexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FormAjoutLivre extends JDialog {

    private JPanel panelMain = new JPanel();
    private JPanel panelForm = new JPanel(new GridBagLayout());

    private JButton b = new JButton("OK");

    //DateFormat format = new SimpleDateFormat("yyyy.MMM.dd");

    //On defini les champs du formulaire
    private JTextField titre = new JTextField(10);
    private JTextField auteur = new JTextField(10);

    String[] itemsGenre = {"Aventure", "Policier", "Biographique"};
    private JComboBox genre = new JComboBox(itemsGenre);

    String[] itemsSupport = {"Livre de poche", "Broché"};
    private JComboBox support = new JComboBox(itemsSupport);

    private JTextField dateAchat = new JTextField("yyyy-mm-dd", 10);
    private JTextField platformAchat = new JTextField(10);

    String[] itemsStatus = {"En cours", "Terminé"};
    private JComboBox status = new JComboBox(itemsStatus);

    private JTextField note = new JTextField(10);
    private JTextField commentaire = new JTextField(10);


    public FormAjoutLivre() {

        createView();

        this.setTitle("Ajouter un livre");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void createView() {

        String[] labels = new String[]{"Titre: ", "Auteur: ", "Genre: ", "Support: ", "Date d'achat: ", "Boutique: ", "Status: ", "Note: ", "Commentaire: "};

        //On récupere la taille de chaine <labels>
        int lenLabels = labels.length;

        getContentPane().add(panelMain);
        panelMain.add(panelForm);

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;

        //Affiche le label des champs du formulaire
        for (int i = 0; i < lenLabels; i++) {
            panelForm.add(new JLabel(labels[i]), c);
            c.gridy++;
        }


        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;

        //Affiche les champs de text pour chaques label
        //Dans l'idéal faire une boucle
        panelForm.add(titre, c);
        c.gridy++;
        panelForm.add(auteur, c);
        c.gridy++;
        panelForm.add(genre, c);
        c.gridy++;
        panelForm.add(support, c);
        c.gridy++;
        panelForm.add(dateAchat, c);
        c.gridy++;
        panelForm.add(platformAchat, c);
        c.gridy++;
        panelForm.add(status, c);
        c.gridy++;
        panelForm.add(note, c);
        c.gridy++;
        //commentaire.setPreferredSize(new Dimension(150, 60));
        panelForm.add(commentaire, c);

        //Place le boutton dans le formulaire

        c.gridx = 1;
        c.gridy = lenLabels + 1;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        panelForm.add(b, c);

        b.addActionListener(new BoutonListener());
    }

    public class BoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String query = "INSERT INTO oeuvre ( oeuvre_titre, oeuvre_createur, oeuvre_genre, oeuvre_support, date_achat, " +
                    "plateforme_achat, oeuvre_terminer, oeuvre_note, oeuvre_commentaire, categorie_id, support_id ) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {

                PreparedStatement st = Connexion.getInstance().prepareStatement(query);
                st.setString(1, titre.getText());
                st.setString(2, auteur.getText());
                st.setString(3, (String) genre.getSelectedItem());
                st.setString(4, (String) support.getSelectedItem());
                st.setString(5, dateAchat.getText());
                st.setString(6, platformAchat.getText());
                st.setString(7, (String) status.getSelectedItem());
                st.setString(8, note.getText());
                st.setString(9, commentaire.getText());
                st.setString(10, "2");
                st.setString(11, "1");
                st.executeUpdate();

            } catch (SQLException t) {

                t.printStackTrace();
            }
            //Affiche les données du formulaire dans le terminal
            //System.out.println("TEXT : Nom " + listeDeroulante.getSelectedItem());
            //System.out.println("TEXT : Prénom " + titre.getText());

            dispose();

        }
    }
}
