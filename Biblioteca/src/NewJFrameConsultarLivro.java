/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
class Livro {
    String titulo;
    String autor;
    boolean emprestado; // true = emprestado, false = disponível

    Livro(String titulo, String autor, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public String getStatus() {
        return emprestado ? "Emprestado" : "Disponível";
    }
}

 
public class NewJFrameConsultarLivro extends javax.swing.JFrame {
private Livro[] livros = {
  
        new Livro("Viagem ao Mundo em 80 Dias", "Jules Verne", false),
        new Livro("Dom Quixote", "Miguel de Cervantes", true),
        new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", false)
    };

    public NewJFrameConsultarLivro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblConsultaTitulo = new javax.swing.JLabel();
        lblConsultaAutor = new javax.swing.JLabel();
        txtConsultaTitulo = new javax.swing.JTextField();
        txtConsultaAutor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        bntLimpar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();

        tabelaResultado = new javax.swing.JTable();
        tabelaResultado.setModel(new DefaultTableModel(
            new Object [][] {},
            new String [] {"Título", "Autor", "Status"}
        ) {
            public boolean isCellEditable(int row, int column) {
                return false; // impede edição das células
            }
        });

        JScrollPane scroll = new JScrollPane(tabelaResultado);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Livro");
        setSize(550, 400);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        lblConsultaTitulo.setText("Título:");
        lblConsultaTitulo.setBounds(30, 20, 80, 25);
        getContentPane().add(lblConsultaTitulo);

        txtConsultaTitulo.setBounds(100, 20, 200, 25);
        getContentPane().add(txtConsultaTitulo);

        lblConsultaAutor.setText("Autor:");
        lblConsultaAutor.setBounds(30, 60, 80, 25);
        getContentPane().add(lblConsultaAutor);

        txtConsultaAutor.setBounds(100, 60, 200, 25);
        getContentPane().add(txtConsultaAutor);

        btnBuscar.setText("Buscar");
        btnBuscar.setBounds(320, 20, 100, 25);
        getContentPane().add(btnBuscar);

        bntLimpar.setText("Limpar");
        bntLimpar.setBounds(320, 60, 100, 25);
        getContentPane().add(bntLimpar);

        bntCancelar.setText("Cancelar");
        bntCancelar.setBounds(320, 100, 100, 25);
        getContentPane().add(bntCancelar);

        scroll.setBounds(30, 140, 440, 200);
        getContentPane().add(scroll);
         btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
         bntLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bntLimparActionPerformed(evt);
            }
        });
         bntCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }

            private void bntCancelarActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
   
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        lblConsultaTitulo = new javax.swing.JLabel();
        txtConsultaTitulo = new javax.swing.JTextField();
        lblConsultaAutor = new javax.swing.JLabel();
        txtConsultaAutor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        bntLimpar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaResultado = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConsultaTitulo.setText("Titulo:");

        lblConsultaAutor.setText("Autor:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        bntLimpar.setText("LIMPAR");
        bntLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimparActionPerformed(evt);
            }
        });

        bntCancelar.setText("CANCELAR");

        tabelaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Autor", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabelaResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblConsultaAutor)
                            .addComponent(lblConsultaTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsultaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsultaTitulo)
                            .addComponent(txtConsultaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsultaAutor)
                            .addComponent(txtConsultaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(bntLimpar)
                    .addComponent(bntCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     String tituloBusca = txtConsultaTitulo.getText().trim().toLowerCase();
        String autorBusca = txtConsultaAutor.getText().trim().toLowerCase();

        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
        model.setRowCount(0); // limpa tabela

        for (Livro l : livros) {
            boolean tituloOK = tituloBusca.isEmpty() || l.titulo.toLowerCase().contains(tituloBusca);
            boolean autorOK = autorBusca.isEmpty() || l.autor.toLowerCase().contains(autorBusca);

            if (tituloOK && autorOK) {
                model.addRow(new Object[]{l.titulo, l.autor, l.getStatus()});
            }
        }

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum livro encontrado com esses critérios.");
        }
    }
       
  // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed
    txtConsultaTitulo.setText("");
        txtConsultaAutor.setText("");
        DefaultTableModel model = (DefaultTableModel) tabelaResultado.getModel();
        model.setRowCount(0);
    }

    // Ação do botão Cancelar
    private void bntCancelarActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameConsultarLivro().setVisible(true);
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_bntLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntLimpar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConsultaAutor;
    private javax.swing.JLabel lblConsultaTitulo;
    private javax.swing.JTable tabelaResultado;
    private javax.swing.JTextField txtConsultaAutor;
    private javax.swing.JTextField txtConsultaTitulo;
    // End of variables declaration//GEN-END:variables
}

