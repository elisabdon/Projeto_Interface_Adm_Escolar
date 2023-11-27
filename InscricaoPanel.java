import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class InscricaoPanel extends JPanel {
    private JComboBox<Aluno> alunoComboBox;
    private JComboBox<Curso> cursoComboBox;
    private JButton inscreverBtn, limparBtn;
    private JTextArea detalhesInscricaoArea;

    public InscricaoPanel() {
        setLayout(new BorderLayout(5, 5)); 

        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        
        alunoComboBox = new JComboBox<>(); 
        cursoComboBox = new JComboBox<>(); 

        inputPanel.add(new JLabel("Selecione o Aluno:"));
        inputPanel.add(alunoComboBox);
        inputPanel.add(new JLabel("Selecione o Curso:"));
        inputPanel.add(cursoComboBox);

        inscreverBtn = new JButton("Inscrever");
        limparBtn = new JButton("Limpar");

        inscreverBtn.addActionListener(e -> inscreverAluno());
        limparBtn.addActionListener(e -> limparCampos());

        detalhesInscricaoArea = new JTextArea(10, 30);
        detalhesInscricaoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(detalhesInscricaoArea);

        add(inputPanel, BorderLayout.NORTH);
        add(inscreverBtn, BorderLayout.WEST);
        add(limparBtn, BorderLayout.EAST);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void inscreverAluno() {
        Aluno alunoSelecionado = (Aluno) alunoComboBox.getSelectedItem();
        Curso cursoSelecionado = (Curso) cursoComboBox.getSelectedItem();
        Date dataAtual = new Date();

        Inscricao novaInscricao = new Inscricao(alunoSelecionado, cursoSelecionado);
        novaInscricao.setDataInscricao(dataAtual); 

        detalhesInscricaoArea.append(novaInscricao.toString() + "\n");
    }

    private void limparCampos() {
        alunoComboBox.setSelectedIndex(0);
        cursoComboBox.setSelectedIndex(0);
        detalhesInscricaoArea.setText("");
    }
}
