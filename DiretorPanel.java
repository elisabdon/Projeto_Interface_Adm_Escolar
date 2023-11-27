import javax.swing.*;
import java.awt.*;

public class DiretorPanel extends JPanel {
    private JTextField nomeField, dataField, numeroField, telefoneField;
    private JButton atualizarBtn, limparBtn;
    private Escola escola;

    public DiretorPanel(Escola escola) {
        this.escola = escola;
        setLayout(new GridLayout(0, 2, 5, 5));

        nomeField = new JTextField(20);
        dataField = new JTextField(20);
        numeroField = new JTextField(20);
        telefoneField = new JTextField(20);

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Data de Contratação:"));
        add(dataField);
        add(new JLabel("Número de Identificação:"));
        add(numeroField);
        add(new JLabel("Telefone:"));
        add(telefoneField);

        atualizarBtn = new JButton("Atualizar");
        limparBtn = new JButton("Limpar");

        atualizarBtn.addActionListener(e -> atualizarDiretor());
        limparBtn.addActionListener(e -> limparCampos());

        add(atualizarBtn);
        add(limparBtn);
    }

    private void atualizarDiretor() {
        try {
            String nome = nomeField.getText();
            String data = dataField.getText();
            int numero = Integer.parseInt(numeroField.getText());
            String telefone = telefoneField.getText();
    
            // Validação básica
            if (nome.isEmpty() || data.isEmpty() || telefone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            Diretor diretorAtualizado = new Diretor(nome, data, numero, telefone);
            escola.setDiretor(diretorAtualizado);
            JOptionPane.showMessageDialog(this, "Dados do Diretor atualizados com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de identificação inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    private void limparCampos() {
        nomeField.setText("");
        dataField.setText("");
        numeroField.setText("");
        telefoneField.setText("");
    }
}
