/*
JFrom Principal
 */
package formularios;

// Palette Deslizamiento    - Carpeta Deslizamiento
import clases.Libro;
import clases.cBaseDatos;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;
import clases.funcion;
import java.awt.Dimension;
/**
 *
 * @author alber
 */
public class Principal extends javax.swing.JFrame {
    // variables
    String hora, minutos,segundos;
    Thread hilo;
             //Lista de Area de Herramientas      27/01/2020
     DefaultTableModel model = null;
        private cBaseDatos con = new cBaseDatos();
       funcion func= new funcion();
    public Principal() {
   
        initComponents();
        
        //botones
               btnEditar.setEnabled(false);  
               btnGuardar.setEnabled(true);
               btnCancelar.setEnabled(false);
               btnEliminar.setEnabled(false); 
               
        this.setLocationRelativeTo(this);
                this.setResizable(false);
        this.cmbCategoria.setModel(con.Obt_Categoria());
        // Textto de titulo
        setTitle("Municipalidad de Socabaya ");
        setIconImage( new ImageIcon(getClass().getResource("/img/logosocabaya.png")).getImage());
        
      // Color de JFrame   2/02/2020
          this.getContentPane().setBackground(Color.white);
       // Color de Jpanel   07/02/2020    
         panel2.setBackground(Color.white);        
            // panel1.setBackground(Color.white);    
          panel3.setBackground(Color.white);        
        panel4.setBackground(Color.white);         
        
        //Ejecutar JFrame en FullScreen y/o Maximizado    02/02/2020
      this.setExtendedState(MAXIMIZED_BOTH);
        
      


//Centrar jframe de codigo
          rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this,false);  
        
        
        // Sesion de Carga Lista de Herramientas
       cargarLista();     
       
       

       
       
       
       
       
       
    }
    
     // Seccion de Herramientas   
 
