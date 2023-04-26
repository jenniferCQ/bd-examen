package examen;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_examen database table.
 * 
 */
@Entity
@Table(name="tb_examen")
@NamedQuery(name="Examen.findAll", query="SELECT e FROM Examen e")
public class Examen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String pw;

	private String usert;

	public Examen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPw() {
		return this.pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUsert() {
		return this.usert;
	}

	public void setUsert(String usert) {
		this.usert = usert;
	}

}