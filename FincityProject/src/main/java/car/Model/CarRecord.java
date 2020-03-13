package car.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ${Smruti}
 *

 */
@Entity
@Table
public class CarRecord {
	@Id
	private int id;
	private String name;
	private String mName;
	private String model;
	private Date mYear;
	private String colour;

//default conatructor    
	public CarRecord() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getmYear() {
		return mYear;
	}

	public void setmYear(Date mYear) {
		this.mYear = mYear;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}