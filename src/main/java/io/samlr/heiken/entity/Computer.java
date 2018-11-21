package io.samlr.heiken.entity;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pk;
    private Long id_uzel;
    private Long id_otdel;
    private String descr;
    private String ip;
    private String name;
    private String tel;
    private Long tip_pk;
    private Long diap_ip;
    private String radmin_pass;
    private String descr_ad;
    private String radmin_port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public Long getId_uzel() {
        return id_uzel;
    }

    public void setId_uzel(Long id_uzel) {
        this.id_uzel = id_uzel;
    }

    public Long getId_otdel() {
        return id_otdel;
    }

    public void setId_otdel(Long id_otdel) {
        this.id_otdel = id_otdel;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getTip_pk() {
        return tip_pk;
    }

    public void setTip_pk(Long tip_pk) {
        this.tip_pk = tip_pk;
    }

    public Long getDiap_ip() {
        return diap_ip;
    }

    public void setDiap_ip(Long diap_ip) {
        this.diap_ip = diap_ip;
    }

    public String getRadmin_pass() {
        return radmin_pass;
    }

    public void setRadmin_pass(String radmin_pass) {
        this.radmin_pass = radmin_pass;
    }

    public String getDescr_ad() {
        return descr_ad;
    }

    public void setDescr_ad(String descr_ad) {
        this.descr_ad = descr_ad;
    }

    public String getRadmin_port() {
        return radmin_port;
    }

    public void setRadmin_port(String radmin_port) {
        this.radmin_port = radmin_port;
    }
}
