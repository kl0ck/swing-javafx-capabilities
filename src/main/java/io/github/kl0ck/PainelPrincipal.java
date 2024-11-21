package io.github.kl0ck;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.time.LocalDate;

import org.controlsfx.control.SearchableComboBox;
import org.tbee.javafx.scene.layout.MigPane;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class PainelPrincipal extends JPanel {

    PainelPrincipal() {
        setLayout(new BorderLayout());

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

        migPane.add(new Label("Data de Nascimento:"));
        migPane.add(new DatePicker(LocalDate.of(1980, 1, 1)), "growx");

        migPane.add(new Label("Email:"));
        migPane.add(new TextField());

        migPane.add(new Label("Sexo:"));
        migPane.add(new SearchableComboBox<>(FXCollections.observableArrayList("Masculino", "Feminino")));

        migPane.add(new Label("Gênero:"));
        migPane.add(new SearchableComboBox<>(FXCollections.observableArrayList("Masculino", "Feminino", "Não-binário", "Bicha")));

        
        return migPane;
    }

}