// Listado del libro    25/01/2020
        public void cargarLista(){
        model = new DefaultTableModel();        
        tblLista.setModel(model);
        model.addColumn("CODIGO");
        model.addColumn("TITULO");
        model.addColumn("AUTOR");
        model.addColumn("CATEGORIA");
        model.addColumn("EDITORIAL");
        model.addColumn("FECHA INGRESO");
        model.addColumn("DESCRIPCION");
        model.addColumn("CANTIDAD");
                      
        Libro libro = new Libro();
        Vector arrLibro = (Vector)libro.getLibro();
        for(int i=0;i<arrLibro.size();i++){
            Vector dato = (Vector)arrLibro.get(i);
                model.addRow(dato);
        }
        tblLista.updateUI();  
                
    }  
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        btn1 = new rojerusan.RSButtonIconI();
        btn2 = new rojerusan.RSButtonIconI();
        btn3 = new rojerusan.RSButtonIconI();
        btn4 = new rojerusan.RSButtonIconI();
        btnSalir = new rojerusan.RSButtonIconI();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panel2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        letraCodigo = new javax.swing.JLabel();
        txtCodigo = new rojeru_san.RSMTextFull();
        letraCodigo1 = new javax.swing.JLabel();
        txtTitulo = new rojeru_san.RSMTextFull();
        letraCodigo2 = new javax.swing.JLabel();
        txtAutor = new rojeru_san.RSMTextFull();
        letraCodigo3 = new javax.swing.JLabel();
        cmbCategoria = new rojerusan.RSComboMetro();
        letraCodigo4 = new javax.swing.JLabel();
        txtEditorial = new rojeru_san.RSMTextFull();
        letraCodigo5 = new javax.swing.JLabel();
        letraCodigo6 = new javax.swing.JLabel();
        txtCantidad = new rojeru_san.RSMTextFull();
        btnEditar = new rojerusan.RSButtonRound();
        btnEliminar = new rojerusan.RSButtonRound();
        btnGuardar = new rojerusan.RSButtonRound();
        btnCancelar = new rojerusan.RSButtonRound();
        letraCodigo7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        letraCodigo9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        dtFecha = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ListaLibro = new javax.swing.JScrollPane();
        tblLista = new rojerusan.RSTableMetro();
        panel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMenu.setPreferredSize(new java.awt.Dimension(319, 731));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 51, 0));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 102, 51));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letra.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        btn1.setBackground(new java.awt.Color(255, 102, 51));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio.png"))); // NOI18N
        btn1.setText("Inicio");
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setName("btn1"); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 102, 51));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Herramientas.png"))); // NOI18N
        btn2.setText("Herramientas");
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setName("btn2"); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 102, 51));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Filtro.png"))); // NOI18N
        btn3.setText("Busqueda");
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setName("btn3"); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 102, 51));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Manual.png"))); // NOI18N
        btn4.setText("Manual");
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setName("btn4"); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 102, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setName("btn3"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setName("panel2"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1067, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sesion Herramientas ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1025, 271));

        letraCodigo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo.setText("Codigo de Libro :");

        txtCodigo.setPlaceholder("");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        letraCodigo1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo1.setText("Titulo :");

        letraCodigo2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo2.setText("Autor :");

        letraCodigo3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo3.setText("Categoria :");

        cmbCategoria.setMaximumRowCount(4);
        cmbCategoria.setAutoscrolls(true);
        cmbCategoria.setColorArrow(new java.awt.Color(32, 131, 255));
        cmbCategoria.setColorFondo(new java.awt.Color(32, 131, 255));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        letraCodigo4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo4.setText("Editorial :");

        letraCodigo5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo5.setText("Fecha de Ingreso :");

        letraCodigo6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo6.setText("Cantidad:");

        txtCantidad.setPlaceholder("");
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnEditar.setText("Modificar");
        btnEditar.setColorHover(new java.awt.Color(255, 102, 51));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setColorHover(new java.awt.Color(255, 102, 51));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 51));
        btnGuardar.setText("Guardar ");
        btnGuardar.setColorHover(new java.awt.Color(255, 102, 51));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 102, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorHover(new java.awt.Color(255, 102, 51));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        letraCodigo7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo7.setText("Fecha de Ingreso:");

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 112, 192));

        letraCodigo9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        letraCodigo9.setText("Descripcion :");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(117, 165, 230), 2, true));
        jScrollPane1.setViewportView(txtDescripcion);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkSP.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        dtFecha.setForeground(new java.awt.Color(0, 153, 153));
        dtFecha.setDateFormatString("yyyy-MM-dd");
        dtFecha.setMaxSelectableDate(new java.util.Date(253370786477000L));
        dtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtFechaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dtFechaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letraCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraCodigo9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(letraCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(letraCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(letraCodigo9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letraCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(letraCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(letraCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(letraCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(letraCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(letraCodigo7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 286));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Lista de Libro Agregados");

        ListaLibro.setBackground(new java.awt.Color(255, 255, 255));

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLista.setColorBackgoundHead(new java.awt.Color(255, 102, 51));
        tblLista.setColorBordeFilas(new java.awt.Color(255, 102, 51));
        tblLista.setColorBordeHead(new java.awt.Color(255, 102, 51));
        tblLista.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        ListaLibro.setViewportView(tblLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ListaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(panel2, "card2");

        panel3.setName("panel3"); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));
        jPanel6.setPreferredSize(new java.awt.Dimension(1067, 90));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sesion Busqueda");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 590, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(panel3, "card4");

        panel4.setName("panel4"); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 102, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(1067, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sesion Manual");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 590, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(panel4, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // Boton de Inicio - LLamado de Panel1
             
            if(!this.btn1.isSelected()){
            this.btn1.setSelected(true);
            this.btn2.setSelected(false);
            this.btn3.setSelected(false);  
            this.btn4.setSelected(false);              
      //  rSPanelsSlider1.setPanelSlider(1, panel1, RSPanelsSlider.DIRECT.RIGHT);
        }
              
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
            // Boton de Herramientas - LLamado de Panel2 
        
            if(!this.btn2.isSelected()){
            this.btn1.setSelected(false);
            this.btn2.setSelected(true);
            this.btn3.setSelected(false);
            this.btn4.setSelected(false);              
         rSPanelsSlider1.setPanelSlider(1, panel2, RSPanelsSlider.DIRECT.RIGHT);   
            
         }  
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
             // Boton de Busqueda - LLamado de Panel1
             
            if(!this.btn3.isSelected()){
            this.btn1.setSelected(false);
            this.btn2.setSelected(false);
            this.btn3.setSelected(true); 
            this.btn4.setSelected(false);  
        rSPanelsSlider1.setPanelSlider(1, panel3, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
              // Boton de Manual - LLamado de Panel1
             
            if(!this.btn4.isSelected()){
            this.btn1.setSelected(false);
            this.btn2.setSelected(false);
            this.btn3.setSelected(false); 
            this.btn4.setSelected(true);     
        rSPanelsSlider1.setPanelSlider(1, panel4, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn4ActionPerformed

 private void rSButtonRound8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Boton de Elminar
    int i = JOptionPane.showConfirmDialog(null,"Realmente desea eliminar este registro?");
        if(i==JOptionPane.YES_OPTION){
            Libro libro = new Libro();
            String dato = txtCodigo.getText().toString().trim();
            try {
                libro.eliminarLibro(dato);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar Registro.");
            }
        }
    //    btnAgregar.setEnabled(true);
      //  btnEditar.setEnabled(false);  
        //btnGuardar.setEnabled(false);
      //  btnCancelar.setEnabled(false);
       // btnEliminar.setEnabled(false);
    
        
        
        
        
        
        
//        int fila=tblLista.getSelectedRow();
//        if(fila>=0){
//            model.removeRow(fila);
//            
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "Seleccione La Fila");
//        }

      
        
        // Opcion Adicional de Eliminar Todo
       /*
        int fila = tblLista.getRowCount();
        for ( int i = fila-1; i >=0 ; i--)¨{
        model.removeRow(i);
        }
        
        
        */
        
    }                                      
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            int rpta= JOptionPane.showConfirmDialog(null, "Desea Salir Del Sitema","Biblioteca Municipal", 
                JOptionPane.YES_NO_OPTION);
        
        if ( rpta == JOptionPane.YES_NO_OPTION){  
        System.exit(0);
        
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
             // AREA DE TBLISTA
        
            // Metodo para el momento de seleccionar una lista permita poner los datos para modificaicones
        
        int fila = tblLista.getSelectedRow();
txtCodigo.setText(tblLista.getValueAt(fila, 0) + "");
txtTitulo.setText(tblLista.getValueAt(fila, 1) + "");
txtAutor.setText(tblLista.getValueAt(fila, 2) + "");
cmbCategoria.setSelectedItem((String) tblLista.getValueAt(fila, 3));
//txtFecha.setText(tblLista.getValueAt(fila, 4) + "");

// FALTA INRGESO DE CALENDAR  txtFecha
txtEditorial.setText(tblLista.getValueAt(fila, 4) + "");
txtFecha.setText(tblLista.getValueAt(fila, 5) + "");

txtDescripcion.setText(tblLista.getValueAt(fila, 6) + "");
txtCantidad.setText(tblLista.getValueAt(fila, 7) + "");


//          btnAgregar.setEnabled(true);  // Area de Moficada 20/01/2020
            btnEditar.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblListaMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        txtFecha.setText(func.getFecha(dtFecha));

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void dtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtFechaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_dtFechaMouseClicked

    private void dtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtFechaMousePressed

    }//GEN-LAST:event_dtFechaMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        cmbCategoria.setSelectedItem("Seleccione Categoria");
        //txtFecha.setText(tblLista.getValueAt(fila, 4) + "");

        // FALTA INRGESO DE CALENDAR  txtFecha
        txtEditorial.setText("");
        txtFecha.setText("");

        txtDescripcion.setText("");
        txtCantidad.setText("");

        //          btnAgregar.setEnabled(true);  // Area de Moficada 20/01/2020
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null,"Realmente desea guardar este registro?");
        if(i==JOptionPane.YES_OPTION){
            Libro libro = new Libro();
            String[] datos = new String[8];
            datos[0] = txtCodigo.getText().toString().trim();
            datos[1] = txtTitulo.getText().toString().trim();
            datos[2] = txtAutor.getText().toString().trim();
            datos[3] = (String)cmbCategoria.getSelectedItem();
            datos[4] = txtEditorial.getText().toString().trim();  
  //          datos[4] = txtFecha.getText().toString().trim();
            datos[5] = txtFecha.getText().toString().trim();  
     
            datos[6] = txtDescripcion.getText().toString().trim();
            datos[7] = txtCantidad.getText().toString().trim();
            try {
                libro.grabarNuevoLibro(datos);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro agregado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar insertar Registro.");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null,"Realmente desea editar este registro?");
        if(i==JOptionPane.YES_OPTION){
            Libro libros= new Libro();
            String[] datos = new String[8];
            datos[0] = txtCodigo.getText().toString().trim();
            datos[1] = txtTitulo.getText().toString().trim();
            datos[2] = txtAutor.getText().toString().trim();
            datos[3] = (String)cmbCategoria.getSelectedItem();
            datos[4] = txtEditorial.getText().toString().trim();  
  //          datos[4] = txtFecha.getText().toString().trim();
            datos[5] = txtFecha.getText().toString().trim();  
     
            datos[6] = txtDescripcion.getText().toString().trim();
            datos[7] = txtCantidad.getText().toString().trim();
            try {
                libros.modificarLibro(datos);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro modificado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar editar Registro.");
            }
        }
        
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
           int i = JOptionPane.showConfirmDialog(null,"Realmente desea eliminar este registro?");
        if(i==JOptionPane.YES_OPTION){
            Libro libro = new Libro();
            String dato = txtCodigo.getText().toString().trim();
            try {
                libro.eliminarLibro(dato);
                cargarLista();
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar Registro.");
            }
        }
     
        btnEditar.setEnabled(false);  
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
    
        
        
        
        
        
        
//        int fila=tblLista.getSelectedRow();
//        if(fila>=0){
//            model.removeRow(fila);
//            
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "Seleccione La Fila");
//        }

      
        
        // Opcion Adicional de Eliminar Todo
       /*
        int fila = tblLista.getRowCount();
        for ( int i = fila-1; i >=0 ; i--)¨{
        model.removeRow(i);
        }
        
        
        */
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListaLibro;
    private javax.swing.JPanel PanelMenu;
    private rojerusan.RSButtonIconI btn1;
    private rojerusan.RSButtonIconI btn2;
    private rojerusan.RSButtonIconI btn3;
    private rojerusan.RSButtonIconI btn4;
    private javax.swing.JButton btnAgregar;
    private rojerusan.RSButtonRound btnCancelar;
    private rojerusan.RSButtonRound btnEditar;
    private rojerusan.RSButtonRound btnEliminar;
    private rojerusan.RSButtonRound btnGuardar;
    private rojerusan.RSButtonIconI btnSalir;
    private rojerusan.RSComboMetro cmbCategoria;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel letraCodigo;
    private javax.swing.JLabel letraCodigo1;
    private javax.swing.JLabel letraCodigo2;
    private javax.swing.JLabel letraCodigo3;
    private javax.swing.JLabel letraCodigo4;
    private javax.swing.JLabel letraCodigo5;
    private javax.swing.JLabel letraCodigo6;
    private javax.swing.JLabel letraCodigo7;
    private javax.swing.JLabel letraCodigo9;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSTableMetro tblLista;
    private rojeru_san.RSMTextFull txtAutor;
    private rojeru_san.RSMTextFull txtCantidad;
    private rojeru_san.RSMTextFull txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private rojeru_san.RSMTextFull txtEditorial;
    private javax.swing.JLabel txtFecha;
    private rojeru_san.RSMTextFull txtTitulo;
    // End of variables declaration//GEN-END:variables
}
