package io.github.kl0ck;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import org.controlsfx.control.SearchableComboBox;
import org.tbee.javafx.scene.layout.MigPane;

import javafx.application.Platform;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

import net.miginfocom.swing.MigLayout;

class PainelPrincipal extends JPanel {

    PainelPrincipal() {
        setLayout(new BorderLayout());
        // add(new JLabel("Nome:"));
        // add(new JTextField());
        // add(new JLabel("Endereço:"));
        // add(new JTextField());
        // add(new JLabel("Telefone:"));
        // add(new JTextField());
        // add(new JLabel("Sexo:"));
        // add(new SearchableComboBox());

        // Adiciona um painel JavaFX dentro da aplicação Swing
        JFXPanel fxPanel = new JFXPanel();
        add(fxPanel);

        // Inicializa o conteúdo JavaFX
        Platform.runLater(() -> {
            MigPane migPane = criarForm();

            Scene scene = new Scene(migPane);

            fxPanel.setScene(scene);
        });
    }

    private MigPane criarForm() {
        // Criando um MigPane para gerenciar o layout
        MigPane migPane = new MigPane("wrap 2", "[][200px, fill]");

        migPane.add(new Label("Nome:"));
        migPane.add(new TextField());

        migPane.add(new Label("Email:"));
        migPane.add(new TextField());

        migPane.add(new Label("Sexo:"));
        migPane.add(new SearchableComboBox());
        
        return migPane;
    }

}
