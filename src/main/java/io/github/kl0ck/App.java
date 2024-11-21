package io.github.kl0ck;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal().setVisible(true));
    }

}
