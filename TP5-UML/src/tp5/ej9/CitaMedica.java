
package tp5.ej9;
public class CitaMedica {
    private final String fecha;
    private final String hora;
    private final Paciente paciente;      // asociación
    private final Profesional profesional; // asociación
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional){
        this.fecha=fecha; this.hora=hora; this.paciente=paciente; this.profesional=profesional;
    }
    public String getFecha(){ return fecha; }
    public String getHora(){ return hora; }
    public Paciente getPaciente(){ return paciente; }
    public Profesional getProfesional(){ return profesional; }
}
