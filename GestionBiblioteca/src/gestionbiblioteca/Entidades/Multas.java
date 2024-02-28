package gestionbiblioteca.Entidades;

import java.time.LocalDate;

public class Multas {

    private int idUnicoDeLaMulta; 
    private int idUsuarioMultado;
    private int montoQueDebe; 
    private LocalDate fechaDeMulta;
    private Boolean estadoDelPago;
    
//constVacio
    public Multas() {
    }
//sinID
    public Multas(int idUsuarioMultado, int montoQueDebe, LocalDate fechaDeMulta, Boolean estadoDelPago) {
        this.idUsuarioMultado = idUsuarioMultado;
        this.montoQueDebe = montoQueDebe;
        this.fechaDeMulta = fechaDeMulta;
        this.estadoDelPago = estadoDelPago;
    }
//conID
    public Multas(int idUnicoDeLaMulta, int idUsuarioMultado, int montoQueDebe, LocalDate fechaDeMulta, Boolean estadoDelPago) {
        this.idUnicoDeLaMulta = idUnicoDeLaMulta;
        this.idUsuarioMultado = idUsuarioMultado;
        this.montoQueDebe = montoQueDebe;
        this.fechaDeMulta = fechaDeMulta;
        this.estadoDelPago = estadoDelPago;
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

    @Override
    public String toString() {
        return "ID Multa " + idUnicoDeLaMulta + 
               ", ID De Usuario Multado " + idUsuarioMultado + 
               ", Monto Que Debe " + montoQueDebe + 
               ", fecha De La Multa " + fechaDeMulta +
               ", Estado Del Pago " + estadoDelPago;
    }
    
    
}
