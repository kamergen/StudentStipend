package institute.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Nikolai_Iakovlev on 10/16/2016.
 */
@Entity
@Table(name = "stipend")
public class Stipend implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;
    @Column(name = "studentId")
    private int studentId;
    @Column(name = "status")
    private int status;
    @Column(name = "how_many")
    private int howMany;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}
