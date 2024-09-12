package view;


import javax.swing.SwingUtilities; // Importação necessária para SwingUtilities
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PreMatriculaSystem extends JFrame {
    public PreMatriculaSystem() {
        setTitle("Sistema de Pré-Matrícula");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuMatricula = new JMenu("Matrícula");
        JMenu menuRelatorios = new JMenu("Relatórios");

        JMenuItem menuItemSair = new JMenuItem("Sair");
        menuItemSair.addActionListener(e -> System.exit(0));

        JMenuItem menuItemAlunos = new JMenuItem("Alunos");
        JMenuItem menuItemDisciplinas = new JMenuItem("Disciplinas");
        JMenuItem menuItemRealizarMatricula = new JMenuItem("Realizar");
        JMenuItem menuItemCancelarMatricula = new JMenuItem("Cancelar");
        JMenuItem menuItemRelatorioDisciplinas = new JMenuItem("Relatório de Disciplinas");
        JMenuItem menuItemRelatorioAlunos = new JMenuItem("Relatório de Alunos");

        menuArquivo.add(menuItemSair);
        menuCadastro.add(menuItemAlunos);
        menuCadastro.add(menuItemDisciplinas);
        menuMatricula.add(menuItemRealizarMatricula);
        menuMatricula.add(menuItemCancelarMatricula);
        menuRelatorios.add(menuItemRelatorioDisciplinas);
        menuRelatorios.add(menuItemRelatorioAlunos);

        menuBar.add(menuArquivo);
        menuBar.add(menuCadastro);
        menuBar.add(menuMatricula);
        menuBar.add(menuRelatorios);
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.add(new JLabel("Matrícula do Aluno:"));
        JTextField txtMatriculaAluno = new JTextField();
        inputPanel.add(txtMatriculaAluno);

        inputPanel.add(new JLabel("Nome do Aluno:"));
        JTextField txtNomeAluno = new JTextField();
        inputPanel.add(txtNomeAluno);

        inputPanel.add(new JLabel("Código da Disciplina:"));
        JTextField txtCodigoDisciplina = new JTextField();
        inputPanel.add(txtCodigoDisciplina);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnEditar = new JButton("Editar");
        JButton btnRemover = new JButton("Remover");
        JButton btnListar = new JButton("Listar");

        buttonPanel.add(btnAdicionar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnRemover);
        buttonPanel.add(btnListar);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PreMatriculaSystem frame = new PreMatriculaSystem();
            frame.setVisible(true);
        });
    }
}
