package Entity;

public class Medico
{
    private int id_medico;
    private String name;
    private String surname;
    private int fk_id_especialidad;
    private String speciality;
    public Medico() {
    }

    public Medico(int id_medico, String name, String surname, int fk_id_especialidad, String speciality) {
        this.id_medico = id_medico;
        this.name = name;
        this.surname = surname;
        this.fk_id_especialidad = fk_id_especialidad;
        this.speciality = speciality;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getFk_id_especialidad() {
        return fk_id_especialidad;
    }

    public void setFk_id_especialidad(int fk_id_especialidad) {
        this.fk_id_especialidad = fk_id_especialidad;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Medico --> " +
                "id_medico: " + id_medico +
                " fk_id_especialidad: " + fk_id_especialidad +
                " name: " + name +
                " surname: " + surname  +
                " Speciality : " + speciality;
    }
}
