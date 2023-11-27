import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PessoaPanel extends JPanel {
    private JTextField nomeField, dataField, numeroField, telefoneField;
    private JButton atualizarBtn, limparBtn;

    public PessoaPanel() {
        setLayout(new GridLayout(0, 2, 5, 5));

        nomeField = new JTextField(20);
        dataField = new JTextField(20);
        numeroField = new JTextField(20);
        telefoneField = new JTextField(20);

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Data:"));
        add(dataField);
        add(new JLabel("Número:"));
        add(numeroField);
        add(new JLabel("Telefone:"));
        add(telefoneField);

        atualizarBtn = new JButton("Atualizar");
        limparBtn = new JButton("Limpar");

        atualizarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = nomeField.getText();
                    String data = dataField.getText();
                    int numero = Integer.parseInt(numeroField.getText());
                    String telefone = telefoneField.getText();

                    Pessoa pessoa = new Pessoa(nome, data, numero, telefone);

                    JOptionPane.showMessageDialog(PessoaPanel.this, "Pessoa atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(PessoaPanel.this, "Erro ao converter número. Verifique o campo de número.", "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(PessoaPanel.this, "Erro ao atualizar pessoa: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        limparBtn.addActionListener(e -> limparCampos());

        add(atualizarBtn);
        add(limparBtn);
    }

    private void limparCampos() {
        nomeField.setText("");
        dataField.setText("");
        numeroField.setText("");
        telefoneField.setText("");
    }
}
