/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import gui.ButtonEditor;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.SHORT;
import static java.util.Calendar.YEAR;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JCheckBox;
import sistematurno.Turno;



/**
 *
 * @author Lisa
 */
public class VerTurnos extends javax.swing.JFrame {
    private Turno turno;
    

    /**
     * Creates new form VerTurnos
     */
    public VerTurnos() {
        initComponents();
        this.setTableModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVerTurno = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        jLabelBuscarMedico = new javax.swing.JLabel();
        jComboBoxVerMedico = new javax.swing.JComboBox<>();
        jButtonBuscarMedico = new javax.swing.JButton();
        jButtonVerUnTurno = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Turnos");

        jPanelVerTurno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTable1.setAutoscrolls(isFocusTraversalPolicyProvider());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        jLabelBuscarMedico.setText("Buscar por Médico");

        jComboBoxVerMedico.setEditable(true);
        jComboBoxVerMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVerMedicoActionPerformed(evt);
            }
        });

        jButtonBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMedicoActionPerformed(evt);
            }
        });

        jButtonVerUnTurno.setText("Ver");
        jButtonVerUnTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerUnTurnoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVerTurnoLayout = new javax.swing.GroupLayout(jPanelVerTurno);
        jPanelVerTurno.setLayout(jPanelVerTurnoLayout);
        jPanelVerTurnoLayout.setHorizontalGroup(
            jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVerTurnoLayout.createSequentialGroup()
                        .addComponent(jLabelBuscarMedico)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxVerMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerUnTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanelVerTurnoLayout.setVerticalGroup(
            jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerTurnoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBuscarMedico)
                        .addComponent(jComboBoxVerMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelVerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVerTurnoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonVerUnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanelVerTurnoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVerTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVerTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonVerUnTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerUnTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVerUnTurnoActionPerformed

    private void jButtonBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarMedicoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        /*int row = jTable1.getRowCount();
        int column = jTable1.getColumnCount();
        System.out.println(jTable1.getComponentAt(row, column));//setBackground(Color.red);*/
        
        RegistrarTurno vt= new RegistrarTurno(); //Creo un objeto del formulario
        int columna = jTable1.getSelectedColumn(); // Nombre de la cabecera columna
        int row = jTable1.getSelectedRow();        // Nombre de la cabecera fila
        if(jTable1.getValueAt(row, columna)!=null){  
            //vt.setTurno((Turno)jTable1.getValueAt(row, columna));
    }//GEN-LAST:event_jTable1MouseClicked
        else{
            Turno t = new Turno();
            String cab = titulos[columna];
            String fila = (String)jTable1.getValueAt(row, 0);
            String []fecha = cab.split(" |/");
            int d = Integer.parseInt(fecha[1]);
            int m = Integer.parseInt(fecha[2])-1;
            int a = Integer.parseInt(fecha[3]);
            String []hora = fila.split(":");
            int h = Integer.parseInt(hora[0]);
            int min = Integer.parseInt(hora[1]);
            t.cambiarFecha(new GregorianCalendar(a,m,d,h,min));
        
        vt.setTurno(t);
        }
        vt.setVisible(true);
        jTable1.setValueAt(vt.getTurno(), row, columna);
    }    
        

    private void jComboBoxVerMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVerMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVerMedicoActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VerTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable(){ 
            
    
            public void run(){
                new VerTurnos().setVisible(true);
            }
        });
    }
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarMedico;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonVerUnTurno;
    private javax.swing.JComboBox<String> jComboBoxVerMedico;
    private javax.swing.JLabel jLabelBuscarMedico;
    private javax.swing.JPanel jPanelVerTurno;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private String []titulos;

    private void setTableModel() {
        GregorianCalendar f = new GregorianCalendar();
        String[] tit = new String[]{"Hora", "", "", "", "", "", ""};
        for (int i = 1; i < 7; i++) {
            tit[i] = f.getDisplayName(DAY_OF_WEEK, SHORT, new Locale("es"))
                    + " - " + f.get(DAY_OF_MONTH) + "/" + f.get(MONTH) + "/" + f.get(YEAR);
            if (f.get(DAY_OF_WEEK) == 7) {
                f.add(DAY_OF_MONTH, 2);
            } else {
                f.add(DAY_OF_MONTH, 1);
            }
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"8:00", null, null, null, null, null, null},
                    {"8:30", null, null, null, null, null, null},
                    {"9:00", null, null, null, null, null, null},
                    {"9:30", null, null, null, null, null, null},
                    {"10:00", null, null, null, null, null, null},
                    {"10:30", null, null, null, null, null, null},
                    {"11:00", null, null, null, null, null, null},
                    {"11:30", null, null, null, null, null, null},
                    {"12:00", null, null, null, null, null, null},
                    {"12:30", null, null, null, null, null, null},
                    {"14:00", null, null, null, null, null, null},
                    {"14:30", null, null, null, null, null, null},
                    {"15:00", null, null, null, null, null, null},
                    {"15:30", null, null, null, null, null, null},
                    {"16:00", null, null, null, null, null, null},
                    {"16:30", null, null, null, null, null, null},
                    {"17:00", null, null, null, null, null, null},
                    {"17:30", null, null, null, null, null, null},
                    {"18:00", null, null, null, null, null, null},
                    {"18:30", null, null, null, null, null, null},
                    {"19:00", null, null, null, null, null, null},
                    {"19:30", null, null, null, null, null, null},
                    {"20:00", null, null, null, null, null, null},
                    {"20:30", null, null, null, null, null, null},},
                tit
        ));
        jTable1.setRowHeight(30);
        this.setRenderer(tit);
    }

    private void setRenderer(String[] tit) {
        for(int i=1;i<7;i++){
            this.jTable1.getColumn(tit[i]).setCellRenderer(new ButtonRenderer());
            this.jTable1.getColumn(tit[i]).setCellEditor(new ButtonEditor(new JCheckBox()));
        }
    }
}
