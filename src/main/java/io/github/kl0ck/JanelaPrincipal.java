package io.github.kl0ck;

import javax.swing.JFrame;

class JanelaPrincipal extends JFrame {

    JanelaPrincipal() {
        setTitle("swing-javafx-capabilities");

        add(new PainelPrincipal());

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
