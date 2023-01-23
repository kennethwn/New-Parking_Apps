package com.mycompany.parkingmanagement;

import com.mycompany.parkingmanagement.logic.Vehicle;
import com.mycompany.parkingmanagement.logic.Vehicles.Create;
import com.mycompany.parkingmanagement.logic.Vehicles.Dashboard;
import com.mycompany.parkingmanagement.logic.Vehicles.Edit;
import com.mycompany.parkingmanagement.logic.Vehicles.History;
import com.mycompany.parkingmanagement.logic.Vehicles.VehicleList;
import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class MainView extends javax.swing.JFrame {
  private boolean flag = false;
  
  private String nopol;
  private String selectedTypeText;
  private String selectedMemberText;
   
  private StyleGuide cta_button = new StyleGuide();
  private StyleGuide _font = new StyleGuide();
  
  private Dashboard dashboard;
  private VehicleList vehicle_list = new VehicleList();
  private History history = new History();
  private Create create = new Create();
  private Edit edit = new Edit();

  /** Creates new form MainView */
  public MainView() {
    setUndecorated(false);
    initComponents();
    setTitle("Parking Management System");
    setLocationRelativeTo(null);
    setResizable(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    typeGroup = new javax.swing.ButtonGroup();
    membershipGroup = new javax.swing.ButtonGroup();
    tambahTypeGroup = new javax.swing.ButtonGroup();
    tambahMembershipGroup = new javax.swing.ButtonGroup();
    main_panel = new javax.swing.JPanel();
    side_panel = new javax.swing.JPanel();
    jSeparator1 = new javax.swing.JSeparator();
    title = new javax.swing.JLabel();
    user_pic = new javax.swing.JLabel();
    cta_beranda = new javax.swing.JPanel();
    home_icon = new javax.swing.JLabel();
    beranda = new javax.swing.JLabel();
    cta_daftar_kendaraan = new javax.swing.JPanel();
    list_icon = new javax.swing.JLabel();
    daftar_kendaraan = new javax.swing.JLabel();
    cta_riwayat = new javax.swing.JPanel();
    repo_icon = new javax.swing.JLabel();
    riwayat = new javax.swing.JLabel();
    cta_tambah = new javax.swing.JPanel();
    tambah_title = new javax.swing.JLabel();
    icon_tambah = new javax.swing.JLabel();
    jSeparator3 = new javax.swing.JSeparator();
    cta_delete = new javax.swing.JPanel();
    delete_title = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jSeparator2 = new javax.swing.JSeparator();
    cta_signout = new javax.swing.JPanel();
    signout_icon = new javax.swing.JLabel();
    sign_out = new javax.swing.JLabel();
    feature_panel = new javax.swing.JPanel();
    beranda_panel = new javax.swing.JPanel();
    keterangan = new javax.swing.JPanel();
    nopol_panel = new javax.swing.JPanel();
    nopol_title = new javax.swing.JLabel();
    nopol_input = new javax.swing.JTextField();
    status_panel = new javax.swing.JPanel();
    status_title = new javax.swing.JLabel();
    member_radio = new javax.swing.JRadioButton();
    nonmember_radio = new javax.swing.JRadioButton();
    tipe_panel = new javax.swing.JPanel();
    tipe_title = new javax.swing.JLabel();
    mobil_radio = new javax.swing.JRadioButton();
    motor_radio = new javax.swing.JRadioButton();
    truk_radio = new javax.swing.JRadioButton();
    bus_radio = new javax.swing.JRadioButton();
    cta_button_next = new javax.swing.JPanel();
    cta_next = new javax.swing.JLabel();
    pic_1 = new javax.swing.JPanel();
    label_pic1 = new javax.swing.JLabel();
    pic_2 = new javax.swing.JPanel();
    label_pic2 = new javax.swing.JLabel();
    daftar_kendaraan_panel = new javax.swing.JPanel();
    table_panel = new javax.swing.JPanel();
    table_title_panel = new javax.swing.JPanel();
    daftar_kendaraan_title = new javax.swing.JLabel();
    total_title = new javax.swing.JLabel();
    num_jumlah_kendaraan = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    mobil_panel = new javax.swing.JPanel();
    mobil_title_panel = new javax.swing.JPanel();
    mobil_title = new javax.swing.JLabel();
    total_mobil_parkir = new javax.swing.JLabel();
    motor_panel = new javax.swing.JPanel();
    motor_title_panel = new javax.swing.JPanel();
    motor_title = new javax.swing.JLabel();
    total_motor_parkir = new javax.swing.JLabel();
    others_panel = new javax.swing.JPanel();
    others_title_panel = new javax.swing.JPanel();
    others_title = new javax.swing.JLabel();
    total_lainnya_parkir = new javax.swing.JLabel();
    history_panel = new javax.swing.JPanel();
    table_riwayat_panel = new javax.swing.JPanel();
    table_riwayat_title_panel = new javax.swing.JPanel();
    table_riwayat_title = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    table_riwayat = new javax.swing.JTable();
    search_panel = new javax.swing.JPanel();
    search_textfield = new javax.swing.JTextField();
    cta_search = new javax.swing.JButton();
    payment_panel = new javax.swing.JPanel();
    jScrollPane5 = new javax.swing.JScrollPane();
    table_status_payment2 = new javax.swing.JTable();
    cta_button_validate1 = new javax.swing.JPanel();
    cta_validate1 = new javax.swing.JLabel();
    panel_count3 = new javax.swing.JPanel();
    panel_count_title_3 = new javax.swing.JPanel();
    title_mobil2 = new javax.swing.JLabel();
    title_motor2 = new javax.swing.JLabel();
    title_truk_3 = new javax.swing.JLabel();
    title_bus2 = new javax.swing.JLabel();
    panel_terisi_3 = new javax.swing.JPanel();
    title_terisi_3 = new javax.swing.JLabel();
    panel_kosong_3 = new javax.swing.JPanel();
    title_kosong_3 = new javax.swing.JLabel();
    panel_number2 = new javax.swing.JPanel();
    mobil_terisi_3 = new javax.swing.JPanel();
    mobil_terisi_label2 = new javax.swing.JLabel();
    mobil_kosong_3 = new javax.swing.JPanel();
    mobil_kosong_label2 = new javax.swing.JLabel();
    motor_terisi_3 = new javax.swing.JPanel();
    motor_terisi_label2 = new javax.swing.JLabel();
    motor_kosong_3 = new javax.swing.JPanel();
    motor_kosong_label2 = new javax.swing.JLabel();
    truk_terisi_3 = new javax.swing.JPanel();
    truk_terisi_label2 = new javax.swing.JLabel();
    truk_kosong_3 = new javax.swing.JPanel();
    truk_kosong_label2 = new javax.swing.JLabel();
    bus_terisi_3 = new javax.swing.JPanel();
    bus_terisi_label2 = new javax.swing.JLabel();
    bus_kosong_3 = new javax.swing.JPanel();
    bus_kosong_label2 = new javax.swing.JLabel();
    validated_panel = new javax.swing.JPanel();
    jScrollPane7 = new javax.swing.JScrollPane();
    table_status_payment3 = new javax.swing.JTable();
    cta_button_to_beranda = new javax.swing.JPanel();
    cta_to_beranda = new javax.swing.JLabel();
    panel_count5 = new javax.swing.JPanel();
    panel_count_title_5 = new javax.swing.JPanel();
    title_mobil4 = new javax.swing.JLabel();
    title_motor4 = new javax.swing.JLabel();
    title_truk_5 = new javax.swing.JLabel();
    title_bus4 = new javax.swing.JLabel();
    panel_terisi_5 = new javax.swing.JPanel();
    title_terisi_5 = new javax.swing.JLabel();
    panel_kosong_5 = new javax.swing.JPanel();
    title_kosong_5 = new javax.swing.JLabel();
    panel_number4 = new javax.swing.JPanel();
    mobil_terisi_5 = new javax.swing.JPanel();
    mobil_terisi_label4 = new javax.swing.JLabel();
    mobil_kosong_5 = new javax.swing.JPanel();
    mobil_kosong_label4 = new javax.swing.JLabel();
    motor_terisi_5 = new javax.swing.JPanel();
    motor_terisi_label4 = new javax.swing.JLabel();
    motor_kosong_5 = new javax.swing.JPanel();
    motor_kosong_label4 = new javax.swing.JLabel();
    truk_terisi_5 = new javax.swing.JPanel();
    truk_terisi_label4 = new javax.swing.JLabel();
    truk_kosong_5 = new javax.swing.JPanel();
    truk_kosong_label4 = new javax.swing.JLabel();
    bus_terisi_5 = new javax.swing.JPanel();
    bus_terisi_label4 = new javax.swing.JLabel();
    bus_kosong_5 = new javax.swing.JPanel();
    bus_kosong_label4 = new javax.swing.JLabel();
    tambah_panel = new javax.swing.JPanel();
    form_insert_panel = new javax.swing.JPanel();
    keterangan_title = new javax.swing.JLabel();
    tambah_nopol_title = new javax.swing.JLabel();
    tambah_nopol = new javax.swing.JTextField();
    tambah_merk_title = new javax.swing.JLabel();
    tambah_merk_input = new javax.swing.JTextField();
    tambah_tanggal_title = new javax.swing.JLabel();
    tambah_tanggal_input = new javax.swing.JTextField();
    tipe_kendaraan_title = new javax.swing.JLabel();
    tipe_button_zone = new javax.swing.JPanel();
    tambah_mobil_radio = new javax.swing.JRadioButton();
    tambah_motor_radio = new javax.swing.JRadioButton();
    tambah_truk_radio = new javax.swing.JRadioButton();
    tambah_bus_radio = new javax.swing.JRadioButton();
    membership_title = new javax.swing.JLabel();
    membership_button_zone = new javax.swing.JPanel();
    tambah_member_radio = new javax.swing.JRadioButton();
    tambah_nonmember_radio = new javax.swing.JRadioButton();
    cta_tambah_submit = new javax.swing.JPanel();
    cta_submit_title = new javax.swing.JLabel();
    edit_panel = new javax.swing.JPanel();
    edit_search_zone = new javax.swing.JPanel();
    edit_nopol_input = new javax.swing.JTextField();
    edit_search = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    edit_table = new javax.swing.JTable();
    update_form_panel = new javax.swing.JPanel();
    update_title = new javax.swing.JLabel();
    nopol_update_title = new javax.swing.JLabel();
    update_nopol_input_panel = new javax.swing.JPanel();
    update_nopol_input = new javax.swing.JTextField();
    update_tipe_title = new javax.swing.JLabel();
    update_membership_title = new javax.swing.JLabel();
    update_merk_title = new javax.swing.JLabel();
    update_merk_panel = new javax.swing.JPanel();
    update_merk_input = new javax.swing.JTextField();
    update_tanggal_title = new javax.swing.JLabel();
    update_tanggal_panel = new javax.swing.JPanel();
    update_tanggal_input = new javax.swing.JTextField();
    cta_simpan = new javax.swing.JButton();
    cta_hapus = new javax.swing.JButton();
    tipe_dropdown = new javax.swing.JComboBox<>();
    membership_dropdown = new javax.swing.JComboBox<>();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setExtendedState(1);
    setResizable(false);

    main_panel.setBackground(new java.awt.Color(255, 255, 255));

    side_panel.setBackground(new java.awt.Color(75, 86, 210));

    jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
    jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

    title.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
    title.setForeground(new java.awt.Color(255, 255, 255));
    title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title.setText("Selamat Datang, Admin");

    user_pic.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\rsz_11rsz_user.png")); // NOI18N

    cta_beranda.setBackground(new java.awt.Color(75, 86, 210));
    cta_beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_berandaMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_berandaMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_berandaMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_berandaMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_berandaMouseReleased(evt);
      }
    });

    home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    home_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-home-page-30.png")); // NOI18N

    beranda.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    beranda.setForeground(new java.awt.Color(255, 255, 255));
    beranda.setText("Beranda");

    javax.swing.GroupLayout cta_berandaLayout = new javax.swing.GroupLayout(cta_beranda);
    cta_beranda.setLayout(cta_berandaLayout);
    cta_berandaLayout.setHorizontalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_berandaLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(home_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cta_berandaLayout.setVerticalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(home_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
      .addComponent(beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    cta_daftar_kendaraan.setBackground(new java.awt.Color(75, 86, 210));
    cta_daftar_kendaraan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_daftar_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMousePressed(evt);
      }
    });

    list_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    list_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-bullet-list-30.png")); // NOI18N

    daftar_kendaraan.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    daftar_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
    daftar_kendaraan.setText("Daftar Kendaraan");

    javax.swing.GroupLayout cta_daftar_kendaraanLayout = new javax.swing.GroupLayout(cta_daftar_kendaraan);
    cta_daftar_kendaraan.setLayout(cta_daftar_kendaraanLayout);
    cta_daftar_kendaraanLayout.setHorizontalGroup(
      cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_daftar_kendaraanLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cta_daftar_kendaraanLayout.setVerticalGroup(
      cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(list_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    cta_riwayat.setBackground(new java.awt.Color(75, 86, 210));
    cta_riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_riwayatMousePressed(evt);
      }
    });

    repo_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    repo_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-repository-30.png")); // NOI18N

    riwayat.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    riwayat.setForeground(new java.awt.Color(255, 255, 255));
    riwayat.setText("Riwayat");

    javax.swing.GroupLayout cta_riwayatLayout = new javax.swing.GroupLayout(cta_riwayat);
    cta_riwayat.setLayout(cta_riwayatLayout);
    cta_riwayatLayout.setHorizontalGroup(
      cta_riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_riwayatLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(repo_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    cta_riwayatLayout.setVerticalGroup(
      cta_riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(repo_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
      .addComponent(riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    cta_tambah.setBackground(new java.awt.Color(75, 86, 210));
    cta_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_tambahMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_tambahMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_tambahMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_tambahMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_tambahMouseReleased(evt);
      }
    });

    tambah_title.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
    tambah_title.setForeground(new java.awt.Color(255, 255, 255));
    tambah_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    tambah_title.setText("Tambah");

    icon_tambah.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    icon_tambah.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\icons8-add-new-24.png")); // NOI18N

    javax.swing.GroupLayout cta_tambahLayout = new javax.swing.GroupLayout(cta_tambah);
    cta_tambah.setLayout(cta_tambahLayout);
    cta_tambahLayout.setHorizontalGroup(
      cta_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cta_tambahLayout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addComponent(icon_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(tambah_title, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    cta_tambahLayout.setVerticalGroup(
      cta_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tambah_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(icon_tambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
    jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

    cta_delete.setBackground(new java.awt.Color(75, 86, 210));
    cta_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_delete.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_deleteMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_deleteMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_deleteMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_deleteMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_deleteMouseReleased(evt);
      }
    });

    delete_title.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
    delete_title.setForeground(new java.awt.Color(255, 255, 255));
    delete_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    delete_title.setText("Edit");

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\icons8-pencil-24.png")); // NOI18N

    javax.swing.GroupLayout cta_deleteLayout = new javax.swing.GroupLayout(cta_delete);
    cta_delete.setLayout(cta_deleteLayout);
    cta_deleteLayout.setHorizontalGroup(
      cta_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cta_deleteLayout.createSequentialGroup()
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(delete_title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    cta_deleteLayout.setVerticalGroup(
      cta_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(delete_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
      .addGroup(cta_deleteLayout.createSequentialGroup()
        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

    cta_signout.setBackground(new java.awt.Color(75, 86, 210));
    cta_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_signout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_signoutMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_signoutMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_signoutMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_signoutMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_signoutMouseReleased(evt);
      }
    });

    signout_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    signout_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-logout-32.png")); // NOI18N

    sign_out.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    sign_out.setForeground(new java.awt.Color(255, 255, 255));
    sign_out.setText("Sign Out");

    javax.swing.GroupLayout cta_signoutLayout = new javax.swing.GroupLayout(cta_signout);
    cta_signout.setLayout(cta_signoutLayout);
    cta_signoutLayout.setHorizontalGroup(
      cta_signoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_signoutLayout.createSequentialGroup()
        .addGap(66, 66, 66)
        .addComponent(signout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(sign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24))
    );
    cta_signoutLayout.setVerticalGroup(
      cta_signoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(signout_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
      .addComponent(sign_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
    side_panel.setLayout(side_panelLayout);
    side_panelLayout.setHorizontalGroup(
      side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator1)
      .addComponent(cta_daftar_kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jSeparator2)
      .addComponent(cta_signout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(side_panelLayout.createSequentialGroup()
        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cta_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cta_riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cta_beranda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cta_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(side_panelLayout.createSequentialGroup()
            .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title))
              .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(user_pic)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jSeparator3))
        .addContainerGap())
    );
    side_panelLayout.setVerticalGroup(
      side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panelLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(user_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(title)
        .addGap(18, 18, 18)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cta_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(81, 81, 81)
        .addComponent(cta_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_signout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    feature_panel.setBackground(new java.awt.Color(255, 255, 255));
    feature_panel.setLayout(new java.awt.CardLayout());

    beranda_panel.setBackground(new java.awt.Color(255, 255, 255));

    keterangan.setBackground(new java.awt.Color(255, 255, 255));
    keterangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    nopol_panel.setBackground(new java.awt.Color(255, 255, 255));

    nopol_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    nopol_title.setForeground(new java.awt.Color(0, 0, 0));
    nopol_title.setText("Nomor Polisi : ");

    nopol_input.setBackground(new java.awt.Color(241, 246, 245));
    nopol_input.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    nopol_input.setForeground(new java.awt.Color(149, 149, 149));
    nopol_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    nopol_input.setText("x xxxx xx");
    nopol_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    nopol_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        nopol_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout nopol_panelLayout = new javax.swing.GroupLayout(nopol_panel);
    nopol_panel.setLayout(nopol_panelLayout);
    nopol_panelLayout.setHorizontalGroup(
      nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(nopol_panelLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(nopol_input)
          .addComponent(nopol_title, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        .addContainerGap())
    );
    nopol_panelLayout.setVerticalGroup(
      nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(nopol_panelLayout.createSequentialGroup()
        .addComponent(nopol_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(nopol_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    status_panel.setBackground(new java.awt.Color(255, 255, 255));

    status_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    status_title.setForeground(new java.awt.Color(0, 0, 0));
    status_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    status_title.setText("Status : ");

    member_radio.setBackground(new java.awt.Color(255, 255, 255));
    membershipGroup.add(member_radio);
    member_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    member_radio.setForeground(new java.awt.Color(219, 219, 219));
    member_radio.setText("Member");
    member_radio.setEnabled(false);
    member_radio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        member_radioActionPerformed(evt);
      }
    });

    nonmember_radio.setBackground(new java.awt.Color(255, 255, 255));
    membershipGroup.add(nonmember_radio);
    nonmember_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    nonmember_radio.setForeground(new java.awt.Color(0, 0, 0));
    nonmember_radio.setText("Nonmember");

    javax.swing.GroupLayout status_panelLayout = new javax.swing.GroupLayout(status_panel);
    status_panel.setLayout(status_panelLayout);
    status_panelLayout.setHorizontalGroup(
      status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(status_panelLayout.createSequentialGroup()
        .addGap(166, 166, 166)
        .addGroup(status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(status_panelLayout.createSequentialGroup()
            .addComponent(status_title, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(member_radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(nonmember_radio, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        .addContainerGap())
    );
    status_panelLayout.setVerticalGroup(
      status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(status_panelLayout.createSequentialGroup()
        .addComponent(status_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(member_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(nonmember_radio)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    tipe_panel.setBackground(new java.awt.Color(255, 255, 255));

    tipe_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    tipe_title.setForeground(new java.awt.Color(0, 0, 0));
    tipe_title.setText("Tipe :");

    mobil_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(mobil_radio);
    mobil_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    mobil_radio.setForeground(new java.awt.Color(0, 0, 0));
    mobil_radio.setText("Mobil");

    motor_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(motor_radio);
    motor_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    motor_radio.setForeground(new java.awt.Color(0, 0, 0));
    motor_radio.setText("Motor");

    truk_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(truk_radio);
    truk_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    truk_radio.setForeground(new java.awt.Color(0, 0, 0));
    truk_radio.setText("Truk");

    bus_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(bus_radio);
    bus_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    bus_radio.setForeground(new java.awt.Color(0, 0, 0));
    bus_radio.setText("Bus");

    javax.swing.GroupLayout tipe_panelLayout = new javax.swing.GroupLayout(tipe_panel);
    tipe_panel.setLayout(tipe_panelLayout);
    tipe_panelLayout.setHorizontalGroup(
      tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipe_panelLayout.createSequentialGroup()
        .addContainerGap(155, Short.MAX_VALUE)
        .addGroup(tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(bus_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(truk_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(motor_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(mobil_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tipe_title, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(34, 34, 34))
    );
    tipe_panelLayout.setVerticalGroup(
      tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tipe_panelLayout.createSequentialGroup()
        .addComponent(tipe_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(mobil_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(motor_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(truk_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(bus_radio)
        .addGap(0, 28, Short.MAX_VALUE))
    );

    cta_button_next.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_next.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_nextMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseReleased(evt);
      }
    });

    cta_next.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta_next.setForeground(new java.awt.Color(255, 255, 255));
    cta_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_next.setText("NEXT");

    javax.swing.GroupLayout cta_button_nextLayout = new javax.swing.GroupLayout(cta_button_next);
    cta_button_next.setLayout(cta_button_nextLayout);
    cta_button_nextLayout.setHorizontalGroup(
      cta_button_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    cta_button_nextLayout.setVerticalGroup(
      cta_button_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_next, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout keteranganLayout = new javax.swing.GroupLayout(keterangan);
    keterangan.setLayout(keteranganLayout);
    keteranganLayout.setHorizontalGroup(
      keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(keteranganLayout.createSequentialGroup()
        .addComponent(nopol_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(cta_button_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tipe_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(status_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    keteranganLayout.setVerticalGroup(
      keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(keteranganLayout.createSequentialGroup()
        .addGroup(keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(nopol_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tipe_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(status_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(cta_button_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 31, Short.MAX_VALUE))
    );

    pic_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    label_pic1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    label_pic1.setForeground(new java.awt.Color(102, 102, 102));
    label_pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    label_pic1.setText("Coming Soon");

    javax.swing.GroupLayout pic_1Layout = new javax.swing.GroupLayout(pic_1);
    pic_1.setLayout(pic_1Layout);
    pic_1Layout.setHorizontalGroup(
      pic_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(label_pic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    pic_1Layout.setVerticalGroup(
      pic_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(label_pic1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
    );

    pic_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    label_pic2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    label_pic2.setForeground(new java.awt.Color(102, 102, 102));
    label_pic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    label_pic2.setText("Coming Soon");

    javax.swing.GroupLayout pic_2Layout = new javax.swing.GroupLayout(pic_2);
    pic_2.setLayout(pic_2Layout);
    pic_2Layout.setHorizontalGroup(
      pic_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(label_pic2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
    );
    pic_2Layout.setVerticalGroup(
      pic_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(label_pic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout beranda_panelLayout = new javax.swing.GroupLayout(beranda_panel);
    beranda_panel.setLayout(beranda_panelLayout);
    beranda_panelLayout.setHorizontalGroup(
      beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(beranda_panelLayout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(beranda_panelLayout.createSequentialGroup()
            .addComponent(pic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(pic_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(250, Short.MAX_VALUE))
    );
    beranda_panelLayout.setVerticalGroup(
      beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(beranda_panelLayout.createSequentialGroup()
        .addContainerGap(12, Short.MAX_VALUE)
        .addGroup(beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(pic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(pic_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(68, 68, 68))
    );

    feature_panel.add(beranda_panel, "card2");

    daftar_kendaraan_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    daftar_kendaraan_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    daftar_kendaraan_title.setForeground(new java.awt.Color(255, 255, 255));
    daftar_kendaraan_title.setText("Daftar Kendaraan");

    total_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    total_title.setForeground(new java.awt.Color(255, 255, 255));
    total_title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    total_title.setText("Total : ");

    num_jumlah_kendaraan.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    num_jumlah_kendaraan.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout table_title_panelLayout = new javax.swing.GroupLayout(table_title_panel);
    table_title_panel.setLayout(table_title_panelLayout);
    table_title_panelLayout.setHorizontalGroup(
      table_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_title_panelLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(daftar_kendaraan_title)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(total_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(num_jumlah_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0))
    );
    table_title_panelLayout.setVerticalGroup(
      table_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(daftar_kendaraan_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
      .addComponent(num_jumlah_kendaraan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Tanggal Parkir", "No Polisi", "Tipe", "Merk", "Jam Masuk"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, true, true, true, true
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTable1.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(jTable1);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
      jTable1.getColumnModel().getColumn(0).setResizable(false);
    }

    javax.swing.GroupLayout table_panelLayout = new javax.swing.GroupLayout(table_panel);
    table_panel.setLayout(table_panelLayout);
    table_panelLayout.setHorizontalGroup(
      table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane2)
    );
    table_panelLayout.setVerticalGroup(
      table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_panelLayout.createSequentialGroup()
        .addComponent(table_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    mobil_panel.setBackground(new java.awt.Color(255, 255, 255));
    mobil_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    mobil_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    mobil_title.setForeground(new java.awt.Color(255, 255, 255));
    mobil_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mobil_title.setText("MOBIL");

    javax.swing.GroupLayout mobil_title_panelLayout = new javax.swing.GroupLayout(mobil_title_panel);
    mobil_title_panel.setLayout(mobil_title_panelLayout);
    mobil_title_panelLayout.setHorizontalGroup(
      mobil_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
    );
    mobil_title_panelLayout.setVerticalGroup(
      mobil_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_mobil_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_mobil_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_mobil_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_panelLayout = new javax.swing.GroupLayout(mobil_panel);
    mobil_panel.setLayout(mobil_panelLayout);
    mobil_panelLayout.setHorizontalGroup(
      mobil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_mobil_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    mobil_panelLayout.setVerticalGroup(
      mobil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mobil_panelLayout.createSequentialGroup()
        .addComponent(mobil_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_mobil_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    motor_panel.setBackground(new java.awt.Color(255, 255, 255));
    motor_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    motor_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    motor_title.setForeground(new java.awt.Color(255, 255, 255));
    motor_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    motor_title.setText("MOTOR");

    javax.swing.GroupLayout motor_title_panelLayout = new javax.swing.GroupLayout(motor_title_panel);
    motor_title_panel.setLayout(motor_title_panelLayout);
    motor_title_panelLayout.setHorizontalGroup(
      motor_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
    );
    motor_title_panelLayout.setVerticalGroup(
      motor_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_motor_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_motor_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_motor_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_panelLayout = new javax.swing.GroupLayout(motor_panel);
    motor_panel.setLayout(motor_panelLayout);
    motor_panelLayout.setHorizontalGroup(
      motor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_motor_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    motor_panelLayout.setVerticalGroup(
      motor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(motor_panelLayout.createSequentialGroup()
        .addComponent(motor_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_motor_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    others_panel.setBackground(new java.awt.Color(255, 255, 255));
    others_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    others_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    others_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    others_title.setForeground(new java.awt.Color(255, 255, 255));
    others_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    others_title.setText("LAINNYA");

    javax.swing.GroupLayout others_title_panelLayout = new javax.swing.GroupLayout(others_title_panel);
    others_title_panel.setLayout(others_title_panelLayout);
    others_title_panelLayout.setHorizontalGroup(
      others_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
    );
    others_title_panelLayout.setVerticalGroup(
      others_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_lainnya_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_lainnya_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_lainnya_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout others_panelLayout = new javax.swing.GroupLayout(others_panel);
    others_panel.setLayout(others_panelLayout);
    others_panelLayout.setHorizontalGroup(
      others_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_lainnya_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    others_panelLayout.setVerticalGroup(
      others_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(others_panelLayout.createSequentialGroup()
        .addComponent(others_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_lainnya_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout daftar_kendaraan_panelLayout = new javax.swing.GroupLayout(daftar_kendaraan_panel);
    daftar_kendaraan_panel.setLayout(daftar_kendaraan_panelLayout);
    daftar_kendaraan_panelLayout.setHorizontalGroup(
      daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(daftar_kendaraan_panelLayout.createSequentialGroup()
        .addGap(57, 57, 57)
        .addGroup(daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(table_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, daftar_kendaraan_panelLayout.createSequentialGroup()
            .addComponent(mobil_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(motor_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(others_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(243, Short.MAX_VALUE))
    );
    daftar_kendaraan_panelLayout.setVerticalGroup(
      daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(daftar_kendaraan_panelLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(mobil_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(others_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(90, Short.MAX_VALUE))
    );

    feature_panel.add(daftar_kendaraan_panel, "card3");

    history_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_riwayat_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    table_riwayat_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    table_riwayat_title.setForeground(new java.awt.Color(255, 255, 255));
    table_riwayat_title.setText("Daftar Kendaraan");

    javax.swing.GroupLayout table_riwayat_title_panelLayout = new javax.swing.GroupLayout(table_riwayat_title_panel);
    table_riwayat_title_panel.setLayout(table_riwayat_title_panelLayout);
    table_riwayat_title_panelLayout.setHorizontalGroup(
      table_riwayat_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_riwayat_title_panelLayout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(table_riwayat_title)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    table_riwayat_title_panelLayout.setVerticalGroup(
      table_riwayat_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_riwayat_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

    table_riwayat.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Tanggal Parkir", "No Polisi", "Tipe ", "Merk", "Jam Masuk", "Jam Keluar"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table_riwayat.getTableHeader().setReorderingAllowed(false);
    jScrollPane4.setViewportView(table_riwayat);
    if (table_riwayat.getColumnModel().getColumnCount() > 0) {
      table_riwayat.getColumnModel().getColumn(0).setResizable(false);
      table_riwayat.getColumnModel().getColumn(1).setResizable(false);
      table_riwayat.getColumnModel().getColumn(2).setResizable(false);
      table_riwayat.getColumnModel().getColumn(3).setResizable(false);
      table_riwayat.getColumnModel().getColumn(4).setResizable(false);
      table_riwayat.getColumnModel().getColumn(5).setResizable(false);
    }

    javax.swing.GroupLayout table_riwayat_panelLayout = new javax.swing.GroupLayout(table_riwayat_panel);
    table_riwayat_panel.setLayout(table_riwayat_panelLayout);
    table_riwayat_panelLayout.setHorizontalGroup(
      table_riwayat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_riwayat_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
    );
    table_riwayat_panelLayout.setVerticalGroup(
      table_riwayat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_riwayat_panelLayout.createSequentialGroup()
        .addComponent(table_riwayat_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
    );

    search_panel.setBackground(new java.awt.Color(255, 255, 255));
    search_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    search_textfield.setBackground(new java.awt.Color(255, 255, 255));
    search_textfield.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
    search_textfield.setForeground(new java.awt.Color(149, 149, 149));
    search_textfield.setText("No Polisi");
    search_textfield.setBorder(null);
    search_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        search_textfieldFocusGained(evt);
      }
    });

    javax.swing.GroupLayout search_panelLayout = new javax.swing.GroupLayout(search_panel);
    search_panel.setLayout(search_panelLayout);
    search_panelLayout.setHorizontalGroup(
      search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(search_textfield))
    );
    search_panelLayout.setVerticalGroup(
      search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(search_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    cta_search.setBackground(new java.awt.Color(75, 86, 210));
    cta_search.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta_search.setForeground(new java.awt.Color(255, 255, 255));
    cta_search.setText("Search");
    cta_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_search.setFocusPainted(false);
    cta_search.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cta_searchActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout history_panelLayout = new javax.swing.GroupLayout(history_panel);
    history_panel.setLayout(history_panelLayout);
    history_panelLayout.setHorizontalGroup(
      history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(history_panelLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(history_panelLayout.createSequentialGroup()
            .addComponent(search_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(cta_search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(table_riwayat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(236, Short.MAX_VALUE))
    );
    history_panelLayout.setVerticalGroup(
      history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, history_panelLayout.createSequentialGroup()
        .addContainerGap(72, Short.MAX_VALUE)
        .addGroup(history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cta_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addComponent(table_riwayat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(68, 68, 68))
    );

    feature_panel.add(history_panel, "card4");

    payment_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_status_payment2.setBackground(new java.awt.Color(255, 255, 255));
    table_status_payment2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    table_status_payment2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Tanggal Parkir", "Nomor Polisi", "Tipe ", "Status", "Metode", "Tarif", "Status Pembayaran"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table_status_payment2.setGridColor(new java.awt.Color(0, 0, 0));
    table_status_payment2.getTableHeader().setReorderingAllowed(false);
    jScrollPane5.setViewportView(table_status_payment2);
    if (table_status_payment2.getColumnModel().getColumnCount() > 0) {
      table_status_payment2.getColumnModel().getColumn(0).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(1).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(2).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(3).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(4).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(5).setResizable(false);
      table_status_payment2.getColumnModel().getColumn(6).setResizable(false);
    }

    cta_button_validate1.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_validate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_validate1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_validate1MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_validate1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_validate1MouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_validate1MousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_validate1MouseReleased(evt);
      }
    });

    cta_validate1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    cta_validate1.setForeground(new java.awt.Color(255, 255, 255));
    cta_validate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_validate1.setText("VALIDASI BAYAR");

    javax.swing.GroupLayout cta_button_validate1Layout = new javax.swing.GroupLayout(cta_button_validate1);
    cta_button_validate1.setLayout(cta_button_validate1Layout);
    cta_button_validate1Layout.setHorizontalGroup(
      cta_button_validate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_validate1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
    );
    cta_button_validate1Layout.setVerticalGroup(
      cta_button_validate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_validate1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    panel_count_title_3.setBackground(new java.awt.Color(75, 86, 210));

    title_mobil2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_mobil2.setForeground(new java.awt.Color(255, 255, 255));
    title_mobil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_mobil2.setText("MOBIL");

    title_motor2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_motor2.setForeground(new java.awt.Color(255, 255, 255));
    title_motor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_motor2.setText("MOTOR");

    title_truk_3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_truk_3.setForeground(new java.awt.Color(255, 255, 255));
    title_truk_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_truk_3.setText("TRUK");

    title_bus2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_bus2.setForeground(new java.awt.Color(255, 255, 255));
    title_bus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_bus2.setText("BUS");

    javax.swing.GroupLayout panel_count_title_3Layout = new javax.swing.GroupLayout(panel_count_title_3);
    panel_count_title_3.setLayout(panel_count_title_3Layout);
    panel_count_title_3Layout.setHorizontalGroup(
      panel_count_title_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count_title_3Layout.createSequentialGroup()
        .addGap(202, 202, 202)
        .addComponent(title_mobil2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_motor2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_truk_3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_bus2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
    );
    panel_count_title_3Layout.setVerticalGroup(
      panel_count_title_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count_title_3Layout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(panel_count_title_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(title_mobil2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
          .addComponent(title_motor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(title_truk_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(title_bus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    panel_terisi_3.setBackground(new java.awt.Color(75, 86, 210));

    title_terisi_3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_terisi_3.setForeground(new java.awt.Color(255, 255, 255));
    title_terisi_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_terisi_3.setText("TERISI");

    javax.swing.GroupLayout panel_terisi_3Layout = new javax.swing.GroupLayout(panel_terisi_3);
    panel_terisi_3.setLayout(panel_terisi_3Layout);
    panel_terisi_3Layout.setHorizontalGroup(
      panel_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_terisi_3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
    );
    panel_terisi_3Layout.setVerticalGroup(
      panel_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_terisi_3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
    );

    panel_kosong_3.setBackground(new java.awt.Color(75, 86, 210));

    title_kosong_3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_kosong_3.setForeground(new java.awt.Color(255, 255, 255));
    title_kosong_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_kosong_3.setText("KOSONG");

    javax.swing.GroupLayout panel_kosong_3Layout = new javax.swing.GroupLayout(panel_kosong_3);
    panel_kosong_3.setLayout(panel_kosong_3Layout);
    panel_kosong_3Layout.setHorizontalGroup(
      panel_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
    );
    panel_kosong_3Layout.setVerticalGroup(
      panel_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
    );

    mobil_terisi_3.setBackground(new java.awt.Color(255, 255, 255));
    mobil_terisi_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_terisi_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    mobil_terisi_label2.setForeground(new java.awt.Color(255, 0, 0));
    mobil_terisi_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_terisi_3Layout = new javax.swing.GroupLayout(mobil_terisi_3);
    mobil_terisi_3.setLayout(mobil_terisi_3Layout);
    mobil_terisi_3Layout.setHorizontalGroup(
      mobil_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    mobil_terisi_3Layout.setVerticalGroup(
      mobil_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    mobil_kosong_3.setBackground(new java.awt.Color(255, 255, 255));
    mobil_kosong_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_kosong_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    mobil_kosong_label2.setForeground(new java.awt.Color(0, 0, 0));
    mobil_kosong_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_kosong_3Layout = new javax.swing.GroupLayout(mobil_kosong_3);
    mobil_kosong_3.setLayout(mobil_kosong_3Layout);
    mobil_kosong_3Layout.setHorizontalGroup(
      mobil_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    mobil_kosong_3Layout.setVerticalGroup(
      mobil_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    motor_terisi_3.setBackground(new java.awt.Color(255, 255, 255));
    motor_terisi_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_terisi_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    motor_terisi_label2.setForeground(new java.awt.Color(255, 0, 0));
    motor_terisi_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_terisi_3Layout = new javax.swing.GroupLayout(motor_terisi_3);
    motor_terisi_3.setLayout(motor_terisi_3Layout);
    motor_terisi_3Layout.setHorizontalGroup(
      motor_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    motor_terisi_3Layout.setVerticalGroup(
      motor_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    motor_kosong_3.setBackground(new java.awt.Color(255, 255, 255));
    motor_kosong_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_kosong_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    motor_kosong_label2.setForeground(new java.awt.Color(0, 0, 0));
    motor_kosong_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_kosong_3Layout = new javax.swing.GroupLayout(motor_kosong_3);
    motor_kosong_3.setLayout(motor_kosong_3Layout);
    motor_kosong_3Layout.setHorizontalGroup(
      motor_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    motor_kosong_3Layout.setVerticalGroup(
      motor_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    truk_terisi_3.setBackground(new java.awt.Color(255, 255, 255));
    truk_terisi_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    truk_terisi_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    truk_terisi_label2.setForeground(new java.awt.Color(255, 0, 0));
    truk_terisi_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout truk_terisi_3Layout = new javax.swing.GroupLayout(truk_terisi_3);
    truk_terisi_3.setLayout(truk_terisi_3Layout);
    truk_terisi_3Layout.setHorizontalGroup(
      truk_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    truk_terisi_3Layout.setVerticalGroup(
      truk_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    truk_kosong_3.setBackground(new java.awt.Color(255, 255, 255));
    truk_kosong_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    truk_kosong_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    truk_kosong_label2.setForeground(new java.awt.Color(0, 0, 0));
    truk_kosong_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout truk_kosong_3Layout = new javax.swing.GroupLayout(truk_kosong_3);
    truk_kosong_3.setLayout(truk_kosong_3Layout);
    truk_kosong_3Layout.setHorizontalGroup(
      truk_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    truk_kosong_3Layout.setVerticalGroup(
      truk_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    bus_terisi_3.setBackground(new java.awt.Color(255, 255, 255));
    bus_terisi_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    bus_terisi_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    bus_terisi_label2.setForeground(new java.awt.Color(255, 0, 0));
    bus_terisi_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout bus_terisi_3Layout = new javax.swing.GroupLayout(bus_terisi_3);
    bus_terisi_3.setLayout(bus_terisi_3Layout);
    bus_terisi_3Layout.setHorizontalGroup(
      bus_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    bus_terisi_3Layout.setVerticalGroup(
      bus_terisi_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_terisi_label2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
    );

    bus_kosong_3.setBackground(new java.awt.Color(255, 255, 255));
    bus_kosong_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    bus_kosong_label2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    bus_kosong_label2.setForeground(new java.awt.Color(0, 0, 0));
    bus_kosong_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout bus_kosong_3Layout = new javax.swing.GroupLayout(bus_kosong_3);
    bus_kosong_3.setLayout(bus_kosong_3Layout);
    bus_kosong_3Layout.setHorizontalGroup(
      bus_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    bus_kosong_3Layout.setVerticalGroup(
      bus_kosong_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_kosong_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout panel_number2Layout = new javax.swing.GroupLayout(panel_number2);
    panel_number2.setLayout(panel_number2Layout);
    panel_number2Layout.setHorizontalGroup(
      panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_number2Layout.createSequentialGroup()
        .addGroup(panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(panel_number2Layout.createSequentialGroup()
            .addComponent(mobil_kosong_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(motor_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panel_number2Layout.createSequentialGroup()
            .addComponent(mobil_terisi_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(motor_terisi_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(truk_terisi_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 0, 0)
        .addGroup(panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(bus_terisi_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bus_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    panel_number2Layout.setVerticalGroup(
      panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_number2Layout.createSequentialGroup()
        .addGroup(panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(bus_terisi_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(mobil_terisi_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_terisi_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_terisi_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(panel_number2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(mobil_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bus_kosong_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout panel_count3Layout = new javax.swing.GroupLayout(panel_count3);
    panel_count3.setLayout(panel_count3Layout);
    panel_count3Layout.setHorizontalGroup(
      panel_count3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panel_count_title_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(panel_count3Layout.createSequentialGroup()
        .addGroup(panel_count3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panel_terisi_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(panel_kosong_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addComponent(panel_number2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panel_count3Layout.setVerticalGroup(
      panel_count3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count3Layout.createSequentialGroup()
        .addComponent(panel_count_title_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(panel_count3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panel_count3Layout.createSequentialGroup()
            .addComponent(panel_terisi_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(panel_kosong_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(panel_number2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout payment_panelLayout = new javax.swing.GroupLayout(payment_panel);
    payment_panel.setLayout(payment_panelLayout);
    payment_panelLayout.setHorizontalGroup(
      payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(payment_panelLayout.createSequentialGroup()
        .addGroup(payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(payment_panelLayout.createSequentialGroup()
            .addGap(367, 367, 367)
            .addComponent(cta_button_validate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(payment_panelLayout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addGroup(payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(panel_count3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jScrollPane5))))
        .addContainerGap(217, Short.MAX_VALUE))
    );
    payment_panelLayout.setVerticalGroup(
      payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(payment_panelLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(panel_count3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addComponent(cta_button_validate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(54, Short.MAX_VALUE))
    );

    feature_panel.add(payment_panel, "card7");

    validated_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_status_payment3.setBackground(new java.awt.Color(255, 255, 255));
    table_status_payment3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    table_status_payment3.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Tanggal Parkir", "Nomor Polisi", "Tipe ", "Status", "Metode", "Tarif", "Status Pembayaran"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table_status_payment3.setGridColor(new java.awt.Color(0, 0, 0));
    table_status_payment3.getTableHeader().setReorderingAllowed(false);
    jScrollPane7.setViewportView(table_status_payment3);
    if (table_status_payment3.getColumnModel().getColumnCount() > 0) {
      table_status_payment3.getColumnModel().getColumn(0).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(1).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(2).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(3).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(4).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(5).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(6).setResizable(false);
    }

    cta_button_to_beranda.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_to_beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_to_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_to_berandaMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_to_berandaMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_to_berandaMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_to_berandaMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_to_berandaMouseReleased(evt);
      }
    });

    cta_to_beranda.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    cta_to_beranda.setForeground(new java.awt.Color(255, 255, 255));
    cta_to_beranda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_to_beranda.setText("BERANDA");

    javax.swing.GroupLayout cta_button_to_berandaLayout = new javax.swing.GroupLayout(cta_button_to_beranda);
    cta_button_to_beranda.setLayout(cta_button_to_berandaLayout);
    cta_button_to_berandaLayout.setHorizontalGroup(
      cta_button_to_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_to_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
    );
    cta_button_to_berandaLayout.setVerticalGroup(
      cta_button_to_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_to_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    panel_count_title_5.setBackground(new java.awt.Color(75, 86, 210));

    title_mobil4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_mobil4.setForeground(new java.awt.Color(255, 255, 255));
    title_mobil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_mobil4.setText("MOBIL");

    title_motor4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_motor4.setForeground(new java.awt.Color(255, 255, 255));
    title_motor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_motor4.setText("MOTOR");

    title_truk_5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_truk_5.setForeground(new java.awt.Color(255, 255, 255));
    title_truk_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_truk_5.setText("TRUK");

    title_bus4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_bus4.setForeground(new java.awt.Color(255, 255, 255));
    title_bus4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_bus4.setText("BUS");

    javax.swing.GroupLayout panel_count_title_5Layout = new javax.swing.GroupLayout(panel_count_title_5);
    panel_count_title_5.setLayout(panel_count_title_5Layout);
    panel_count_title_5Layout.setHorizontalGroup(
      panel_count_title_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count_title_5Layout.createSequentialGroup()
        .addGap(202, 202, 202)
        .addComponent(title_mobil4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_motor4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_truk_5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(title_bus4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
    );
    panel_count_title_5Layout.setVerticalGroup(
      panel_count_title_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count_title_5Layout.createSequentialGroup()
        .addGap(0, 0, 0)
        .addGroup(panel_count_title_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(title_mobil4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
          .addComponent(title_motor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(title_truk_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(title_bus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    panel_terisi_5.setBackground(new java.awt.Color(75, 86, 210));

    title_terisi_5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_terisi_5.setForeground(new java.awt.Color(255, 255, 255));
    title_terisi_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_terisi_5.setText("TERISI");

    javax.swing.GroupLayout panel_terisi_5Layout = new javax.swing.GroupLayout(panel_terisi_5);
    panel_terisi_5.setLayout(panel_terisi_5Layout);
    panel_terisi_5Layout.setHorizontalGroup(
      panel_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_terisi_5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
    );
    panel_terisi_5Layout.setVerticalGroup(
      panel_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_terisi_5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
    );

    panel_kosong_5.setBackground(new java.awt.Color(75, 86, 210));

    title_kosong_5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    title_kosong_5.setForeground(new java.awt.Color(255, 255, 255));
    title_kosong_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title_kosong_5.setText("KOSONG");

    javax.swing.GroupLayout panel_kosong_5Layout = new javax.swing.GroupLayout(panel_kosong_5);
    panel_kosong_5.setLayout(panel_kosong_5Layout);
    panel_kosong_5Layout.setHorizontalGroup(
      panel_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
    );
    panel_kosong_5Layout.setVerticalGroup(
      panel_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(title_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
    );

    mobil_terisi_5.setBackground(new java.awt.Color(255, 255, 255));
    mobil_terisi_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_terisi_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    mobil_terisi_label4.setForeground(new java.awt.Color(255, 0, 0));
    mobil_terisi_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_terisi_5Layout = new javax.swing.GroupLayout(mobil_terisi_5);
    mobil_terisi_5.setLayout(mobil_terisi_5Layout);
    mobil_terisi_5Layout.setHorizontalGroup(
      mobil_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    mobil_terisi_5Layout.setVerticalGroup(
      mobil_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    mobil_kosong_5.setBackground(new java.awt.Color(255, 255, 255));
    mobil_kosong_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_kosong_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    mobil_kosong_label4.setForeground(new java.awt.Color(0, 0, 0));
    mobil_kosong_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_kosong_5Layout = new javax.swing.GroupLayout(mobil_kosong_5);
    mobil_kosong_5.setLayout(mobil_kosong_5Layout);
    mobil_kosong_5Layout.setHorizontalGroup(
      mobil_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    mobil_kosong_5Layout.setVerticalGroup(
      mobil_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    motor_terisi_5.setBackground(new java.awt.Color(255, 255, 255));
    motor_terisi_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_terisi_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    motor_terisi_label4.setForeground(new java.awt.Color(255, 0, 0));
    motor_terisi_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_terisi_5Layout = new javax.swing.GroupLayout(motor_terisi_5);
    motor_terisi_5.setLayout(motor_terisi_5Layout);
    motor_terisi_5Layout.setHorizontalGroup(
      motor_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    motor_terisi_5Layout.setVerticalGroup(
      motor_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    motor_kosong_5.setBackground(new java.awt.Color(255, 255, 255));
    motor_kosong_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_kosong_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    motor_kosong_label4.setForeground(new java.awt.Color(0, 0, 0));
    motor_kosong_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_kosong_5Layout = new javax.swing.GroupLayout(motor_kosong_5);
    motor_kosong_5.setLayout(motor_kosong_5Layout);
    motor_kosong_5Layout.setHorizontalGroup(
      motor_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    motor_kosong_5Layout.setVerticalGroup(
      motor_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    truk_terisi_5.setBackground(new java.awt.Color(255, 255, 255));
    truk_terisi_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    truk_terisi_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    truk_terisi_label4.setForeground(new java.awt.Color(255, 0, 0));
    truk_terisi_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout truk_terisi_5Layout = new javax.swing.GroupLayout(truk_terisi_5);
    truk_terisi_5.setLayout(truk_terisi_5Layout);
    truk_terisi_5Layout.setHorizontalGroup(
      truk_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
    );
    truk_terisi_5Layout.setVerticalGroup(
      truk_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    truk_kosong_5.setBackground(new java.awt.Color(255, 255, 255));
    truk_kosong_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    truk_kosong_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    truk_kosong_label4.setForeground(new java.awt.Color(0, 0, 0));
    truk_kosong_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout truk_kosong_5Layout = new javax.swing.GroupLayout(truk_kosong_5);
    truk_kosong_5.setLayout(truk_kosong_5Layout);
    truk_kosong_5Layout.setHorizontalGroup(
      truk_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    truk_kosong_5Layout.setVerticalGroup(
      truk_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(truk_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    bus_terisi_5.setBackground(new java.awt.Color(255, 255, 255));
    bus_terisi_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    bus_terisi_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    bus_terisi_label4.setForeground(new java.awt.Color(255, 0, 0));
    bus_terisi_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout bus_terisi_5Layout = new javax.swing.GroupLayout(bus_terisi_5);
    bus_terisi_5.setLayout(bus_terisi_5Layout);
    bus_terisi_5Layout.setHorizontalGroup(
      bus_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    bus_terisi_5Layout.setVerticalGroup(
      bus_terisi_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_terisi_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
    );

    bus_kosong_5.setBackground(new java.awt.Color(255, 255, 255));
    bus_kosong_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    bus_kosong_label4.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
    bus_kosong_label4.setForeground(new java.awt.Color(0, 0, 0));
    bus_kosong_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout bus_kosong_5Layout = new javax.swing.GroupLayout(bus_kosong_5);
    bus_kosong_5.setLayout(bus_kosong_5Layout);
    bus_kosong_5Layout.setHorizontalGroup(
      bus_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    bus_kosong_5Layout.setVerticalGroup(
      bus_kosong_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(bus_kosong_label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout panel_number4Layout = new javax.swing.GroupLayout(panel_number4);
    panel_number4.setLayout(panel_number4Layout);
    panel_number4Layout.setHorizontalGroup(
      panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_number4Layout.createSequentialGroup()
        .addGroup(panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(panel_number4Layout.createSequentialGroup()
            .addComponent(mobil_kosong_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(motor_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(panel_number4Layout.createSequentialGroup()
            .addComponent(mobil_terisi_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(motor_terisi_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGroup(panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(truk_terisi_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 0, 0)
        .addGroup(panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(bus_terisi_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bus_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    panel_number4Layout.setVerticalGroup(
      panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_number4Layout.createSequentialGroup()
        .addGroup(panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(bus_terisi_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(mobil_terisi_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_terisi_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_terisi_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(panel_number4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(mobil_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(truk_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(bus_kosong_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout panel_count5Layout = new javax.swing.GroupLayout(panel_count5);
    panel_count5.setLayout(panel_count5Layout);
    panel_count5Layout.setHorizontalGroup(
      panel_count5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panel_count_title_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(panel_count5Layout.createSequentialGroup()
        .addGroup(panel_count5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panel_terisi_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(panel_kosong_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 0, 0)
        .addComponent(panel_number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panel_count5Layout.setVerticalGroup(
      panel_count5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_count5Layout.createSequentialGroup()
        .addComponent(panel_count_title_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(panel_count5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panel_count5Layout.createSequentialGroup()
            .addComponent(panel_terisi_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(panel_kosong_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(panel_number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout validated_panelLayout = new javax.swing.GroupLayout(validated_panel);
    validated_panel.setLayout(validated_panelLayout);
    validated_panelLayout.setHorizontalGroup(
      validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(validated_panelLayout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(panel_count5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7))
          .addComponent(cta_button_to_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(217, Short.MAX_VALUE))
    );
    validated_panelLayout.setVerticalGroup(
      validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(validated_panelLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(panel_count5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addComponent(cta_button_to_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(54, Short.MAX_VALUE))
    );

    feature_panel.add(validated_panel, "card6");

    tambah_panel.setBackground(new java.awt.Color(255, 255, 255));

    form_insert_panel.setBackground(new java.awt.Color(255, 255, 255));
    form_insert_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    keterangan_title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
    keterangan_title.setForeground(new java.awt.Color(0, 0, 0));
    keterangan_title.setText("Silahkan masukan data kendaraan");

    tambah_nopol_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    tambah_nopol_title.setForeground(new java.awt.Color(0, 0, 0));
    tambah_nopol_title.setText("No Polisi");

    tambah_nopol.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    tambah_nopol.setForeground(new java.awt.Color(149, 149, 149));
    tambah_nopol.setText("x xxxx xx");
    tambah_nopol.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        tambah_nopolFocusGained(evt);
      }
    });

    tambah_merk_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    tambah_merk_title.setForeground(new java.awt.Color(0, 0, 0));
    tambah_merk_title.setText("Merk");

    tambah_merk_input.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
    tambah_merk_input.setForeground(new java.awt.Color(149, 149, 149));
    tambah_merk_input.setText("Merk");
    tambah_merk_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        tambah_merk_inputFocusGained(evt);
      }
    });

    tambah_tanggal_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    tambah_tanggal_title.setForeground(new java.awt.Color(0, 0, 0));
    tambah_tanggal_title.setText("Tanggal Masuk");

    tambah_tanggal_input.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
    tambah_tanggal_input.setForeground(new java.awt.Color(149, 149, 149));
    tambah_tanggal_input.setText("yyyy-mm-dd");
    tambah_tanggal_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        tambah_tanggal_inputFocusGained(evt);
      }
    });
    tambah_tanggal_input.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tambah_tanggal_inputActionPerformed(evt);
      }
    });

    tipe_kendaraan_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    tipe_kendaraan_title.setForeground(new java.awt.Color(0, 0, 0));
    tipe_kendaraan_title.setText("Tipe");

    tipe_button_zone.setBackground(new java.awt.Color(255, 255, 255));

    tambah_mobil_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahTypeGroup.add(tambah_mobil_radio);
    tambah_mobil_radio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tambah_mobil_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_mobil_radio.setText("Mobil");

    tambah_motor_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahTypeGroup.add(tambah_motor_radio);
    tambah_motor_radio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tambah_motor_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_motor_radio.setText("Motor");

    tambah_truk_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahTypeGroup.add(tambah_truk_radio);
    tambah_truk_radio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tambah_truk_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_truk_radio.setText("Truk");

    tambah_bus_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahTypeGroup.add(tambah_bus_radio);
    tambah_bus_radio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tambah_bus_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_bus_radio.setText("Bus");

    javax.swing.GroupLayout tipe_button_zoneLayout = new javax.swing.GroupLayout(tipe_button_zone);
    tipe_button_zone.setLayout(tipe_button_zoneLayout);
    tipe_button_zoneLayout.setHorizontalGroup(
      tipe_button_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tambah_mobil_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(tambah_motor_radio, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
      .addComponent(tambah_truk_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(tambah_bus_radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    tipe_button_zoneLayout.setVerticalGroup(
      tipe_button_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tipe_button_zoneLayout.createSequentialGroup()
        .addComponent(tambah_mobil_radio)
        .addGap(18, 18, 18)
        .addComponent(tambah_motor_radio)
        .addGap(18, 18, 18)
        .addComponent(tambah_truk_radio)
        .addGap(18, 18, 18)
        .addComponent(tambah_bus_radio)
        .addGap(0, 92, Short.MAX_VALUE))
    );

    membership_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    membership_title.setForeground(new java.awt.Color(0, 0, 0));
    membership_title.setText("Membership");

    membership_button_zone.setBackground(new java.awt.Color(255, 255, 255));

    tambah_member_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahMembershipGroup.add(tambah_member_radio);
    tambah_member_radio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    tambah_member_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_member_radio.setText("Member");
    tambah_member_radio.setEnabled(false);

    tambah_nonmember_radio.setBackground(new java.awt.Color(255, 255, 255));
    tambahMembershipGroup.add(tambah_nonmember_radio);
    tambah_nonmember_radio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
    tambah_nonmember_radio.setForeground(new java.awt.Color(0, 0, 0));
    tambah_nonmember_radio.setText("Nonmember");

    javax.swing.GroupLayout membership_button_zoneLayout = new javax.swing.GroupLayout(membership_button_zone);
    membership_button_zone.setLayout(membership_button_zoneLayout);
    membership_button_zoneLayout.setHorizontalGroup(
      membership_button_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(tambah_member_radio)
      .addComponent(tambah_nonmember_radio)
    );
    membership_button_zoneLayout.setVerticalGroup(
      membership_button_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(membership_button_zoneLayout.createSequentialGroup()
        .addComponent(tambah_member_radio)
        .addGap(18, 18, 18)
        .addComponent(tambah_nonmember_radio)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout form_insert_panelLayout = new javax.swing.GroupLayout(form_insert_panel);
    form_insert_panel.setLayout(form_insert_panelLayout);
    form_insert_panelLayout.setHorizontalGroup(
      form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(form_insert_panelLayout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(form_insert_panelLayout.createSequentialGroup()
            .addComponent(keterangan_title)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(form_insert_panelLayout.createSequentialGroup()
            .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(tambah_tanggal_title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tambah_tanggal_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
              .addComponent(tambah_merk_input, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tambah_merk_title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tambah_nopol_title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tambah_nopol, javax.swing.GroupLayout.Alignment.LEADING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
            .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tipe_kendaraan_title, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(tipe_button_zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(149, 149, 149)
            .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(membership_title)
              .addComponent(membership_button_zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(72, 72, 72))))
    );
    form_insert_panelLayout.setVerticalGroup(
      form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(form_insert_panelLayout.createSequentialGroup()
        .addComponent(keterangan_title, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(37, 37, 37)
        .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tambah_nopol_title)
          .addComponent(tipe_kendaraan_title)
          .addComponent(membership_title))
        .addGap(9, 9, 9)
        .addGroup(form_insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(form_insert_panelLayout.createSequentialGroup()
            .addComponent(tambah_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(tambah_merk_title)
            .addGap(12, 12, 12)
            .addComponent(tambah_merk_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(47, 47, 47)
            .addComponent(tambah_tanggal_title)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tambah_tanggal_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(tipe_button_zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(membership_button_zone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 37, Short.MAX_VALUE))
    );

    cta_tambah_submit.setBackground(new java.awt.Color(75, 86, 210));
    cta_tambah_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_tambah_submit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_tambah_submitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_tambah_submitMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_tambah_submitMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_tambah_submitMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_tambah_submitMouseReleased(evt);
      }
    });

    cta_submit_title.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
    cta_submit_title.setForeground(new java.awt.Color(255, 255, 255));
    cta_submit_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_submit_title.setText("SUBMIT");

    javax.swing.GroupLayout cta_tambah_submitLayout = new javax.swing.GroupLayout(cta_tambah_submit);
    cta_tambah_submit.setLayout(cta_tambah_submitLayout);
    cta_tambah_submitLayout.setHorizontalGroup(
      cta_tambah_submitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_submit_title, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
    );
    cta_tambah_submitLayout.setVerticalGroup(
      cta_tambah_submitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_submit_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout tambah_panelLayout = new javax.swing.GroupLayout(tambah_panel);
    tambah_panel.setLayout(tambah_panelLayout);
    tambah_panelLayout.setHorizontalGroup(
      tambah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tambah_panelLayout.createSequentialGroup()
        .addGroup(tambah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(tambah_panelLayout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(form_insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(tambah_panelLayout.createSequentialGroup()
            .addGap(347, 347, 347)
            .addComponent(cta_tambah_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(251, Short.MAX_VALUE))
    );
    tambah_panelLayout.setVerticalGroup(
      tambah_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tambah_panelLayout.createSequentialGroup()
        .addGap(66, 66, 66)
        .addComponent(form_insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(50, 50, 50)
        .addComponent(cta_tambah_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(65, Short.MAX_VALUE))
    );

    feature_panel.add(tambah_panel, "card7");

    edit_panel.setBackground(new java.awt.Color(255, 255, 255));

    edit_search_zone.setBackground(new java.awt.Color(255, 255, 255));
    edit_search_zone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    edit_nopol_input.setBackground(new java.awt.Color(255, 255, 255));
    edit_nopol_input.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    edit_nopol_input.setForeground(new java.awt.Color(153, 153, 153));
    edit_nopol_input.setText("No Polisi");
    edit_nopol_input.setBorder(null);
    edit_nopol_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        edit_nopol_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout edit_search_zoneLayout = new javax.swing.GroupLayout(edit_search_zone);
    edit_search_zone.setLayout(edit_search_zoneLayout);
    edit_search_zoneLayout.setHorizontalGroup(
      edit_search_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(edit_search_zoneLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(edit_nopol_input, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
    );
    edit_search_zoneLayout.setVerticalGroup(
      edit_search_zoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(edit_nopol_input, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
    );

    edit_search.setBackground(new java.awt.Color(75, 86, 210));
    edit_search.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    edit_search.setForeground(new java.awt.Color(255, 255, 255));
    edit_search.setText("Search");
    edit_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    edit_search.setFocusPainted(false);
    edit_search.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        edit_searchMouseClicked(evt);
      }
    });
    edit_search.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        edit_searchActionPerformed(evt);
      }
    });

    edit_table.setBackground(new java.awt.Color(255, 255, 255));
    edit_table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Tanggal Masuk", "No Polisi", "Tipe", "Merk", "Membership"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    edit_table.getTableHeader().setReorderingAllowed(false);
    edit_table.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        edit_tableMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(edit_table);
    if (edit_table.getColumnModel().getColumnCount() > 0) {
      edit_table.getColumnModel().getColumn(0).setResizable(false);
      edit_table.getColumnModel().getColumn(1).setResizable(false);
      edit_table.getColumnModel().getColumn(2).setResizable(false);
      edit_table.getColumnModel().getColumn(3).setResizable(false);
      edit_table.getColumnModel().getColumn(4).setResizable(false);
    }

    update_form_panel.setBackground(new java.awt.Color(255, 255, 255));
    update_form_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    update_title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
    update_title.setForeground(new java.awt.Color(0, 0, 0));
    update_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    update_title.setText("FORM UPDATE");

    nopol_update_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    nopol_update_title.setForeground(new java.awt.Color(0, 0, 0));
    nopol_update_title.setText("No Polisi");

    update_nopol_input_panel.setBackground(new java.awt.Color(255, 255, 255));
    update_nopol_input_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    update_nopol_input.setBackground(new java.awt.Color(255, 255, 255));
    update_nopol_input.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    update_nopol_input.setForeground(new java.awt.Color(153, 153, 153));
    update_nopol_input.setText("x xxxx xx");
    update_nopol_input.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    update_nopol_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        update_nopol_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout update_nopol_input_panelLayout = new javax.swing.GroupLayout(update_nopol_input_panel);
    update_nopol_input_panel.setLayout(update_nopol_input_panelLayout);
    update_nopol_input_panelLayout.setHorizontalGroup(
      update_nopol_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(update_nopol_input_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(update_nopol_input, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
    );
    update_nopol_input_panelLayout.setVerticalGroup(
      update_nopol_input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(update_nopol_input, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    update_tipe_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    update_tipe_title.setForeground(new java.awt.Color(0, 0, 0));
    update_tipe_title.setText("Tipe");

    update_membership_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    update_membership_title.setForeground(new java.awt.Color(0, 0, 0));
    update_membership_title.setText("Membership");

    update_merk_title.setBackground(new java.awt.Color(255, 255, 255));
    update_merk_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    update_merk_title.setForeground(new java.awt.Color(0, 0, 0));
    update_merk_title.setText("Merk");

    update_merk_panel.setBackground(new java.awt.Color(255, 255, 255));
    update_merk_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    update_merk_input.setBackground(new java.awt.Color(255, 255, 255));
    update_merk_input.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    update_merk_input.setForeground(new java.awt.Color(153, 153, 153));
    update_merk_input.setText("Merk");
    update_merk_input.setBorder(null);
    update_merk_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        update_merk_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout update_merk_panelLayout = new javax.swing.GroupLayout(update_merk_panel);
    update_merk_panel.setLayout(update_merk_panelLayout);
    update_merk_panelLayout.setHorizontalGroup(
      update_merk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(update_merk_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(update_merk_input, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(76, Short.MAX_VALUE))
    );
    update_merk_panelLayout.setVerticalGroup(
      update_merk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(update_merk_input, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    update_tanggal_title.setBackground(new java.awt.Color(255, 255, 255));
    update_tanggal_title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
    update_tanggal_title.setForeground(new java.awt.Color(0, 0, 0));
    update_tanggal_title.setText("Tanggal Masuk");

    update_tanggal_panel.setBackground(new java.awt.Color(255, 255, 255));
    update_tanggal_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    update_tanggal_input.setBackground(new java.awt.Color(255, 255, 255));
    update_tanggal_input.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    update_tanggal_input.setForeground(new java.awt.Color(153, 153, 153));
    update_tanggal_input.setText("yyyy-mm-dd");
    update_tanggal_input.setBorder(null);
    update_tanggal_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        update_tanggal_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout update_tanggal_panelLayout = new javax.swing.GroupLayout(update_tanggal_panel);
    update_tanggal_panel.setLayout(update_tanggal_panelLayout);
    update_tanggal_panelLayout.setHorizontalGroup(
      update_tanggal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(update_tanggal_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(update_tanggal_input, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
    );
    update_tanggal_panelLayout.setVerticalGroup(
      update_tanggal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(update_tanggal_input, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    cta_simpan.setBackground(new java.awt.Color(102, 255, 102));
    cta_simpan.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
    cta_simpan.setForeground(new java.awt.Color(255, 255, 255));
    cta_simpan.setText("SIMPAN");
    cta_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_simpan.setFocusPainted(false);
    cta_simpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cta_simpanActionPerformed(evt);
      }
    });

    cta_hapus.setBackground(new java.awt.Color(255, 51, 51));
    cta_hapus.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
    cta_hapus.setForeground(new java.awt.Color(255, 255, 255));
    cta_hapus.setText("HAPUS");
    cta_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_hapus.setFocusPainted(false);
    cta_hapus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cta_hapusActionPerformed(evt);
      }
    });

    tipe_dropdown.setBackground(new java.awt.Color(255, 255, 255));
    tipe_dropdown.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    tipe_dropdown.setForeground(new java.awt.Color(153, 153, 153));
    tipe_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Mobil", "Motor", "Truk", "Bus" }));
    tipe_dropdown.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tipe_dropdownActionPerformed(evt);
      }
    });

    membership_dropdown.setBackground(new java.awt.Color(255, 255, 255));
    membership_dropdown.setFont(new java.awt.Font("SansSerif", 2, 16)); // NOI18N
    membership_dropdown.setForeground(new java.awt.Color(149, 149, 149));
    membership_dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "Member", "Nonmember", " " }));

    jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
    jButton1.setText("CLEAR");
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.setFocusPainted(false);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout update_form_panelLayout = new javax.swing.GroupLayout(update_form_panel);
    update_form_panel.setLayout(update_form_panelLayout);
    update_form_panelLayout.setHorizontalGroup(
      update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(update_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(update_form_panelLayout.createSequentialGroup()
        .addGap(39, 39, 39)
        .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(update_membership_title, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(nopol_update_title, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(update_tipe_title, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(update_nopol_input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tipe_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(membership_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(update_tanggal_title, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
            .addComponent(update_merk_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(update_merk_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(update_form_panelLayout.createSequentialGroup()
              .addComponent(cta_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(cta_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(update_tanggal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    update_form_panelLayout.setVerticalGroup(
      update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(update_form_panelLayout.createSequentialGroup()
        .addComponent(update_title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25)
        .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(update_form_panelLayout.createSequentialGroup()
            .addComponent(nopol_update_title)
            .addGap(0, 0, 0)
            .addComponent(update_nopol_input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(update_tipe_title)
            .addComponent(tipe_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(update_membership_title)
            .addGap(0, 0, 0)
            .addComponent(membership_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(update_form_panelLayout.createSequentialGroup()
            .addComponent(update_merk_title)
            .addGap(0, 0, 0)
            .addComponent(update_merk_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(update_tanggal_title)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(update_tanggal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        .addGroup(update_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cta_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cta_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout edit_panelLayout = new javax.swing.GroupLayout(edit_panel);
    edit_panel.setLayout(edit_panelLayout);
    edit_panelLayout.setHorizontalGroup(
      edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(edit_panelLayout.createSequentialGroup()
        .addGap(68, 68, 68)
        .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(edit_panelLayout.createSequentialGroup()
            .addComponent(edit_search_zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(edit_search, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(update_form_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(229, Short.MAX_VALUE))
    );
    edit_panelLayout.setVerticalGroup(
      edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(edit_panelLayout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(edit_search_zone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(edit_search, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(update_form_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(65, Short.MAX_VALUE))
    );

    feature_panel.add(edit_panel, "card8");

    javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
    main_panel.setLayout(main_panelLayout);
    main_panelLayout.setHorizontalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(main_panelLayout.createSequentialGroup()
        .addComponent(side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(feature_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    main_panelLayout.setVerticalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(side_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(feature_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cta_berandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseEntered
    cta_button.changeColor(cta_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_berandaMouseEntered

  private void cta_berandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseExited
    cta_button.changeColor(cta_beranda, new Color(75,86,210));
  }//GEN-LAST:event_cta_berandaMouseExited

  private void cta_berandaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMousePressed
    
  }//GEN-LAST:event_cta_berandaMousePressed

  private void cta_daftar_kendaraanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseEntered
    cta_button.changeColor(cta_daftar_kendaraan, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_daftar_kendaraanMouseEntered

  private void cta_daftar_kendaraanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseExited
    cta_button.changeColor(cta_daftar_kendaraan, new Color(75,86,210));
  }//GEN-LAST:event_cta_daftar_kendaraanMouseExited

  private void cta_daftar_kendaraanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMousePressed
    
  }//GEN-LAST:event_cta_daftar_kendaraanMousePressed

  private void cta_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseEntered
    cta_button.changeColor(cta_riwayat, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_riwayatMouseEntered

  private void cta_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseExited
    cta_button.changeColor(cta_riwayat, new Color(75,86,210));
  }//GEN-LAST:event_cta_riwayatMouseExited

  private void cta_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMousePressed
    
  }//GEN-LAST:event_cta_riwayatMousePressed

  private void cta_signoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseEntered
    cta_button.changeColor(cta_signout, new Color(71,33,131));
  }//GEN-LAST:event_cta_signoutMouseEntered

  private void cta_signoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseExited
    cta_button.changeColor(cta_signout, new Color(75,86,210));
  }//GEN-LAST:event_cta_signoutMouseExited

  private void cta_signoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMousePressed
    cta_button.changeColor(cta_signout, new Color(75,86,210));
  }//GEN-LAST:event_cta_signoutMousePressed

  private void cta_signoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseReleased
    cta_button.changeColor(cta_signout, new Color(71,33,131));
  }//GEN-LAST:event_cta_signoutMouseReleased

  private void clearInputBeranda(
    JTextField text, 
    ButtonGroup button1, 
    ButtonGroup button2
  ) {
    text.setText("x xxxx xx");
    button1.clearSelection();
    button2.clearSelection();
  }
  
  private void clearInputTambah(
    JTextField text1,
    JTextField text2,
    JTextField text3,
    ButtonGroup button1,
    ButtonGroup button2
  ) {
    text1.setText("x xxxx xx");
    text2.setText("Merk");
    text3.setText("yyyy-mm-dd");
    button1.clearSelection();
    button2.clearSelection();
  }
  
  private void cta_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseClicked
    // Style
    boldColoredFont(beranda);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(riwayat);
    unboldUncoloredFont(tambah_title);
    unboldUncoloredFont(delete_title);
    
    // Logic
    cta_button.changePanel(feature_panel, beranda_panel);
    clearInputBeranda(nopol_input,typeGroup,membershipGroup);
  }//GEN-LAST:event_cta_berandaMouseClicked

  
  private void cta_daftar_kendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseClicked
    // Style
    boldColoredFont(daftar_kendaraan);
    unboldUncoloredFont(riwayat);
    unboldUncoloredFont(beranda);
    unboldUncoloredFont(tambah_title);
    unboldUncoloredFont(delete_title);

    // Logic
    cta_button.changePanel(feature_panel, daftar_kendaraan_panel);
    Vehicle.clearTableContent(jTable1);
    
    int mobil_parkir = vehicle_list.getUnemptySlot("Mobil");
    int motor_parkir = vehicle_list.getUnemptySlot("Motor");
    int lainnya_parkir = vehicle_list.getUnemptySlot("Lainnya");
    int total_vehicle = vehicle_list.getTotalVehicle();

    total_mobil_parkir.setText(String.valueOf(mobil_parkir));
    total_motor_parkir.setText(String.valueOf(motor_parkir));
    total_lainnya_parkir.setText(String.valueOf(lainnya_parkir));
    num_jumlah_kendaraan.setText(String.valueOf(total_vehicle));

    vehicle_list.displayData(jTable1);
  }//GEN-LAST:event_cta_daftar_kendaraanMouseClicked

  private void cta_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseClicked
    // Style
    boldColoredFont(riwayat);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(beranda);
    unboldUncoloredFont(tambah_title);
    unboldUncoloredFont(delete_title);
    
    // Logic
    cta_button.changePanel(feature_panel, history_panel);
    Vehicle.clearTableContent(table_riwayat);
    search_textfield.setText("No Polisi");
    history.displayData(table_riwayat);
  }//GEN-LAST:event_cta_riwayatMouseClicked

  private void boldColoredFont(JLabel _text) {
    _font.boldingFont(_text);
  }
  
  private void unboldUncoloredFont(JLabel _text) {
    _font.unboldFont(_text);
  }
  
  private void cta_berandaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseReleased
  }//GEN-LAST:event_cta_berandaMouseReleased

  private void member_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_radioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_member_radioActionPerformed

  private void nopol_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nopol_inputFocusGained
    nopol_input.setText("");
  }//GEN-LAST:event_nopol_inputFocusGained

  private void cta_button_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseEntered
    cta_button.changeColor(cta_button_next, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_nextMouseEntered

  private void cta_button_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseExited
    cta_button.changeColor(cta_button_next, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_nextMouseExited

  private void cta_button_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMousePressed
    cta_button.changeColor(cta_button_next, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_nextMousePressed

  private void cta_button_nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseReleased
    cta_button.changeColor(cta_button_next, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_nextMouseReleased

  private String getSelectedRadioButtonText(ButtonGroup buttonGroup) {
    for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
      AbstractButton button = buttons.nextElement();

      if (button.isSelected()) {
        return button.getText();
      }
    }
    return null;
  }

  private boolean stringMatching(String input, String pattern) {
    if (input.matches(pattern)) return true;
    else return false;
  }
  
  private void setAllUnemptySlot(
    JLabel label1,
    JLabel label2,
    JLabel label3,
    JLabel label4
  ) {
    int mobil_terisi = dashboard.getUnemptySlot("Mobil");
    int motor_terisi = dashboard.getUnemptySlot("Motor");
    int truk_terisi = dashboard.getUnemptySlot("Truk");
    int bus_terisi = dashboard.getUnemptySlot("Bus");
    
    label1.setText(String.valueOf(mobil_terisi));
    label2.setText(String.valueOf(motor_terisi));
    label3.setText(String.valueOf(truk_terisi));
    label4.setText(String.valueOf(bus_terisi));
  }
  
  private void setAllEmptySlot(
    JLabel label1,
    JLabel label2,
    JLabel label3,
    JLabel label4
  ) {
    int mobil_kosong = dashboard.getEmptySlot("Mobil",30);
    int motor_kosong = dashboard.getEmptySlot("Motor",50);
    int truk_kosong = dashboard.getEmptySlot("Truk",10);
    int bus_kosong = dashboard.getEmptySlot("Bus",5);

    label1.setText(String.valueOf(mobil_kosong));
    label2.setText(String.valueOf(motor_kosong));
    label3.setText(String.valueOf(truk_kosong));
    label4.setText(String.valueOf(bus_kosong));
  }
  
  private void cta_button_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseClicked
    // Style
    cta_button.changeColor(cta_button_next, new Color(75,86,210));
    
    // Logic
    this.nopol = nopol_input.getText();
    
    if (
      nonmember_radio.isSelected() &&
      !this.nopol.isEmpty() &&
      stringMatching(this.nopol,"[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{2}") ||
      stringMatching(this.nopol, "[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{3}")
    ) {
      if (
        mobil_radio.isSelected() ||
        motor_radio.isSelected() ||
        truk_radio.isSelected()  ||
        bus_radio.isSelected()
      ) {
        cta_button.changePanel(feature_panel, payment_panel);
        this.selectedTypeText = getSelectedRadioButtonText(typeGroup);
        this.selectedMemberText = getSelectedRadioButtonText(membershipGroup);

        dashboard = new Dashboard(
          this.nopol,
          selectedTypeText,
          selectedMemberText
        );
        
        Vehicle.clearTableContent(table_status_payment2);
        dashboard.displaySingleData(table_status_payment2, this.nopol, this.selectedTypeText, this.selectedMemberText, 0);
        
        setAllUnemptySlot(mobil_terisi_label2,motor_terisi_label2,truk_terisi_label2,bus_terisi_label2);
        setAllEmptySlot(mobil_kosong_label2,motor_kosong_label2,truk_kosong_label2,bus_kosong_label2);
      }
    }
    else if (
      !stringMatching(this.nopol,"[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{2}") ||
      !stringMatching(this.nopol, "[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{3}")
    ) {
      JOptionPane.showMessageDialog(this,"License plate's format is wrong!");
    }
    else {
      JOptionPane.showMessageDialog(this,"Please fill the form!");
    }
  }//GEN-LAST:event_cta_button_nextMouseClicked

  private void search_textfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_textfieldFocusGained
    search_textfield.setText("");
  }//GEN-LAST:event_search_textfieldFocusGained

  private void cta_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cta_searchActionPerformed
    String input = search_textfield.getText();
    Vehicle.clearTableContent(table_riwayat);
    
    if (input.isEmpty() || input.equals("No Polisi")) {
      history.displayData(table_riwayat);
    }
    else {
      history.searchData(input, table_riwayat); 
    }
  }//GEN-LAST:event_cta_searchActionPerformed

  private void cta_button_validate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validate1MouseClicked
    // Style
    cta_button.changePanel(feature_panel, validated_panel);
    cta_button.changeColor(cta_button_validate1, new Color(75, 86, 210));
    
    // Logic
    DefaultTableModel model = (DefaultTableModel) table_status_payment2.getModel();
    
    if (model.getRowCount() == 0) {
      cta_button.changePanel(feature_panel, beranda_panel);
      clearInputBeranda(nopol_input,typeGroup,membershipGroup);
      JOptionPane.showMessageDialog(this,"Data not found!");
    }
    else {
      this.nopol = nopol_input.getText();
      dashboard.validatePayment(this.nopol);
      setAllUnemptySlot(mobil_terisi_label4,motor_terisi_label4,truk_terisi_label4,bus_terisi_label4);
      setAllEmptySlot(mobil_kosong_label4,motor_kosong_label4,truk_kosong_label4,bus_kosong_label4);

      Vehicle.clearTableContent(table_status_payment3);
      dashboard.displaySingleData(table_status_payment3, this.nopol, this.selectedTypeText, this.selectedMemberText, 1);
    }
  }//GEN-LAST:event_cta_button_validate1MouseClicked

  private void cta_button_validate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validate1MouseEntered
    cta_button.changeColor(cta_button_validate1, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_validate1MouseEntered

  private void cta_button_validate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validate1MouseExited
    cta_button.changeColor(cta_button_validate1, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_validate1MouseExited

  private void cta_button_validate1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validate1MousePressed
    cta_button.changeColor(cta_button_validate1, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_validate1MousePressed

  private void cta_button_validate1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validate1MouseReleased
    cta_button.changeColor(cta_button_validate1, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_validate1MouseReleased

  private void cta_button_to_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_to_berandaMouseClicked
    // Style
    cta_button.changePanel(feature_panel, beranda_panel);
    cta_button.changeColor(cta_button_to_beranda, new Color(75, 86, 210));
    
    // Logic
    clearInputBeranda(nopol_input,typeGroup,membershipGroup);
  }//GEN-LAST:event_cta_button_to_berandaMouseClicked

  private void cta_button_to_berandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_to_berandaMouseEntered
    cta_button.changeColor(cta_button_to_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_to_berandaMouseEntered

  private void cta_button_to_berandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_to_berandaMouseExited
    cta_button.changeColor(cta_button_to_beranda, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_to_berandaMouseExited

  private void cta_button_to_berandaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_to_berandaMousePressed
    cta_button.changeColor(cta_button_to_beranda, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_to_berandaMousePressed

  private void cta_button_to_berandaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_to_berandaMouseReleased
    cta_button.changeColor(cta_button_to_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_to_berandaMouseReleased

  private void cta_signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseClicked
    dispose();
    LoginForm login = new LoginForm();
    login.show();
  }//GEN-LAST:event_cta_signoutMouseClicked

  private void cta_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambahMouseEntered
    cta_button.changeColor(cta_tambah, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_tambahMouseEntered

  private void cta_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambahMouseExited
    cta_button.changeColor(cta_tambah, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_tambahMouseExited

  private void cta_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambahMousePressed
    cta_button.changeColor(cta_tambah, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_tambahMousePressed

  private void cta_tambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambahMouseReleased
    cta_button.changeColor(cta_tambah, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_tambahMouseReleased

  private void cta_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_deleteMouseEntered
    cta_button.changeColor(cta_delete, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_deleteMouseEntered

  private void cta_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_deleteMouseExited
    cta_button.changeColor(cta_delete, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_deleteMouseExited

  private void cta_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_deleteMousePressed
    cta_button.changeColor(cta_delete, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_deleteMousePressed

  private void cta_deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_deleteMouseReleased
    cta_button.changeColor(cta_delete, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_deleteMouseReleased

  private void cta_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambahMouseClicked
    boldColoredFont(tambah_title);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(beranda);
    unboldUncoloredFont(riwayat);
    unboldUncoloredFont(delete_title);
    
    // Logic
    cta_button.changePanel(feature_panel, tambah_panel);
    tambah_tanggal_input.setText("yyyy-mm-dd");
    tambah_nopol.setText("x xxxx xx");
    tambah_merk_input.setText("Merk");
  }//GEN-LAST:event_cta_tambahMouseClicked

  private void tambah_tanggal_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_tanggal_inputActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tambah_tanggal_inputActionPerformed

  private void tambah_nopolFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tambah_nopolFocusGained
    tambah_nopol.setText("");
  }//GEN-LAST:event_tambah_nopolFocusGained

  private void tambah_merk_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tambah_merk_inputFocusGained
    tambah_merk_input.setText("");
  }//GEN-LAST:event_tambah_merk_inputFocusGained

  private void tambah_tanggal_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tambah_tanggal_inputFocusGained
    tambah_tanggal_input.setText("");
  }//GEN-LAST:event_tambah_tanggal_inputFocusGained

  private void cta_tambah_submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambah_submitMouseEntered
    cta_button.changeColor(cta_tambah_submit, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_tambah_submitMouseEntered

  private void cta_tambah_submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambah_submitMouseExited
    cta_button.changeColor(cta_tambah_submit, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_tambah_submitMouseExited

  private void cta_tambah_submitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambah_submitMousePressed
    cta_button.changeColor(cta_tambah_submit, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_tambah_submitMousePressed

  private void cta_tambah_submitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambah_submitMouseReleased
    cta_button.changeColor(cta_tambah_submit, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_tambah_submitMouseReleased

  private void cta_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_deleteMouseClicked
    boldColoredFont(delete_title);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(beranda);
    unboldUncoloredFont(tambah_title);
    unboldUncoloredFont(riwayat);
    
    // logic
    cta_button.changePanel(feature_panel, edit_panel);
    Vehicle.clearTableContent(edit_table);
    edit.displayData(edit_table);
    edit_nopol_input.setText("No Polisi");
    update_nopol_input.setText("No Polisi");
    update_merk_input.setText("Merk");
    update_tanggal_input.setText("yyyy-mm-dd");
  }//GEN-LAST:event_cta_deleteMouseClicked

  private void cta_tambah_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_tambah_submitMouseClicked
    if (
      stringMatching(tambah_nopol.getText(),"[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{2}") ||
      stringMatching(tambah_nopol.getText(), "[A-Z]{1}\\s[0-9]{4}\\s[A-Z]{3}") &&
      tambah_nonmember_radio.isSelected()
    ) {
      if (
        tambah_mobil_radio.isSelected() ||
        tambah_motor_radio.isSelected() ||
        tambah_truk_radio.isSelected() ||
        tambah_truk_radio.isSelected()
      ) {
        this.selectedTypeText = getSelectedRadioButtonText(tambahTypeGroup);
        this.selectedMemberText = getSelectedRadioButtonText(tambahMembershipGroup);
                
        create.insert(
    tambah_nopol.getText(), 
    tambah_merk_input.getText(), 
     this.selectedTypeText, 
      this.selectedMemberText, 
           tambah_tanggal_input.getText()
        );
        
        clearInputTambah(tambah_nopol, tambah_merk_input, tambah_tanggal_input, tambahTypeGroup, tambahMembershipGroup);
        JOptionPane.showMessageDialog(this, "Your data successfully added!");
      }
    }
    else {
      JOptionPane.showMessageDialog(this, "Failed to add your data!");
    }
  }//GEN-LAST:event_cta_tambah_submitMouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    update_nopol_input.setText("x xxxx xx");
    update_merk_input.setText("Merk");
    update_tanggal_input.setText("yyyy-mm-dd");
    tipe_dropdown.setSelectedItem("-- Select --");
    membership_dropdown.setSelectedItem("-- Select --");
  }//GEN-LAST:event_jButton1ActionPerformed

  private void update_tanggal_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_tanggal_inputFocusGained
    update_tanggal_input.setText("");
  }//GEN-LAST:event_update_tanggal_inputFocusGained

  private void update_merk_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_merk_inputFocusGained
    update_merk_input.setText("");
  }//GEN-LAST:event_update_merk_inputFocusGained

  private void update_nopol_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_update_nopol_inputFocusGained
    update_nopol_input.setText("");
  }//GEN-LAST:event_update_nopol_inputFocusGained

  private void edit_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_tableMouseClicked
    int row = edit_table.rowAtPoint(evt.getPoint());
    
    String date = (String)edit_table.getValueAt(row,0);
    update_tanggal_input.setText(date);
    
    this.nopol = (String)edit_table.getValueAt(row,1);
    update_nopol_input.setText(this.nopol);
    
    String tipe = (String)edit_table.getValueAt(row, 2);
    tipe_dropdown.setSelectedItem(tipe);
    
    String merk = (String)edit_table.getValueAt(row, 3);
    update_merk_input.setText(merk);
    
    String membership = (String)edit_table.getValueAt(row, 4);
    membership_dropdown.setSelectedItem(membership);
  }//GEN-LAST:event_edit_tableMouseClicked

  private void edit_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_searchActionPerformed
    String input = edit_nopol_input.getText();
    Vehicle.clearTableContent(edit_table);

    if (input.isEmpty() || input.equals("No Polisi")) {
      edit.displayData(edit_table);
    }
    else {
      edit.searchData(input, edit_table);
    }
  }//GEN-LAST:event_edit_searchActionPerformed

  private void edit_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_searchMouseClicked

  }//GEN-LAST:event_edit_searchMouseClicked

  private void edit_nopol_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edit_nopol_inputFocusGained
    edit_nopol_input.setText("");
  }//GEN-LAST:event_edit_nopol_inputFocusGained

  private void tipe_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipe_dropdownActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tipe_dropdownActionPerformed
 
  private void cta_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cta_simpanActionPerformed
    if (
      !update_nopol_input.getText().isEmpty() &&
      !update_merk_input.getText().isEmpty() &&
      !update_tanggal_input.getText().isEmpty() &&
      tipe_dropdown.getSelectedItem().toString() != "-- Select --" &&
      membership_dropdown.getSelectedItem().toString() != "-- Select --"   
    ) {
      edit.updateKendaraan(
        update_nopol_input.getText(), 
        update_merk_input.getText(), 
        tipe_dropdown.getSelectedItem().toString(), 
        membership_dropdown.getSelectedItem().toString(), 
        update_tanggal_input.getText()
      );
      update_nopol_input.setText("x xxxx xx");
      update_merk_input.setText("Merk");
      update_tanggal_input.setText("yyyy-mm-dd");
      tipe_dropdown.setSelectedItem("-- Select --");
      membership_dropdown.setSelectedItem("-- Select --");
      JOptionPane.showMessageDialog(this,"Update successfuly!");
    }
    else if (update_nopol_input.getText().equals("x xxxx xx")) {
      JOptionPane.showMessageDialog(this,"Update failed!");
    }
    else {
      JOptionPane.showMessageDialog(this,"Update failed!");
    }
  }//GEN-LAST:event_cta_simpanActionPerformed

  private void cta_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cta_hapusActionPerformed
    if (
      !update_nopol_input.getText().isEmpty() &&
      !update_merk_input.getText().isEmpty() &&
      !update_tanggal_input.getText().isEmpty() &&
      tipe_dropdown.getSelectedItem().toString() != "-- Select --" &&
      membership_dropdown.getSelectedItem().toString() != "-- Select --"   
    ) {
      edit.delete(update_nopol_input.getText());
      update_nopol_input.setText("x xxxx xx");
      update_merk_input.setText("Merk");
      update_tanggal_input.setText("yyyy-mm-dd");
      tipe_dropdown.setSelectedItem("-- Select --");
      membership_dropdown.setSelectedItem("-- Select --");
      JOptionPane.showMessageDialog(this,"Delete data successfuly!");
    }
    else if (update_nopol_input.getText().equals("x xxxx xx")) {
      JOptionPane.showMessageDialog(this,"Delete data failed!");
    }
    else {
      JOptionPane.showMessageDialog(this,"Delete data failed!");
    }
  }//GEN-LAST:event_cta_hapusActionPerformed

  private void showAllField(
    String nopol,
    JTextField txt1,
    JTextField txt2,
    JTextField txt3
  ) {
    txt1.setText(edit.displaySingleData("nopol", nopol));
    txt2.setText(edit.displaySingleData("merk", nopol));
    txt3.setText(edit.displaySingleData("tanggal", nopol));
  }
  
  
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
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel beranda;
  private javax.swing.JPanel beranda_panel;
  private javax.swing.JPanel bus_kosong_3;
  private javax.swing.JPanel bus_kosong_5;
  private javax.swing.JLabel bus_kosong_label2;
  private javax.swing.JLabel bus_kosong_label4;
  private javax.swing.JRadioButton bus_radio;
  private javax.swing.JPanel bus_terisi_3;
  private javax.swing.JPanel bus_terisi_5;
  private javax.swing.JLabel bus_terisi_label2;
  private javax.swing.JLabel bus_terisi_label4;
  private javax.swing.JPanel cta_beranda;
  private javax.swing.JPanel cta_button_next;
  private javax.swing.JPanel cta_button_to_beranda;
  private javax.swing.JPanel cta_button_validate1;
  private javax.swing.JPanel cta_daftar_kendaraan;
  private javax.swing.JPanel cta_delete;
  private javax.swing.JButton cta_hapus;
  private javax.swing.JLabel cta_next;
  private javax.swing.JPanel cta_riwayat;
  private javax.swing.JButton cta_search;
  private javax.swing.JPanel cta_signout;
  private javax.swing.JButton cta_simpan;
  private javax.swing.JLabel cta_submit_title;
  private javax.swing.JPanel cta_tambah;
  private javax.swing.JPanel cta_tambah_submit;
  private javax.swing.JLabel cta_to_beranda;
  private javax.swing.JLabel cta_validate1;
  private javax.swing.JLabel daftar_kendaraan;
  private javax.swing.JPanel daftar_kendaraan_panel;
  private javax.swing.JLabel daftar_kendaraan_title;
  private javax.swing.JLabel delete_title;
  private javax.swing.JTextField edit_nopol_input;
  private javax.swing.JPanel edit_panel;
  private javax.swing.JButton edit_search;
  private javax.swing.JPanel edit_search_zone;
  private javax.swing.JTable edit_table;
  private javax.swing.JPanel feature_panel;
  private javax.swing.JPanel form_insert_panel;
  private javax.swing.JPanel history_panel;
  private javax.swing.JLabel home_icon;
  private javax.swing.JLabel icon_tambah;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JScrollPane jScrollPane7;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  public static javax.swing.JTable jTable1;
  private javax.swing.JPanel keterangan;
  private javax.swing.JLabel keterangan_title;
  private javax.swing.JLabel label_pic1;
  private javax.swing.JLabel label_pic2;
  private javax.swing.JLabel list_icon;
  private javax.swing.JPanel main_panel;
  private javax.swing.JRadioButton member_radio;
  private javax.swing.ButtonGroup membershipGroup;
  private javax.swing.JPanel membership_button_zone;
  private javax.swing.JComboBox<String> membership_dropdown;
  private javax.swing.JLabel membership_title;
  private javax.swing.JPanel mobil_kosong_3;
  private javax.swing.JPanel mobil_kosong_5;
  private javax.swing.JLabel mobil_kosong_label2;
  private javax.swing.JLabel mobil_kosong_label4;
  private javax.swing.JPanel mobil_panel;
  private javax.swing.JRadioButton mobil_radio;
  private javax.swing.JPanel mobil_terisi_3;
  private javax.swing.JPanel mobil_terisi_5;
  private javax.swing.JLabel mobil_terisi_label2;
  private javax.swing.JLabel mobil_terisi_label4;
  private javax.swing.JLabel mobil_title;
  private javax.swing.JPanel mobil_title_panel;
  private javax.swing.JPanel motor_kosong_3;
  private javax.swing.JPanel motor_kosong_5;
  private javax.swing.JLabel motor_kosong_label2;
  private javax.swing.JLabel motor_kosong_label4;
  private javax.swing.JPanel motor_panel;
  private javax.swing.JRadioButton motor_radio;
  private javax.swing.JPanel motor_terisi_3;
  private javax.swing.JPanel motor_terisi_5;
  private javax.swing.JLabel motor_terisi_label2;
  private javax.swing.JLabel motor_terisi_label4;
  private javax.swing.JLabel motor_title;
  private javax.swing.JPanel motor_title_panel;
  private javax.swing.JRadioButton nonmember_radio;
  private javax.swing.JTextField nopol_input;
  private javax.swing.JPanel nopol_panel;
  private javax.swing.JLabel nopol_title;
  private javax.swing.JLabel nopol_update_title;
  private javax.swing.JLabel num_jumlah_kendaraan;
  private javax.swing.JPanel others_panel;
  private javax.swing.JLabel others_title;
  private javax.swing.JPanel others_title_panel;
  private javax.swing.JPanel panel_count3;
  private javax.swing.JPanel panel_count5;
  private javax.swing.JPanel panel_count_title_3;
  private javax.swing.JPanel panel_count_title_5;
  private javax.swing.JPanel panel_kosong_3;
  private javax.swing.JPanel panel_kosong_5;
  private javax.swing.JPanel panel_number2;
  private javax.swing.JPanel panel_number4;
  private javax.swing.JPanel panel_terisi_3;
  private javax.swing.JPanel panel_terisi_5;
  private javax.swing.JPanel payment_panel;
  private javax.swing.JPanel pic_1;
  private javax.swing.JPanel pic_2;
  private javax.swing.JLabel repo_icon;
  private javax.swing.JLabel riwayat;
  private javax.swing.JPanel search_panel;
  private javax.swing.JTextField search_textfield;
  private javax.swing.JPanel side_panel;
  private javax.swing.JLabel sign_out;
  private javax.swing.JLabel signout_icon;
  private javax.swing.JPanel status_panel;
  private javax.swing.JLabel status_title;
  private javax.swing.JPanel table_panel;
  private javax.swing.JTable table_riwayat;
  private javax.swing.JPanel table_riwayat_panel;
  private javax.swing.JLabel table_riwayat_title;
  private javax.swing.JPanel table_riwayat_title_panel;
  private javax.swing.JTable table_status_payment2;
  private javax.swing.JTable table_status_payment3;
  private javax.swing.JPanel table_title_panel;
  private javax.swing.ButtonGroup tambahMembershipGroup;
  private javax.swing.ButtonGroup tambahTypeGroup;
  private javax.swing.JRadioButton tambah_bus_radio;
  private javax.swing.JRadioButton tambah_member_radio;
  private javax.swing.JTextField tambah_merk_input;
  private javax.swing.JLabel tambah_merk_title;
  private javax.swing.JRadioButton tambah_mobil_radio;
  private javax.swing.JRadioButton tambah_motor_radio;
  private javax.swing.JRadioButton tambah_nonmember_radio;
  private javax.swing.JTextField tambah_nopol;
  private javax.swing.JLabel tambah_nopol_title;
  private javax.swing.JPanel tambah_panel;
  private javax.swing.JTextField tambah_tanggal_input;
  private javax.swing.JLabel tambah_tanggal_title;
  private javax.swing.JLabel tambah_title;
  private javax.swing.JRadioButton tambah_truk_radio;
  private javax.swing.JPanel tipe_button_zone;
  private javax.swing.JComboBox<String> tipe_dropdown;
  private javax.swing.JLabel tipe_kendaraan_title;
  private javax.swing.JPanel tipe_panel;
  private javax.swing.JLabel tipe_title;
  private javax.swing.JLabel title;
  private javax.swing.JLabel title_bus2;
  private javax.swing.JLabel title_bus4;
  private javax.swing.JLabel title_kosong_3;
  private javax.swing.JLabel title_kosong_5;
  private javax.swing.JLabel title_mobil2;
  private javax.swing.JLabel title_mobil4;
  private javax.swing.JLabel title_motor2;
  private javax.swing.JLabel title_motor4;
  private javax.swing.JLabel title_terisi_3;
  private javax.swing.JLabel title_terisi_5;
  private javax.swing.JLabel title_truk_3;
  private javax.swing.JLabel title_truk_5;
  private javax.swing.JLabel total_lainnya_parkir;
  private javax.swing.JLabel total_mobil_parkir;
  private javax.swing.JLabel total_motor_parkir;
  private javax.swing.JLabel total_title;
  private javax.swing.JPanel truk_kosong_3;
  private javax.swing.JPanel truk_kosong_5;
  private javax.swing.JLabel truk_kosong_label2;
  private javax.swing.JLabel truk_kosong_label4;
  private javax.swing.JRadioButton truk_radio;
  private javax.swing.JPanel truk_terisi_3;
  private javax.swing.JPanel truk_terisi_5;
  private javax.swing.JLabel truk_terisi_label2;
  private javax.swing.JLabel truk_terisi_label4;
  private javax.swing.ButtonGroup typeGroup;
  private javax.swing.JPanel update_form_panel;
  private javax.swing.JLabel update_membership_title;
  private javax.swing.JTextField update_merk_input;
  private javax.swing.JPanel update_merk_panel;
  private javax.swing.JLabel update_merk_title;
  private javax.swing.JTextField update_nopol_input;
  private javax.swing.JPanel update_nopol_input_panel;
  private javax.swing.JTextField update_tanggal_input;
  private javax.swing.JPanel update_tanggal_panel;
  private javax.swing.JLabel update_tanggal_title;
  private javax.swing.JLabel update_tipe_title;
  private javax.swing.JLabel update_title;
  private javax.swing.JLabel user_pic;
  private javax.swing.JPanel validated_panel;
  // End of variables declaration//GEN-END:variables
}
