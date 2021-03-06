/*
 * class contains the interface that is presented to the
 * doctor when the click on a patient that is displayed 
 * in their patient lists
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class DoctorUI2 extends javax.swing.JFrame {

    /**
     * Creates new form DoctorUI2
     */
    public DoctorUI2(Patient patient) {
        initComponents(patient);
    }
    @SuppressWarnings("unchecked")                         
    private void initComponents(Patient patient) {
    	//all GUI components
        jTabbedPane1 = new javax.swing.JTabbedPane();
        viewSumbissionsTab = new javax.swing.JPanel();
        viewSymptomsBackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewSymptomsTextArea = new javax.swing.JTextArea();
        viewSymptomsHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactPatientTextArea = new javax.swing.JTextArea();
        contactPatientInfoHeader = new javax.swing.JLabel();
        symptomDates = new javax.swing.JComboBox();
        selectDateHeader = new javax.swing.JLabel();
        filePrescriptionPanel = new javax.swing.JPanel();
        filePrescriptionsBackButton = new javax.swing.JButton();
        enterPrescriptionHeader = new javax.swing.JLabel();
        prescriptionNameHeader = new javax.swing.JLabel();
        enterPrescriptionTextField = new javax.swing.JTextField();
        frequencyHeader = new javax.swing.JLabel();
        enterFrequencyTextField = new javax.swing.JTextField();
        dosesHeader = new javax.swing.JLabel();
        enterDoseTextField = new javax.swing.JTextField();
        mgHeader = new javax.swing.JLabel();
        patientPharInfoHeader = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientPharInfoTextArea = new javax.swing.JTextArea();
        filePrescriptionButton = new javax.swing.JButton();
        contactPatientTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        chatBoxTextArea = new javax.swing.JTextArea();
        sendMessageButton = new javax.swing.JButton();
        contactPatientBackButton = new javax.swing.JButton();
        editPatientInfoTab = new javax.swing.JPanel();
        nameHeader = new javax.swing.JLabel();
        emailHeader = new javax.swing.JLabel();
        phoneHeader = new javax.swing.JLabel();
        addressHeader = new javax.swing.JLabel();
        pharHeader = new javax.swing.JLabel();
        passwordHeader = new javax.swing.JLabel();
        editPatientName = new javax.swing.JTextField();
        patientName = new javax.swing.JLabel();
        patientEmail = new javax.swing.JLabel();
        patientPhone = new javax.swing.JLabel();
        patientStreet = new javax.swing.JLabel();
        patientCity = new javax.swing.JLabel();
        patientPharName = new javax.swing.JLabel();
        patientPharAddr = new javax.swing.JLabel();
        patientPharPhone = new javax.swing.JLabel();
        patientPassword = new javax.swing.JLabel();
        editPatientEmail = new javax.swing.JTextField();
        editPatientPhone = new javax.swing.JTextField();
        editPatientStreet = new javax.swing.JTextField();
        editPatientCity = new javax.swing.JTextField();
        editPatientPharName = new javax.swing.JTextField();
        editPharAddress = new javax.swing.JTextField();
        editPatientPharPhone = new javax.swing.JTextField();
        passField1 = new javax.swing.JPasswordField();
        confirmHeader = new javax.swing.JLabel();
        passField2 = new javax.swing.JPasswordField();
        editPatientInfoBackButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        //sets up GUI visual interface (88-683)
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        

        viewSymptomsBackButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        viewSymptomsBackButton.setText("Go Back to List");
        viewSymptomsBackButton.setName(""); // NOI18N
        viewSymptomsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSymptomsBackButtonActionPerformed(evt, patient);
            }
        });

        viewSymptomsTextArea.setColumns(20);
        viewSymptomsTextArea.setRows(5);
        viewSymptomsTextArea.setEditable(false);
        jScrollPane1.setViewportView(viewSymptomsTextArea);

        viewSymptomsHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewSymptomsHeader.setText("Symptom Ratings");

        contactPatientTextArea.setColumns(20);
        contactPatientTextArea.setRows(5);
        contactPatientTextArea.setEditable(false);
        setContactInfo(patient);
        jScrollPane2.setViewportView(contactPatientTextArea);

        contactPatientInfoHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contactPatientInfoHeader.setText("Patient Contact Information");

        symptomDates.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setSymptomDates(patient);
        
     
        symptomDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomDatesActionPerformed(evt, patient);
            }
        });

        selectDateHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        selectDateHeader.setText("Select Date:");

        javax.swing.GroupLayout viewSumbissionsTabLayout = new javax.swing.GroupLayout(viewSumbissionsTab);
        viewSumbissionsTab.setLayout(viewSumbissionsTabLayout);
        viewSumbissionsTabLayout.setHorizontalGroup(
            viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSumbissionsTabLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(contactPatientInfoHeader)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(viewSymptomsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSumbissionsTabLayout.createSequentialGroup()
                .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewSumbissionsTabLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(viewSymptomsHeader))
                    .addGroup(viewSumbissionsTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(symptomDates, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectDateHeader))
                .addContainerGap())
        );
        viewSumbissionsTabLayout.setVerticalGroup(
            viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSumbissionsTabLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewSymptomsHeader)
                    .addComponent(selectDateHeader))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(viewSumbissionsTabLayout.createSequentialGroup()
                        .addComponent(symptomDates, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(contactPatientInfoHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewSumbissionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewSymptomsBackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("View Symptoms", viewSumbissionsTab);

        filePrescriptionsBackButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        filePrescriptionsBackButton.setText("Go Back to List");
        filePrescriptionsBackButton.setPreferredSize(new java.awt.Dimension(114, 38));
        filePrescriptionsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePrescriptionsBackButtonActionPerformed(evt, patient);
            }
        });

        enterPrescriptionHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        enterPrescriptionHeader.setText("Enter Prescription Information:");

        prescriptionNameHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prescriptionNameHeader.setText("Name: ");

        enterPrescriptionTextField.setText("Enter prescription name here");
        enterPrescriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPrescriptionTextFieldActionPerformed(evt);
            }
        });

        frequencyHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        frequencyHeader.setText("Frequency:");

        enterFrequencyTextField.setText("Enter the amount of prescriptions here");
        enterFrequencyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterFrequencyTextFieldActionPerformed(evt);
            }
        });

        dosesHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dosesHeader.setText("Dose:");

        enterDoseTextField.setText("Enter dose amount");
        enterDoseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDoseTextFieldActionPerformed(evt);
            }
        });

        mgHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mgHeader.setText("mg");

        patientPharInfoHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patientPharInfoHeader.setText("Patient Pharmacy Information");

        patientPharInfoTextArea.setColumns(20);
        patientPharInfoTextArea.setRows(5);
        patientPharInfoTextArea.setEditable(false);
        patientPharInfoTextArea.setFont(new java.awt.Font("Times New Roman", 0, 14));
        setPharInfo(patient);
        jScrollPane3.setViewportView(patientPharInfoTextArea);

        filePrescriptionButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        filePrescriptionButton.setText("File Prescription");
        filePrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePrescriptionButtonActionPerformed(evt, patient);
            }
        });

        javax.swing.GroupLayout filePrescriptionPanelLayout = new javax.swing.GroupLayout(filePrescriptionPanel);
        filePrescriptionPanel.setLayout(filePrescriptionPanelLayout);
        filePrescriptionPanelLayout.setHorizontalGroup(
            filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterPrescriptionHeader)
                                    .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prescriptionNameHeader)
                                            .addComponent(frequencyHeader)
                                            .addComponent(dosesHeader))
                                        .addGap(26, 26, 26)
                                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(enterPrescriptionTextField)
                                                .addComponent(enterFrequencyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                                            .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                                                .addComponent(enterDoseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mgHeader))))))
                            .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(filePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(patientPharInfoHeader)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filePrescriptionPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filePrescriptionsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        filePrescriptionPanelLayout.setVerticalGroup(
            filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filePrescriptionPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(enterPrescriptionHeader)
                .addGap(3, 3, 3)
                .addComponent(patientPharInfoHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(filePrescriptionPanelLayout.createSequentialGroup()
                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prescriptionNameHeader)
                            .addComponent(enterPrescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frequencyHeader)
                            .addComponent(enterFrequencyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(filePrescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dosesHeader)
                            .addComponent(enterDoseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgHeader))
                        .addGap(64, 64, 64)
                        .addComponent(filePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filePrescriptionsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        filePrescriptionPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {filePrescriptionButton, filePrescriptionsBackButton});

        jTabbedPane1.addTab("File Prescriptions", filePrescriptionPanel);

        chatBoxTextArea.setColumns(20);
        chatBoxTextArea.setRows(5);
        chatBoxTextArea.setLineWrap(true);
        jScrollPane4.setViewportView(chatBoxTextArea);

        sendMessageButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sendMessageButton.setText("Send Message");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt, patient);
            }
        });

        contactPatientBackButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        contactPatientBackButton.setText("Go Back to List");
        contactPatientBackButton.setPreferredSize(new java.awt.Dimension(114, 38));
        contactPatientBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactPatientBackButtonActionPerformed(evt, patient);
            }
        });

        javax.swing.GroupLayout contactPatientTabLayout = new javax.swing.GroupLayout(contactPatientTab);
        contactPatientTab.setLayout(contactPatientTabLayout);
        contactPatientTabLayout.setHorizontalGroup(
            contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPatientTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPatientTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contactPatientBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        contactPatientTabLayout.setVerticalGroup(
            contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPatientTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(contactPatientTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(contactPatientBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Contact Patient", contactPatientTab);

        nameHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nameHeader.setText("Name:");

        emailHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailHeader.setText("Email:");

        phoneHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phoneHeader.setText("Phone Number:");

        addressHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addressHeader.setText("Address:");

        pharHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pharHeader.setText("Pharmacy:");

        passwordHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        passwordHeader.setText("Password:");

        editPatientName.setText("Enter new patient name here");

        patientName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientName.setText(patient.getname());

        patientEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientEmail.setText(patient.getEmail());

        patientPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientPhone.setText("(" + patient.getPhoneNumber().substring(0, 3) + ") " +
        		patient.getPhoneNumber().substring(3, 6) + "-" + 
        		patient.getPhoneNumber().substring(6, patient.getPhoneNumber().length()));
        
        patientStreet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientStreet.setText(patient.getStreetAddress());

        patientCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientCity.setText(patient.getCityStateAddress());

        patientPharName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientPharName.setText(patient.getPharmacy().getName());

        patientPharAddr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientPharAddr.setText(patient.getPharmacy().getAddress());

        patientPharPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientPharPhone.setText("(" + patient.getPharmacy().getPhone().substring(0, 3) + ") " +
        		patient.getPharmacy().getPhone().substring(3, 6) + "-" + 
        		patient.getPharmacy().getPhone().substring(6, patient.getPharmacy().getPhone().length()));
        patientPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientPassword.setText(patient.getPassword());

        editPatientEmail.setText("Enter new patient email here");

        editPatientPhone.setText("Enter new patient phone number here");

        editPatientStreet.setText("Enter new patient street address here");

        editPatientCity.setText("Enter new patient city, state, and zip here");
     
        editPatientPharName.setText("Enter new pharmacy name here");

        editPharAddress.setText("Enter new pharmacy address here");

        editPatientPharPhone.setText("Enter new pharmacy phone number here");
       
        confirmHeader.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        confirmHeader.setText("Confirm Password:");

        editPatientInfoBackButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        editPatientInfoBackButton.setText("Go Back to List");
        editPatientInfoBackButton.setPreferredSize(new java.awt.Dimension(114, 38));
        editPatientInfoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientInfoBackButtonActionPerformed(evt, patient);
            }
        });

        editButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.setPreferredSize(new java.awt.Dimension(114, 38));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt, patient);
            }
        });
        
        enterPrescriptionTextField.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        enterFrequencyTextField.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        enterDoseTextField.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        editPatientCity.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        editPatientEmail.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        editPatientName.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        editPatientPharName.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        
        editPatientPharPhone.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
    
        
        editPatientPhone.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        editPatientStreet.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});
        editPharAddress.addFocusListener(new FocusAdapter() {
        	public void focusGained(FocusEvent e){
        	JTextField source = (JTextField)e.getComponent();
        	source.setText("");
        	source.removeFocusListener(this);
        	}});

        javax.swing.GroupLayout editPatientInfoTabLayout = new javax.swing.GroupLayout(editPatientInfoTab);
        editPatientInfoTab.setLayout(editPatientInfoTabLayout);
        editPatientInfoTabLayout.setHorizontalGroup(
            editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameHeader)
                            .addComponent(passwordHeader)
                            .addComponent(pharHeader)
                            .addComponent(addressHeader)
                            .addComponent(phoneHeader)
                            .addComponent(emailHeader))
                        .addGap(27, 27, 27)
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientName)
                            .addComponent(patientEmail)
                            .addComponent(patientPhone)
                            .addComponent(patientStreet)
                            .addComponent(patientPharPhone)
                            .addComponent(patientPharAddr)
                            .addComponent(patientCity)
                            .addComponent(patientPharName)
                            .addComponent(patientPassword)))
                    .addComponent(confirmHeader))
                .addGap(98, 98, 98)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passField1)
                            .addComponent(passField2)
                            .addComponent(editPatientPharPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editPatientInfoBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editPatientName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPatientCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(editPatientPharName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPharAddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        editPatientInfoTabLayout.setVerticalGroup(
            editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameHeader)
                    .addComponent(editPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientName))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailHeader)
                    .addComponent(patientEmail)
                    .addComponent(editPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneHeader)
                    .addComponent(patientPhone)
                    .addComponent(editPatientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressHeader)
                    .addComponent(patientStreet)
                    .addComponent(editPatientStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientCity)
                    .addComponent(editPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pharHeader)
                    .addComponent(patientPharName)
                    .addComponent(editPatientPharName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientPharAddr)
                    .addComponent(editPharAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editPatientInfoTabLayout.createSequentialGroup()
                                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(patientPharPhone)
                                    .addComponent(editPatientPharPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 41, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPatientInfoTabLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordHeader)
                                    .addComponent(patientPassword)
                                    .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPatientInfoTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(editPatientInfoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmHeader)
                    .addComponent(passField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPatientInfoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Edit Patient Information", editPatientInfoTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>                        

    private void viewSymptomsBackButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                       
       DoctorUI ui = new DoctorUI(patient.getDoctor());
       ui.setVisible(true);
       this.setVisible(false);
       this.dispose();
       
    }                                                      

    private void filePrescriptionsBackButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                            
    	   DoctorUI ui = new DoctorUI(patient.getDoctor());
           ui.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }       
    
   
    

    private void enterFrequencyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void enterPrescriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          
    
    //adds patient symptom list for doctor to view
    private void symptomDatesActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                             
    	int patientIndex = 0;
    	Doctor temp = null;
    	viewSymptomsTextArea.setText(""); // initialize text to being empty
    	
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	for(int i = 0; i < temp.getPatientList().get(patientIndex).getSymptoms().size(); i++){
	    	// if symptom name is equal to the one in the combo box, then append symptoms to it
    		if(temp.getPatientList().get(patientIndex).getSymptoms().get(i).getDate().equals
	    		((String)symptomDates.getSelectedItem())){
	    			viewSymptomsTextArea.append(temp.getPatientList().get(patientIndex).getSymptoms().get(i).getName()
	    					+ ": " + temp.getPatientList().get(patientIndex).getSymptoms().get(i).getLevel()
	    					+ "\n");
	    	}
    	
    	}
    	
    }
        
                                           
    //sends a prescription to the patient which they can view from the patient interface
    private void filePrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                       
        if(!enterFrequencyTextField.getText().equals("") && !enterPrescriptionTextField.getText().equals("Enter prescription name here") &&
        		!enterPrescriptionTextField.getText().equals("")
        		&& !enterDoseTextField.getText().equals(""))
        {
        	docList = Serialize.deserialize("src/doctor.bin");
        	Doctor doc = patient.getDoctor();
        	
        	for (int i = 0; i < docList.size(); i++)	//finds and removes doc from the patient list
        	{
        		if(doc.getname().equals(docList.get(i).getname()) && doc.getEmail().equals(docList.get(i).getEmail()))
        				{
        			docList.remove(i);
        			break;
        				}
        	}
        	for(int j = 0; j < doc.getPatientList().size(); j++)	//finds the patient in the doctor's patient list
        	{
        		if(patient.getname().equals(doc.getPatientList().get(j).getname())
        				&& patient.getEmail().equals(doc.getPatientList().get(j).getEmail()))
        		{
        			String name;
        			int frequency;
        			double dose;
        			try{
        				//tries adding the prescription to the patient's pharmacy prescription arrary
        				name = enterPrescriptionTextField.getText();
        				frequency = Integer.parseInt(enterFrequencyTextField.getText());
        				dose = Double.parseDouble(enterDoseTextField.getText());
        				doc.getPatientList().get(j).getPharmacy().newPrescription(name, frequency, dose);
        				javax.swing.JOptionPane.showMessageDialog(filePrescriptionPanel, "Prescription added successfully!");
        			}
        			catch(NumberFormatException e){
        				//if values entered are not numbers, displays error
        				javax.swing.JOptionPane.showMessageDialog(filePrescriptionPanel, "Please input numeric amounts for frequency and dose.\nFrequency cannot be a decimal.");
        			}
        		}
        			
        	}
        	docList.add(doc);
        	Serialize.serialize(docList, "src/doctor.bin");
        	enterFrequencyTextField.setText("");
        	enterPrescriptionTextField.setText("");
        	enterDoseTextField.setText("");   
        	
        }
    }                                                      

    private void enterDoseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  
    //sends a message to the patient
    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                  
    	int patientIndex = 0;
    	Doctor temp = null;
    	
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        						docList.remove(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //check if submitting symptoms within specified time frame
        Date date = new Date();
        String today = dateFormat.format(date);
    	String message = today + " " + chatBoxTextArea.getText();
    	patient.addMessage(message);
    	temp.getPatientList().get(patientIndex).newMessageList(patient.getMessageList());
    	chatBoxTextArea.setText(null);
    	JOptionPane.showMessageDialog(jScrollPane1, "Message successfully sent on " + today);//, "error", JOptionPane.ERROR_MESSAGE);
        
    	docList.add(temp);
    	Serialize.serialize(docList, "src/doctor.bin"); // writes to doctor file
    }                                                 

    private void contactPatientBackButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                         
    	   DoctorUI ui = new DoctorUI(patient.getDoctor());
           ui.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }                                                                                     

    	//allows for the editing of patient informaiotn
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                           
    	int patientIndex = 0;
    	Doctor temp = null;
    	boolean changed = false;
    	
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){	//finds and removes patient from doctor's patient list
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        						docList.remove(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	//validates all entered patient information
    	if(!editPatientEmail.getText().equals("") && !editPatientEmail.getText().equals("Enter new patient email here")){
    		if(Validator.isEmail(editPatientEmail.getText())){
	    		 String newEmail = editPatientEmail.getText();
	    		 System.out.println(newEmail);
	    	     patientEmail.setText(newEmail);
	    	     editPatientEmail.setText("");
	    	     temp.getPatientList().remove(patientIndex);
	    	     patient.setEmail(newEmail);
	    	     temp.getPatientList().add(patientIndex, patient);
	    	     changed = true;
    		}
    		else{
    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Please enter a valid email.");
    			editPatientEmail.setText("");
    			
    		}
    	}
    	
    	if(!editPatientPhone.getText().equals("") && !editPatientPhone.getText().equals("Enter new patient phone number here")){
    		if(Validator.isPhone(editPatientPhone.getText())){
    		String newPhone= editPatientPhone.getText();	
    		patientPhone.setText("(" + newPhone.substring(0, 3) + ") " + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length()));
   	     	editPatientPhone.setText("");
	   	     temp.getPatientList().remove(patientIndex);
		     patient.setPhoneNumber(newPhone);
		     temp.getPatientList().add(patientIndex, patient);
   	     	changed = true;
    		}
    		
    		else
    		{
    			editPatientPhone.setText("");
    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Please enter a valid phone number in the form of XXXXXXXXXX with no spaces");
    		}
    			
   	     }
    	
    	if(!editPatientName.getText().equals("") && !editPatientName.getText().equals("Enter new patient name here")){
    		String newName = editPatientName.getText();
    		patientName.setText(newName);
    		editPatientName.setText("");
    		temp.getPatientList().remove(patientIndex);
	   	    patient.setName(newName);
	   	    temp.getPatientList().add(patientIndex, patient);
    		changed = true;
    	}
    	
    	if(!editPatientStreet.getText().equals("") && !editPatientStreet.getText().equals("Enter new patient street address here")){
    		String newStreet = editPatientStreet.getText();
    		patientStreet.setText(newStreet);
    		editPatientStreet.setText("");
    		temp.getPatientList().remove(patientIndex);
	   	    patient.setStreetAddress(newStreet);
	   	    temp.getPatientList().add(patientIndex, patient);
    		changed = true;
    	}
    	
    	if(!editPatientCity.getText().equals("") && !editPatientCity.getText().equals("Enter new patient city, state, and zip here")){
    		String newCityState = editPatientCity.getText();
    		patientCity.setText(newCityState);
    		editPatientCity.setText("");
    		temp.getPatientList().remove(patientIndex);
	   	    patient.setCityStateAddress(newCityState);
	   	    temp.getPatientList().add(patientIndex, patient);
    		changed = true;
    	}
    	
    	if(!editPatientPharName.getText().equals("") && !editPatientPharName.getText().equals("Enter new pharmacy name here")){
    		String newPharName = editPatientPharName.getText();
    		patientPharName.setText(newPharName);
    		editPatientPharName.setText("");
    		temp.getPatientList().remove(patientIndex);
    		patient.getPharmacy().changeName(newPharName);
   	     	temp.getPatientList().add(patientIndex, patient);
    		changed = true;
    	}
    	
    	if(!editPharAddress.getText().equals("") && !editPharAddress.getText().equals("Enter new pharmacy address here")){
    		String newPharCity = editPharAddress.getText();
    		patientPharAddr.setText(newPharCity);
    		editPharAddress.setText("");
    		temp.getPatientList().remove(patientIndex);
    		patient.getPharmacy().changeAddr(newPharCity);
    		temp.getPatientList().add(patientIndex, patient);
    		changed = true;
    	}
    	
    	if(!editPatientPharPhone.getText().equals("") && !editPatientPharPhone.getText().equals("Enter new pharmacy phone number here")){
    		if(Validator.isPhone(editPatientPharPhone.getText())){
        		String newPhone= editPatientPharPhone.getText();	
        		patientPharPhone.setText("(" + newPhone.substring(0, 3) + ") " + newPhone.substring(3, 6) + "-" + newPhone.substring(6, newPhone.length()));
       	     	editPatientPharPhone.setText("");
	       	    temp.getPatientList().remove(patientIndex);
	     		patient.getPharmacy().changePhone(newPhone);
	     		temp.getPatientList().add(patientIndex, patient);;
       	     	changed = true;
        		}
        		else{
        			editPatientPharPhone.setText("");
        			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Please enter a valid pharmacy phone number in the form of XXXXXXXXXX with no spaces");
        		}
    	}
    	
    	if(!passField1.getText().equals(""))
    	{
    		if(passField1.getText().equals(passField2.getText()))
    		{
    			String newPass = passField1.getText();
    			patientPassword.setText(newPass);
    			  temp.getPatientList().remove(patientIndex);
 	    	     patient.setPassword(newPass);
 	    	     temp.getPatientList().add(patientIndex, patient);
 	    	     changed = true;
    			passField1.setText("");
    			passField2.setText("");
    			changed = true;
    		}
    		else
    		{
    			javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "The passwords do not match");
    		
    		}
    	}
    	
    	if(passField1.getText().equals("") && !passField2.getText().equals(""))
    	{
    		passField2.setText("");
    		javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "To edit password, please complete both password fields");
    	}
    	
    	
    	
    	if(changed)
    	{
    		javax.swing.JOptionPane.showMessageDialog(jScrollPane1, "Profile information changed.");
    		changed = false;
    				
    	}
    
    	
    	docList.add(temp);
     	Serialize.serialize(docList, "src/doctor.bin");	//re adds the doc to the doc list with
     													//new information
     	setContactInfo(patient);
     	setPharInfo(patient);
    }

    private void editPatientInfoBackButtonActionPerformed(java.awt.event.ActionEvent evt, Patient patient) {                                                          
    	   DoctorUI ui = new DoctorUI(patient.getDoctor());
    	   ui.setVisible(true);
           this.setVisible(false);
           this.dispose();
    }                                                            

    private void setSymptomDates(Patient patient){
    	int patientIndex = 0;
    	Doctor temp = null;
    	
    	// reads in patients
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	 ArrayList<String> dates = new ArrayList<String>();
         
         // adds the dates to the dates combo box starting with a blank one
         dates.add("");
         
         if(temp.getPatientList().get(patientIndex).getSymptoms().size() > 0){
	         for(int i = 0; i < temp.getPatientList().get(patientIndex).getSymptoms().size(); i+=10){
	        	viewSymptomsTextArea.append("Symptoms found.\nSelect a date to view symptoms on that day.");
	         	dates.add(temp.getPatientList().get(patientIndex).getSymptoms().get(i).getDate());
	         }
         }         
         else
        	 viewSymptomsTextArea.append("No symptoms found.");
         
        symptomDates.setModel(new javax.swing.DefaultComboBoxModel(dates.toArray()));
        symptomDates.setFont(new java.awt.Font("Times New Roman", 0, 14));
         
    }
    
    private void setContactInfo(Patient patient){
    	int patientIndex = 0;
    	Doctor temp = null;
    	contactPatientTextArea.setText(null);
    	// reads in patients
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	// adds patient information to the contact patient text area
    	contactPatientTextArea.append("Email: " + temp.getPatientList().get(patientIndex).getEmail() + "\n" +
    								  "Phone Number: (" + temp.getPatientList().get(patientIndex).getPhoneNumber().
    								  substring(0, 3) + ") " + temp.getPatientList().get(patientIndex).getPhoneNumber().
    								  substring(3, 6) + "-" + temp.getPatientList().get(patientIndex).getPhoneNumber().
    								  substring(6, temp.getPatientList().get(patientIndex).getPhoneNumber().length()) + 
    								  "\n");
    	contactPatientTextArea.setFont(new java.awt.Font("Times New Roman", 0, 16));
 
    }
    
    //changes the display of the patient's pharmacy information 
    private void setPharInfo(Patient patient){
    	int patientIndex = 0;
    	Doctor temp = null;
    	patientPharInfoTextArea.setText(null);
    	// reads in patients
    	docList = Serialize.deserialize("src/doctor.bin");
    	
    	for(int i = 0; i < docList.size(); i++)	//finds and removes doc from the doc list
        {
        	if(docList.get(i).getEmail().equalsIgnoreCase(patient.getDoctor().getEmail()) 
        			&& docList.get(i).getPassword().equals(patient.getDoctor().getPassword()))
        	{
        		for(int j = 0; j < docList.get(i).getPatientList().size(); j++){
        			if(patient.getEmail().equalsIgnoreCase(docList.get(i).getPatientList().get(j).getEmail())
        					&& patient.getPassword().equals(docList.get(i).getPatientList().get(j).getPassword())){
        						patientIndex = j;
        						temp = docList.get(i);
        			     		break;
        			}
        		}
        	}
        }
    	
    	patientPharInfoTextArea.append("Pharmacy Name: " + temp.getPatientList().get(patientIndex).getPharmacy().
    									getName() + "\nPharmacy Address: " + 
    									temp.getPatientList().get(patientIndex).getPharmacy().getAddress() + 
    									"\nPharmacy Phone Number: " + "(" + temp.getPatientList().get(patientIndex).getPharmacy().getPhone().
      								  substring(0, 3) + ") " + temp.getPatientList().get(patientIndex).getPharmacy().getPhone().
      								  substring(3, 6) + "-" + temp.getPatientList().get(patientIndex).getPharmacy().getPhone().
      								  substring(6, temp.getPatientList().get(patientIndex).getPharmacy().getPhone().length()) + 
      								  "\n");
    	patientPharInfoTextArea.setFont(new java.awt.Font("Times New Roman", 0, 16));
    }

    // Global variables declaration section                     
    private javax.swing.JLabel addressHeader;
    private javax.swing.JTextArea chatBoxTextArea;
    private javax.swing.JLabel confirmHeader;
    private javax.swing.JButton contactPatientBackButton;
    private javax.swing.JLabel contactPatientInfoHeader;
    private javax.swing.JPanel contactPatientTab;
    private javax.swing.JTextArea contactPatientTextArea;
    private javax.swing.JLabel dosesHeader;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editPatientCity;
    private javax.swing.JTextField editPatientEmail;
    private javax.swing.JButton editPatientInfoBackButton;
    private javax.swing.JPanel editPatientInfoTab;
    private javax.swing.JTextField editPatientName;
    private javax.swing.JTextField editPatientPharName;
    private javax.swing.JTextField editPatientPharPhone;
    private javax.swing.JTextField editPatientPhone;
    private javax.swing.JTextField editPatientStreet;
    private javax.swing.JTextField editPharAddress;
    private javax.swing.JLabel emailHeader;
    private javax.swing.JTextField enterDoseTextField;
    private javax.swing.JTextField enterFrequencyTextField;
    private javax.swing.JLabel enterPrescriptionHeader;
    private javax.swing.JTextField enterPrescriptionTextField;
    private javax.swing.JButton filePrescriptionButton;
    private javax.swing.JPanel filePrescriptionPanel;
    private javax.swing.JButton filePrescriptionsBackButton;
    private javax.swing.JLabel frequencyHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mgHeader;
    private javax.swing.JLabel nameHeader;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JPasswordField passField2;
    private javax.swing.JLabel passwordHeader;
    private javax.swing.JLabel patientCity;
    private javax.swing.JLabel patientEmail;
    private javax.swing.JLabel patientName;
    private javax.swing.JLabel patientPassword;
    private javax.swing.JLabel patientPharAddr;
    private javax.swing.JLabel patientPharInfoHeader;
    private javax.swing.JTextArea patientPharInfoTextArea;
    private javax.swing.JLabel patientPharName;
    private javax.swing.JLabel patientPharPhone;
    private javax.swing.JLabel patientPhone;
    private javax.swing.JLabel patientStreet;
    private javax.swing.JLabel pharHeader;
    private javax.swing.JLabel phoneHeader;
    private javax.swing.JLabel prescriptionNameHeader;
    private javax.swing.JLabel selectDateHeader;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JComboBox symptomDates;
    private javax.swing.JPanel viewSumbissionsTab;
    private javax.swing.JButton viewSymptomsBackButton;
    private javax.swing.JLabel viewSymptomsHeader;
    private javax.swing.JTextArea viewSymptomsTextArea;
    private ArrayList<Doctor> docList;
    // End of variables declaration                   
}
