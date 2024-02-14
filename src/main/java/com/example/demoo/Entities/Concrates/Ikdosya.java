package com.example.demoo.Entities.Concrates;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Entity
@Table(name = "giris_kayitlari")
@AllArgsConstructor
@NoArgsConstructor
public class Ikdosya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "santiye")
    private String santiye;

    @Column(name = "firma")
    private String firma;

    @Column(name = "GirisNotu")
    private String girisNotu;

    @Column(name = "Durumu")
    private String durumu;

    @Column(name = "SGuvenlikNo")
    private Long sGuvenlikNo;

    @Column(name = "AdiSoyadi")
    private String adiSoyadi;

    @Temporal(TemporalType.DATE)
    @Column(name = "Ggun")
    private Date ggun;

    @Temporal(TemporalType.DATE)
    @Column(name = "Cgun")
    private Date cgun;

    @Column(name = "CalistigiGunSayisi")
    private Integer calistigiGunSayisi;

    @Column(name = "CikisKodu")
    private Integer cikisKodu;

    @Column(name = "MeslekKodu")
    private String meslekKodu;

    @Column(name = "MeslekAdi")
    private String meslekAdi;

    @Column(name = "ArabuluculukGerekenler")
    private String arabuluculukGerekenler;

    @Column(name = "Notlar")
    private String notlar;

    @Column(name = "Notlar2")
    private String notlar2;

    @ManyToOne
    @JoinColumn(name = "kullanici_id", referencedColumnName = "id")
    private Kullanıcı kullanici;

}
