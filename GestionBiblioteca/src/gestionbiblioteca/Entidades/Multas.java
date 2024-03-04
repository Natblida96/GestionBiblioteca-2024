package gestionbiblioteca.Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Multas {

    private int idUnicoDeLaMulta;
    private int idUsuarioMultado;
    private int montoQueDebe;
    private LocalDate fechaDeMulta;
    private Boolean estadoDelPago;
    private String dniUsuario;

    public Multas() {
    }

    public Multas(int idUsuarioMultado, int montoQueDebe, LocalDate fechaDeMulta, Boolean estadoDelPago, String dniUsuario) {
        this.idUsuarioMultado = idUsuarioMultado;
        this.montoQueDebe = montoQueDebe;
        this.fechaDeMulta = fechaDeMulta;
        this.estadoDelPago = estadoDelPago;
        this.dniUsuario = dniUsuario;
    }

    public Multas(int idUnicoDeLaMulta, int idUsuarioMultado, int montoQueDebe, LocalDate fechaDeMulta, Boolean estadoDelPago, String dniUsuario) {
        this.idUnicoDeLaMulta = idUnicoDeLaMulta;
        this.idUsuarioMultado = idUsuarioMultado;
        this.montoQueDebe = montoQueDebe;
        this.fechaDeMulta = fechaDeMulta;
        this.estadoDelPago = estadoDelPago;
        this.dniUsuario = dniUsuario;
    }

    public int getIdUnicoDeLaMulta() {
        return idUnicoDeLaMulta;
    }

    public void setIdUnicoDeLaMulta(int idUnicoDeLaMulta) {
        this.idUnicoDeLaMulta = idUnicoDeLaMulta;
    }

    public int getIdUsuarioMultado() {
        return idUsuarioMultado;
    }

    public void setIdUsuarioMultado(int idUsuarioMultado) {
        this.idUsuarioMultado = idUsuarioMultado;
    }

    public int getMontoQueDebe() {
        return montoQueDebe;
    }

    public void setMontoQueDebe(int montoQueDebe) {
        this.montoQueDebe = montoQueDebe;
    }

    public LocalDate getFechaDeMulta() {
        return fechaDeMulta;
    }

    public void setFechaDeMulta(LocalDate fechaDeMulta) {
        this.fechaDeMulta = fechaDeMulta;
    }

    public Boolean getEstadoDelPago() {
        return estadoDelPago;
    }

    public void setEstadoDelPago(Boolean estadoDelPago) {
        this.estadoDelPago = estadoDelPago;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    @Override
    public String toString() {
        return "ID Multa " + idUnicoDeLaMulta
                + ", ID De Usuario Multado " + idUsuarioMultado
                + ", Monto Que Debe " + montoQueDebe
                + ", Fecha De La Multa " + fechaDeMulta 
                + ", Estado Del Pago " + estadoDelPago
                + ", DNI Del Usuario " + dniUsuario;
    }

}
