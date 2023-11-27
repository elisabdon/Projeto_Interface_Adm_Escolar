import javax.swing.*;
import java.awt.*;

public class EscolaPanel extends JPanel {
    private JTextField nomeField, enderecoField, idField, anoField;
    private JButton atualizarBtn, limparBtn;

    public EscolaPanel() {
        setLayout(new GridLayout(0, 2, 5, 5));

        nomeField = new JTextField(20);
        enderecoField = new JTextField(20);
        idField = new JTextField(20);
        anoField = new JTextField(20);

        add(new JLabel("Nome da Escola:"));
        add(nomeField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("ID da Escola:"));
        add(idField);
        add(new JLabel("Ano de Fundação:"));
        add(anoField);

        atualizarBtn = new JButton("Atualizar");
        limparBtn = new JButton("Limpar");

        atualizarBtn.addActionListener(e -> atualizarEscola());
        limparBtn.addActionListener(e -> limparCampos());

        add(atualizarBtn);
        add(limparBtn);
    }

    private void atualizarEscola() {
        try {
            String nome = nomeField.getText();
            String endereco = enderecoField.getText();
            int id = Integer.parseInt(idField.getText());
            int ano = Integer.parseInt(anoField.getText());

            // Criando um novo objeto Escola com os dados dos campos de texto
            Escola escola = new Escola(nome, endereco, id, ano, null); // Diretor é passado como null por enquanto

            // Aqui você pode adicionar a escola a uma lista, banco de dados, etc.
            // Por exemplo: listaEscolas.add(escola);

            JOptionPane.showMessageDialog(this, "Escola atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter número. Verifique os campos de ID e Ano.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar escola: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        nomeField.setText("");
        enderecoField.setText("");
        idField.setText("");
        anoField.setText("");
    }
}
