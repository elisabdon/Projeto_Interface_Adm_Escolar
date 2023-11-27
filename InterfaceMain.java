import javax.swing.*;
import java.awt.*;

public class InterfaceMain extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JButton alunoBtn, professorBtn, inscricaoBtn, diretorBtn, escolaBtn;
    private Escola escola;

    public InterfaceMain() {
        setTitle("Sistema de Gerenciamento Escolar");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        escola = new Escola("Nome da Escola", "Endereço", 1, 2023, new Diretor("Nome do Diretor", "Data", 1, "Telefone"));

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        AlunoPanel alunoPanel = new AlunoPanel(escola);
        ProfessorPanel professorPanel = new ProfessorPanel();
        InscricaoPanel inscricaoPanel = new InscricaoPanel(escola);
        DiretorPanel diretorPanel = new DiretorPanel(escola);
        EscolaPanel escolaPanel = new EscolaPanel();

        mainPanel.add(alunoPanel, "Aluno");
        mainPanel.add(professorPanel, "Professor");
        mainPanel.add(inscricaoPanel, "Inscricao");
        mainPanel.add(diretorPanel, "Diretor");
        mainPanel.add(escolaPanel, "Escola");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        alunoBtn = createStyledButton("Aluno");
        professorBtn = createStyledButton("Professor");
        inscricaoBtn = createStyledButton("Inscrição");
        diretorBtn = createStyledButton("Diretor");
        escolaBtn = createStyledButton("Escola");

        buttonPanel.add(alunoBtn);
        buttonPanel.add(professorBtn);
        buttonPanel.add(inscricaoBtn);
        buttonPanel.add(diretorBtn);
        buttonPanel.add(escolaBtn);

        alunoBtn.addActionListener(e -> cardLayout.show(mainPanel, "Aluno"));
        professorBtn.addActionListener(e -> cardLayout.show(mainPanel, "Professor"));
        inscricaoBtn.addActionListener(e -> cardLayout.show(mainPanel, "Inscricao"));
        diretorBtn.addActionListener(e -> cardLayout.show(mainPanel, "Diretor"));
        escolaBtn.addActionListener(e -> cardLayout.show(mainPanel, "Escola"));

        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfaceMain frame = new InterfaceMain();
            frame.setVisible(true);
        });
    }
}
