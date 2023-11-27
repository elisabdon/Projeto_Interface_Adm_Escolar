import javax.swing.*;
import java.awt.*;

public class ProfessorPanel extends JPanel {
    private JTextField nomeField, dataField, numeroField, telefoneField, enderecoField, salarioField;
    private JButton atualizarBtn, limparBtn;

    public ProfessorPanel() {
        setLayout(new GridLayout(0, 2, 5, 5));

        nomeField = new JTextField(20);
        dataField = new JTextField(20);
        numeroField = new JTextField(20);
        telefoneField = new JTextField(20);
        enderecoField = new JTextField(20);
        salarioField = new JTextField(20);

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Data de Contratação:"));
        add(dataField);
        add(new JLabel("Número de Identificação:"));
        add(numeroField);
        add(new JLabel("Telefone:"));
        add(telefoneField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Salário:"));
        add(salarioField);

        atualizarBtn = new JButton("Atualizar");
        limparBtn = new JButton("Limpar");

        limparBtn.addActionListener(e -> limparCampos());

        add(atualizarBtn);
        add(limparBtn);
    }

    private void limparCampos() {
        nomeField.setText("");
        dataField.setText("");
        numeroField.setText("");
        telefoneField.setText("");
        enderecoField.setText("");
        salarioField.setText("");
    }
}
