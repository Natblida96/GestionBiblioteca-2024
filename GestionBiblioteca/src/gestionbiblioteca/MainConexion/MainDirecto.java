package gestionbiblioteca.MainConexion;

import gestionbiblioteca.Vistas.BibliotecaEscritorio;
import javax.swing.JFrame;

public class MainDirecto {

    public static void main(String[] args) {

        BibliotecaEscritorio miapp = new BibliotecaEscritorio();
        miapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miapp.setLocationRelativeTo(null);
        miapp.setVisible(true);

    }

}
