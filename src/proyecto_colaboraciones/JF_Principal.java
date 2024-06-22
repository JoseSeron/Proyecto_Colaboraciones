/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_colaboraciones;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author joser
 */
public class JF_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JF_Principal
     */
    public JF_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_fondo = new javax.swing.JPanel();
        jp_stats = new javax.swing.JPanel();
        jp_estadisticas_utilizado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_stats_utilizado = new javax.swing.JLabel();
        jp_estadisticas_utilizado1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jl_stats_intentos = new javax.swing.JLabel();
        jp_estadisticas_utilizado2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jl_stats_voluntad = new javax.swing.JLabel();
        jp_estadisticas_utilizado3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jl_stats_ejecucion = new javax.swing.JLabel();
        jp_colaboradores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_archivo = new javax.swing.JComboBox<>();
        jb_buscarAleatorio = new javax.swing.JButton();
        cb_modos = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jl_colaboracionesClicleable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl_indiceCero = new javax.swing.JLabel();
        jl_nombreCero = new javax.swing.JLabel();
        jb_menosCero = new javax.swing.JButton();
        jl_masCero = new javax.swing.JButton();
        jl_colaboracionesCero = new javax.swing.JLabel();
        pb_porcentajeCero = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_administracion = new javax.swing.JMenu();
        jmi_colaboradores = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        jmi_acerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colaboraciones V1.0 por Jose Seron");
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setPreferredSize(new java.awt.Dimension(1040, 725));
        setSize(jp_fondo.getPreferredSize());

        jp_fondo.setBackground(new java.awt.Color(255, 255, 255));
        jp_fondo.setPreferredSize(new java.awt.Dimension(1040, 666));

        jp_stats.setBackground(new java.awt.Color(153, 153, 153));

        jp_estadisticas_utilizado.setBackground(new java.awt.Color(204, 255, 255));
        jp_estadisticas_utilizado.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UTILIZADO");

        jl_stats_utilizado.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jl_stats_utilizado.setForeground(new java.awt.Color(0, 0, 0));
        jl_stats_utilizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_stats_utilizado.setText("000000");

        javax.swing.GroupLayout jp_estadisticas_utilizadoLayout = new javax.swing.GroupLayout(jp_estadisticas_utilizado);
        jp_estadisticas_utilizado.setLayout(jp_estadisticas_utilizadoLayout);
        jp_estadisticas_utilizadoLayout.setHorizontalGroup(
            jp_estadisticas_utilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_estadisticas_utilizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_estadisticas_utilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_stats_utilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jp_estadisticas_utilizadoLayout.setVerticalGroup(
            jp_estadisticas_utilizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_estadisticas_utilizadoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_stats_utilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_estadisticas_utilizado1.setBackground(new java.awt.Color(102, 255, 255));
        jp_estadisticas_utilizado1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INTENTOS");

        jl_stats_intentos.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jl_stats_intentos.setForeground(new java.awt.Color(0, 0, 0));
        jl_stats_intentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_stats_intentos.setText("000000");

        javax.swing.GroupLayout jp_estadisticas_utilizado1Layout = new javax.swing.GroupLayout(jp_estadisticas_utilizado1);
        jp_estadisticas_utilizado1.setLayout(jp_estadisticas_utilizado1Layout);
        jp_estadisticas_utilizado1Layout.setHorizontalGroup(
            jp_estadisticas_utilizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_estadisticas_utilizado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_estadisticas_utilizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_stats_intentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        jp_estadisticas_utilizado1Layout.setVerticalGroup(
            jp_estadisticas_utilizado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_estadisticas_utilizado1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_stats_intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_estadisticas_utilizado2.setBackground(new java.awt.Color(0, 255, 255));
        jp_estadisticas_utilizado2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VOLUNTAD");

        jl_stats_voluntad.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jl_stats_voluntad.setForeground(new java.awt.Color(0, 0, 0));
        jl_stats_voluntad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_stats_voluntad.setText("000000");

        javax.swing.GroupLayout jp_estadisticas_utilizado2Layout = new javax.swing.GroupLayout(jp_estadisticas_utilizado2);
        jp_estadisticas_utilizado2.setLayout(jp_estadisticas_utilizado2Layout);
        jp_estadisticas_utilizado2Layout.setHorizontalGroup(
            jp_estadisticas_utilizado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_estadisticas_utilizado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_estadisticas_utilizado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_stats_voluntad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        jp_estadisticas_utilizado2Layout.setVerticalGroup(
            jp_estadisticas_utilizado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_estadisticas_utilizado2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_stats_voluntad, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_estadisticas_utilizado3.setBackground(new java.awt.Color(0, 153, 153));
        jp_estadisticas_utilizado3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EJECUCIÓN");

        jl_stats_ejecucion.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        jl_stats_ejecucion.setForeground(new java.awt.Color(0, 0, 0));
        jl_stats_ejecucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_stats_ejecucion.setText("000000");

        javax.swing.GroupLayout jp_estadisticas_utilizado3Layout = new javax.swing.GroupLayout(jp_estadisticas_utilizado3);
        jp_estadisticas_utilizado3.setLayout(jp_estadisticas_utilizado3Layout);
        jp_estadisticas_utilizado3Layout.setHorizontalGroup(
            jp_estadisticas_utilizado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_estadisticas_utilizado3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_estadisticas_utilizado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_stats_ejecucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        jp_estadisticas_utilizado3Layout.setVerticalGroup(
            jp_estadisticas_utilizado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_estadisticas_utilizado3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_stats_ejecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_statsLayout = new javax.swing.GroupLayout(jp_stats);
        jp_stats.setLayout(jp_statsLayout);
        jp_statsLayout.setHorizontalGroup(
            jp_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_statsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_estadisticas_utilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_estadisticas_utilizado1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_estadisticas_utilizado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_estadisticas_utilizado3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_statsLayout.setVerticalGroup(
            jp_statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_statsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_estadisticas_utilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_estadisticas_utilizado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_estadisticas_utilizado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_estadisticas_utilizado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_colaboradores.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Colaboradores");

        cb_archivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jb_buscarAleatorio.setText("BUSCAR");

        cb_modos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple Aleatoria", "Lista Aleatoria", "Rueda Aletoria" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("##");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NOMBRE DE COLABORADOR");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jl_colaboracionesClicleable.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jl_colaboracionesClicleable.setForeground(new java.awt.Color(0, 0, 0));
        jl_colaboracionesClicleable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_colaboracionesClicleable.setText("COLABORACIONES (Clic para actualizar)");
        jl_colaboracionesClicleable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PORCENTAJE");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jl_indiceCero.setBackground(new java.awt.Color(255, 255, 255));
        jl_indiceCero.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jl_indiceCero.setForeground(new java.awt.Color(0, 0, 0));
        jl_indiceCero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jl_indiceCero.setText("00");
        jl_indiceCero.setOpaque(true);

        jl_nombreCero.setBackground(new java.awt.Color(255, 255, 255));
        jl_nombreCero.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jl_nombreCero.setForeground(new java.awt.Color(0, 0, 0));
        jl_nombreCero.setText("PARTICIPANTE ##");
        jl_nombreCero.setOpaque(true);

        jb_menosCero.setText("-");

        jl_masCero.setText("+");

        jl_colaboracionesCero.setBackground(new java.awt.Color(255, 255, 255));
        jl_colaboracionesCero.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jl_colaboracionesCero.setForeground(new java.awt.Color(0, 0, 0));
        jl_colaboracionesCero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jl_colaboracionesCero.setText("##");
        jl_colaboracionesCero.setOpaque(true);

        jButton1.setText("prueba");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_colaboradoresLayout = new javax.swing.GroupLayout(jp_colaboradores);
        jp_colaboradores.setLayout(jp_colaboradoresLayout);
        jp_colaboradoresLayout.setHorizontalGroup(
            jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_colaboradoresLayout.createSequentialGroup()
                                .addComponent(cb_modos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_buscarAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_archivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jl_indiceCero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jl_nombreCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                                .addComponent(jb_menosCero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jl_colaboracionesCero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jl_masCero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jl_colaboracionesClicleable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pb_porcentajeCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_colaboradoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        jp_colaboradoresLayout.setVerticalGroup(
            jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_colaboradoresLayout.createSequentialGroup()
                        .addComponent(cb_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_buscarAleatorio)
                            .addComponent(cb_modos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jl_colaboracionesClicleable)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_masCero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jl_colaboracionesCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_menosCero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jp_colaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_indiceCero)
                            .addComponent(jl_nombreCero))
                        .addComponent(pb_porcentajeCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jp_fondoLayout = new javax.swing.GroupLayout(jp_fondo);
        jp_fondo.setLayout(jp_fondoLayout);
        jp_fondoLayout.setHorizontalGroup(
            jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_colaboradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_fondoLayout.setVerticalGroup(
            jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_colaboradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jm_administracion.setText("Administración");

        jmi_colaboradores.setText("Colaboradores");
        jm_administracion.add(jmi_colaboradores);

        jMenuBar1.add(jm_administracion);

        Ayuda.setText("Ayuda");

        jmi_acerca.setText("Acerca");
        Ayuda.add(jmi_acerca);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("colabo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        /*
        for (int i = 0; i < 5; i++) {
             JLabel label = new JLabel();
             
             
             int posX = jl_indiceCero.getX();
             int posY = jl_indiceCero.getY();
             label.setBounds(posX, posY-jl_indiceCero.getHeight(), jl_indiceCero.getWidth(), jl_indiceCero.getHeight());
             
             label.setLocation(posX, posY+label.getHeight());
             jp_colaboradores.add(label);
        }
        */
        
           
    for (int i = 0; i < 40; i++) {
        JLabel label = new JLabel("00",SwingConstants.TRAILING);
        jp_colaboradores.add(label);
       
        int posX = jl_indiceCero.getX();
        int posY = jl_indiceCero.getY() + (i + 1) * jl_indiceCero.getHeight();
        
        label.setBounds(posX, posY, jl_indiceCero.getWidth(), jl_indiceCero.getHeight());
        label.setOpaque(true);
  
        label.setFont(jl_indiceCero.getFont());
        
    }
   
    jp_colaboradores.revalidate();
    jp_colaboradores.repaint();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JComboBox<String> cb_archivo;
    private javax.swing.JComboBox<String> cb_modos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jb_buscarAleatorio;
    private javax.swing.JButton jb_menosCero;
    private javax.swing.JLabel jl_colaboracionesCero;
    private javax.swing.JLabel jl_colaboracionesClicleable;
    private javax.swing.JLabel jl_indiceCero;
    private javax.swing.JButton jl_masCero;
    private javax.swing.JLabel jl_nombreCero;
    private javax.swing.JLabel jl_stats_ejecucion;
    private javax.swing.JLabel jl_stats_intentos;
    private javax.swing.JLabel jl_stats_utilizado;
    private javax.swing.JLabel jl_stats_voluntad;
    private javax.swing.JMenu jm_administracion;
    private javax.swing.JMenuItem jmi_acerca;
    private javax.swing.JMenuItem jmi_colaboradores;
    private javax.swing.JPanel jp_colaboradores;
    private javax.swing.JPanel jp_estadisticas_utilizado;
    private javax.swing.JPanel jp_estadisticas_utilizado1;
    private javax.swing.JPanel jp_estadisticas_utilizado2;
    private javax.swing.JPanel jp_estadisticas_utilizado3;
    private javax.swing.JPanel jp_fondo;
    private javax.swing.JPanel jp_stats;
    private javax.swing.JProgressBar pb_porcentajeCero;
    // End of variables declaration//GEN-END:variables
}
