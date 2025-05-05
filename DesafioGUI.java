import javax.swing.*;
import java.awt.*;

public class DesafioGUI {
    private double saldo = 1599.99;

    public DesafioGUI() {
        // Crear ventana principal
        JFrame frame = new JFrame("Banco - Gestión de Cuenta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        // Etiquetas y área de texto
        JLabel lblNombre = new JLabel("Nombre del Cliente: Tony Stark");
        JLabel lblTipoCuenta = new JLabel("Tipo de Cuenta: Corriente");
        JLabel lblSaldo = new JLabel("Saldo Disponible: " + saldo + " $");
        frame.add(lblNombre);
        frame.add(lblTipoCuenta);
        frame.add(lblSaldo);

        // Botones
        JButton btnConsultar = new JButton("Consultar Saldo");
        JButton btnRetirar = new JButton("Retirar");
        JButton btnDepositar = new JButton("Depositar");
        JButton btnSalir = new JButton("Salir");

        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnConsultar);
        panelBotones.add(btnRetirar);
        panelBotones.add(btnDepositar);
        panelBotones.add(btnSalir);
        frame.add(panelBotones);

        // Acciones de los botones
        btnConsultar.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Saldo disponible: " + saldo + " $"));

        btnRetirar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "¿Cuánto desea retirar?");
            if (input != null) {
                double retiro = Double.parseDouble(input);
                if (retiro > saldo) {
                    JOptionPane.showMessageDialog(frame, "No tiene suficiente saldo para realizar el retiro.");
                } else {
                    saldo -= retiro;
                    lblSaldo.setText("Saldo Disponible: " + saldo + " $");
                    JOptionPane.showMessageDialog(frame, "Retiro realizado con éxito. Nuevo saldo: " + saldo + " $");
                }
            }
        });

        btnDepositar.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "¿Cuánto desea depositar?");
            if (input != null) {
                double deposito = Double.parseDouble(input);
                saldo += deposito;
                lblSaldo.setText("Saldo Disponible: " + saldo + " $");
                JOptionPane.showMessageDialog(frame, "Depósito realizado con éxito. Nuevo saldo: " + saldo + " $");
            }
        });

        btnSalir.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Gracias por usar nuestro servicio.");
            System.exit(0);
        });

        // Mostrar ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DesafioGUI();
    }
}

