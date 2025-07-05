package org.educatiom;

import org.educatiom.login.LoginUser;

public class Main {
    public static void main(String[] args) {

        // Ejecutar la ventana de CRUD_Tablas
        //java.awt.EventQueue.invokeLater(() -> new CRUD_Tablas().setVisible(true));

        // Ejecutar la ventana de Login
        java.awt.EventQueue.invokeLater(() -> new LoginUser().setVisible(true));



    }
}