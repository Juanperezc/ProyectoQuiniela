package com.lab2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "request")
public class Request extends AuditModel {

    /*public enum Type {
		ADMINISTRADOR,
		QUINIELAPRIVADA;
	}

	public enum State{
		SINREVISION,
		VISTA,
		APROBADA,
		RECHAZADA;
	}*/
    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fromid")
    private User fromid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "toid")
    private User toid;

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "quiniela_id")
    private Quiniela quiniela;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_id")
    private int id;

    @Column(name = "type")
    private Integer type;

    @Column(name = "state")
    private Integer state;

    public Request() {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setTipo(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public void setToid(User toid) {
        this.toid = toid;
    }
    public void setFromid(User fromid) {
        this.fromid = fromid;
    }
    public User getFromid() {
        return fromid;
    }
    public User getToid() {
        return toid;
    }

    public Quiniela getQuiniela() {
        return quiniela;
    }
    public void setQuiniela(Quiniela quiniela) {
        this.quiniela = quiniela;
    }
    public String getStatename() {
        switch (state) {
            case 1:
                return "Sin revision";
            case 2:
                return "Vista";
            case 3:
                return "Aprobada";
            case 4:
                return "Rechazada";
            default:
                return null;
        }
	}
	public String getTypename() {
        switch (state) {
            case 1:
                return "Quiero ser Administrador de quinielas";
            case 2:
                return "Quiero participar en tu quiniela privada";
            default:
                return null;
        }
    }
}
