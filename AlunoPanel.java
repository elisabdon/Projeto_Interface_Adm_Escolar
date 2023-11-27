import javax.swing.*;
import java.awt.*;

public class AlunoPanel extends JPanel {
    private JTextField nomeField, dataNascField, matriculaField, emailField, telefoneField;
    private JButton atualizarBtn, limparBtn;
    private Escola escola;

    public AlunoPanel(Escola escola) {
        this.escola = escola;
        setLayout(new GridLayout(0, 2, 5, 5));

        nomeField = new JTextField(20);
        dataNascField = new JTextField(20);
        matriculaField = new JTextField(20);
        emailField = new JTextField(20);
        telefoneField = new JTextField(20);

        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Data de Nascimento:"));
        add(dataNascField);
        add(new JLabel("Número de Matrícula:"));
        add(matriculaField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Telefone:"));
        add(telefoneField);

        atualizarBtn = new JButton("Atualizar");
        limparBtn = new JButton("Limpar");

        atualizarBtn.addActionListener(e -> adicionarAluno());
        limparBtn.addActionListener(e -> limparCampos());

        add(atualizarBtn);
        add(limparBtn);
    }

    private void adicionarAluno() {
        String nome = nomeField.getText();
        String dataNascimento = dataNascField.getText();
        int numero = Integer.parseInt(matriculaField.getText());
        String email = emailField.getText();
        String telefone = telefoneField.getText();

        Aluno novoAluno = new Aluno(nome, dataNascimento, numero, 0, telefone, dataNascimento, email);
        escola.adicionarAluno(novoAluno);
        JOptionPane.showMessageDialog(this, "Aluno adicionado com sucesso!");
        limparCampos();
    }

    private void limparCampos() {
        nomeField.setText("");
        dataNascField.setText("");
        matriculaField.setText("");
        emailField.setText("");
        telefoneField.setText("");
    }
}
