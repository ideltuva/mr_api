package com.api.mr.api.web.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(GroupStatementId.class)
@Entity
@Slf4j
@Table(name = "group_statements_flat")
public class GroupStatement {
    @Column(name = "terminalo_zyme")
    private String terminalMark;
    @Id
    @Column(name = "movement_id")
    private BigInteger movementId;
    @Column(name = "pardavejo_pavadinimas")
    private String sellerName;
    @Column(name = "pardavejo_imones_kodas")
    private String sellerOrganisationId;
    @Column(name = "pirkejo_pavadinimas")
    private String buyerName;
    @Column(name = "pirkejo_imones_kodas")
    private String buyerOrganisationId;
    @Column(name = "vezejo_pavadinimas")
    private String carrierName;
    @Column(name = "vezejo_imones_kodas")
    private String carrierOrganisationId;
    @Column(name = "transp_priem_tipas")
    private String vehicleType;
    @Column(name = "transp_priem")
    private String vehicle;
    @Column(name = "vairuotojas")
    private String driver;
    @Id
    @Column(name = "vaztar_nr")
    private String invoiceNo;
    @Column(name = "isdavimo_data")
    private String issueDate;
    @Column(name = "medienos_kilme")
    private String timberOrigin;
    @Column(name = "sertifikatas")
    private String certificate;
    @Column(name = "padalinys")
    private String division;
    @Column(name = "rys_skaicius")
    private Integer bundleCount;
    @Column(name = "data_matav")
    private String measurementDate;
    @Column(name = "laikas_matav_pr")
    private String measurementStartDate;
    @Column(name = "laikas_matav_pb")
    private String measruementEndDate;
    @Column(name = "data_krov")
    private String loadingDate;
    @Column(name = "laikas_krov_pr")
    private String loadingTimeStartDate;
    @Column(name = "laikas_krov_pb")
    private String loadingTimeEndDate;
    @Column(name = "vardas")
    private String firstName;
    @Column(name = "pavarde")
    private String lastName;
    @Id
    @Column(name = "rysulio_nr")
    private Integer bundleNo;
    @Column(name = "rietuves_vard")
    private String stackName;
    @Column(name = "sortim_vard")
    private String selectionName;
    @Column(name = "sortimento_ilgis")
    private String selectionLength;
    @Column(name = "sortimento_plotis")
    private String selectionWidth;
    @Column(name = "sortimento_aukstis")
    private String selectionHeight;
    @Column(name = "koeficientas")
    private String coefficient;
    @Column(name = "atl_1")
    private String res1;
    @Column(name = "atl_2")
    private String res2;
    @Column(name = "atl_3")
    private String res3;
    @Column(name = "atl_4")
    private String res4;
    @Column(name = "atl_5")
    private String res5;
    @Column(name = "atl_6")
    private String res6;
    @Column(name = "atl_7")
    private String res7;
    @Column(name = "atl_8")
    private String res8;
    @Column(name = "atl_9")
    private String res9;
}
